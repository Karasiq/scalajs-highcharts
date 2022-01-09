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
  * @note JavaScript name: <code>accessibility</code>
  */
class Accessibility extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Options for announcing new data to screen reader users. Useful
    * for dynamic data applications and drilldown.</p>
    * <p>Keep in mind that frequent announcements will not be useful to
    * users, as they won&#39;t have time to explore the new data. For these
    * applications, consider making snapshots of the data accessible, and
    * do the announcements in batches.</p>
    * @since 7.1.0
    */
  var announceNewData: js.Any = js.undefined

  /**
    * <p>A hook for adding custom components to the accessibility module.
    * Should be an object mapping component names to instances of classes
    * inheriting from the Highcharts.AccessibilityComponent base class.
    * Remember to add the component to the
    * <a href="#accessibility.keyboardNavigation.order">keyboardNavigation.order</a>
    * for the keyboard navigation to be usable.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/custom-component">Custom accessibility component</a>
    * @since 7.1.0
    */
  var customComponents: js.Any = js.undefined

  /**
    * <p>A text description of the chart.</p>
    * <p><strong>Note: Prefer using <a href="#accessibility.linkedDescription">linkedDescription</a>
    * or <a href="#caption.text">caption</a> instead.</strong></p>
    * <p>If the Accessibility module is loaded, this option is included by
    * default as a long description of the chart in the hidden screen
    * reader information region.</p>
    * <p>Note: Since Highcharts now supports captions and linked descriptions,
    * it is preferred to define the description using those methods, as a
    * visible caption/description benefits all users. If the
    * <code>accessibility.description</code> option is defined, the linked description
    * is ignored, and the caption is hidden from screen reader users.</p>
    * @since 5.0.0
    */
  var description: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable accessibility functionality for the chart.</p>
    * @since 5.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Theme to apply to the chart when Windows High Contrast Mode is
    * detected. By default, a high contrast theme matching the high
    * contrast system system colors is used.</p>
    * @since 7.1.3
    */
  var highContrastTheme: js.Any = js.undefined

  /**
    * <p>Options for keyboard navigation.</p>
    * @since 5.0.0
    */
  var keyboardNavigation: js.Any = js.undefined

  /**
    * <p>Amount of landmarks/regions to create for screen reader users. More
    * landmarks can make navigation with screen readers easier, but can
    * be distracting if there are lots of charts on the page. Three modes
    * are available:</p>
    * <ul>
    * <li><code>all</code>: Adds regions for all series, legend, information
    *   region.</li>
    * <li><code>one</code>: Adds a single landmark per chart.</li>
    * <li><code>disabled</code>: No landmarks are added.</li>
    * </ul>
    * @since 7.1.0
    */
  var landmarkVerbosity: js.UndefOr[String] = js.undefined

  /**
    * <p>Link the chart to an HTML element describing the contents of the
    * chart.</p>
    * <p>It is always recommended to describe charts using visible text, to
    * improve SEO as well as accessibility for users with disabilities.
    * This option lets an HTML element with a description be linked to the
    * chart, so that screen reader users can connect the two.</p>
    * <p>By setting this option to a string, Highcharts runs the string as an
    * HTML selector query on the entire document. If there is only a single
    * match, this element is linked to the chart. The content of the linked
    * element will be included in the chart description for screen reader
    * users.</p>
    * <p>By default, the chart looks for an adjacent sibling element with the
    * <code>highcharts-description</code> class.</p>
    * <p>The feature can be disabled by setting the option to an empty string,
    * or overridden by providing the
    * <a href="#accessibility.description">accessibility.description</a> option.
    * Alternatively, the HTML element to link can be passed in directly as
    * an HTML node.</p>
    * <p>If you need the description to be part of the exported image,
    * consider using the <a href="#caption">caption</a> feature.</p>
    * <p>If you need the description to be hidden visually, use the
    * <a href="#accessibility.description">accessibility.description</a> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/accessible-line">Accessible line chart</a>
    * @since 8.0.0
    */
  var linkedDescription: js.UndefOr[String | dom.Element] = js.undefined

  /**
    * <p>Options for descriptions of individual data points.</p>
    * @since 8.0.0
    */
  var point: js.Any = js.undefined

  /**
    * <p>Accessibility options for the screen reader information sections
    * added before and after the chart.</p>
    * @since 8.0.0
    */
  var screenReaderSection: js.Any = js.undefined

  /**
    * <p>Accessibility options global to all data series. Individual series
    * can also have specific <a href="#plotOptions.series.accessibility">accessibility options</a>
    * set.</p>
    * @since 8.0.0
    */
  var series: js.Any = js.undefined

  /**
    * <p>A text description of the chart type.</p>
    * <p>If the Accessibility module is loaded, this will be included in the
    * description of the chart in the screen reader information region.</p>
    * <p>Highcharts will by default attempt to guess the chart type, but for
    * more complex charts it is recommended to specify this property for
    * clarity.</p>
    * @since 5.0.0
    */
  var typeDescription: js.UndefOr[String] = js.undefined
}

