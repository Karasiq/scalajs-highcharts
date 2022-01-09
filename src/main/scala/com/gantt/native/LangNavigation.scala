/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>lang-navigation</code>
  */
class LangNavigation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Translations for all field names used in popup.</p>
    * @since 7.0.0
    */
  var popup: js.Any = js.undefined
}

object LangNavigation {
  /**
    * @param popup <p>Translations for all field names used in popup.</p>
    */
  def apply(popup: js.UndefOr[js.Any] = js.undefined): LangNavigation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangNavigation {
      this.popup = popup
    })
  }
}
