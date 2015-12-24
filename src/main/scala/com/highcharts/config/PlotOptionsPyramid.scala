/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.3 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class PlotOptionsPyramid extends js.Object {
  
  /**
   * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-allowpointselect-line/" target="_blank">Line</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-allowpointselect-column/" target="_blank">column</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-allowpointselect-pie/" target="_blank">pie</a>
   * @since 1.2.0
   */
  val allowPointSelect: Boolean = false
  
  /**
   * The color of the border surrounding each slice. When <code>null</code>, the border takes the same color as the slice fill. This can be used together with a <code>borderWidth</code> to fill drawing gaps created by antialiazing artefacts in borderless pies.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/pie-bordercolor-black/" target="_blank">Black border</a>
   */
  val borderColor: String = "#FFFFFF"
  
  /**
   * <p>The width of the border surrounding each slice.</p>
   * 
   * <p>When setting the border width to 0, there may be small gaps between the slices due to SVG antialiasing artefacts. To work around this, keep the border width at 0.5 or 1, but set the <code>borderColor</code> to <code>null</code> instead.</p>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/pie-borderwidth/" target="_blank">3px border</a>
   */
  val borderWidth: Double = 1
  
  /**
   * The center of the series. By default, it is centered in the middle of the plot area, so it fills the plot area height.
   * @since 3.0
   */
  val center: js.Any = js.Array("50%", "50%")
  
  /**
   * A series specific or series type specific color set to use instead of the global <a href="#colors">colors</a>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/pie-monochrome/" target="_blank">Set default colors for all pies</a>
   * @since 3.0
   */
  val colors: UndefOr[js.Array[String]] = js.undefined
  
  /**
   * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
   * @example Pointer cursor <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-cursor-line/" target="_blank">on line graph</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-cursor-column/" target="_blank">on columns</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-cursor-scatter/" target="_blank">on scatter markers</a>
   */
  val cursor: UndefOr[String] = js.undefined
  
  val dataLabels: UndefOr[PlotOptionsPyramidDataLabels] = js.undefined
  
  /**
   * The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/3d-pie/">Basic 3D pie chart</a>
   * @since 4.0
   */
  val depth: Double = 0
  
  /**
   * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-enablemousetracking-false/" target="_blank">No mouse tracking</a>
   */
  val enableMouseTracking: Boolean = true
  
  val events: UndefOr[PlotOptionsPyramidEvents] = js.undefined
  
  /**
   * Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
   * @since 4.1.6
   */
  val getExtremesFromAll: Boolean = false
  
  /**
   * The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string it is the percentage of the plot area height.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/funnel/" target="_blank">Funnel demo</a>
   * @since 3.0
   */
  val height: UndefOr[js.Any] = js.undefined
  
  /**
   * An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-keys/" target="_blank">An extended data array with keys</a>
   * @since 4.1.6
   */
  val keys: UndefOr[js.Array[String]] = js.undefined
  
  /**
   * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/arearange-line/" target="_blank">Linked series</a>
   * @since 3.0
   */
  val linkedTo: String = ""
  
  /**
   * The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels in side the plot area, but only to this size.
   * @since 3.0
   */
  val minSize: Double = 80
  
  /**
   * Properties for each single point
   */
  val point: UndefOr[PlotOptionsPyramidPoint] = js.undefined
  
  /**
   * The pyramid is reversed by default, as opposed to the funnel, which shares the layout engine, and is not reversed.
   * @since 3.0.10
   */
  val reversed: Boolean = true
  
  /**
   * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-selected/" target="_blank">One out of two series selected</a>
   * @since 1.2.0
   */
  val selected: Boolean = false
  
  /**
   * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-shadow/" target="_blank">Shadow enabled</a>
   */
  val shadow: js.Any = false
  
  /**
   * Whether to display this particular series or series type in the legend. Since 2.1, pies are not shown in the legend by default.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-showinlegend/" target="_blank">One series in the legend, one hidden</a>
   */
  val showInLegend: Boolean = false
  
  /**
   * If a point is sliced, moved out from the center, how many pixels should  it be moved?.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/pie-slicedoffset-20/" target="_blank">20px offset</a>
   */
  val slicedOffset: Double = 10
  
  /**
   * A wrapper object for all the series options in specific states.
   */
  val states: UndefOr[PlotOptionsSeriesStates] = js.undefined
  
  /**
   * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event
   *  on a series isn't triggered until the mouse moves over another series, or out
   *  of the plot area. When false, the <code>mouseOut</code> event on a series is
   *  triggered when the mouse leaves the area around the series' graph or markers.
   *  This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the 
   *  tooltip will be hidden when moving the mouse between series.
   */
  val stickyTracking: Boolean = false
  
  /**
   * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
   * @since 2.3
   */
  val tooltip: UndefOr[js.Object] = js.undefined
  
  /**
   * Set the initial visibility of the series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-visible/" target="_blank">Two series, one hidden and one visible</a>
   */
  val visible: Boolean = true
  
  /**
   * The width of the funnel compared to the width of the plot area, or the pixel width if it is a number.
   * @since 3.0
   */
  val width: js.Any = "90%"
  
  /**
   * Defines the Axis on which the zones are applied.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/" target="_blank">Zones on the X-Axis</a>
   * @since 4.1.0
   */
  val zoneAxis: String = "y"
  
  /**
   * An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/color-zones-simple/" target="_blank">Color zones</a>
   * @since 4.1.0
   */
  val zones: UndefOr[js.Array[PlotOptionsPyramidZones]] = js.undefined
}
