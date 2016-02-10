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
  * @note JavaScript name: <code>plotOptions-flags</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsFlags extends js.Object {

  /**
    * Allow this series' points to be selected by clicking on the markers or bars.
    */
  val allowPointSelect: js.UndefOr[Boolean] = js.undefined

  /**
    * The main color of the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * A series specific or series type specific color set to apply instead of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.
    * @since 1.3
    */
  val colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined

  /**
    * When the series contains less points than the crop threshold, all points are drawn,  event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.  .
    */
  val cropThreshold: js.UndefOr[Double] = js.undefined

  /**
    * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/cursor/" target="_blank">Pointer on a line graph</a>
    */
  val cursor: js.UndefOr[String] = js.undefined

  val dataLabels: js.UndefOr[CleanJsObject[PlotOptionsFlagsDataLabels]] = js.undefined

  /**
    * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. When using shared tooltips  (default in stock charts), mouse tracking is not required. For large datasets it improves performance.
    */
  val enableMouseTracking: js.UndefOr[Boolean] = js.undefined

  val events: js.UndefOr[CleanJsObject[PlotOptionsFlagsEvents]] = js.undefined

  /**
    * Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
    * @since 2.1.6
    */
  val getExtremesFromAll: js.UndefOr[Boolean] = js.undefined

  /**
    * An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-keys/" target="_blank">An extended data array with keys</a>
    * @since 2.1.6
    */
  val keys: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * The sequential index of the series within the legend.
    */
  val legendIndex: js.UndefOr[Double] = js.undefined

  /**
    * The color of the line/border of the flag. Defaults to <code>"black"</code>.
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pixel width of the candlestick line/border. Defaults to <code>1</code>.
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/arearange-line/" target="_blank">Linked series</a>
    * @since 1.3
    */
  val linkedTo: js.UndefOr[String] = js.undefined

  /**
    * The maximum allowed pixel width for a column, translated to the height of a bar in a bar chart. This prevents the columns from becoming too wide when there is a small number of points in the chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/column-maxpointwidth-20/" target="_blank">Limited to 50</a>
    * @since 2.1.8
    */
  val maxPointWidth: js.UndefOr[Double] = js.undefined

  /**
    * In case the flag is placed on a series, on what point key to place it. Line and columns have one key, <code>y</code>. In range or OHLC-type series, however, the flag can optionally be placed on the <code>open</code>, <code>high</code>, <code>low</code> or <code>close</code> key.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highcharts/highcharts/tree/master/samples/stock/plotoptions/flags-onkey/" target="_blank">Range series, flag on high</a>.
    * @since 4.2.2
    */
  val onKey: js.UndefOr[String] = js.undefined

  /**
    * The id of the series that the flags should be drawn on. If no id is given, the flags are drawn on the x axis.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/flags/" target="_blank">Flags on series and on x axis</a>
    */
  val onSeries: js.UndefOr[String] = js.undefined

  /**
    * Properties for each single point
    */
  val point: js.UndefOr[CleanJsObject[PlotOptionsFlagsPoint]] = js.undefined

  /**
    * On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointintervalunit/" target="_blank">One point a month</a>
    * @since 2.1.0
    */
  val pointIntervalUnit: js.UndefOr[String] = js.undefined

  /**
    * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name in the legend will be checked for a selected series.
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to apply a drop shadow to the graph line. Since 1.1.7 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * The shape of the marker. Can be one of "flag", "circlepin", "squarepin", or an image on the format <code>url(/path-to-image.jpg)</code>. Individual shapes can also be set for each point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/flags/" target="_blank">Different shapes</a>
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
    */
  val showCheckbox: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
    */
  val showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When this is true, the series will not cause the Y axis to cross the zero plane (or <a href="#plotOptions.series.threshold">threshold</a> option) unless the data actually crosses the plane.</p>
    * 
    * <p>For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2, 3 will make the Y axis show negative values according to the <code>minPadding</code> option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.</p>
    * @since 2.1.9
    */
  val softThreshold: js.UndefOr[Boolean] = js.undefined

  /**
    * When multiple flags in the same series fall on the same value, this number determines the vertical
    *  offset between them.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/flags-stackdistance/" target="_blank">A greater stack distance</a>
    */
  val stackDistance: js.UndefOr[Double] = js.undefined

  /**
    * A wrapper object for all the series options in specific states.
    */
  val states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = js.undefined

  /**
    * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event
    *  on a series isn't triggered until the mouse moves over another series, or out
    *  of the plot area. When false, the <code>mouseOut</code> event on a series is
    *  triggered when the mouse leaves the area around the series' graph or markers.
    *  This also implies the tooltip when not shared. When <code>stickyTracking</code> is false, the 
    *  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, candlesticks etc.
    */
  val stickyTracking: js.UndefOr[Boolean] = js.undefined

  /**
    * The text styles of the flag. Defaults to:
    * <pre>style: {
    * 	fontSize: '11px',
    * 	fontWeight: 'bold',
    * 	textAlign: 'center'
    * }</pre>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The threshold, also called zero level or base level. For line type series this is only used in conjunction with <a href="#plotOptions.series.negativeColor">negativeColor</a>.
    */
  val threshold: js.UndefOr[Double] = js.undefined

  /**
    * The text to display on each flag. This can be defined on series level, or  individually for each point. Defaults to <code>"A"</code>.
    */
  val title: js.Any = js.undefined

  /**
    * Specific tooltip options for flag series. Flag series tooltips are different from most other types in that a flag doesn't have a data value, so the tooltip rather displays the <code>text</code> option for each point.
    */
  val tooltip: js.UndefOr[CleanJsObject[PlotOptionsFlagsTooltip]] = js.undefined

  /**
    * Whether to use HTML to render the flag texts. Using HTML allows for advanced formatting, images and reliable bi-directional text rendering. Note that exported images won't respect the HTML, and that HTML won't respect Z-index settings.
    * @since 1.3
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * Set the initial visibility of the series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/series-visibility/" target="_blank">Hidden series</a>
    */
  val visible: js.UndefOr[Boolean] = js.undefined

  /**
    * The y position of the top left corner of the flag relative to either the series (if onSeries is defined), or the x axis. Defaults to <code>-30</code>.
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * Defines the Axis on which the zones are applied.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/" target="_blank">Zones on the X-Axis</a>
    * @since 2.1.0
    */
  val zoneAxis: js.UndefOr[String] = js.undefined

  /**
    * An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/color-zones-simple/" target="_blank">Color zones</a>
    * @since 2.1.0
    */
  val zones: js.UndefOr[js.Array[CleanJsObject[PlotOptionsFlagsZones]]] = js.undefined
}

