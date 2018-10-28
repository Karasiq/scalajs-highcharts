/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>drilldown</code>
  */
@js.annotation.ScalaJSDefined
class Drilldown extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Additional styles to apply to the X axis label for a point that
    * has drilldown data. By default it is underlined and blue to invite
    * to interaction.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/labels/">Label styles</a>
    * @since 3.0.8
    */
  val activeAxisLabelStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Additional styles to apply to the data label of a point that has
    * drilldown data. By default it is underlined and blue to invite to
    * interaction.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/labels/">Label styles</a>
    * @since 3.0.8
    */
  val activeDataLabelStyle: js.UndefOr[js.Object] = js.undefined

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
    * <dl>
    * 
    * <dt>duration</dt>
    * 
    * <dd>The duration of the animation in milliseconds.</dd>
    * 
    * <dt>easing</dt>
    * 
    * <dd>A string reference to an easing function set on the `Math` object.
    * See [the easing demo](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-
    * animation-easing/).</dd>
    * 
    * </dl>
    * @since 3.0.8
    */
  val animation: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Options for the drill up button that appears when drilling down
    * on a series. The text for the button is defined in
    * <a href="#lang.drillUpText">lang.drillUpText</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/drillupbutton/">Drill up button</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/drillupbutton/">Drill up button</a>
    * @since 3.0.8
    */
  val drillUpButton: js.UndefOr[CleanJsObject[DrilldownDrillUpButton]] = js.undefined

  /**
    * <p>When this option is false, clicking a single point will drill down
    * all points in the same category, equivalent to clicking the X axis
    * label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/allowpointdrilldown-false/">Don't allow point drilldown</a>
    * @since 4.1.7
    */
  val allowPointDrilldown: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>An array of series configurations for the drill down. Each series
    * configuration uses the same syntax as the <a href="#series">series</a> option
    * set. These drilldown series are hidden by default. The drilldown
    * series is linked to the parent series&#39; point by its <code>id</code>.</p>
    * @since 3.0.8
    */
  val series: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object Drilldown {
  /**
    * @param activeAxisLabelStyle <p>Additional styles to apply to the X axis label for a point that. has drilldown data. By default it is underlined and blue to invite. to interaction.</p>
    * @param activeDataLabelStyle <p>Additional styles to apply to the data label of a point that has. drilldown data. By default it is underlined and blue to invite to. interaction.</p>
    * @param animation <p>Set the animation for all drilldown animations. Animation of a drilldown. occurs when drilling between a column point and a column series,. or a pie slice and a full pie series. Drilldown can still be used. between series and points of different types, but animation will. not occur.</p>. <p>The animation can either be set as a boolean or a configuration. object. If <code>true</code>, it will use the &#39;swing&#39; jQuery easing and a duration. of 500 ms. If used as a configuration object, the following properties. are supported:</p>. <dl>. . <dt>duration</dt>. . <dd>The duration of the animation in milliseconds.</dd>. . <dt>easing</dt>. . <dd>A string reference to an easing function set on the `Math` object.. See [the easing demo](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-. animation-easing/).</dd>. . </dl>
    * @param drillUpButton <p>Options for the drill up button that appears when drilling down. on a series. The text for the button is defined in. <a href="#lang.drillUpText">lang.drillUpText</a>.</p>
    * @param allowPointDrilldown <p>When this option is false, clicking a single point will drill down. all points in the same category, equivalent to clicking the X axis. label.</p>
    * @param series <p>An array of series configurations for the drill down. Each series. configuration uses the same syntax as the <a href="#series">series</a> option. set. These drilldown series are hidden by default. The drilldown. series is linked to the parent series&#39; point by its <code>id</code>.</p>
    */
  def apply(activeAxisLabelStyle: js.UndefOr[js.Object] = js.undefined, activeDataLabelStyle: js.UndefOr[js.Object] = js.undefined, animation: js.UndefOr[Boolean] = js.undefined, drillUpButton: js.UndefOr[CleanJsObject[DrilldownDrillUpButton]] = js.undefined, allowPointDrilldown: js.UndefOr[Boolean] = js.undefined, series: js.UndefOr[js.Array[js.Object]] = js.undefined): Drilldown = {
    val activeAxisLabelStyleOuter: js.UndefOr[js.Object] = activeAxisLabelStyle
    val activeDataLabelStyleOuter: js.UndefOr[js.Object] = activeDataLabelStyle
    val animationOuter: js.UndefOr[Boolean] = animation
    val drillUpButtonOuter: js.UndefOr[CleanJsObject[DrilldownDrillUpButton]] = drillUpButton
    val allowPointDrilldownOuter: js.UndefOr[Boolean] = allowPointDrilldown
    val seriesOuter: js.UndefOr[js.Array[js.Object]] = series
    com.highcharts.HighchartsGenericObject.toCleanObject(new Drilldown {
      override val activeAxisLabelStyle: js.UndefOr[js.Object] = activeAxisLabelStyleOuter
      override val activeDataLabelStyle: js.UndefOr[js.Object] = activeDataLabelStyleOuter
      override val animation: js.UndefOr[Boolean] = animationOuter
      override val drillUpButton: js.UndefOr[CleanJsObject[DrilldownDrillUpButton]] = drillUpButtonOuter
      override val allowPointDrilldown: js.UndefOr[Boolean] = allowPointDrilldownOuter
      override val series: js.UndefOr[js.Array[js.Object]] = seriesOuter
    })
  }
}
