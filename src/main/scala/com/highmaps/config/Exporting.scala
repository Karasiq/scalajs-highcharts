/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>exporting</code>
  */
@js.annotation.ScalaJSDefined
class Exporting extends js.Object {

  /**
    * <p>Experimental setting to allow HTML inside the chart (added through the <code>useHTML</code> options), directly in the exported image. This allows you to preserve complicated HTML structures like tables or bi-directional text in exported charts.</p>
    * 
    * <p>Disclaimer: The HTML is rendered in a <code>foreignObject</code> tag in the generated SVG. The official export server is based on PhantomJS, which supports this, but other SVG clients, like Batik, does not support it. This also applies to downloaded SVG that you want to open in a desktop client.</p>
    * @since 1.1.8
    */
  val allowHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * Options for the export related buttons, print and export. In addition to the default buttons listed here, custom buttons can be added. See <a href="#navigation.buttonOptions">navigation.buttonOptions</a> for general options.
    */
  val buttons: js.UndefOr[CleanJsObject[ExportingButtons]] = js.undefined

  /**
    * Additional chart options to be merged into an exported chart. For example, a common use case is to add data labels to improve readaility of the exported chart, or to add a printer-friendly color scheme.
    */
  val chartOptions: js.UndefOr[js.Object] = js.undefined

  /**
    * Whether to enable the exporting module. Disabling the module will hide the context button, but API methods will still be available.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Function to call if the offline-exporting module fails to export a chart on the client side, and <a href="#exporting.fallbackToExportServer">fallbackToExportServer</a> is disabled. If left undefined, an exception is thrown instead.
    * @since 5.0.0
    */
  val error: js.UndefOr[js.Function] = js.undefined

  /**
    * Whether or not to fall back to the export server if the offline-exporting module is unable to export the chart on the client side.
    * @since 1.1.8
    */
  val fallbackToExportServer: js.UndefOr[Boolean] = js.undefined

  /**
    * The filename, without extension, to use for the exported chart.
    */
  val filename: js.UndefOr[String] = js.undefined

  /**
    * An object containing additional attributes for the POST form that sends the SVG to the export server. For example, a <code>target</code> can be set to make sure the generated image is received in another frame, or a custom <code>enctype</code> or <code>encoding</code> can be set.
    */
  val formAttributes: js.UndefOr[js.Object] = js.undefined

  /**
    * Path where Highcharts will look for export module dependencies to load on demand if they don't already exist on <code>window</code>.
    * 
    * Should currently point to location of <a href="https://github.com/canvg/canvg">CanVG</a> library, <a href="https://github.com/canvg/canvg">RGBColor.js</a>, <a href="https://github.com/yWorks/jsPDF">jsPDF</a> and <a href="https://github.com/yWorks/svg2pdf.js">svg2pdf.js</a>, required for client side export in certain browsers.
    * @since 5.0.0
    */
  val libURL: js.UndefOr[String] = js.undefined

  /**
    * <p>An object consisting of definitions for the menu items in the context menu. Each key value pair has a <code>key</code> that is referenced in the <a href="#exporting.buttons.contextButton.menuItems">menuItems</a> setting, and a <code>value</code>, which is an object with the following properties:</p>
    * <dl>
    * <dt>onclick</dt>
    * <dd>The click handler for the menu item</dd>
    * <dt>text</dt>
    * <dd>The text for the menu item</dt>
    * <dt>textKey</dt>
    * <dd>If internationalization is required, the key to a language string</dd>
    * <dl>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highslide-software/highcharts.com/tree/master/samples/highcharts/exporting/menuitemdefinitions/" target="_blank">Menu item definitions</a>
    * @since 5.0.13
    */
  val menuItemDefinitions: js.UndefOr[js.Object] = js.undefined

  /**
    * When printing the chart from the menu item in the burger menu, if the on-screen chart exceeds this width, it is resized. After printing or cancelled, it is restored. The default width makes the chart fit into typical paper format. Note that this does not affect the chart when printing the web page as a whole.
    * @since 4.2.5
    */
  val printMaxWidth: js.UndefOr[Double] = js.undefined

  /**
    * Defines the scale or zoom factor for the exported image compared to the on-screen display. While for instance a 600px wide chart may look good on a website, it will look bad in print. The default scale of 2 makes this chart export to a 1200px PNG or JPG. 
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/exporting/scale/" target="_blank">Scale demonstrated</a>
    */
  val scale: js.UndefOr[Double] = js.undefined

