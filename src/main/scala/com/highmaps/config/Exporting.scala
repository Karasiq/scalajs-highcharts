/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
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
    * Additional chart options to be merged into an exported chart. For example, the exported chart can be given a specific width and height, or a printer-friendly color scheme.
    */
  val chartOptions: js.UndefOr[js.Object] = js.undefined

  /**
    * Whether to enable the exporting module. Disabling the module will hide the context button, but API methods will still be available.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

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
    * Defines the scale or zoom factor for the exported image compared to the on-screen display. While for instance a 600px wide chart may look good on a website, it will look bad in print. The default scale of 2 makes this chart export to a 1200px PNG or JPG. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/exporting/scale/" target="_blank">Scale demonstrated</a>
    */
  val scale: js.UndefOr[Double] = js.undefined

  /**
    * Analogous to <a href="#exporting.sourceWidth">sourceWidth</a>
    */
  val sourceHeight: js.UndefOr[Double] = js.undefined

  /**
    * The width of the original chart when exported, unless an explicit <a href="#chart.width">chart.width</a> is set. The width exported raster image is then multiplied by <a href="#exporting.scale">scale</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/exporting/sourcewidth/" target="_blank">Source size demo</a>
    */
  val sourceWidth: js.UndefOr[Double] = js.undefined

  /**
    * Default MIME type for exporting if <code>chart.exportChart()</code> is called without specifying a <code>type</code> option. Possible values are <code>image/png</code>, <code>image/jpeg</code>, <code>application/pdf</code> and <code>image/svg+xml</code>.
    */
  val `type`: js.UndefOr[String] = js.undefined

  /**
    * The URL for the server module converting the SVG string to an image format. By default this points to Highslide Software's free web service.
    */
  val url: js.UndefOr[String] = js.undefined

  /**
    * The pixel width of charts exported to PNG or JPG. As of Highcharts 3.0, the default pixel width is a function of the <a href="#chart.width">chart.width</a> or <a href="#exporting.sourceWidth">exporting.sourceWidth</a> and the <a href="#exporting.scale">exporting.scale</a>.
    */
  val width: js.UndefOr[Double] = js.undefined
}
