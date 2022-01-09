/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>drilldown</code>
  */
class Drilldown extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Additional styles to apply to the X axis label for a point that
    * has drilldown data. By default it is underlined and blue to invite
    * to interaction.</p>
    * <p>In styled mode, active label styles can be set with the
    * <code>.highcharts-drilldown-axis-label</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/labels/">Label styles</a>
    * @since 3.0.8
    */
  var activeAxisLabelStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Additional styles to apply to the data label of a point that has
    * drilldown data. By default it is underlined and blue to invite to
    * interaction.</p>
    * <p>In styled mode, active data label styles can be applied with the
    * <code>.highcharts-drilldown-data-label</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/labels/">Label styles</a>
    * @since 3.0.8
    */
  var activeDataLabelStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>When this option is false, clicking a single point will drill down
    * all points in the same category, equivalent to clicking the X axis
    * label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/allowpointdrilldown-false/">Don't allow point drilldown</a>
    * @since 4.1.7
    */
  var allowPointDrilldown: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Set the animation for all drilldown animations. Animation of a drilldown
    * occurs when drilling between a column point and a column series,
    * or a pie slice and a full pie series. Drilldown can still be used
    * between series and points of different types, but animation will
    * not occur.</p>
    * <p>The animation can either be set as a boolean or a configuration
    * object. If <code>true</code>, it will use the &#39;swing&#39; jQuery easing and a duration
    * of 500 ms. If used as a configuration object, the following properties
    * are supported:</p>
    * <ul>
    * <li><p><code>duration</code>: The duration of the animation in milliseconds.</p>
    * </li>
    * <li><p><code>easing</code>: A string reference to an easing function set on the <code>Math</code>
    * object. See
    * <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</p>
    * </li>
    * </ul>
    * @since 3.0.8
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Options for the drill up button that appears when drilling down on a
    * series. The text for the button is defined in
    * <a href="#lang.drillUpText">lang.drillUpText</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/drillupbutton/">Drill up button</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/drillupbutton/">Drill up button</a>
    * @since 3.0.8
    */
  var drillUpButton: js.Any = js.undefined

  /**
    * <p>An array of series configurations for the drill down. Each series
    * configuration uses the same syntax as the <a href="#series">series</a> option set.
    * These drilldown series are hidden by default. The drilldown series is
    * linked to the parent series&#39; point by its <code>id</code>.</p>
    * @since 3.0.8
    */
  var series: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object Drilldown {
  /**
    * @param activeAxisLabelStyle <p>Additional styles to apply to the X axis label for a point that. has drilldown data. By default it is underlined and blue to invite. to interaction.</p>. <p>In styled mode, active label styles can be set with the. <code>.highcharts-drilldown-axis-label</code> class.</p>
    * @param activeDataLabelStyle <p>Additional styles to apply to the data label of a point that has. drilldown data. By default it is underlined and blue to invite to. interaction.</p>. <p>In styled mode, active data label styles can be applied with the. <code>.highcharts-drilldown-data-label</code> class.</p>
    * @param allowPointDrilldown <p>When this option is false, clicking a single point will drill down. all points in the same category, equivalent to clicking the X axis. label.</p>
    * @param animation <p>Set the animation for all drilldown animations. Animation of a drilldown. occurs when drilling between a column point and a column series,. or a pie slice and a full pie series. Drilldown can still be used. between series and points of different types, but animation will. not occur.</p>. <p>The animation can either be set as a boolean or a configuration. object. If <code>true</code>, it will use the &#39;swing&#39; jQuery easing and a duration. of 500 ms. If used as a configuration object, the following properties. are supported:</p>. <ul>. <li><p><code>duration</code>: The duration of the animation in milliseconds.</p>. </li>. <li><p><code>easing</code>: A string reference to an easing function set on the <code>Math</code>. object. See. <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</p>. </li>. </ul>
    * @param drillUpButton <p>Options for the drill up button that appears when drilling down on a. series. The text for the button is defined in. <a href="#lang.drillUpText">lang.drillUpText</a>.</p>
    * @param series <p>An array of series configurations for the drill down. Each series. configuration uses the same syntax as the <a href="#series">series</a> option set.. These drilldown series are hidden by default. The drilldown series is. linked to the parent series&#39; point by its <code>id</code>.</p>
    */
  def apply(activeAxisLabelStyle: js.UndefOr[js.Object] = js.undefined, activeDataLabelStyle: js.UndefOr[js.Object] = js.undefined, allowPointDrilldown: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, drillUpButton: js.UndefOr[js.Any] = js.undefined, series: js.UndefOr[js.Array[js.Object]] = js.undefined): Drilldown = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Drilldown {
      this.activeAxisLabelStyle = activeAxisLabelStyle
      this.activeDataLabelStyle = activeDataLabelStyle
      this.allowPointDrilldown = allowPointDrilldown
      this.animation = animation
      this.drillUpButton = drillUpButton
      this.series = series
    })
  }
}
