/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>accessibility-point</code>
  */
class AccessibilityPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Date format to use for points on datetime axes when describing
    * them to screen reader users.</p>
    * <p>Defaults to the same format as in tooltip.</p>
    * <p>For an overview of the replacement codes, see
    * <a href="/class-reference/Highcharts.Time#dateFormat">dateFormat</a>.</p>
    * @since 8.0.0
    */
  var dateFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Formatter function to determine the date/time format used with
    * points on datetime axes when describing them to screen reader
    * users. Receives one argument, <code>point</code>, referring to the point
    * to describe. Should return a date format string compatible with
    * <a href="/class-reference/Highcharts.Time#dateFormat">dateFormat</a>.</p>
    * @since 8.0.0
    */
  var dateFormatter: js.Any = js.undefined

  /**
    * <p>Formatter function to use instead of the default for point
    * descriptions.</p>
    * <p>Receives one argument, <code>point</code>, referring to the point to
    * describe. Should return a string with the description of the
    * point for a screen reader user. If <code>false</code> is returned, the
    * default formatter will be used for that point.</p>
    * <p>Note: Prefer using <a href="#accessibility.point.valueDescriptionFormat">accessibility.point.valueDescriptionFormat</a>
    * instead if possible, as default functionality such as describing
    * annotations will be preserved.</p>
    * @since 8.0.0
    */
  var descriptionFormatter: js.Any = js.undefined

  /**
    * <p>Decimals to use for the values in the point descriptions. Uses
    * <a href="#tooltip.valueDecimals">tooltip.valueDecimals</a> if not defined.</p>
    * @since 8.0.0
    */
  var valueDecimals: js.UndefOr[Double] = js.undefined

  /**
    * <p>Format to use for describing the values of data points
    * to assistive technology - including screen readers.
    * The point context is available as <code>{point}</code>.</p>
    * <p>Additionally, the series name, annotation info, and
    * description added in <code>point.accessibility.description</code>
    * is added by default if relevant. To override this, use the
    * <a href="#accessibility.point.descriptionFormatter">accessibility.point.descriptionFormatter</a>
    * option.</p>
    * @since 8.0.1
    */
  var valueDescriptionFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Prefix to add to the values in the point descriptions. Uses
    * <a href="#tooltip.valuePrefix">tooltip.valuePrefix</a> if not defined.</p>
    * @since 8.0.0
    */
  var valuePrefix: js.UndefOr[String] = js.undefined

  /**
    * <p>Suffix to add to the values in the point descriptions. Uses
    * <a href="#tooltip.valueSuffix">tooltip.valueSuffix</a> if not defined.</p>
    * @since 8.0.0
    */
  var valueSuffix: js.UndefOr[String] = js.undefined
}

object AccessibilityPoint {
  /**
    * @param dateFormat <p>Date format to use for points on datetime axes when describing. them to screen reader users.</p>. <p>Defaults to the same format as in tooltip.</p>. <p>For an overview of the replacement codes, see. <a href="/class-reference/Highcharts.Time#dateFormat">dateFormat</a>.</p>
    * @param dateFormatter <p>Formatter function to determine the date/time format used with. points on datetime axes when describing them to screen reader. users. Receives one argument, <code>point</code>, referring to the point. to describe. Should return a date format string compatible with. <a href="/class-reference/Highcharts.Time#dateFormat">dateFormat</a>.</p>
    * @param descriptionFormatter <p>Formatter function to use instead of the default for point. descriptions.</p>. <p>Receives one argument, <code>point</code>, referring to the point to. describe. Should return a string with the description of the. point for a screen reader user. If <code>false</code> is returned, the. default formatter will be used for that point.</p>. <p>Note: Prefer using <a href="#accessibility.point.valueDescriptionFormat">accessibility.point.valueDescriptionFormat</a>. instead if possible, as default functionality such as describing. annotations will be preserved.</p>
    * @param valueDecimals <p>Decimals to use for the values in the point descriptions. Uses. <a href="#tooltip.valueDecimals">tooltip.valueDecimals</a> if not defined.</p>
    * @param valueDescriptionFormat <p>Format to use for describing the values of data points. to assistive technology - including screen readers.. The point context is available as <code>{point}</code>.</p>. <p>Additionally, the series name, annotation info, and. description added in <code>point.accessibility.description</code>. is added by default if relevant. To override this, use the. <a href="#accessibility.point.descriptionFormatter">accessibility.point.descriptionFormatter</a>. option.</p>
    * @param valuePrefix <p>Prefix to add to the values in the point descriptions. Uses. <a href="#tooltip.valuePrefix">tooltip.valuePrefix</a> if not defined.</p>
    * @param valueSuffix <p>Suffix to add to the values in the point descriptions. Uses. <a href="#tooltip.valueSuffix">tooltip.valueSuffix</a> if not defined.</p>
    */
  def apply(dateFormat: js.UndefOr[String] = js.undefined, dateFormatter: js.UndefOr[js.Any] = js.undefined, descriptionFormatter: js.UndefOr[js.Any] = js.undefined, valueDecimals: js.UndefOr[Double] = js.undefined, valueDescriptionFormat: js.UndefOr[String] = js.undefined, valuePrefix: js.UndefOr[String] = js.undefined, valueSuffix: js.UndefOr[String] = js.undefined): AccessibilityPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AccessibilityPoint {
      this.dateFormat = dateFormat
      this.dateFormatter = dateFormatter
      this.descriptionFormatter = descriptionFormatter
      this.valueDecimals = valueDecimals
      this.valueDescriptionFormat = valueDescriptionFormat
      this.valuePrefix = valuePrefix
      this.valueSuffix = valueSuffix
    })
  }
}
