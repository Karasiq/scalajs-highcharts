package com.karasiq.highcharts.generator

import java.io.{OutputStreamWriter, BufferedWriter, FileOutputStream, PrintWriter}
import java.nio.file.attribute.BasicFileAttributes
import java.nio.file._

import com.karasiq.highcharts.generator.writers.{ScalaClassWriter, ScalaJsClassBuilder}

import scala.util.control.Exception
import scalaj.http.{Http, HttpOptions}

case class HighchartsApiDoc(library: String) {
  private val defaultPackage = System.getProperty(s"highcharts-generator.$library.package", s"com.$library")

  private def httpGet(url: String): List[ConfigurationObject] = {
    val page = Http.get(url)
      .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:43.0) Gecko/20100101 Firefox/43.0")
      .options(HttpOptions.connTimeout(10000), HttpOptions.readTimeout(10000))

    ConfigurationObject.fromJson(page.asString)
  }

  private def writeFiles(pkg: String, configs: List[ConfigurationObject], rootObject: Option[String] = None): Unit = {
    val header =
      s"""/**
          |  * Automatically generated file. Please do not edit.
          |  * @author Highcharts Config Generator v1.0.9 by Karasiq
          |  * @see [[http://api.highcharts.com/$library]]
          |  */
          |package $pkg
          |
          |import scalajs.js, js.`|`
          |import com.highcharts.CleanJsObject
          |import com.highcharts.HighchartsUtils._
          |
          |""".stripMargin

    val outputDir = Paths.get(System.getProperty("highcharts-generator.output", "src/main/scala"), pkg.split("\\."):_*)
    Files.createDirectories(outputDir)

    // Remove all files
    Files.walkFileTree(outputDir, new SimpleFileVisitor[Path] {
      override def visitFile(file: Path, attrs: BasicFileAttributes): FileVisitResult = {
        Files.delete(file)
        FileVisitResult.CONTINUE
      }
    })

    val classes = new ScalaJsClassBuilder().parse(configs, rootObject)
    val classWriter = new ScalaClassWriter
    classes.foreach { scalaJsClass ⇒
      val file = outputDir.resolve(scalaJsClass.scalaName + ".scala")
      println(s"Writing $file...")
      val writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file.toFile, true), "UTF-8")))
      Exception.allCatch.andFinally(writer.close()) {
        if (Files.size(file) == 0) {
          writer.print(header)
        }
        classWriter.writeClass(scalaJsClass) { line ⇒
          writer.println(line)
        }
        writer.flush()
      }
    }
  }

  def writeConfigs(): Unit = {
    val configs = httpGet(s"http://api.highcharts.com/$library/option/dump.json")
    writeFiles(s"$defaultPackage.config", configs, Some(s"${library.head.toUpper + library.tail}Config"))
  }

  def writeApis(): Unit = {
    val configs = httpGet(s"http://api.highcharts.com/$library/object/dump.json")
    writeFiles(s"$defaultPackage.api", configs)
  }

  def writeAll(): Unit = {
    writeConfigs()
    writeApis()
  }
}

object Main extends App {
  HighchartsApiDoc("highcharts").writeAll()
  HighchartsApiDoc("highstock").writeAll()
  HighchartsApiDoc("highmaps").writeAll()
}