  /**
    * Analogous to <a href="#exporting.sourceWidth">sourceWidth</a>
    */
  val sourceHeight: js.UndefOr[Double] = js.undefined

  /**
    * The width of the original chart when exported, unless an explicit <a href="#chart.width">chart.width</a> is set. The width exported raster image is then multiplied by <a href="#exporting.scale">scale</a>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/exporting/sourcewidth/" target="_blank">Source size demo</a>
    */
  val sourceWidth: js.UndefOr[Double] = js.undefined

  /**
    * Default MIME type for exporting if <code>chart.exportChart()</code> is called without specifying a <code>type</code> option. Possible values are <code>image/png</code>, <code>image/jpeg</code>, <code>application/pdf</code> and <code>image/svg+xml</code>.
    */
  val `type`: js.UndefOr[String] = js.undefined

  /**
    * The URL for the server module converting the SVG string to an image format. By default this points to Highchart's free web service.
    */
  val url: js.UndefOr[String] = js.undefined

  /**
    * The pixel width of charts exported to PNG or JPG. As of Highcharts 3.0, the default pixel width is a function of the <a href="#chart.width">chart.width</a> or <a href="#exporting.sourceWidth">exporting.sourceWidth</a> and the <a href="#exporting.scale">exporting.scale</a>.
    */
  val width: js.UndefOr[Double] = js.undefined
}

