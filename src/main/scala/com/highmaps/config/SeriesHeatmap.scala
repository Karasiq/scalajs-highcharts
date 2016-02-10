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
  * @note JavaScript name: <code>series&lt;heatmap&gt;</code>
  */
@js.annotation.ScalaJSDefined
class SeriesHeatmap extends js.Object {

  /**
    * Allow this series' points to be selected by clicking on the shapes. Selected points can be read through the <a href="#Chart.getSelectedPoints()">Chart.getSelectedPoints()</a> method.
    * @example Allow select on <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-allowpointselect/" target="_blank">map area</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/mapbubble-allowpointselect/" target="_blank">map bubble</a>
    */
  val allowPointSelect: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>
    * <dl>
    *   <dt>duration</dt>
    *   <dd>The duration of the animation in milliseconds.</dd>
    * <dt>easing</dt>
    * <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>
    * </dl>
    * <p>Due to poor performance, animation is disabled in old IE browsers for map series, but enabled on mapbubble series.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-animation-true/" target="_blank">Animation enabled on map series</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/mapbubble-animation-false/" target="_blank">disabled on mapbubble series</a>
    */
  val animation: js.UndefOr[Boolean] = js.undefined

  /**
    * The border color of the map areas.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-border/" target="_blank">Borders demo</a>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border width of each map area.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-border/" target="_blank">Borders demo</a>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * The main color of the series. In maps, this color is rarely used, as most choropleth maps use the color to denote the value of each point. The series color can however be used in a map with multiple series holding categorized data. The default value is pulled from the  <code>options.colors</code> array.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/category-map/" target="_blank">Category map by multiple series</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The column size - how many X axis units each column in the heatmap should span.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/heatmap/" target="_blank">One day</a>
    */
  val colsize: js.UndefOr[Double] = js.undefined

  /**
    * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @example Pointer cursor on <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-allowpointselect/" target="_blank">map area</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/mapbubble-allowpointselect/" target="_blank">map bubble</a>
    */
  val cursor: js.UndefOr[String] = js.undefined

  /**
    * An array of data points for the series. For the <code>heatmap</code> series type, points can be given in the following ways:
    *  <ol>
    *  	<li><p>An array of arrays with 3 or 2 values. In this case, the values correspond to <code>x,y,value</code>. If the first value is a string, it is
    *  	applied as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted, in which case the inner arrays should be of length 2. Then the <code>x</code> value is automatically calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code> 
    *  	and <code>pointInterval</code> given in the series options.</p>
    * <pre>data: [
    *     [0, 9, 5], 
    *     [1, 3, 5], 
    *     [2, 8, 8]
    * ]</pre></li>
    * 
    * 
    * <li><p>An array of objects with named values. The objects are
    *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<heatmap>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
    * 
    * <pre>data: [{
    *     x: 1,
    *     y: 3,
    *     value: 1,
    *     name: "Point2",
    *     color: "#00FF00"
    * }, {
    *     x: 1,
    *     y: 1,
    *     value: 2,
    *     name: "Point1",
    *     color: "#FF00FF"
    * }]</pre></li>
    *  </ol>
    */
  val data: js.UndefOr[js.Array[CleanJsObject[SeriesHeatmapData] | js.Array[js.Any]]] = js.undefined

  val dataLabels: js.UndefOr[CleanJsObject[SeriesHeatmapDataLabels]] = js.undefined

  /**
    * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-enablemousetracking-false/" target="_blank">No mouse tracking</a>
    */
  val enableMouseTracking: js.UndefOr[Boolean] = js.undefined

  val events: js.UndefOr[CleanJsObject[SeriesHeatmapEvents]] = js.undefined

  /**
    * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    */
  val index: js.UndefOr[Double] = js.undefined

  /**
    * The sequential index of the series in the legend.
    */
  val legendIndex: js.UndefOr[Double] = js.undefined

  /**
    * An array of objects containing a <code>path</code> definition and optionally a code or property to join in the data as per the <code>joinBy</code> option. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/category-map/" target="_blank">Map data and joinBy</a>
    */
  val mapData: js.UndefOr[js.Array[js.Object]] = js.undefined

  /**
    * The name of the series as shown in the legend, tooltip etc.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/category-map/" target="_blank">Series name</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * The color to apply to null points.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/all-areas-as-null/" target="_blank">Null color</a>
    */
  val nullColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Properties for each single point
    */
  val point: js.UndefOr[CleanJsObject[SeriesHeatmapPoint]] = js.undefined

  /**
    * The row size - how many Y axis units each heatmap row should span.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/heatmap/" target="_blank">1 by default</a>
    */
  val rowsize: js.UndefOr[Double] = js.undefined

