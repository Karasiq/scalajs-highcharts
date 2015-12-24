package com.karasiq.highcharts.generator

import java.io.FileWriter
import java.nio.file.{Files, Paths}

import com.karasiq.highcharts.generator.writers.ScalaClassWriter

import scala.util.control.Exception
import scalaj.http.{Http, HttpOptions}

object Main extends App {
  val page = Http.get("http://api.highcharts.com/highcharts/option/dump.json")
    .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:43.0) Gecko/20100101 Firefox/43.0")
    .options(HttpOptions.connTimeout(10000), HttpOptions.readTimeout(10000))

  val configs = ConfigurationObject.fromJson(page.asString)

  val writer = new ScalaClassWriter

  val pkg = System.getProperty("highcharts-generator.package", "com.highcharts.config")
  val header =
    s"""/**
      | * Automatically generated file. Please do not edit.
      | * @author Highcharts Config Generator v1.0.0 by Karasiq
      | * @see [[http://api.highcharts.com/highcharts]]
      | */
      |package $pkg
      |
      |import scalajs.js, js.UndefOr, js.annotation.ScalaJSDefined
      |
      |""".stripMargin

  val outputDir = Paths.get(System.getProperty("highcharts-generator.output", "scalajs-library/src/main/scala"), pkg.split("\\."):_*)
  Files.createDirectories(outputDir)
  writer.write(configs) {
    case (className, source) ⇒
      val file = outputDir.resolve(className + ".scala")
      println(s"Writing $file...")
      val writer = new FileWriter(file.toFile)
      Exception.allCatch.andFinally(writer.close()) {
        writer.write(header)
        writer.write(source)
      }
  }
}
