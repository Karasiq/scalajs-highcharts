package com.highcharts

import scala.scalajs.js

@js.native
trait CleanJsObject[T <: scalajs.js.Object] extends scalajs.js.Object

object CleanJsObject {
  def apply(v: js.Object): js.Object = v match {
    case null ⇒
      null

    case und if js.isUndefined(und) ⇒
      js.undefined.asInstanceOf[js.Object]

    case obj ⇒
      val newObj: js.Object = new js.Object()

      def cleanProperty(p: js.Any): js.Any = p match {
        case array if js.Array.isArray(array) ⇒
          array.asInstanceOf[js.Array[js.Any]]
            .filterNot(js.isUndefined)
            .map(cleanProperty)

        //        case subObj if js.typeOf(subObj) == "object" ⇒
        //          cleanObject(subObj.asInstanceOf[js.Object])

        case newValue ⇒
          newValue
      }


      val properties = js.Object.keys(obj)
        .filterNot(key ⇒ js.isUndefined(obj.asInstanceOf[js.Dynamic].selectDynamic(key)))
        .map(key ⇒ key → cleanProperty(obj.asInstanceOf[js.Dynamic].selectDynamic(key)))

      properties.foreach { case (key, value) ⇒
        newObj.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      }

      newObj
  }
}