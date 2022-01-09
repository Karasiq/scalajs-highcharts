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
  * @note JavaScript name: <code>accessibility-screenReaderSection</code>
  */
class AccessibilityScreenReaderSection extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Format for the screen reader information region after the chart.
    * Analogous to <a href="#accessibility.screenReaderSection.beforeChartFormat">beforeChartFormat</a>.</p>
    * @since 8.0.0
    */
  var afterChartFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>A formatter function to create the HTML contents of the hidden
    * screen reader information region after the chart. Analogous to
    * <a href="#accessibility.screenReaderSection.beforeChartFormatter">beforeChartFormatter</a>.</p>
    * @since 8.0.0
    */
  var afterChartFormatter: js.Any = js.undefined

  /**
    * <p>Date format to use to describe range of datetime axes.</p>
    * <p>For an overview of the replacement codes, see
    * <a href="/class-reference/Highcharts.Time#dateFormat">dateFormat</a>.</p>
    * @since 8.0.0
    */
  var axisRangeDateFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Format for the screen reader information region before the chart.
    * Supported HTML tags are <code>&lt;h1-6&gt;</code>, <code>&lt;p&gt;</code>, <code>&lt;div&gt;</code>, <code>&lt;a&gt;</code>, <code>&lt;ul&gt;</code>,
    * <code>&lt;ol&gt;</code>, <code>&lt;li&gt;</code>, and <code>&lt;button&gt;</code>. Attributes are not supported,
    * except for id on <code>&lt;div&gt;</code>, <code>&lt;a&gt;</code>, and <code>&lt;button&gt;</code>. Id is required
    * on <code>&lt;a&gt;</code> and <code>&lt;button&gt;</code> in the format <code>&lt;tag id=&quot;abcd&quot;&gt;</code>. Numbers,
    * lower- and uppercase letters, &quot;-&quot; and &quot;#&quot; are valid characters in
    * IDs.</p>
    * <p>The headingTagName is an auto-detected heading (h1-h6) that
    * corresponds to the heading level below the previous heading in
    * the DOM.</p>
    * <p>Set to empty string to remove the region altogether.</p>
    * @since 8.0.0
    */
  var beforeChartFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>A formatter function to create the HTML contents of the hidden
    * screen reader information region before the chart. Receives one
    * argument, <code>chart</code>, referring to the chart object. Should return a
    * string with the HTML content of the region. By default this
    * returns an automatic description of the chart based on
    * <a href="#accessibility.screenReaderSection.beforeChartFormat">beforeChartFormat</a>.</p>
    * @since 8.0.0
    */
  var beforeChartFormatter: js.Any = js.undefined

  /**
    * <p>Function to run upon clicking the &quot;Play as sound&quot; button in
    * the screen reader region.</p>
    * <p>By default Highcharts will call the <code>chart.sonify</code> function.</p>
    * @since 8.0.1
    */
  var onPlayAsSoundClick: js.Any = js.undefined

  /**
    * <p>Function to run upon clicking the &quot;View as Data Table&quot; link in
    * the screen reader region.</p>
    * <p>By default Highcharts will insert and set focus to a data table
    * representation of the chart.</p>
    * @since 8.0.0
    */
  var onViewDataTableClick: js.Any = js.undefined
}

object AccessibilityScreenReaderSection {
  /**
    * @param afterChartFormat <p>Format for the screen reader information region after the chart.. Analogous to <a href="#accessibility.screenReaderSection.beforeChartFormat">beforeChartFormat</a>.</p>
    * @param afterChartFormatter <p>A formatter function to create the HTML contents of the hidden. screen reader information region after the chart. Analogous to. <a href="#accessibility.screenReaderSection.beforeChartFormatter">beforeChartFormatter</a>.</p>
    * @param axisRangeDateFormat <p>Date format to use to describe range of datetime axes.</p>. <p>For an overview of the replacement codes, see. <a href="/class-reference/Highcharts.Time#dateFormat">dateFormat</a>.</p>
    * @param beforeChartFormat <p>Format for the screen reader information region before the chart.. Supported HTML tags are <code>&lt;h1-6&gt;</code>, <code>&lt;p&gt;</code>, <code>&lt;div&gt;</code>, <code>&lt;a&gt;</code>, <code>&lt;ul&gt;</code>,. <code>&lt;ol&gt;</code>, <code>&lt;li&gt;</code>, and <code>&lt;button&gt;</code>. Attributes are not supported,. except for id on <code>&lt;div&gt;</code>, <code>&lt;a&gt;</code>, and <code>&lt;button&gt;</code>. Id is required. on <code>&lt;a&gt;</code> and <code>&lt;button&gt;</code> in the format <code>&lt;tag id=&quot;abcd&quot;&gt;</code>. Numbers,. lower- and uppercase letters, &quot;-&quot; and &quot;#&quot; are valid characters in. IDs.</p>. <p>The headingTagName is an auto-detected heading (h1-h6) that. corresponds to the heading level below the previous heading in. the DOM.</p>. <p>Set to empty string to remove the region altogether.</p>
    * @param beforeChartFormatter <p>A formatter function to create the HTML contents of the hidden. screen reader information region before the chart. Receives one. argument, <code>chart</code>, referring to the chart object. Should return a. string with the HTML content of the region. By default this. returns an automatic description of the chart based on. <a href="#accessibility.screenReaderSection.beforeChartFormat">beforeChartFormat</a>.</p>
    * @param onPlayAsSoundClick <p>Function to run upon clicking the &quot;Play as sound&quot; button in. the screen reader region.</p>. <p>By default Highcharts will call the <code>chart.sonify</code> function.</p>
    * @param onViewDataTableClick <p>Function to run upon clicking the &quot;View as Data Table&quot; link in. the screen reader region.</p>. <p>By default Highcharts will insert and set focus to a data table. representation of the chart.</p>
    */
  def apply(afterChartFormat: js.UndefOr[String] = js.undefined, afterChartFormatter: js.UndefOr[js.Any] = js.undefined, axisRangeDateFormat: js.UndefOr[String] = js.undefined, beforeChartFormat: js.UndefOr[String] = js.undefined, beforeChartFormatter: js.UndefOr[js.Any] = js.undefined, onPlayAsSoundClick: js.UndefOr[js.Any] = js.undefined, onViewDataTableClick: js.UndefOr[js.Any] = js.undefined): AccessibilityScreenReaderSection = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AccessibilityScreenReaderSection {
      this.afterChartFormat = afterChartFormat
      this.afterChartFormatter = afterChartFormatter
      this.axisRangeDateFormat = axisRangeDateFormat
      this.beforeChartFormat = beforeChartFormat
      this.beforeChartFormatter = beforeChartFormatter
      this.onPlayAsSoundClick = onPlayAsSoundClick
      this.onViewDataTableClick = onViewDataTableClick
    })
  }
}
