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
  * @note JavaScript name: <code>lang-accessibility-series</code>
  */
class LangAccessibilitySeries extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>User supplied description text. This is added in the point
    * comment description by default if present.</p>
    * @since 6.0.6
    */
  var description: js.UndefOr[String] = js.undefined

  /**
    * <p>Description for the value of null points.</p>
    * @since 8.0.0
    */
  var nullPointValue: js.UndefOr[String] = js.undefined

  /**
    * <p>Description for annotations on a point, as it is made available
    * to assistive technology.</p>
    * @since 8.0.1
    */
  var pointAnnotationsDescription: js.UndefOr[String] = js.undefined

  /**
    * <p>Lang configuration for the series main summary. Each series
    * type has two modes:</p>
    * <ol>
    * <li><p>This series type is the only series type used in the
    * chart</p>
    * </li>
    * <li><p>This is a combination chart with multiple series types</p>
    * </li>
    * </ol>
    * <p>If a definition does not exist for the specific series type
    * and mode, the &#39;default&#39; lang definitions are used.</p>
    * @since 6.0.6
    */
  var summary: js.Any = js.undefined

  /**
    * <p>xAxis description for series if there are multiple xAxes in
    * the chart.</p>
    * @since 6.0.6
    */
  var xAxisDescription: js.UndefOr[String] = js.undefined

  /**
    * <p>yAxis description for series if there are multiple yAxes in
    * the chart.</p>
    * @since 6.0.6
    */
  var yAxisDescription: js.UndefOr[String] = js.undefined
}

object LangAccessibilitySeries {
  /**
    * @param description <p>User supplied description text. This is added in the point. comment description by default if present.</p>
    * @param nullPointValue <p>Description for the value of null points.</p>
    * @param pointAnnotationsDescription <p>Description for annotations on a point, as it is made available. to assistive technology.</p>
    * @param summary <p>Lang configuration for the series main summary. Each series. type has two modes:</p>. <ol>. <li><p>This series type is the only series type used in the. chart</p>. </li>. <li><p>This is a combination chart with multiple series types</p>. </li>. </ol>. <p>If a definition does not exist for the specific series type. and mode, the &#39;default&#39; lang definitions are used.</p>
    * @param xAxisDescription <p>xAxis description for series if there are multiple xAxes in. the chart.</p>
    * @param yAxisDescription <p>yAxis description for series if there are multiple yAxes in. the chart.</p>
    */
  def apply(description: js.UndefOr[String] = js.undefined, nullPointValue: js.UndefOr[String] = js.undefined, pointAnnotationsDescription: js.UndefOr[String] = js.undefined, summary: js.UndefOr[js.Any] = js.undefined, xAxisDescription: js.UndefOr[String] = js.undefined, yAxisDescription: js.UndefOr[String] = js.undefined): LangAccessibilitySeries = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibilitySeries {
      this.description = description
      this.nullPointValue = nullPointValue
      this.pointAnnotationsDescription = pointAnnotationsDescription
      this.summary = summary
      this.xAxisDescription = xAxisDescription
      this.yAxisDescription = yAxisDescription
    })
  }
}
