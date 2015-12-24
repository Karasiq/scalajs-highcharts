/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.1 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class Exporting extends js.Object {
  
  /**
   * <p>Experimental setting to allow HTML inside the chart (added through the <code>useHTML</code> options), directly in the exported image. This allows you to preserve complicated HTML structures like tables or bi-directional text in exported charts.</p>
   * 
   * <p>Disclaimer: The HTML is rendered in a <code>foreignObject</code> tag in the generated SVG. The official export server is based on PhantomJS, which supports this, but other SVG clients, like Batik, does not support it. This also applies to downloaded SVG that you want to open in a desktop client.</p>
   * @since 4.1.8
   */
  var allowHTML: Boolean = false
  
  /**
   * Options for the export related buttons, print and export. In addition to the default buttons listed here, custom buttons can be added. See <a href="#navigation.buttonOptions">navigation.buttonOptions</a> for general options.
   */
  var buttons: UndefOr[ExportingButtons] = js.undefined
  
  /**
   * Additional chart options to be merged into an exported chart. For example, the exported chart can be given a specific width and height, or a printer-friendly color scheme.
   */
  var chartOptions: js.Object = null.asInstanceOf[js.Object]
  
  /**
   * Whether to enable the exporting module. Disabling the module will hide the context button, but API methods will still be available.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/exporting/enabled-false/" target="_blank">Exporting module is loaded but disabled</a>
   * @since 2.0
   */
  var enabled: Boolean = true
  
  /**
   * Whether or not to fall back to the export server if the offline-exporting module is unable to export the chart on the client side.
   * @since 4.1.8
   */
  var fallbackToExportServer: Boolean = true
  
  /**
   * The filename, without extension, to use for the exported chart.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/exporting/filename/" target="_blank">Custom file name</a>
   * @since 2.0
   */
  var filename: String = "chart"
  
  /**
   * An object containing additional attributes for the POST form that sends the SVG to the export server. For example, a <code>target</code> can be set to make sure the generated image is received in another frame, or a custom <code>enctype</code> or <code>encoding</code> can be set.
   * @since 3.0.8
   */
  var formAttributes: UndefOr[js.Object] = js.undefined
  
  /**
   * Defines the scale or zoom factor for the exported image compared to the on-screen display. While for instance a 600px wide chart may look good on a website, it will look bad in print. The default scale of 2 makes this chart export to a 1200px PNG or JPG. 
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/exporting/scale/" target="_blank">Scale demonstrated</a>
   * @since 3.0
   */
  var scale: Double = 2
  
  /**
   * Analogous to <a href="#exporting.sourceWidth">sourceWidth</a>
   * @since 3.0
   */
  var sourceHeight: UndefOr[Double] = js.undefined
  
  /**
   * The width of the original chart when exported, unless an explicit <a href="#chart.width">chart.width</a> is set. The width exported raster image is then multiplied by <a href="#exporting.scale">scale</a>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/exporting/sourcewidth/" target="_blank">Source size demo</a>
   * @since 3.0
   */
  var sourceWidth: UndefOr[Double] = js.undefined
  
  /**
   * Default MIME type for exporting if <code>chart.exportChart()</code> is called without specifying a <code>type</code> option. Possible values are <code>image/png</code>, <code>image/jpeg</code>, <code>application/pdf</code> and <code>image/svg+xml</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/exporting/type/" target="_blank">Default type set to <code>image/jpeg</code></a>
   * @since 2.0
   */
  var `type`: String = "image/png"
  
  /**
   * The URL for the server module converting the SVG string to an image format. By default this points to Highslide Software's free web service.
   * @since 2.0
   */
  var url: String = "http://export.highcharts.com"
  
  /**
   * The pixel width of charts exported to PNG or JPG. As of Highcharts 3.0, the default pixel width is a function of the <a href="#chart.width">chart.width</a> or <a href="#exporting.sourceWidth">exporting.sourceWidth</a> and the <a href="#exporting.scale">exporting.scale</a>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/exporting/width/" target="_blank">Export to 200px wide images</a>
   * @since 2.0
   */
  var width: UndefOr[Double] = js.undefined
}