object Exporting {
  /**
    * @param allowHTML <p>Experimental setting to allow HTML inside the chart (added through the <code>useHTML</code> options), directly in the exported image. This allows you to preserve complicated HTML structures like tables or bi-directional text in exported charts.</p>. . <p>Disclaimer: The HTML is rendered in a <code>foreignObject</code> tag in the generated SVG. The official export server is based on PhantomJS, which supports this, but other SVG clients, like Batik, does not support it. This also applies to downloaded SVG that you want to open in a desktop client.</p>
    * @param buttons Options for the export related buttons, print and export. In addition to the default buttons listed here, custom buttons can be added. See <a href="#navigation.buttonOptions">navigation.buttonOptions</a> for general options.
    * @param chartOptions Additional chart options to be merged into an exported chart. For example, a common use case is to add data labels to improve readaility of the exported chart, or to add a printer-friendly color scheme.
    * @param enabled Whether to enable the exporting module. Disabling the module will hide the context button, but API methods will still be available.
    * @param error Function to call if the offline-exporting module fails to export a chart on the client side, and <a href="#exporting.fallbackToExportServer">fallbackToExportServer</a> is disabled. If left undefined, an exception is thrown instead.
    * @param fallbackToExportServer Whether or not to fall back to the export server if the offline-exporting module is unable to export the chart on the client side.
    * @param filename The filename, without extension, to use for the exported chart.
    * @param formAttributes An object containing additional attributes for the POST form that sends the SVG to the export server. For example, a <code>target</code> can be set to make sure the generated image is received in another frame, or a custom <code>enctype</code> or <code>encoding</code> can be set.
    * @param libURL Path where Highcharts will look for export module dependencies to load on demand if they don't already exist on <code>window</code>.. . Should currently point to location of <a href="https://github.com/canvg/canvg">CanVG</a> library, <a href="https://github.com/canvg/canvg">RGBColor.js</a>, <a href="https://github.com/yWorks/jsPDF">jsPDF</a> and <a href="https://github.com/yWorks/svg2pdf.js">svg2pdf.js</a>, required for client side export in certain browsers.
    * @param menuItemDefinitions <p>An object consisting of definitions for the menu items in the context menu. Each key value pair has a <code>key</code> that is referenced in the <a href="#exporting.buttons.contextButton.menuItems">menuItems</a> setting, and a <code>value</code>, which is an object with the following properties:</p>. <dl>. <dt>onclick</dt>. <dd>The click handler for the menu item</dd>. <dt>text</dt>. <dd>The text for the menu item</dt>. <dt>textKey</dt>. <dd>If internationalization is required, the key to a language string</dd>. <dl>
    * @param printMaxWidth When printing the chart from the menu item in the burger menu, if the on-screen chart exceeds this width, it is resized. After printing or cancelled, it is restored. The default width makes the chart fit into typical paper format. Note that this does not affect the chart when printing the web page as a whole.
    * @param scale Defines the scale or zoom factor for the exported image compared to the on-screen display. While for instance a 600px wide chart may look good on a website, it will look bad in print. The default scale of 2 makes this chart export to a 1200px PNG or JPG. 
    * @param sourceHeight Analogous to <a href="#exporting.sourceWidth">sourceWidth</a>
    * @param sourceWidth The width of the original chart when exported, unless an explicit <a href="#chart.width">chart.width</a> is set. The width exported raster image is then multiplied by <a href="#exporting.scale">scale</a>.
    * @param `type` Default MIME type for exporting if <code>chart.exportChart()</code> is called without specifying a <code>type</code> option. Possible values are <code>image/png</code>, <code>image/jpeg</code>, <code>application/pdf</code> and <code>image/svg+xml</code>.
    * @param url The URL for the server module converting the SVG string to an image format. By default this points to Highchart's free web service.
    * @param width The pixel width of charts exported to PNG or JPG. As of Highcharts 3.0, the default pixel width is a function of the <a href="#chart.width">chart.width</a> or <a href="#exporting.sourceWidth">exporting.sourceWidth</a> and the <a href="#exporting.scale">exporting.scale</a>.
    */
  def apply(allowHTML: js.UndefOr[Boolean] = js.undefined, buttons: js.UndefOr[CleanJsObject[ExportingButtons]] = js.undefined, chartOptions: js.UndefOr[js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, error: js.UndefOr[js.Function] = js.undefined, fallbackToExportServer: js.UndefOr[Boolean] = js.undefined, filename: js.UndefOr[String] = js.undefined, formAttributes: js.UndefOr[js.Object] = js.undefined, libURL: js.UndefOr[String] = js.undefined, menuItemDefinitions: js.UndefOr[js.Object] = js.undefined, printMaxWidth: js.UndefOr[Double] = js.undefined, scale: js.UndefOr[Double] = js.undefined, sourceHeight: js.UndefOr[Double] = js.undefined, sourceWidth: js.UndefOr[Double] = js.undefined, `type`: js.UndefOr[String] = js.undefined, url: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double] = js.undefined): Exporting = {
    val allowHTMLOuter: js.UndefOr[Boolean] = allowHTML
    val buttonsOuter: js.UndefOr[CleanJsObject[ExportingButtons]] = buttons
    val chartOptionsOuter: js.UndefOr[js.Object] = chartOptions
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val errorOuter: js.UndefOr[js.Function] = error
    val fallbackToExportServerOuter: js.UndefOr[Boolean] = fallbackToExportServer
    val filenameOuter: js.UndefOr[String] = filename
    val formAttributesOuter: js.UndefOr[js.Object] = formAttributes
    val libURLOuter: js.UndefOr[String] = libURL
    val menuItemDefinitionsOuter: js.UndefOr[js.Object] = menuItemDefinitions
    val printMaxWidthOuter: js.UndefOr[Double] = printMaxWidth
    val scaleOuter: js.UndefOr[Double] = scale
    val sourceHeightOuter: js.UndefOr[Double] = sourceHeight
    val sourceWidthOuter: js.UndefOr[Double] = sourceWidth
    val typeOuter: js.UndefOr[String] = `type`
    val urlOuter: js.UndefOr[String] = url
    val widthOuter: js.UndefOr[Double] = width
    new Exporting {
      override val allowHTML: js.UndefOr[Boolean] = allowHTMLOuter
      override val buttons: js.UndefOr[CleanJsObject[ExportingButtons]] = buttonsOuter
      override val chartOptions: js.UndefOr[js.Object] = chartOptionsOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val error: js.UndefOr[js.Function] = errorOuter
      override val fallbackToExportServer: js.UndefOr[Boolean] = fallbackToExportServerOuter
      override val filename: js.UndefOr[String] = filenameOuter
      override val formAttributes: js.UndefOr[js.Object] = formAttributesOuter
      override val libURL: js.UndefOr[String] = libURLOuter
      override val menuItemDefinitions: js.UndefOr[js.Object] = menuItemDefinitionsOuter
      override val printMaxWidth: js.UndefOr[Double] = printMaxWidthOuter
      override val scale: js.UndefOr[Double] = scaleOuter
      override val sourceHeight: js.UndefOr[Double] = sourceHeightOuter
      override val sourceWidth: js.UndefOr[Double] = sourceWidthOuter
      override val `type`: js.UndefOr[String] = typeOuter
      override val url: js.UndefOr[String] = urlOuter
      override val width: js.UndefOr[Double] = widthOuter
    }
  }
}
