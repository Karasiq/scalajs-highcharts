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
  * @note JavaScript name: <code>exporting</code>
  */
class Exporting extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Accessibility options for the exporting menu. Requires the
    * Accessibility module.</p>
    * @since 7.1.0
    */
  var accessibility: js.Any = js.undefined

  /**
    * <p>Experimental setting to allow HTML inside the chart (added through
    * the <code>useHTML</code> options), directly in the exported image. This allows
    * you to preserve complicated HTML structures like tables or bi-directional
    * text in exported charts.</p>
    * <p>Disclaimer: The HTML is rendered in a <code>foreignObject</code> tag in the
    * generated SVG. The official export server is based on PhantomJS,
    * which supports this, but other SVG clients, like Batik, does not
    * support it. This also applies to downloaded SVG that you want to
    * open in a desktop client.</p>
    * @since 4.1.8
    */
  var allowHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Options for the export related buttons, print and export. In addition
    * to the default buttons listed here, custom buttons can be added.
    * See <a href="#navigation.buttonOptions">navigation.buttonOptions</a> for general
    * options.</p>
    */
  var buttons: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Additional chart options to be merged into the chart before exporting to
    * an image format. This does not apply to printing the chart via the export
    * menu.</p>
    * <p>For example, a common use case is to add data labels to improve
    * readability of the exported chart, or to add a printer-friendly color
    * scheme to exported PDFs.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/chartoptions-data-labels/">Added data labels</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/chartoptions-data-labels/">Added data labels</a>
    */
  var chartOptions: js.Any = js.undefined

  /**
    * <p>Options for exporting data to CSV or ExCel, or displaying the data
    * in a HTML table or a JavaScript structure.</p>
    * <p>This module adds data export options to the export menu and provides
    * functions like <code>Chart.getCSV</code>, <code>Chart.getTable</code>, <code>Chart.getDataRows</code>
    * and <code>Chart.viewData</code>.</p>
    * <p>The XLS converter is limited and only creates a HTML string that is
    * passed for download, which works but creates a warning before
    * opening. The workaround for this is to use a third party XLSX
    * converter, as demonstrated in the sample below.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/categorized/">Categorized data</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/stock-timeaxis/">Highcharts Stock time axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/xlsx/">Using a third party XLSX converter</a>
    * @since 6.0.0
    */
  var csv: js.Any = js.undefined

  /**
    * <p>Whether to enable the exporting module. Disabling the module will
    * hide the context button, but API methods will still be available.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/enabled-false/">Exporting module is loaded but disabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/enabled-false/">Exporting module is loaded but disabled</a>
    * @since 2.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Function to call if the offline-exporting module fails to export
    * a chart on the client side, and <a href="#exporting.fallbackToExportServer">fallbackToExportServer</a> is disabled. If left undefined, an
    * exception is thrown instead. Receives two parameters, the exporting
    * options, and the error from the module.</p>
    * @since 5.0.0
    */
  var error: js.Any = js.undefined

  /**
    * <p>Whether or not to fall back to the export server if the offline-exporting
    * module is unable to export the chart on the client side. This happens for
    * certain browsers, and certain features (e.g.
    * <a href="#exporting.allowHTML">allowHTML</a>), depending on the image type exporting
    * to. For very complex charts, it is possible that export can fail in
    * browsers that don&#39;t support Blob objects, due to data URL length limits.
    * It is recommended to define the <a href="#exporting.error">exporting.error</a>
    * handler if disabling fallback, in order to notify users in case export
    * fails.</p>
    * @since 4.1.8
    */
  var fallbackToExportServer: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The filename, without extension, to use for the exported chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/filename/">Custom file name</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/filename/">Custom file name</a>
    * @since 2.0.0
    */
  var filename: js.UndefOr[String] = js.undefined

  /**
    * <p>An object containing additional key value data for the POST form that
    * sends the SVG to the export server. For example, a <code>target</code> can be set to
    * make sure the generated image is received in another frame, or a custom
    * <code>enctype</code> or <code>encoding</code> can be set.</p>
    * @since 3.0.8
    */
  var formAttributes: js.Any = js.undefined

  /**
    * <p>Path where Highcharts will look for export module dependencies to
    * load on demand if they don&#39;t already exist on <code>window</code>. Should currently
    * point to location of <a href="https://github.com/canvg/canvg">CanVG</a> library,
    * <a href="https://github.com/yWorks/jsPDF">jsPDF</a> and
    * <a href="https://github.com/yWorks/svg2pdf.js">svg2pdf.js</a>, required for client
    * side export in certain browsers.</p>
    * @since 5.0.0
    */
  var libURL: js.UndefOr[String] = js.undefined

  /**
    * <p>An object consisting of definitions for the menu items in the context
    * menu. Each key value pair has a <code>key</code> that is referenced in the
    * <a href="#exporting.buttons.contextButton.menuItems">menuItems</a> setting,
    * and a <code>value</code>, which is an object with the following properties:</p>
    * <ul>
    * <li><p><strong>onclick:</strong> The click handler for the menu item</p>
    * </li>
    * <li><p><strong>text:</strong> The text for the menu item</p>
    * </li>
    * <li><p><strong>textKey:</strong> If internationalization is required, the key to a language
    * string</p>
    * </li>
    * </ul>
    * <p>Custom text for the &quot;exitFullScreen&quot; can be set only in lang options
    * (it is not a separate button).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/menuitemdefinitions/">Menu item definitions</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/menuitemdefinitions/">Menu item definitions</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/menuitemdefinitions/">Menu item definitions</a>
    * @since 5.0.13
    */
  var menuItemDefinitions: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>When printing the chart from the menu item in the burger menu, if
    * the on-screen chart exceeds this width, it is resized. After printing
    * or cancelled, it is restored. The default width makes the chart
    * fit into typical paper format. Note that this does not affect the
    * chart when printing the web page as a whole.</p>
    * @since 4.2.5
    */
  var printMaxWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Defines the scale or zoom factor for the exported image compared
    * to the on-screen display. While for instance a 600px wide chart
    * may look good on a website, it will look bad in print. The default
    * scale of 2 makes this chart export to a 1200px PNG or JPG.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/scale/">Scale demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/scale/">Scale demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/exporting/scale/">Scale demonstrated</a>
    * @since 3.0.0
    */
  var scale: js.UndefOr[Double] = js.undefined

  /**
    * <p>Show a HTML table below the chart with the chart&#39;s current data.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/showtable/">Show the table</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/studies/exporting-table-html">Experiment with putting the table inside the subtitle to allow exporting it.</a>
    * @since 6.0.0
    */
  var showTable: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Analogous to <a href="#exporting.sourceWidth">sourceWidth</a>.</p>
    * @since 3.0.0
    */
  var sourceHeight: js.UndefOr[Double] = js.undefined

  /**
    * <p>The width of the original chart when exported, unless an explicit
    * <a href="#chart.width">chart.width</a> is set, or a pixel width is set on the
    * container. The width exported raster image is then multiplied by
    * <a href="#exporting.scale">scale</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/sourcewidth/">Source size demo</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/sourcewidth/">Source size demo</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/exporting/sourcewidth/">Source size demo</a>
    * @since 3.0.0
    */
  var sourceWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Caption for the data table. Same as chart title by default. Set to
    * <code>false</code> to disable.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/multilevel-table">Multiple table headers</a>
    * @since 6.0.4
    */
  var tableCaption: js.UndefOr[Boolean | String] = js.undefined

  /**
    * <p>Default MIME type for exporting if <code>chart.exportChart()</code> is called
    * without specifying a <code>type</code> option. Possible values are <code>image/png</code>,
    *  <code>image/jpeg</code>, <code>application/pdf</code> and <code>image/svg+xml</code>.</p>
    * @since 2.0.0
    */
  var `type`: js.Any = js.undefined

  /**
    * <p>The URL for the server module converting the SVG string to an image
    * format. By default this points to Highchart&#39;s free web service.</p>
    * @since 2.0.0
    */
  var url: js.UndefOr[String] = js.undefined

  /**
    * <p>Use multi level headers in data table. If <a href="#exporting.csv.columnHeaderFormatter">csv.columnHeaderFormatter</a> is defined, it has to return
    * objects in order for multi level headers to work.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/multilevel-table">Multiple table headers</a>
    * @since 6.0.4
    */
  var useMultiLevelHeaders: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>If using multi level table headers, use rowspans for headers that
    * have only one level.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/multilevel-table">Multiple table headers</a>
    * @since 6.0.4
    */
  var useRowspanHeaders: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The pixel width of charts exported to PNG or JPG. As of Highcharts
    * 3.0, the default pixel width is a function of the <a href="#chart.width">chart.width</a> or <a href="#exporting.sourceWidth">exporting.sourceWidth</a> and the
    * <a href="#exporting.scale">exporting.scale</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/width/">Export to 200px wide images</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/width/">Export to 200px wide images</a>
    * @since 2.0.0
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Exporting {
  /**
    * @param accessibility <p>Accessibility options for the exporting menu. Requires the. Accessibility module.</p>
    * @param allowHTML <p>Experimental setting to allow HTML inside the chart (added through. the <code>useHTML</code> options), directly in the exported image. This allows. you to preserve complicated HTML structures like tables or bi-directional. text in exported charts.</p>. <p>Disclaimer: The HTML is rendered in a <code>foreignObject</code> tag in the. generated SVG. The official export server is based on PhantomJS,. which supports this, but other SVG clients, like Batik, does not. support it. This also applies to downloaded SVG that you want to. open in a desktop client.</p>
    * @param buttons <p>Options for the export related buttons, print and export. In addition. to the default buttons listed here, custom buttons can be added.. See <a href="#navigation.buttonOptions">navigation.buttonOptions</a> for general. options.</p>
    * @param chartOptions <p>Additional chart options to be merged into the chart before exporting to. an image format. This does not apply to printing the chart via the export. menu.</p>. <p>For example, a common use case is to add data labels to improve. readability of the exported chart, or to add a printer-friendly color. scheme to exported PDFs.</p>
    * @param csv <p>Options for exporting data to CSV or ExCel, or displaying the data. in a HTML table or a JavaScript structure.</p>. <p>This module adds data export options to the export menu and provides. functions like <code>Chart.getCSV</code>, <code>Chart.getTable</code>, <code>Chart.getDataRows</code>. and <code>Chart.viewData</code>.</p>. <p>The XLS converter is limited and only creates a HTML string that is. passed for download, which works but creates a warning before. opening. The workaround for this is to use a third party XLSX. converter, as demonstrated in the sample below.</p>
    * @param enabled <p>Whether to enable the exporting module. Disabling the module will. hide the context button, but API methods will still be available.</p>
    * @param error <p>Function to call if the offline-exporting module fails to export. a chart on the client side, and <a href="#exporting.fallbackToExportServer">fallbackToExportServer</a> is disabled. If left undefined, an. exception is thrown instead. Receives two parameters, the exporting. options, and the error from the module.</p>
    * @param fallbackToExportServer <p>Whether or not to fall back to the export server if the offline-exporting. module is unable to export the chart on the client side. This happens for. certain browsers, and certain features (e.g.. <a href="#exporting.allowHTML">allowHTML</a>), depending on the image type exporting. to. For very complex charts, it is possible that export can fail in. browsers that don&#39;t support Blob objects, due to data URL length limits.. It is recommended to define the <a href="#exporting.error">exporting.error</a>. handler if disabling fallback, in order to notify users in case export. fails.</p>
    * @param filename <p>The filename, without extension, to use for the exported chart.</p>
    * @param formAttributes <p>An object containing additional key value data for the POST form that. sends the SVG to the export server. For example, a <code>target</code> can be set to. make sure the generated image is received in another frame, or a custom. <code>enctype</code> or <code>encoding</code> can be set.</p>
    * @param libURL <p>Path where Highcharts will look for export module dependencies to. load on demand if they don&#39;t already exist on <code>window</code>. Should currently. point to location of <a href="https://github.com/canvg/canvg">CanVG</a> library,. <a href="https://github.com/yWorks/jsPDF">jsPDF</a> and. <a href="https://github.com/yWorks/svg2pdf.js">svg2pdf.js</a>, required for client. side export in certain browsers.</p>
    * @param menuItemDefinitions <p>An object consisting of definitions for the menu items in the context. menu. Each key value pair has a <code>key</code> that is referenced in the. <a href="#exporting.buttons.contextButton.menuItems">menuItems</a> setting,. and a <code>value</code>, which is an object with the following properties:</p>. <ul>. <li><p><strong>onclick:</strong> The click handler for the menu item</p>. </li>. <li><p><strong>text:</strong> The text for the menu item</p>. </li>. <li><p><strong>textKey:</strong> If internationalization is required, the key to a language. string</p>. </li>. </ul>. <p>Custom text for the &quot;exitFullScreen&quot; can be set only in lang options. (it is not a separate button).</p>
    * @param printMaxWidth <p>When printing the chart from the menu item in the burger menu, if. the on-screen chart exceeds this width, it is resized. After printing. or cancelled, it is restored. The default width makes the chart. fit into typical paper format. Note that this does not affect the. chart when printing the web page as a whole.</p>
    * @param scale <p>Defines the scale or zoom factor for the exported image compared. to the on-screen display. While for instance a 600px wide chart. may look good on a website, it will look bad in print. The default. scale of 2 makes this chart export to a 1200px PNG or JPG.</p>
    * @param showTable <p>Show a HTML table below the chart with the chart&#39;s current data.</p>
    * @param sourceHeight <p>Analogous to <a href="#exporting.sourceWidth">sourceWidth</a>.</p>
    * @param sourceWidth <p>The width of the original chart when exported, unless an explicit. <a href="#chart.width">chart.width</a> is set, or a pixel width is set on the. container. The width exported raster image is then multiplied by. <a href="#exporting.scale">scale</a>.</p>
    * @param tableCaption <p>Caption for the data table. Same as chart title by default. Set to. <code>false</code> to disable.</p>
    * @param `type` <p>Default MIME type for exporting if <code>chart.exportChart()</code> is called. without specifying a <code>type</code> option. Possible values are <code>image/png</code>,.  <code>image/jpeg</code>, <code>application/pdf</code> and <code>image/svg+xml</code>.</p>
    * @param url <p>The URL for the server module converting the SVG string to an image. format. By default this points to Highchart&#39;s free web service.</p>
    * @param useMultiLevelHeaders <p>Use multi level headers in data table. If <a href="#exporting.csv.columnHeaderFormatter">csv.columnHeaderFormatter</a> is defined, it has to return. objects in order for multi level headers to work.</p>
    * @param useRowspanHeaders <p>If using multi level table headers, use rowspans for headers that. have only one level.</p>
    * @param width <p>The pixel width of charts exported to PNG or JPG. As of Highcharts. 3.0, the default pixel width is a function of the <a href="#chart.width">chart.width</a> or <a href="#exporting.sourceWidth">exporting.sourceWidth</a> and the. <a href="#exporting.scale">exporting.scale</a>.</p>
    */
  def apply(accessibility: js.UndefOr[js.Any] = js.undefined, allowHTML: js.UndefOr[Boolean] = js.undefined, buttons: js.UndefOr[js.Object] = js.undefined, chartOptions: js.UndefOr[js.Any] = js.undefined, csv: js.UndefOr[js.Any] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, error: js.UndefOr[js.Any] = js.undefined, fallbackToExportServer: js.UndefOr[Boolean] = js.undefined, filename: js.UndefOr[String] = js.undefined, formAttributes: js.UndefOr[js.Any] = js.undefined, libURL: js.UndefOr[String] = js.undefined, menuItemDefinitions: js.UndefOr[js.Object] = js.undefined, printMaxWidth: js.UndefOr[Double] = js.undefined, scale: js.UndefOr[Double] = js.undefined, showTable: js.UndefOr[Boolean] = js.undefined, sourceHeight: js.UndefOr[Double] = js.undefined, sourceWidth: js.UndefOr[Double] = js.undefined, tableCaption: js.UndefOr[Boolean | String] = js.undefined, `type`: js.UndefOr[js.Any] = js.undefined, url: js.UndefOr[String] = js.undefined, useMultiLevelHeaders: js.UndefOr[Boolean] = js.undefined, useRowspanHeaders: js.UndefOr[Boolean] = js.undefined, width: js.UndefOr[Double] = js.undefined): Exporting = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Exporting {
      this.accessibility = accessibility
      this.allowHTML = allowHTML
      this.buttons = buttons
      this.chartOptions = chartOptions
      this.csv = csv
      this.enabled = enabled
      this.error = error
      this.fallbackToExportServer = fallbackToExportServer
      this.filename = filename
      this.formAttributes = formAttributes
      this.libURL = libURL
      this.menuItemDefinitions = menuItemDefinitions
      this.printMaxWidth = printMaxWidth
      this.scale = scale
      this.showTable = showTable
      this.sourceHeight = sourceHeight
      this.sourceWidth = sourceWidth
      this.tableCaption = tableCaption
      this.`type` = `type`
      this.url = url
      this.useMultiLevelHeaders = useMultiLevelHeaders
      this.useRowspanHeaders = useRowspanHeaders
      this.width = width
    })
  }
}
