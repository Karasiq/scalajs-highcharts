/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.5 by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js

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
  val alpha: Double = 0

  /**
    * One of the two rotation angles for the chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/3d-column-interactive/">Dynamic Angles</a>
    * @since 4.0
    */
  val beta: Double = 0

  /**
    * The total depth of the chart.
    * @since 4.0
    */
  val depth: Double = 100

  /**
    * Wether to render the chart using the 3D functionality.
    * @since 4.0
    */
  val enabled: Boolean = false

  /**
    * Provides the option to draw a frame around the charts by defining a bottom, front and back panel. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/3d/column-frame/">Framed column chart</a>
    * @since 4.0
    */
  val frame: ChartOptions3dFrame = new ChartOptions3dFrame

  /**
    * Defines the distance the viewer is standing in front of the chart, this setting is important to calculate the perspective effect in column and scatter charts.
    * It is not used for 3D pie charts.
    * @since 4.0
    */
  val viewDistance: Double = 100
}
