/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart-panning</code>
  */
class ChartPanning extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable chart panning.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Decides in what dimensions the user can pan the chart. Can be
    * one of <code>x</code>, <code>y</code>, or <code>xy</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/panning-type">Zooming and xy panning</a>
    */
  var `type`: js.UndefOr[String] = "x"
}

object ChartPanning {
  /**
    * @param enabled <p>Enable or disable chart panning.</p>
    * @param `type` <p>Decides in what dimensions the user can pan the chart. Can be. one of <code>x</code>, <code>y</code>, or <code>xy</code>.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, `type`: js.UndefOr[String] = "x"): ChartPanning = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartPanning {
      this.enabled = enabled
      this.`type` = `type`
    })
  }
}
