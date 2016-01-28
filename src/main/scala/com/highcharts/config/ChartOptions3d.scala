/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart-options3d</code>
  */
@js.annotation.ScalaJSDefined
class ChartOptions3d extends js.Object {

  /**
    * One of the two rotation angles for the chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/3d-column-interactive/">Dynamic Angles</a>
    * @since 4.0
    */
  val alpha: js.UndefOr[Double] = js.undefined

  /**
    * One of the two rotation angles for the chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/3d-column-interactive/">Dynamic Angles</a>
    * @since 4.0
    */
  val beta: js.UndefOr[Double] = js.undefined

  /**
    * The total depth of the chart.
    * @since 4.0
    */
  val depth: js.UndefOr[Double] = js.undefined

  /**
    * Wether to render the chart using the 3D functionality.
    * @since 4.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Provides the option to draw a frame around the charts by defining a bottom, front and back panel. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/3d/column-frame/">Framed column chart</a>
    * @since 4.0
    */
  val frame: js.UndefOr[CleanJsObject[ChartOptions3dFrame]] = js.undefined

  /**
    * Defines the distance the viewer is standing in front of the chart, this setting is important to calculate the perspective effect in column and scatter charts.
    * It is not used for 3D pie charts.
    * @since 4.0
    */
  val viewDistance: js.UndefOr[Double] = js.undefined
}