  /**
    * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to apply a drop shadow to the shapes. The shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * If true, and the series has a unique legend item, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option. Note that if a colorAxis is defined, the color axis is represented in the legend, not the series.
    */
  val showCheckbox: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to display this particular series or series type in the legend. Note that if a colorAxis is defined, the color axis is represented in the legend, not the series.
    */
  val showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * A wrapper object for all the series options in specific states.
    */
  val states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = js.undefined

  /**
    * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event
    *  on a series isn't triggered until the mouse moves over another series, or out
    *  of the plot area. When false, the <code>mouseOut</code> event on a series is
    *  triggered when the mouse leaves the area around the series' graph or markers.
    *  This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the 
    *  tooltip will be hidden when moving the mouse between series. 
    */
  val stickyTracking: js.UndefOr[Boolean] = js.undefined

  /**
    * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
    */
  val tooltip: js.UndefOr[CleanJsObject[SeriesHeatmapTooltip]] = js.undefined

  /**
    * The type of series. Can be one of <code>area</code>, <code>areaspline</code>,
    *  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,
    *  <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/mapline-mappoint/" target="_blank">Multiple types in the same map</a>
    */
  val `type`: String = "heatmap"

  /**
    * Set the initial visibility of the series.
    */
  val visible: js.UndefOr[Boolean] = js.undefined

