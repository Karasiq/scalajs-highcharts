package com.karasiq.highcharts.generator

import java.io.{PrintWriter, FileWriter}
import java.nio.file.{Files, Paths}

import com.karasiq.highcharts.generator.writers.{ScalaClassWriter, ScalaJsClassBuilder, ScalaJsClassBuilder$}

import scala.util.control.Exception
import scalaj.http.{Http, HttpOptions}

object Main extends App {
  val defaultPackage = System.getProperty("highcharts-generator.package", "com.highcharts")

  def httpGet(url: String): List[ConfigurationObject] = {
    val page = Http.get(url)
      .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:43.0) Gecko/20100101 Firefox/43.0")
      .options(HttpOptions.connTimeout(10000), HttpOptions.readTimeout(10000))

    ConfigurationObject.fromJson(page.asString)
  }

  def writeFiles(pkg: String, configs: List[ConfigurationObject], rootObject: Option[String] = None): Unit = {
    val header =
      s"""/**
         |  * Automatically generated file. Please do not edit.
         |  * @author Highcharts Config Generator v1.0.6 by Karasiq
         |  * @see [[http://api.highcharts.com/highcharts]]
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

    val classes = new ScalaJsClassBuilder().parse(configs, rootObject)
    val classWriter = new ScalaClassWriter
    classes.foreach { scalaJsClass ⇒
      val file = outputDir.resolve(scalaJsClass.scalaName + ".scala")
      println(s"Writing $file...")
      val writer = new PrintWriter(file.toFile, "UTF-8")
      Exception.allCatch.andFinally(writer.close()) {
        writer.print(header)
        classWriter.writeClass(scalaJsClass) { line ⇒
          writer.println(line)
        }
      }
    }
  }

  def writeConfigs(): Unit = {
    val configs = httpGet("http://api.highcharts.com/highcharts/option/dump.json")
    writeFiles(s"$defaultPackage.config", configs, Some("HighchartsConfig"))
  }

  def writeApis(): Unit = {
    val configs = httpGet("http://api.highcharts.com/highcharts/object/dump.json")
    writeFiles(s"$defaultPackage.api", configs)
  }

  writeConfigs()

  writeApis()
}
