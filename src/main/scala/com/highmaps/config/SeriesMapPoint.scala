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
  * @note JavaScript name: <code>series&lt;map&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMapPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesMapPointEvents]] = js.undefined
}

object SeriesMapPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesMapPointEvents]] = js.undefined): SeriesMapPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesMapPointEvents]] = events
    new SeriesMapPoint {
      override val events: js.UndefOr[CleanJsObject[SeriesMapPointEvents]] = eventsOuter
    }
  }
}
/**
  * @note JavaScript name: <code>series&lt;mappoint&gt;</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMappoint extends js.Object {

  /**
    * An array of data points for the series. For the <code>mappoint</code> series type, points can be given in the following ways:
    *  <ol>
    *  	<li>An array of numerical values. In this case, the numerical values will 
    *  	be interpreted as <code>y</code> options. The <code>x</code> values will be automatically calculated,
    *  	either starting at 0 and incremented by 1, or from <code>pointStart</code> 
    *  	and <code>pointInterval</code> given in the series options. If the axis
    *  	has categories, these will be used.  Example:
    * <pre>data: [0, 5, 3, 5]</pre>
    *  	</li>
    *  	<li><p>An array of arrays with 2 values. In this case, the values correspond to <code>x,y</code>. If the first value is a string, it is
    *  	applied as the name of the point, and the <code>x</code> value is inferred. <pre>data: [
    *     [0, 1], 
    *     [1, 8], 
    *     [2, 7]
    * ]</pre></li>
    * 
    * 
    * <li><p>An array of objects with named values. The objects are
    *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<mappoint>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
    * 
    * <pre>data: [{
    *     x: 1,
    *     y: 7,
    *     name: "Point2",
    *     color: "#00FF00"
    * }, {
    *     x: 1,
    *     y: 4,
    *     name: "Point1",
    *     color: "#FF00FF"
    * }]</pre></li>
    *  </ol>
    */
  val data: js.UndefOr[js.Array[CleanJsObject[SeriesMappointData] | js.Array[js.Any] | Double]] = js.undefined

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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/demo/category-map/" target="_blank">Map data and joinBy</a>
    */
  val mapData: js.UndefOr[js.Array[js.Object]] = js.undefined

  /**
    * The name of the series as shown in the legend, tooltip etc.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/demo/category-map/" target="_blank">Series name</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * The type of series. Can be one of <code>area</code>, <code>areaspline</code>,
    *  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,
    *  <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/demo/mapline-mappoint/" target="_blank">Multiple types in the same map</a>
    */
  val `type`: String = "mappoint"
}

object SeriesMappoint {
  /**
    * @param data An array of data points for the series. For the <code>mappoint</code> series type, points can be given in the following ways:.  <ol>.  	<li>An array of numerical values. In this case, the numerical values will .  	be interpreted as <code>y</code> options. The <code>x</code> values will be automatically calculated,.  	either starting at 0 and incremented by 1, or from <code>pointStart</code> .  	and <code>pointInterval</code> given in the series options. If the axis.  	has categories, these will be used.  Example:. <pre>data: [0, 5, 3, 5]</pre>.  	</li>.  	<li><p>An array of arrays with 2 values. In this case, the values correspond to <code>x,y</code>. If the first value is a string, it is.  	applied as the name of the point, and the <code>x</code> value is inferred. <pre>data: [.     [0, 1], .     [1, 8], .     [2, 7]. ]</pre></li>. . . <li><p>An array of objects with named values. The objects are.  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<mappoint>.turboThreshold'>turboThreshold</a>, this option is not available.</p>. . <pre>data: [{.     x: 1,.     y: 7,.     name: "Point2",.     color: "#00FF00". }, {.     x: 1,.     y: 4,.     name: "Point1",.     color: "#FF00FF". }]</pre></li>.  </ol>
    * @param id An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    * @param index The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    * @param legendIndex The sequential index of the series in the legend.
    * @param mapData An array of objects containing a <code>path</code> definition and optionally a code or property to join in the data as per the <code>joinBy</code> option. 
    * @param name The name of the series as shown in the legend, tooltip etc.
    * @param `type` The type of series. Can be one of <code>area</code>, <code>areaspline</code>,.  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,.  <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    */
  def apply(data: js.UndefOr[js.Array[CleanJsObject[SeriesMappointData] | js.Array[js.Any] | Double]] = js.undefined, id: js.UndefOr[String] = js.undefined, index: js.UndefOr[Double] = js.undefined, legendIndex: js.UndefOr[Double] = js.undefined, mapData: js.UndefOr[js.Array[js.Object]] = js.undefined, name: js.UndefOr[String] = js.undefined, `type`: String = "mappoint"): SeriesMappoint = {
    val dataOuter: js.UndefOr[js.Array[CleanJsObject[SeriesMappointData] | js.Array[js.Any] | Double]] = data
    val idOuter: js.UndefOr[String] = id
    val indexOuter: js.UndefOr[Double] = index
    val legendIndexOuter: js.UndefOr[Double] = legendIndex
    val mapDataOuter: js.UndefOr[js.Array[js.Object]] = mapData
    val nameOuter: js.UndefOr[String] = name
    val typeOuter: String = `type`
    new SeriesMappoint {
      override val data: js.UndefOr[js.Array[CleanJsObject[SeriesMappointData] | js.Array[js.Any] | Double]] = dataOuter
      override val id: js.UndefOr[String] = idOuter
      override val index: js.UndefOr[Double] = indexOuter
      override val legendIndex: js.UndefOr[Double] = legendIndexOuter
      override val mapData: js.UndefOr[js.Array[js.Object]] = mapDataOuter
      override val name: js.UndefOr[String] = nameOuter
      override val `type`: String = typeOuter
    }
  }
}