  /**
    * Define the z index of the series.
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object SeriesHeatmap {
  /**
    * @param allowPointSelect Allow this series' points to be selected by clicking on the shapes. Selected points can be read through the <a href="#Chart.getSelectedPoints()">Chart.getSelectedPoints()</a> method.
    * @param animation <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>. <dl>.   <dt>duration</dt>.   <dd>The duration of the animation in milliseconds.</dd>. <dt>easing</dt>. <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>. </dl>. <p>Due to poor performance, animation is disabled in old IE browsers for map series, but enabled on mapbubble series.</p>
    * @param borderColor The border color of the map areas.
    * @param borderWidth The border width of each map area.
    * @param color The main color of the series. In maps, this color is rarely used, as most choropleth maps use the color to denote the value of each point. The series color can however be used in a map with multiple series holding categorized data. The default value is pulled from the  <code>options.colors</code> array.
    * @param colsize The column size - how many X axis units each column in the heatmap should span.
    * @param cursor You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @param data An array of data points for the series. For the <code>heatmap</code> series type, points can be given in the following ways:.  <ol>.  	<li><p>An array of arrays with 3 or 2 values. In this case, the values correspond to <code>x,y,value</code>. If the first value is a string, it is.  	applied as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted, in which case the inner arrays should be of length 2. Then the <code>x</code> value is automatically calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code> .  	and <code>pointInterval</code> given in the series options.</p>. <pre>data: [.     [0, 9, 5], .     [1, 3, 5], .     [2, 8, 8]. ]</pre></li>. . . <li><p>An array of objects with named values. The objects are.  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<heatmap>.turboThreshold'>turboThreshold</a>, this option is not available.</p>. . <pre>data: [{.     x: 1,.     y: 3,.     value: 1,.     name: "Point2",.     color: "#00FF00". }, {.     x: 1,.     y: 1,.     value: 2,.     name: "Point1",.     color: "#FF00FF". }]</pre></li>.  </ol>
    * @param enableMouseTracking Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
    * @param id An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    * @param index The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    * @param legendIndex The sequential index of the series in the legend.
    * @param mapData An array of objects containing a <code>path</code> definition and optionally a code or property to join in the data as per the <code>joinBy</code> option. 
    * @param name The name of the series as shown in the legend, tooltip etc.
    * @param nullColor The color to apply to null points.
    * @param point Properties for each single point
    * @param rowsize The row size - how many Y axis units each heatmap row should span.
    * @param selected Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
    * @param shadow Whether to apply a drop shadow to the shapes. The shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @param showCheckbox If true, and the series has a unique legend item, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option. Note that if a colorAxis is defined, the color axis is represented in the legend, not the series.
    * @param showInLegend Whether to display this particular series or series type in the legend. Note that if a colorAxis is defined, the color axis is represented in the legend, not the series.
    * @param states A wrapper object for all the series options in specific states.
    * @param stickyTracking Sticky tracking of mouse events. When true, the <code>mouseOut</code> event.  on a series isn't triggered until the mouse moves over another series, or out.  of the plot area. When false, the <code>mouseOut</code> event on a series is.  triggered when the mouse leaves the area around the series' graph or markers..  This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the .  tooltip will be hidden when moving the mouse between series. 
    * @param tooltip A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
    * @param `type` The type of series. Can be one of <code>area</code>, <code>areaspline</code>,.  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,.  <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    * @param visible Set the initial visibility of the series.
    * @param zIndex Define the z index of the series.
    */
  def apply(allowPointSelect: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colsize: js.UndefOr[Double] = js.undefined, cursor: js.UndefOr[String] = js.undefined, data: js.UndefOr[js.Array[CleanJsObject[SeriesHeatmapData] | js.Array[js.Any]]] = js.undefined, dataLabels: js.UndefOr[CleanJsObject[SeriesHeatmapDataLabels]] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesHeatmapEvents]] = js.undefined, id: js.UndefOr[String] = js.undefined, index: js.UndefOr[Double] = js.undefined, legendIndex: js.UndefOr[Double] = js.undefined, mapData: js.UndefOr[js.Array[js.Object]] = js.undefined, name: js.UndefOr[String] = js.undefined, nullColor: js.UndefOr[String | js.Object] = js.undefined, point: js.UndefOr[CleanJsObject[SeriesHeatmapPoint]] = js.undefined, rowsize: js.UndefOr[Double] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, showCheckbox: js.UndefOr[Boolean] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, tooltip: js.UndefOr[CleanJsObject[SeriesHeatmapTooltip]] = js.undefined, `type`: String = "heatmap", visible: js.UndefOr[Boolean] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): SeriesHeatmap = {
    val allowPointSelectOuter: js.UndefOr[Boolean] = allowPointSelect
    val animationOuter: js.UndefOr[Boolean] = animation
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val colorOuter: js.UndefOr[String | js.Object] = color
    val colsizeOuter: js.UndefOr[Double] = colsize
    val cursorOuter: js.UndefOr[String] = cursor
    val dataOuter: js.UndefOr[js.Array[CleanJsObject[SeriesHeatmapData] | js.Array[js.Any]]] = data
    val dataLabelsOuter: js.UndefOr[CleanJsObject[SeriesHeatmapDataLabels]] = dataLabels
    val enableMouseTrackingOuter: js.UndefOr[Boolean] = enableMouseTracking
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesHeatmapEvents]] = events
    val idOuter: js.UndefOr[String] = id
    val indexOuter: js.UndefOr[Double] = index
    val legendIndexOuter: js.UndefOr[Double] = legendIndex
    val mapDataOuter: js.UndefOr[js.Array[js.Object]] = mapData
    val nameOuter: js.UndefOr[String] = name
    val nullColorOuter: js.UndefOr[String | js.Object] = nullColor
    val pointOuter: js.UndefOr[CleanJsObject[SeriesHeatmapPoint]] = point
    val rowsizeOuter: js.UndefOr[Double] = rowsize
    val selectedOuter: js.UndefOr[Boolean] = selected
    val shadowOuter: js.UndefOr[Boolean | js.Object] = shadow
    val showCheckboxOuter: js.UndefOr[Boolean] = showCheckbox
    val showInLegendOuter: js.UndefOr[Boolean] = showInLegend
    val statesOuter: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = states
    val stickyTrackingOuter: js.UndefOr[Boolean] = stickyTracking
    val tooltipOuter: js.UndefOr[CleanJsObject[SeriesHeatmapTooltip]] = tooltip
    val typeOuter: String = `type`
    val visibleOuter: js.UndefOr[Boolean] = visible
    val zIndexOuter: js.UndefOr[Double] = zIndex
    new SeriesHeatmap {
      override val allowPointSelect: js.UndefOr[Boolean] = allowPointSelectOuter
      override val animation: js.UndefOr[Boolean] = animationOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val colsize: js.UndefOr[Double] = colsizeOuter
      override val cursor: js.UndefOr[String] = cursorOuter
      override val data: js.UndefOr[js.Array[CleanJsObject[SeriesHeatmapData] | js.Array[js.Any]]] = dataOuter
      override val dataLabels: js.UndefOr[CleanJsObject[SeriesHeatmapDataLabels]] = dataLabelsOuter
      override val enableMouseTracking: js.UndefOr[Boolean] = enableMouseTrackingOuter
      override val events: js.UndefOr[CleanJsObject[SeriesHeatmapEvents]] = eventsOuter
      override val id: js.UndefOr[String] = idOuter
      override val index: js.UndefOr[Double] = indexOuter
      override val legendIndex: js.UndefOr[Double] = legendIndexOuter
      override val mapData: js.UndefOr[js.Array[js.Object]] = mapDataOuter
      override val name: js.UndefOr[String] = nameOuter
      override val nullColor: js.UndefOr[String | js.Object] = nullColorOuter
      override val point: js.UndefOr[CleanJsObject[SeriesHeatmapPoint]] = pointOuter
      override val rowsize: js.UndefOr[Double] = rowsizeOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val shadow: js.UndefOr[Boolean | js.Object] = shadowOuter
      override val showCheckbox: js.UndefOr[Boolean] = showCheckboxOuter
      override val showInLegend: js.UndefOr[Boolean] = showInLegendOuter
      override val states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = statesOuter
      override val stickyTracking: js.UndefOr[Boolean] = stickyTrackingOuter
      override val tooltip: js.UndefOr[CleanJsObject[SeriesHeatmapTooltip]] = tooltipOuter
      override val `type`: String = typeOuter
      override val visible: js.UndefOr[Boolean] = visibleOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    }
  }
}
