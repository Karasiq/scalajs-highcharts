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
  * @note JavaScript name: <code>annotations-measure-typeOptions-label</code>
  */
class AnnotationsMeasureTypeOptionsLabel extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the label text (min, max, average,
    * bins values).</p>
    * <p>Defaults to true.</p>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Formatter function for the label text.</p>
    * <p>Available data are:</p>
    * <table>
    * 
    * <tbody>
    * 
    * <tr>
    * 
    * <td>`this.min`</td>
    * 
    * <td>The mininimum value of the points in the selected
    * range.</td>
    * 
    * </tr>
    * 
    * <tr>
    * 
    * <td>`this.max`</td>
    * 
    * <td>The maximum value of the points in the selected
    * range.</td>
    * 
    * </tr>
    * 
    * <tr>
    * 
    * <td>`this.average`</td>
    * 
    * <td>The average value of the points in the selected
    * range.</td>
    * 
    * </tr>
    * 
    * <tr>
    * 
    * <td>`this.bins`</td>
    * 
    * <td>The amount of the points in the selected range.</td>
    * 
    * </tr>
    * 
    * </table>
    * @since 6.0.0
    */
  var formatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>CSS styles for the measure label.</p>
    * @since 6.0.0
    */
  var style: js.UndefOr[js.Object] = js.undefined
}

object AnnotationsMeasureTypeOptionsLabel {
  /**
    * @param enabled <p>Enable or disable the label text (min, max, average,. bins values).</p>. <p>Defaults to true.</p>
    * @param formatter <p>Formatter function for the label text.</p>. <p>Available data are:</p>. <table>. . <tbody>. . <tr>. . <td>`this.min`</td>. . <td>The mininimum value of the points in the selected. range.</td>. . </tr>. . <tr>. . <td>`this.max`</td>. . <td>The maximum value of the points in the selected. range.</td>. . </tr>. . <tr>. . <td>`this.average`</td>. . <td>The average value of the points in the selected. range.</td>. . </tr>. . <tr>. . <td>`this.bins`</td>. . <td>The amount of the points in the selected range.</td>. . </tr>. . </table>
    * @param style <p>CSS styles for the measure label.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, formatter: js.UndefOr[js.Function] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): AnnotationsMeasureTypeOptionsLabel = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsMeasureTypeOptionsLabel {
      this.enabled = enabled
      this.formatter = formatter
      this.style = style
    })
  }
}
