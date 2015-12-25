package com.karasiq.highcharts.generator.ast

import com.karasiq.highcharts.generator.ConfigurationObject

import scala.concurrent.duration._
import scala.collection.JavaConversions._

/**
  * Scala.JS abstract definition
  */
sealed trait ScalaJsDefinition {
  def scalaName: String
  def scalaType: String
}

/**
  * Scala.JS abstract method
  * @param cfg Configuration object
  * @param scalaName Scala name
  * @param scalaType Scala type
  */
case class ScalaJsMethod(cfg: ConfigurationObject, scalaName: String, scalaType: String, arguments: Seq[ScalaJsValue]) extends ScalaJsDefinition

/**
  * Scala.JS abstract value
  * @param cfg Configuration object
  * @param scalaName Scala name
  * @param scalaType Scala type
  * @param value Initial value
  */
case class ScalaJsValue(cfg: ConfigurationObject, scalaName: String, scalaType: String, value: Option[String]) extends ScalaJsDefinition

/**
  * Scala.JS abstract class
  * @param jsName JavaScript name
  * @param scalaName Scala name
  * @param definitions Class definitions
  */
case class ScalaJsClass(jsName: String, scalaName: String, definitions: Seq[ScalaJsDefinition]) extends ScalaJsDefinition {
  override def scalaType: String = this.scalaName
}