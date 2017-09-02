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
  * @note JavaScript name: <code>plotOptions-mapbubble</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMapbubble extends js.Object {

  /**
    * Whether all areas of the map defined in <code>mapData</code> should be rendered. If <code>true</code>, areas which don't correspond to a data point, are rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allareas-false/" target="_blank">All areas set to false</a>
    */
  val allAreas: js.UndefOr[Boolean] = js.undefined

  /**
    * Allow this series' points to be selected by clicking on the shapes. Selected points can be read through the <a href="#Chart.getSelectedPoints()">Chart.getSelectedPoints()</a> method.
    * @example Allow select on <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/" target="_blank">map area</a>, <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/mapbubble-allowpointselect/" target="_blank">map bubble</a>
    */
  val allowPointSelect: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>
    * <dl>
    *   <dt>duration</dt>
    *   <dd>The duration of the animation in milliseconds.</dd>
    * <dt>easing</dt>
    * <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>
    * </dl>
    * <p>Due to poor performance, animation is disabled in old IE browsers for map series, but enabled on mapbubble series.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-animation-true/" target="_blank">Animation enabled on map series</a>, <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/mapbubble-animation-false/" target="_blank">disabled on mapbubble series</a>
    */
  val animation: js.UndefOr[Boolean] = js.undefined

  /**
    * For some series, there is a limit that shuts down initial animation by default when the total number of points in the chart is too high. For example, for a column chart and its derivatives, animation doesn't run if there is more than 250 points totally. To disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
    */
  val animationLimit: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border color of the map areas.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the border stroke is given in the <code>.highcharts-point</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-border/" target="_blank">Borders demo</a>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border width of each map area.</p>
    * 
    * <p><p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the border stroke width is given in the <code>.highcharts-point</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-border/" target="_blank">Borders demo</a>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * A class name to apply to the series' graphical elements.
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * The main color of the series. This color affects both the fill and the stroke of the bubble. For enhanced control, use <code>marker</code> options.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/mapbubble-color/" target="_blank">Pink bubbles</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Set this option to <code>false</code> to prevent a series from connecting to the global color axis. This will cause the series to have its own legend item.
    */
  val colorAxis: js.UndefOr[Boolean] = js.undefined

  /**
    * <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">Styled mode</a> only. A specific color index to use for the series, so its graphic representations are given the class name <code>highcharts-color-{n}</code>.
    * @since 5.0.0
    */
  val colorIndex: js.UndefOr[Double] = js.undefined

  /**
    * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @example Pointer cursor on <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/" target="_blank">map area</a>, <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/mapbubble-allowpointselect/" target="_blank">map bubble</a>
    */
  val cursor: js.UndefOr[String] = js.undefined

  /**
    * <p>Options for the series data labels, appearing next to each data point.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the data labels can be styled wtih the <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names (<a href=#http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels/">see example</a>).</p>
    */
  val dataLabels: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleDataLabels]] = js.undefined

  /**
    * <p><i>Requires Accessibility module</i></p>
    * <p>A description of the series to add to the screen reader information about the series.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/accessibility/accessible-stock/">Accessible stock chart</a>
    * @since 5.0.0
    */
  val description: js.UndefOr[String] = js.undefined

  /**
    * Whether to display negative sized bubbles. The threshold is given by the <a href="#plotOptions.bubble.zThreshold">zThreshold</a> option, and negative bubbles can be visualized by setting <a href="#plotOptions.bubble.negativeColor">negativeColor</a>.
    */
  val displayNegative: js.UndefOr[Boolean] = js.undefined

  /**
    * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-enablemousetracking-false/" target="_blank">No mouse tracking</a>
    */
  val enableMouseTracking: js.UndefOr[Boolean] = js.undefined

  val events: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleEvents]] = js.undefined

  /**
    * <p>By default, series are exposed to screen readers as regions. By enabling this option, the series element itself will be exposed in the same way as the data points. This is useful if the series is not used as a grouping entity in the chart, but you still want to attach a description to the series.</p>
    * <p>Requires the Accessibility module.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highslide-software/highcharts.com/tree/master/samples/highcharts/accessibility/art-grants/" target="_blank">Accessible data visualization</a>
    * @since 5.0.12
    */
  val exposeElementToA11y: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Determines whether the series should look for the nearest point in both dimensions or just the x-dimension when hovering the series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most other series. If the data has duplicate x-values, it is recommended to set this to <code>'xy'</code> to allow hovering over all points.</p>
    * <p>Applies only to series types using nearest neighbor search (not direct hover) for tooltip.</p> 
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highslide-software/highcharts.com/tree/master/samples/highcharts/series/findnearestpointby/" target="_blank">Different hover behaviors</a>
    * @since 5.0.10
    */
  val findNearestPointBy: js.UndefOr[String] = js.undefined

  /**
    * <p>What property to join the <code>mapData</code> to the value data. For example, if joinBy is "code", the mapData items with a specific code is merged into the data with the same code. For maps loaded from GeoJSON, the keys may be held in each point's <code>properties</code> object.</p>
    * 
    * <p>The joinBy option can also be an array of two values, where the first points to a key in the <code>mapData</code>, and the second points to another key in the <code>data</code>.</p>
    * 
    * <p>When joinBy is <code>null</code>, the map  items are joined by their position in the array, which performs much better in maps with many data points. This is the recommended option if you are printing more than a thousand data points and have a backend that can preprocess the data into a parallel array of the mapData.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-border/" target="_blank">Joined by "code"</a>, <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/geojson/" target="_blank">GeoJSON joined by an array</a>, <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/series/joinby-null/" target="_blank">simple data joined by null</a>.
    */
  val joinBy: js.UndefOr[String | js.Array[String]] = js.undefined

  /**
    * Maximum bubble size. Bubbles will automatically size between the <code>minSize</code> and <code>maxSize</code> to reflect the <code>z</code> value of each bubble. Can be either pixels (when no unit is given), or a percentage of the smallest one of the plot width and height. 
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/map-bubble/" target="_blank">Bubble size</a>
    */
  val maxSize: js.UndefOr[String] = js.undefined

  /**
    * Minimum bubble size. Bubbles will automatically size between the <code>minSize</code> and <code>maxSize</code> to reflect the <code>z</code> value of each bubble. Can be either pixels (when no unit is given), or a percentage of the smallest one of the plot width and height. 
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/map-bubble/" target="_blank">Bubble size</a>
    */
  val minSize: js.UndefOr[String] = js.undefined

  /**
    * When a point's Z value is below the <a href="#plotOptions.bubble.zThreshold">zThreshold</a> setting, this color is used.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/mapbubble-negativecolor/" target="_blank">Negative color below a threshold</a>
    */
  val negativeColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Properties for each single point
    */
  val point: js.UndefOr[CleanJsObject[PlotOptionsMapbubblePoint]] = js.undefined

  /**
    * Same as <a href="#accessibility.pointDescriptionFormatter">accessibility.pointDescriptionFormatter</a>, but for an individual series. Overrides the chart wide configuration.
    * @since 5.0.12
    */
  val pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined

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
    * Whether the bubble's value should be represented by the area or the width of the bubble. The default, <code>area</code>, corresponds best to the human perception of the size of each bubble. 
    */
  val sizeBy: js.UndefOr[String] = js.undefined

  /**
    * When this is true, the absolute value of z determines the size of the bubble. This means that with the default <code>zThreshold</code> of 0, a bubble of value -1 will have the same size as a bubble of value 1, while a bubble of value 0 will have a smaller size according to <code>minSize</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-sizebyabsolutevalue/" target="_blank">Size by absolute value, various thresholds</a>.
    * @since 1.1.9
    */
  val sizeByAbsoluteValue: js.UndefOr[Boolean] = js.undefined

  /**
    * If set to <code>True</code>, the accessibility module will skip past the points in this series for keyboard navigation.
    * @since 5.0.12
    */
  val skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined

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
  val tooltip: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleTooltip]] = js.undefined

  /**
    * Set the initial visibility of the series.
    */
  val visible: js.UndefOr[Boolean] = js.undefined

  /**
    * Define the z index of the series.
    */
  val zIndex: js.UndefOr[Double] = js.undefined

  /**
    * The minimum for the Z value range. Defaults to the highest Z value in the data.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-zmin-zmax/" target="_blank">Z has a possible range of 0-100</a>
    * @since 1.0.3
    */
  val zMax: js.UndefOr[Double] = js.undefined

  /**
    * The minimum for the Z value range. Defaults to the lowest Z value in the data.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-zmin-zmax/" target="_blank">Z has a possible range of 0-100</a>
    * @since 1.0.3
    */
  val zMin: js.UndefOr[Double] = js.undefined

  /**
    * When <a href="#plotOptions.bubble.displayNegative">displayNegative</a> is <code>false</code>, bubbles with lower Z values are skipped. When <code>displayNegative</code> is <code>true</code> and a <a href="#plotOptions.bubble.negativeColor">negativeColor</a> is given, points with lower Z is colored.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/mapbubble-negativecolor/" target="_blank">Negative color below a threshold</a>
    */
  val zThreshold: js.UndefOr[Double] = js.undefined
}