object Accessibility {
  /**
    * @param announceNewData <p>Options for announcing new data to screen reader users. Useful. for dynamic data applications and drilldown.</p>. <p>Keep in mind that frequent announcements will not be useful to. users, as they won&#39;t have time to explore the new data. For these. applications, consider making snapshots of the data accessible, and. do the announcements in batches.</p>
    * @param customComponents <p>A hook for adding custom components to the accessibility module.. Should be an object mapping component names to instances of classes. inheriting from the Highcharts.AccessibilityComponent base class.. Remember to add the component to the. <a href="#accessibility.keyboardNavigation.order">keyboardNavigation.order</a>. for the keyboard navigation to be usable.</p>
    * @param description <p>A text description of the chart.</p>. <p><strong>Note: Prefer using <a href="#accessibility.linkedDescription">linkedDescription</a>. or <a href="#caption.text">caption</a> instead.</strong></p>. <p>If the Accessibility module is loaded, this option is included by. default as a long description of the chart in the hidden screen. reader information region.</p>. <p>Note: Since Highcharts now supports captions and linked descriptions,. it is preferred to define the description using those methods, as a. visible caption/description benefits all users. If the. <code>accessibility.description</code> option is defined, the linked description. is ignored, and the caption is hidden from screen reader users.</p>
    * @param enabled <p>Enable accessibility functionality for the chart.</p>
    * @param highContrastTheme <p>Theme to apply to the chart when Windows High Contrast Mode is. detected. By default, a high contrast theme matching the high. contrast system system colors is used.</p>
    * @param keyboardNavigation <p>Options for keyboard navigation.</p>
    * @param landmarkVerbosity <p>Amount of landmarks/regions to create for screen reader users. More. landmarks can make navigation with screen readers easier, but can. be distracting if there are lots of charts on the page. Three modes. are available:</p>. <ul>. <li><code>all</code>: Adds regions for all series, legend, information.   region.</li>. <li><code>one</code>: Adds a single landmark per chart.</li>. <li><code>disabled</code>: No landmarks are added.</li>. </ul>
    * @param linkedDescription <p>Link the chart to an HTML element describing the contents of the. chart.</p>. <p>It is always recommended to describe charts using visible text, to. improve SEO as well as accessibility for users with disabilities.. This option lets an HTML element with a description be linked to the. chart, so that screen reader users can connect the two.</p>. <p>By setting this option to a string, Highcharts runs the string as an. HTML selector query on the entire document. If there is only a single. match, this element is linked to the chart. The content of the linked. element will be included in the chart description for screen reader. users.</p>. <p>By default, the chart looks for an adjacent sibling element with the. <code>highcharts-description</code> class.</p>. <p>The feature can be disabled by setting the option to an empty string,. or overridden by providing the. <a href="#accessibility.description">accessibility.description</a> option.. Alternatively, the HTML element to link can be passed in directly as. an HTML node.</p>. <p>If you need the description to be part of the exported image,. consider using the <a href="#caption">caption</a> feature.</p>. <p>If you need the description to be hidden visually, use the. <a href="#accessibility.description">accessibility.description</a> option.</p>
    * @param point <p>Options for descriptions of individual data points.</p>
    * @param screenReaderSection <p>Accessibility options for the screen reader information sections. added before and after the chart.</p>
    * @param series <p>Accessibility options global to all data series. Individual series. can also have specific <a href="#plotOptions.series.accessibility">accessibility options</a>. set.</p>
    * @param typeDescription <p>A text description of the chart type.</p>. <p>If the Accessibility module is loaded, this will be included in the. description of the chart in the screen reader information region.</p>. <p>Highcharts will by default attempt to guess the chart type, but for. more complex charts it is recommended to specify this property for. clarity.</p>
    */
  def apply(announceNewData: js.UndefOr[js.Any] = js.undefined, customComponents: js.UndefOr[js.Any] = js.undefined, description: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, highContrastTheme: js.UndefOr[js.Any] = js.undefined, keyboardNavigation: js.UndefOr[js.Any] = js.undefined, landmarkVerbosity: js.UndefOr[String] = js.undefined, linkedDescription: js.UndefOr[String | dom.Element] = js.undefined, point: js.UndefOr[js.Any] = js.undefined, screenReaderSection: js.UndefOr[js.Any] = js.undefined, series: js.UndefOr[js.Any] = js.undefined, typeDescription: js.UndefOr[String] = js.undefined): Accessibility = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Accessibility {
      this.announceNewData = announceNewData
      this.customComponents = customComponents
      this.description = description
      this.enabled = enabled
      this.highContrastTheme = highContrastTheme
      this.keyboardNavigation = keyboardNavigation
      this.landmarkVerbosity = landmarkVerbosity
      this.linkedDescription = linkedDescription
      this.point = point
      this.screenReaderSection = screenReaderSection
      this.series = series
      this.typeDescription = typeDescription
    })
  }
}
