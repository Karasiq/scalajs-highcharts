package com.karasiq.highcharts.generator

sealed trait ConfigurationObject {
  val name: Option[String]
  val fullName: Option[String]
  val title: Option[String]
  val parent: Option[String]
  val isParent: Boolean
  val returnType: Option[String]
  val since: Option[String]
  val description: Option[String]
  val deprecated: Boolean
  val context: Option[String]
  val defaults: Option[String]
  val demo: Option[String]
  val seeAlso: Option[String]

  override def toString: String = {
    def opt(v: Option[String]): String = v.filter(_.nonEmpty).getOrElse("<none>")
    s"ConfigurationObject(name = ${opt(name)}, fullName = ${opt(fullName)}, title = ${opt(title)}, parent = ${opt(parent)}, isParent = $isParent, returnType = ${opt(returnType)}, since = ${opt(since)}, deprecated = $deprecated, context = ${opt(context)}, defaults = ${opt(defaults)}, seeAlso = ${opt(seeAlso)})"
  }
}

object ConfigurationObject {
  import upickle.Js
  import upickle.default._

  private implicit val reader = Reader[ConfigurationObject] {
    case Js.Obj(v @ _*) ⇒
      val values = v.toMap

      def getString(name: String): Option[String] = {
        values.get(name) match {
          case Some(Js.Str(string)) ⇒
            Some(string)

          case _ ⇒
            None
        }
      }

      def getBoolean(name: String, default: Boolean = false): Boolean = {
        values.get(name) match {
          case Some(Js.True) ⇒
            true

          case Some(Js.False) ⇒
            false

          case _ ⇒
            default
        }
      }

      new ConfigurationObject {
        override val name: Option[String] = getString("name")

        override val returnType: Option[String] = getString("returnType")

        override val seeAlso: Option[String] = getString("seeAlso")

        override val fullName: Option[String] = getString("fullname")

        override val deprecated: Boolean = getBoolean("deprecated")

        override val defaults: Option[String] = getString("defaults")

        override val description: Option[String] = getString("description")

        override val since: Option[String] = getString("since")

        override val title: Option[String] = getString("title")

        override val isParent: Boolean = getBoolean("isParent")

        override val demo: Option[String] = getString("demo")

        override val context: Option[String] = getString("context")

        override val parent: Option[String] = getString("parent")
      }
  }

  def fromJson(json: String): List[ConfigurationObject] = {
    read[List[ConfigurationObject]](json)
  }
}