object PlotOptionsMapbubble {
  /**
    * @param allAreas Whether all areas of the map defined in <code>mapData</code> should be rendered. If <code>true</code>, areas which don't correspond to a data point, are rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
    * @param allowPointSelect Allow this series' points to be selected by clicking on the shapes. Selected points can be read through the <a href="#Chart.getSelectedPoints()">Chart.getSelectedPoints()</a> method.
    * @param animation <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>. <dl>.   <dt>duration</dt>.   <dd>The duration of the animation in milliseconds.</dd>. <dt>easing</dt>. <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>. </dl>. <p>Due to poor performance, animation is disabled in old IE browsers for map series, but enabled on mapbubble series.</p>
    * @param animationLimit For some series, there is a limit that shuts down initial animation by default when the total number of points in the chart is too high. For example, for a column chart and its derivatives, animation doesn't run if there is more than 250 points totally. To disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
    * @param borderColor <p>The border color of the map areas.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the border stroke is given in the <code>.highcharts-point</code> class.</p>
    * @param borderWidth <p>The border width of each map area.</p>. . <p><p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the border stroke width is given in the <code>.highcharts-point</code> class.</p>
    * @param className A class name to apply to the series' graphical elements.
    * @param color The main color of the series. This color affects both the fill and the stroke of the bubble. For enhanced control, use <code>marker</code> options.
    * @param colorAxis Set this option to <code>false</code> to prevent a series from connecting to the global color axis. This will cause the series to have its own legend item.
    * @param colorIndex <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">Styled mode</a> only. A specific color index to use for the series, so its graphic representations are given the class name <code>highcharts-color-{n}</code>.
    * @param cursor You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @param dataLabels <p>Options for the series data labels, appearing next to each data point.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the data labels can be styled wtih the <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names (<a href=#http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels/">see example</a>).</p>
    * @param description <p><i>Requires Accessibility module</i></p>. <p>A description of the series to add to the screen reader information about the series.</p>
    * @param displayNegative Whether to display negative sized bubbles. The threshold is given by the <a href="#plotOptions.bubble.zThreshold">zThreshold</a> option, and negative bubbles can be visualized by setting <a href="#plotOptions.bubble.negativeColor">negativeColor</a>.
    * @param enableMouseTracking Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
    * @param exposeElementToA11y <p>By default, series are exposed to screen readers as regions. By enabling this option, the series element itself will be exposed in the same way as the data points. This is useful if the series is not used as a grouping entity in the chart, but you still want to attach a description to the series.</p>. <p>Requires the Accessibility module.</p>
    * @param findNearestPointBy <p>Determines whether the series should look for the nearest point in both dimensions or just the x-dimension when hovering the series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most other series. If the data has duplicate x-values, it is recommended to set this to <code>'xy'</code> to allow hovering over all points.</p>. <p>Applies only to series types using nearest neighbor search (not direct hover) for tooltip.</p> 
    * @param joinBy <p>What property to join the <code>mapData</code> to the value data. For example, if joinBy is "code", the mapData items with a specific code is merged into the data with the same code. For maps loaded from GeoJSON, the keys may be held in each point's <code>properties</code> object.</p>. . <p>The joinBy option can also be an array of two values, where the first points to a key in the <code>mapData</code>, and the second points to another key in the <code>data</code>.</p>. . <p>When joinBy is <code>null</code>, the map  items are joined by their position in the array, which performs much better in maps with many data points. This is the recommended option if you are printing more than a thousand data points and have a backend that can preprocess the data into a parallel array of the mapData.</p>
    * @param maxSize Maximum bubble size. Bubbles will automatically size between the <code>minSize</code> and <code>maxSize</code> to reflect the <code>z</code> value of each bubble. Can be either pixels (when no unit is given), or a percentage of the smallest one of the plot width and height. 
    * @param minSize Minimum bubble size. Bubbles will automatically size between the <code>minSize</code> and <code>maxSize</code> to reflect the <code>z</code> value of each bubble. Can be either pixels (when no unit is given), or a percentage of the smallest one of the plot width and height. 
    * @param negativeColor When a point's Z value is below the <a href="#plotOptions.bubble.zThreshold">zThreshold</a> setting, this color is used.
    * @param point Properties for each single point
    * @param pointDescriptionFormatter Same as <a href="#accessibility.pointDescriptionFormatter">accessibility.pointDescriptionFormatter</a>, but for an individual series. Overrides the chart wide configuration.
    * @param selected Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
    * @param shadow Whether to apply a drop shadow to the shapes. The shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @param showCheckbox If true, and the series has a unique legend item, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option. Note that if a colorAxis is defined, the color axis is represented in the legend, not the series.
    * @param showInLegend Whether to display this particular series or series type in the legend. Note that if a colorAxis is defined, the color axis is represented in the legend, not the series.
    * @param sizeBy Whether the bubble's value should be represented by the area or the width of the bubble. The default, <code>area</code>, corresponds best to the human perception of the size of each bubble. 
    * @param sizeByAbsoluteValue When this is true, the absolute value of z determines the size of the bubble. This means that with the default <code>zThreshold</code> of 0, a bubble of value -1 will have the same size as a bubble of value 1, while a bubble of value 0 will have a smaller size according to <code>minSize</code>.
    * @param skipKeyboardNavigation If set to <code>True</code>, the accessibility module will skip past the points in this series for keyboard navigation.
    * @param states A wrapper object for all the series options in specific states.
    * @param stickyTracking Sticky tracking of mouse events. When true, the <code>mouseOut</code> event.  on a series isn't triggered until the mouse moves over another series, or out.  of the plot area. When false, the <code>mouseOut</code> event on a series is.  triggered when the mouse leaves the area around the series' graph or markers..  This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the .  tooltip will be hidden when moving the mouse between series. 
    * @param tooltip A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
    * @param visible Set the initial visibility of the series.
    * @param zIndex Define the z index of the series.
    * @param zMax The minimum for the Z value range. Defaults to the highest Z value in the data.
    * @param zMin The minimum for the Z value range. Defaults to the lowest Z value in the data.
    * @param zThreshold When <a href="#plotOptions.bubble.displayNegative">displayNegative</a> is <code>false</code>, bubbles with lower Z values are skipped. When <code>displayNegative</code> is <code>true</code> and a <a href="#plotOptions.bubble.negativeColor">negativeColor</a> is given, points with lower Z is colored.
    */
  def apply(allAreas: js.UndefOr[Boolean] = js.undefined, allowPointSelect: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean] = js.undefined, animationLimit: js.UndefOr[Double] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorAxis: js.UndefOr[Boolean] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, cursor: js.UndefOr[String] = js.undefined, dataLabels: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleDataLabels]] = js.undefined, description: js.UndefOr[String] = js.undefined, displayNegative: js.UndefOr[Boolean] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleEvents]] = js.undefined, exposeElementToA11y: js.UndefOr[Boolean] = js.undefined, findNearestPointBy: js.UndefOr[String] = js.undefined, joinBy: js.UndefOr[String | js.Array[String]] = js.undefined, maxSize: js.UndefOr[String] = js.undefined, minSize: js.UndefOr[String] = js.undefined, negativeColor: js.UndefOr[String | js.Object] = js.undefined, point: js.UndefOr[CleanJsObject[PlotOptionsMapbubblePoint]] = js.undefined, pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, showCheckbox: js.UndefOr[Boolean] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, sizeBy: js.UndefOr[String] = js.undefined, sizeByAbsoluteValue: js.UndefOr[Boolean] = js.undefined, skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined, states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, tooltip: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleTooltip]] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, zMax: js.UndefOr[Double] = js.undefined, zMin: js.UndefOr[Double] = js.undefined, zThreshold: js.UndefOr[Double] = js.undefined): PlotOptionsMapbubble = {
    val allAreasOuter: js.UndefOr[Boolean] = allAreas
    val allowPointSelectOuter: js.UndefOr[Boolean] = allowPointSelect
    val animationOuter: js.UndefOr[Boolean] = animation
    val animationLimitOuter: js.UndefOr[Double] = animationLimit
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val colorAxisOuter: js.UndefOr[Boolean] = colorAxis
    val colorIndexOuter: js.UndefOr[Double] = colorIndex
    val cursorOuter: js.UndefOr[String] = cursor
    val dataLabelsOuter: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleDataLabels]] = dataLabels
    val descriptionOuter: js.UndefOr[String] = description
    val displayNegativeOuter: js.UndefOr[Boolean] = displayNegative
    val enableMouseTrackingOuter: js.UndefOr[Boolean] = enableMouseTracking
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleEvents]] = events
    val exposeElementToA11yOuter: js.UndefOr[Boolean] = exposeElementToA11y
    val findNearestPointByOuter: js.UndefOr[String] = findNearestPointBy
    val joinByOuter: js.UndefOr[String | js.Array[String]] = joinBy
    val maxSizeOuter: js.UndefOr[String] = maxSize
    val minSizeOuter: js.UndefOr[String] = minSize
    val negativeColorOuter: js.UndefOr[String | js.Object] = negativeColor
    val pointOuter: js.UndefOr[CleanJsObject[PlotOptionsMapbubblePoint]] = point
    val pointDescriptionFormatterOuter: js.UndefOr[js.Function] = pointDescriptionFormatter
    val selectedOuter: js.UndefOr[Boolean] = selected
    val shadowOuter: js.UndefOr[Boolean | js.Object] = shadow
    val showCheckboxOuter: js.UndefOr[Boolean] = showCheckbox
    val showInLegendOuter: js.UndefOr[Boolean] = showInLegend
    val sizeByOuter: js.UndefOr[String] = sizeBy
    val sizeByAbsoluteValueOuter: js.UndefOr[Boolean] = sizeByAbsoluteValue
    val skipKeyboardNavigationOuter: js.UndefOr[Boolean] = skipKeyboardNavigation
    val statesOuter: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = states
    val stickyTrackingOuter: js.UndefOr[Boolean] = stickyTracking
    val tooltipOuter: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleTooltip]] = tooltip
    val visibleOuter: js.UndefOr[Boolean] = visible
    val zIndexOuter: js.UndefOr[Double] = zIndex
    val zMaxOuter: js.UndefOr[Double] = zMax
    val zMinOuter: js.UndefOr[Double] = zMin
    val zThresholdOuter: js.UndefOr[Double] = zThreshold
    new PlotOptionsMapbubble {
      override val allAreas: js.UndefOr[Boolean] = allAreasOuter
      override val allowPointSelect: js.UndefOr[Boolean] = allowPointSelectOuter
      override val animation: js.UndefOr[Boolean] = animationOuter
      override val animationLimit: js.UndefOr[Double] = animationLimitOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val colorAxis: js.UndefOr[Boolean] = colorAxisOuter
      override val colorIndex: js.UndefOr[Double] = colorIndexOuter
      override val cursor: js.UndefOr[String] = cursorOuter
      override val dataLabels: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleDataLabels]] = dataLabelsOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val displayNegative: js.UndefOr[Boolean] = displayNegativeOuter
      override val enableMouseTracking: js.UndefOr[Boolean] = enableMouseTrackingOuter
      override val events: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleEvents]] = eventsOuter
      override val exposeElementToA11y: js.UndefOr[Boolean] = exposeElementToA11yOuter
      override val findNearestPointBy: js.UndefOr[String] = findNearestPointByOuter
      override val joinBy: js.UndefOr[String | js.Array[String]] = joinByOuter
      override val maxSize: js.UndefOr[String] = maxSizeOuter
      override val minSize: js.UndefOr[String] = minSizeOuter
      override val negativeColor: js.UndefOr[String | js.Object] = negativeColorOuter
      override val point: js.UndefOr[CleanJsObject[PlotOptionsMapbubblePoint]] = pointOuter
      override val pointDescriptionFormatter: js.UndefOr[js.Function] = pointDescriptionFormatterOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val shadow: js.UndefOr[Boolean | js.Object] = shadowOuter
      override val showCheckbox: js.UndefOr[Boolean] = showCheckboxOuter
      override val showInLegend: js.UndefOr[Boolean] = showInLegendOuter
      override val sizeBy: js.UndefOr[String] = sizeByOuter
      override val sizeByAbsoluteValue: js.UndefOr[Boolean] = sizeByAbsoluteValueOuter
      override val skipKeyboardNavigation: js.UndefOr[Boolean] = skipKeyboardNavigationOuter
      override val states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = statesOuter
      override val stickyTracking: js.UndefOr[Boolean] = stickyTrackingOuter
      override val tooltip: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleTooltip]] = tooltipOuter
      override val visible: js.UndefOr[Boolean] = visibleOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
      override val zMax: js.UndefOr[Double] = zMaxOuter
      override val zMin: js.UndefOr[Double] = zMinOuter
      override val zThreshold: js.UndefOr[Double] = zThresholdOuter
    }
  }
}
