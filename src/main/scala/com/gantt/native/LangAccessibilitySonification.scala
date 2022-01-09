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
  * @note JavaScript name: <code>lang-accessibility-sonification</code>
  */
class LangAccessibilitySonification extends com.highcharts.HighchartsGenericObject {

  var playAsSoundButtonText: js.UndefOr[String] = js.undefined

  var playAsSoundClickAnnouncement: js.UndefOr[String] = js.undefined
}

object LangAccessibilitySonification {
  /**
    */
  def apply(playAsSoundButtonText: js.UndefOr[String] = js.undefined, playAsSoundClickAnnouncement: js.UndefOr[String] = js.undefined): LangAccessibilitySonification = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibilitySonification {
      this.playAsSoundButtonText = playAsSoundButtonText
      this.playAsSoundClickAnnouncement = playAsSoundClickAnnouncement
    })
  }
}
