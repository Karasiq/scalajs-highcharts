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
  * @note JavaScript name: <code>accessibility</code>
  */
@js.annotation.ScalaJSDefined
class Accessibility extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Options for keyboard navigation.</p>
    * @since 5.0.0
    */
  val keyboardNavigation: js.UndefOr[CleanJsObject[AccessibilityKeyboardNavigation]] = js.undefined

  /**
    * <p>Enable accessibility features for the chart.</p>
    * @since 5.0.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When a series contains more points than this, we no longer expose
    * information about individual points to screen readers.</p>
    * <p>Set to <code>false</code> to disable.</p>
    * @since 5.0.0
    */
  val pointDescriptionThreshold: js.UndefOr[Double | Boolean] = js.undefined

  /**
    * <p>A formatter function to create the HTML contents of the hidden screen
    * reader information region. Receives one argument, <code>chart</code>, referring
    * to the chart object. Should return a String with the HTML content
    * of the region.</p>
    * <p>The link to view the chart as a data table will be added
    * automatically after the custom HTML content.</p>
    * @since 5.0.0
    */
  val screenReaderSectionFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Whether or not to add series descriptions to charts with a single
    * series.</p>
    * @since 5.0.0
    */
  val describeSingleSeries: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Function to run upon clicking the &quot;View as Data Table&quot; link in the
    * screen reader region.</p>
    * <p>By default Highcharts will insert and set focus to a data table
    * representation of the chart.</p>
    * @since 5.0.0
    */
  val onTableAnchorClick: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Date format to use for points on datetime axes when describing them
    * to screen reader users.</p>
    * <p>Defaults to the same format as in tooltip.</p>
    * <p>For an overview of the replacement codes, see
    * <a href="/class-reference/Highcharts#dateFormat">dateFormat</a>.</p>
    * @since 5.0.0
    */
  val pointDateFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Formatter function to determine the date/time format used with
    * points on datetime axes when describing them to screen reader users.
    * Receives one argument, <code>point</code>, referring to the point to describe.
    * Should return a date format string compatible with
    * <a href="/class-reference/Highcharts#dateFormat">dateFormat</a>.</p>
    * @since 5.0.0
    */
  val pointDateFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Formatter function to use instead of the default for point
    * descriptions.
    * Receives one argument, <code>point</code>, referring to the point to describe.
    * Should return a String with the description of the point for a screen
    * reader user.</p>
    * @since 5.0.0
    */
  val pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Formatter function to use instead of the default for series
    * descriptions. Receives one argument, <code>series</code>, referring to the
    * series to describe. Should return a String with the description of
    * the series for a screen reader user.</p>
    * @since 5.0.0
    */
  val seriesDescriptionFormatter: js.UndefOr[js.Function] = js.undefined
}

object Accessibility {
  /**
    * @param keyboardNavigation <p>Options for keyboard navigation.</p>
    * @param enabled <p>Enable accessibility features for the chart.</p>
    * @param pointDescriptionThreshold <p>When a series contains more points than this, we no longer expose. information about individual points to screen readers.</p>. <p>Set to <code>false</code> to disable.</p>
    * @param screenReaderSectionFormatter <p>A formatter function to create the HTML contents of the hidden screen. reader information region. Receives one argument, <code>chart</code>, referring. to the chart object. Should return a String with the HTML content. of the region.</p>. <p>The link to view the chart as a data table will be added. automatically after the custom HTML content.</p>
    * @param describeSingleSeries <p>Whether or not to add series descriptions to charts with a single. series.</p>
    * @param onTableAnchorClick <p>Function to run upon clicking the &quot;View as Data Table&quot; link in the. screen reader region.</p>. <p>By default Highcharts will insert and set focus to a data table. representation of the chart.</p>
    * @param pointDateFormat <p>Date format to use for points on datetime axes when describing them. to screen reader users.</p>. <p>Defaults to the same format as in tooltip.</p>. <p>For an overview of the replacement codes, see. <a href="/class-reference/Highcharts#dateFormat">dateFormat</a>.</p>
    * @param pointDateFormatter <p>Formatter function to determine the date/time format used with. points on datetime axes when describing them to screen reader users.. Receives one argument, <code>point</code>, referring to the point to describe.. Should return a date format string compatible with. <a href="/class-reference/Highcharts#dateFormat">dateFormat</a>.</p>
    * @param pointDescriptionFormatter <p>Formatter function to use instead of the default for point. descriptions.. Receives one argument, <code>point</code>, referring to the point to describe.. Should return a String with the description of the point for a screen. reader user.</p>
    * @param seriesDescriptionFormatter <p>Formatter function to use instead of the default for series. descriptions. Receives one argument, <code>series</code>, referring to the. series to describe. Should return a String with the description of. the series for a screen reader user.</p>
    */
  def apply(keyboardNavigation: js.UndefOr[CleanJsObject[AccessibilityKeyboardNavigation]] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, pointDescriptionThreshold: js.UndefOr[Double | Boolean] = js.undefined, screenReaderSectionFormatter: js.UndefOr[js.Function] = js.undefined, describeSingleSeries: js.UndefOr[Boolean] = js.undefined, onTableAnchorClick: js.UndefOr[js.Function] = js.undefined, pointDateFormat: js.UndefOr[String] = js.undefined, pointDateFormatter: js.UndefOr[js.Function] = js.undefined, pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined, seriesDescriptionFormatter: js.UndefOr[js.Function] = js.undefined): Accessibility = {
    val keyboardNavigationOuter: js.UndefOr[CleanJsObject[AccessibilityKeyboardNavigation]] = keyboardNavigation
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val pointDescriptionThresholdOuter: js.UndefOr[Double | Boolean] = pointDescriptionThreshold
    val screenReaderSectionFormatterOuter: js.UndefOr[js.Function] = screenReaderSectionFormatter
    val describeSingleSeriesOuter: js.UndefOr[Boolean] = describeSingleSeries
    val onTableAnchorClickOuter: js.UndefOr[js.Function] = onTableAnchorClick
    val pointDateFormatOuter: js.UndefOr[String] = pointDateFormat
    val pointDateFormatterOuter: js.UndefOr[js.Function] = pointDateFormatter
    val pointDescriptionFormatterOuter: js.UndefOr[js.Function] = pointDescriptionFormatter
    val seriesDescriptionFormatterOuter: js.UndefOr[js.Function] = seriesDescriptionFormatter
    com.highcharts.HighchartsGenericObject.toCleanObject(new Accessibility {
      override val keyboardNavigation: js.UndefOr[CleanJsObject[AccessibilityKeyboardNavigation]] = keyboardNavigationOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val pointDescriptionThreshold: js.UndefOr[Double | Boolean] = pointDescriptionThresholdOuter
      override val screenReaderSectionFormatter: js.UndefOr[js.Function] = screenReaderSectionFormatterOuter
      override val describeSingleSeries: js.UndefOr[Boolean] = describeSingleSeriesOuter
      override val onTableAnchorClick: js.UndefOr[js.Function] = onTableAnchorClickOuter
      override val pointDateFormat: js.UndefOr[String] = pointDateFormatOuter
      override val pointDateFormatter: js.UndefOr[js.Function] = pointDateFormatterOuter
      override val pointDescriptionFormatter: js.UndefOr[js.Function] = pointDescriptionFormatterOuter
      override val seriesDescriptionFormatter: js.UndefOr[js.Function] = seriesDescriptionFormatterOuter
    })
  }
}
