package com.karasiq.highcharts.generator

import java.io.{BufferedWriter, FileOutputStream, OutputStreamWriter, PrintWriter}
import java.nio.file._
import java.nio.file.attribute.BasicFileAttributes

import scala.util.control.Exception
import scalaj.http.{Http, HttpOptions}

import com.karasiq.highcharts.generator.writers.{ScalaClassWriter, ScalaJsClassBuilder}

case class HighchartsApiDoc(library: String) {
  private val defaultPackage = System.getProperty(s"highcharts-generator.$library.package", s"com.$library")

  private def httpGet(url: String): List[ConfigurationObject] = {
    val page = Http.get(url)
      .header("User-Agent", "Mozilla/5.0 (X11; OpenBSD amd64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.81 Safari/537.36")
      .header("Accept", "application/json")
      .options(HttpOptions.connTimeout(10000), HttpOptions.readTimeout(10000))

    val json = page.asString
    ConfigurationObject.fromJson(json)
  }

  private def writeFiles(pkg: String, configs: List[ConfigurationObject], rootObject: Option[String] = None): Unit = {
    val header =
      s"""/**
          |  * Automatically generated file. Please do not edit.
          |  * @author Highcharts Config Generator by Karasiq
          |  * @see [[http://api.highcharts.com/$library]]
          |  */
          |package $pkg
          |
          |import scalajs.js, js.`|`
          |import org.scalajs.dom
          |
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
      // println(s"Writing $file...")
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
    val configs = httpGet(s"https://api.highcharts.com/$library/dump.json")
    writeFiles(s"$defaultPackage.native", configs, Some(s"${library.capitalize}Config"))
  }

  def writeAll(): Unit = {
    // TODO: https://github.com/highcharts/highcharts/issues/7227
    writeConfigs()
  }
}

object Main extends App {
  HighchartsApiDoc("highcharts").writeAll()
  HighchartsApiDoc("highstock").writeAll()
  HighchartsApiDoc("highmaps").writeAll()
  HighchartsApiDoc("gantt").writeAll()
}