object PlotOptionsFlags {
  /**
    * @param allowPointSelect Allow this series' points to be selected by clicking on the markers or bars.
    * @param color The main color of the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
    * @param colors A series specific or series type specific color set to apply instead of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.
    * @param cropThreshold When the series contains less points than the crop threshold, all points are drawn,  event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.  .
    * @param cursor You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @param enableMouseTracking Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. When using shared tooltips  (default in stock charts), mouse tracking is not required. For large datasets it improves performance.
    * @param getExtremesFromAll Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
    * @param keys An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
    * @param legendIndex The sequential index of the series within the legend.
    * @param lineColor The color of the line/border of the flag. Defaults to <code>"black"</code>.
    * @param lineWidth The pixel width of the candlestick line/border. Defaults to <code>1</code>.
    * @param linkedTo The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
    * @param maxPointWidth The maximum allowed pixel width for a column, translated to the height of a bar in a bar chart. This prevents the columns from becoming too wide when there is a small number of points in the chart.
    * @param onKey In case the flag is placed on a series, on what point key to place it. Line and columns have one key, <code>y</code>. In range or OHLC-type series, however, the flag can optionally be placed on the <code>open</code>, <code>high</code>, <code>low</code> or <code>close</code> key.
    * @param onSeries The id of the series that the flags should be drawn on. If no id is given, the flags are drawn on the x axis.
    * @param point Properties for each single point
    * @param pointIntervalUnit On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
    * @param selected Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name in the legend will be checked for a selected series.
    * @param shadow Whether to apply a drop shadow to the graph line. Since 1.1.7 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @param shape The shape of the marker. Can be one of "flag", "circlepin", "squarepin", or an image on the format <code>url(/path-to-image.jpg)</code>. Individual shapes can also be set for each point.
    * @param showCheckbox If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
    * @param showInLegend Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
    * @param softThreshold <p>When this is true, the series will not cause the Y axis to cross the zero plane (or <a href="#plotOptions.series.threshold">threshold</a> option) unless the data actually crosses the plane.</p>. . <p>For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2, 3 will make the Y axis show negative values according to the <code>minPadding</code> option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.</p>
    * @param stackDistance When multiple flags in the same series fall on the same value, this number determines the vertical.  offset between them.
    * @param states A wrapper object for all the series options in specific states.
    * @param stickyTracking Sticky tracking of mouse events. When true, the <code>mouseOut</code> event.  on a series isn't triggered until the mouse moves over another series, or out.  of the plot area. When false, the <code>mouseOut</code> event on a series is.  triggered when the mouse leaves the area around the series' graph or markers..  This also implies the tooltip when not shared. When <code>stickyTracking</code> is false, the .  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, candlesticks etc.
    * @param style The text styles of the flag. Defaults to:. <pre>style: {. 	fontSize: '11px',. 	fontWeight: 'bold',. 	textAlign: 'center'. }</pre>
    * @param threshold The threshold, also called zero level or base level. For line type series this is only used in conjunction with <a href="#plotOptions.series.negativeColor">negativeColor</a>.
    * @param title The text to display on each flag. This can be defined on series level, or  individually for each point. Defaults to <code>"A"</code>.
    * @param tooltip Specific tooltip options for flag series. Flag series tooltips are different from most other types in that a flag doesn't have a data value, so the tooltip rather displays the <code>text</code> option for each point.
    * @param useHTML Whether to use HTML to render the flag texts. Using HTML allows for advanced formatting, images and reliable bi-directional text rendering. Note that exported images won't respect the HTML, and that HTML won't respect Z-index settings.
    * @param visible Set the initial visibility of the series.
    * @param y The y position of the top left corner of the flag relative to either the series (if onSeries is defined), or the x axis. Defaults to <code>-30</code>.
    * @param zoneAxis Defines the Axis on which the zones are applied.
    * @param zones An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.
    */
  def apply(allowPointSelect: js.UndefOr[Boolean] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined, cropThreshold: js.UndefOr[Double] = js.undefined, cursor: js.UndefOr[String] = js.undefined, dataLabels: js.UndefOr[CleanJsObject[PlotOptionsFlagsDataLabels]] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[CleanJsObject[PlotOptionsFlagsEvents]] = js.undefined, getExtremesFromAll: js.UndefOr[Boolean] = js.undefined, keys: js.UndefOr[js.Array[String]] = js.undefined, legendIndex: js.UndefOr[Double] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, linkedTo: js.UndefOr[String] = js.undefined, maxPointWidth: js.UndefOr[Double] = js.undefined, onKey: js.UndefOr[String] = js.undefined, onSeries: js.UndefOr[String] = js.undefined, point: js.UndefOr[CleanJsObject[PlotOptionsFlagsPoint]] = js.undefined, pointIntervalUnit: js.UndefOr[String] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, shape: js.UndefOr[String] = js.undefined, showCheckbox: js.UndefOr[Boolean] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, softThreshold: js.UndefOr[Boolean] = js.undefined, stackDistance: js.UndefOr[Double] = js.undefined, states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, threshold: js.UndefOr[Double] = js.undefined, title: js.UndefOr[js.Any] = js.undefined, tooltip: js.UndefOr[CleanJsObject[PlotOptionsFlagsTooltip]] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, y: js.UndefOr[Double] = js.undefined, zoneAxis: js.UndefOr[String] = js.undefined, zones: js.UndefOr[js.Array[CleanJsObject[PlotOptionsFlagsZones]]] = js.undefined): PlotOptionsFlags = {
    val allowPointSelectOuter: js.UndefOr[Boolean] = allowPointSelect
    val colorOuter: js.UndefOr[String | js.Object] = color
    val colorsOuter: js.UndefOr[js.Array[String | js.Object]] = colors
    val cropThresholdOuter: js.UndefOr[Double] = cropThreshold
    val cursorOuter: js.UndefOr[String] = cursor
    val dataLabelsOuter: js.UndefOr[CleanJsObject[PlotOptionsFlagsDataLabels]] = dataLabels
    val enableMouseTrackingOuter: js.UndefOr[Boolean] = enableMouseTracking
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsFlagsEvents]] = events
    val getExtremesFromAllOuter: js.UndefOr[Boolean] = getExtremesFromAll
    val keysOuter: js.UndefOr[js.Array[String]] = keys
    val legendIndexOuter: js.UndefOr[Double] = legendIndex
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val linkedToOuter: js.UndefOr[String] = linkedTo
    val maxPointWidthOuter: js.UndefOr[Double] = maxPointWidth
    val onKeyOuter: js.UndefOr[String] = onKey
    val onSeriesOuter: js.UndefOr[String] = onSeries
    val pointOuter: js.UndefOr[CleanJsObject[PlotOptionsFlagsPoint]] = point
    val pointIntervalUnitOuter: js.UndefOr[String] = pointIntervalUnit
    val selectedOuter: js.UndefOr[Boolean] = selected
    val shadowOuter: js.UndefOr[Boolean | js.Object] = shadow
    val shapeOuter: js.UndefOr[String] = shape
    val showCheckboxOuter: js.UndefOr[Boolean] = showCheckbox
    val showInLegendOuter: js.UndefOr[Boolean] = showInLegend
    val softThresholdOuter: js.UndefOr[Boolean] = softThreshold
    val stackDistanceOuter: js.UndefOr[Double] = stackDistance
    val statesOuter: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = states
    val stickyTrackingOuter: js.UndefOr[Boolean] = stickyTracking
    val styleOuter: js.UndefOr[js.Object] = style
    val thresholdOuter: js.UndefOr[Double] = threshold
    val titleOuter: js.Any = title
    val tooltipOuter: js.UndefOr[CleanJsObject[PlotOptionsFlagsTooltip]] = tooltip
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val visibleOuter: js.UndefOr[Boolean] = visible
    val yOuter: js.UndefOr[Double] = y
    val zoneAxisOuter: js.UndefOr[String] = zoneAxis
    val zonesOuter: js.UndefOr[js.Array[CleanJsObject[PlotOptionsFlagsZones]]] = zones
    new PlotOptionsFlags {
      override val allowPointSelect: js.UndefOr[Boolean] = allowPointSelectOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val colors: js.UndefOr[js.Array[String | js.Object]] = colorsOuter
      override val cropThreshold: js.UndefOr[Double] = cropThresholdOuter
      override val cursor: js.UndefOr[String] = cursorOuter
      override val dataLabels: js.UndefOr[CleanJsObject[PlotOptionsFlagsDataLabels]] = dataLabelsOuter
      override val enableMouseTracking: js.UndefOr[Boolean] = enableMouseTrackingOuter
      override val events: js.UndefOr[CleanJsObject[PlotOptionsFlagsEvents]] = eventsOuter
      override val getExtremesFromAll: js.UndefOr[Boolean] = getExtremesFromAllOuter
      override val keys: js.UndefOr[js.Array[String]] = keysOuter
      override val legendIndex: js.UndefOr[Double] = legendIndexOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val linkedTo: js.UndefOr[String] = linkedToOuter
      override val maxPointWidth: js.UndefOr[Double] = maxPointWidthOuter
      override val onKey: js.UndefOr[String] = onKeyOuter
      override val onSeries: js.UndefOr[String] = onSeriesOuter
      override val point: js.UndefOr[CleanJsObject[PlotOptionsFlagsPoint]] = pointOuter
      override val pointIntervalUnit: js.UndefOr[String] = pointIntervalUnitOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val shadow: js.UndefOr[Boolean | js.Object] = shadowOuter
      override val shape: js.UndefOr[String] = shapeOuter
      override val showCheckbox: js.UndefOr[Boolean] = showCheckboxOuter
      override val showInLegend: js.UndefOr[Boolean] = showInLegendOuter
      override val softThreshold: js.UndefOr[Boolean] = softThresholdOuter
      override val stackDistance: js.UndefOr[Double] = stackDistanceOuter
      override val states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = statesOuter
      override val stickyTracking: js.UndefOr[Boolean] = stickyTrackingOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val threshold: js.UndefOr[Double] = thresholdOuter
      override val title: js.Any = titleOuter
      override val tooltip: js.UndefOr[CleanJsObject[PlotOptionsFlagsTooltip]] = tooltipOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val visible: js.UndefOr[Boolean] = visibleOuter
      override val y: js.UndefOr[Double] = yOuter
      override val zoneAxis: js.UndefOr[String] = zoneAxisOuter
      override val zones: js.UndefOr[js.Array[CleanJsObject[PlotOptionsFlagsZones]]] = zonesOuter
    }
  }
}
