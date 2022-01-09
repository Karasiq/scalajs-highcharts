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
  * @note JavaScript name: <code>plotOptions</code>
  */
class PlotOptions extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Acceleration bands (ABANDS). This series requires the <code>linkedTo</code> option
    * to be set and should be loaded after the
    * <code>stock/indicators/indicators.js</code>.</p>
    * <p>In TypeScript the <a href="series.abands.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>abands</code> series are defined in
    * <a href="plotOptions.abands">plotOptions.abands</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.abands">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         abands: {
    *             // shared options for all abands series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;abands&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/acceleration-bands">Acceleration Bands</a>
    * @since 7.0.0
    */
  var abands: js.UndefOr[CleanJsObject[PlotOptionsAbands]] = js.undefined

  /**
    * <p>Accumulation Distribution (AD). This series requires <code>linkedTo</code> option to
    * be set.</p>
    * <p>In TypeScript the <a href="series.ad.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>ad</code> series are defined in
    * <a href="plotOptions.ad">plotOptions.ad</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.ad">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         ad: {
    *             // shared options for all ad series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;ad&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/accumulation-distribution">Accumulation/Distribution indicator</a>
    * @since 6.0.0
    */
  var ad: js.UndefOr[CleanJsObject[PlotOptionsAd]] = js.undefined

  /**
    * <p>Awesome Oscillator. This series requires the <code>linkedTo</code> option to
    * be set and should be loaded after the <code>stock/indicators/indicators.js</code></p>
    * <p>In TypeScript the <a href="series.ao.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>ao</code> series are defined in
    * <a href="plotOptions.ao">plotOptions.ao</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.ao">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         ao: {
    *             // shared options for all ao series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;ao&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/ao">Awesome</a>
    * @since 7.0.0
    */
  var ao: js.UndefOr[CleanJsObject[PlotOptionsAo]] = js.undefined

  /**
    * <p>Absolute Price Oscillator. This series requires the <code>linkedTo</code> option to
    * be set and should be loaded after the <code>stock/indicators/indicators.js</code>.</p>
    * <p>In TypeScript the <a href="series.apo.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>apo</code> series are defined in
    * <a href="plotOptions.apo">plotOptions.apo</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.apo">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         apo: {
    *             // shared options for all apo series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;apo&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/apo">Absolute Price Oscillator</a>
    * @since 7.0.0
    */
  var apo: js.UndefOr[CleanJsObject[PlotOptionsApo]] = js.undefined

  /**
    * <p>The area series type.</p>
    * <p>In TypeScript the <a href="series.area.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>area</code> series are defined in
    * <a href="plotOptions.area">plotOptions.area</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.area">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         area: {
    *             // shared options for all area series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;area&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/area-basic/">Area chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/area/">Area chart</a>
    */
  var area: js.UndefOr[CleanJsObject[PlotOptionsArea]] = js.undefined

  /**
    * <p>The area range series is a carteseian series with higher and lower
    * values for each point along an X axis, where the area between the
    * values is shaded.</p>
    * <p>In TypeScript the <a href="series.arearange.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>arearange</code> series are defined in
    * <a href="plotOptions.arearange">plotOptions.arearange</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.arearange">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         arearange: {
    *             // shared options for all arearange series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;arearange&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/arearange/">Area range chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/arearange/">Area range chart</a>
    */
  var arearange: js.UndefOr[CleanJsObject[PlotOptionsArearange]] = js.undefined

  /**
    * <p>The area spline series is an area series where the graph between the
    * points is smoothed into a spline.</p>
    * <p>In TypeScript the <a href="series.areaspline.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>areaspline</code> series are defined in
    * <a href="plotOptions.areaspline">plotOptions.areaspline</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.areaspline">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         areaspline: {
    *             // shared options for all areaspline series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;areaspline&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/areaspline/">Area spline chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/areaspline/">Area spline chart</a>
    */
  var areaspline: js.UndefOr[CleanJsObject[PlotOptionsAreaspline]] = js.undefined

  /**
    * <p>The area spline range is a cartesian series type with higher and
    * lower Y values along an X axis. The area inside the range is colored, and
    * the graph outlining the area is a smoothed spline.</p>
    * <p>In TypeScript the <a href="series.areasplinerange.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>areasplinerange</code> series are defined in
    * <a href="plotOptions.areasplinerange">plotOptions.areasplinerange</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.areasplinerange">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         areasplinerange: {
    *             // shared options for all areasplinerange series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;areasplinerange&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/areasplinerange/">Area spline range</a>
    * @since 2.3.0
    */
  var areasplinerange: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerange]] = js.undefined

  /**
    * <p>Aroon. This series requires the <code>linkedTo</code> option to be
    * set and should be loaded after the <code>stock/indicators/indicators.js</code>.</p>
    * <p>In TypeScript the <a href="series.aroon.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>aroon</code> series are defined in
    * <a href="plotOptions.aroon">plotOptions.aroon</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.aroon">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         aroon: {
    *             // shared options for all aroon series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;aroon&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/aroon">Aroon</a>
    * @since 7.0.0
    */
  var aroon: js.UndefOr[CleanJsObject[PlotOptionsAroon]] = js.undefined

  /**
    * <p>Aroon Oscillator. This series requires the <code>linkedTo</code> option to be set
    * and should be loaded after the <code>stock/indicators/indicators.js</code> and
    * <code>stock/indicators/aroon.js</code>.</p>
    * <p>In TypeScript the <a href="series.aroonoscillator.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>aroonoscillator</code> series are defined in
    * <a href="plotOptions.aroonoscillator">plotOptions.aroonoscillator</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.aroonoscillator">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         aroonoscillator: {
    *             // shared options for all aroonoscillator series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;aroonoscillator&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/aroon-oscillator">Aroon Oscillator</a>
    * @since 7.0.0
    */
  var aroonoscillator: js.UndefOr[CleanJsObject[PlotOptionsAroonoscillator]] = js.undefined

  /**
    * <p>Average true range indicator (ATR). This series requires <code>linkedTo</code>
    * option to be set.</p>
    * <p>In TypeScript the <a href="series.atr.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>atr</code> series are defined in
    * <a href="plotOptions.atr">plotOptions.atr</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.atr">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         atr: {
    *             // shared options for all atr series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;atr&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/atr">ATR indicator</a>
    * @since 6.0.0
    */
  var atr: js.UndefOr[CleanJsObject[PlotOptionsAtr]] = js.undefined

  /**
    * <p>A bar series is a special type of column series where the columns are
    * horizontal.</p>
    * <p>In TypeScript the <a href="series.bar.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>bar</code> series are defined in
    * <a href="plotOptions.bar">plotOptions.bar</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.bar">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         bar: {
    *             // shared options for all bar series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;bar&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bar-basic/">Bar chart</a>
    */
  var bar: js.UndefOr[CleanJsObject[PlotOptionsBar]] = js.undefined

  /**
    * <p>Bollinger bands (BB). This series requires the <code>linkedTo</code> option to be
    * set and should be loaded after the <code>stock/indicators/indicators.js</code> file.</p>
    * <p>In TypeScript the <a href="series.bb.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>bb</code> series are defined in
    * <a href="plotOptions.bb">plotOptions.bb</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.bb">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         bb: {
    *             // shared options for all bb series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;bb&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/bollinger-bands">Bollinger bands</a>
    * @since 6.0.0
    */
  var bb: js.UndefOr[CleanJsObject[PlotOptionsBb]] = js.undefined

  /**
    * <p>A bell curve is an areaspline series which represents the probability
    * density function of the normal distribution. It calculates mean and
    * standard deviation of the base series data and plots the curve according
    * to the calculated parameters.</p>
    * <p>In TypeScript the <a href="series.bellcurve.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>bellcurve</code> series are defined in
    * <a href="plotOptions.bellcurve">plotOptions.bellcurve</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.bellcurve">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         bellcurve: {
    *             // shared options for all bellcurve series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;bellcurve&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bellcurve/">Bell curve</a>
    * @since 6.0.0
    */
  var bellcurve: js.UndefOr[CleanJsObject[PlotOptionsBellcurve]] = js.undefined

  /**
    * <p>A box plot is a convenient way of depicting groups of data through their
    * five-number summaries: the smallest observation (sample minimum), lower
    * quartile (Q1), median (Q2), upper quartile (Q3), and largest observation
    * (sample maximum).</p>
    * <p>In TypeScript the <a href="series.boxplot.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>boxplot</code> series are defined in
    * <a href="plotOptions.boxplot">plotOptions.boxplot</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.boxplot">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         boxplot: {
    *             // shared options for all boxplot series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;boxplot&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/box-plot/">Box plot</a>
    */
  var boxplot: js.UndefOr[CleanJsObject[PlotOptionsBoxplot]] = js.undefined

  /**
    * <p>A bubble series is a three dimensional series type where each point
    * renders an X, Y and Z value. Each points is drawn as a bubble where the
    * position along the X and Y axes mark the X and Y values, and the size of
    * the bubble relates to the Z value.</p>
    * <p>In TypeScript the <a href="series.bubble.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>bubble</code> series are defined in
    * <a href="plotOptions.bubble">plotOptions.bubble</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.bubble">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         bubble: {
    *             // shared options for all bubble series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;bubble&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bubble/">Bubble chart</a>
    */
  var bubble: js.UndefOr[CleanJsObject[PlotOptionsBubble]] = js.undefined

  /**
    * <p>A bullet graph is a variation of a bar graph. The bullet graph features
    * a single measure, compares it to a target, and displays it in the context
    * of qualitative ranges of performance that could be set using
    * <a href="#yAxis.plotBands">plotBands</a> on <a href="#yAxis">yAxis</a>.</p>
    * <p>In TypeScript the <a href="series.bullet.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>bullet</code> series are defined in
    * <a href="plotOptions.bullet">plotOptions.bullet</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.bullet">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         bullet: {
    *             // shared options for all bullet series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;bullet&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bullet-graph/">Bullet graph</a>
    * @since 6.0.0
    */
  var bullet: js.UndefOr[CleanJsObject[PlotOptionsBullet]] = js.undefined

  /**
    * <p>A candlestick chart is a style of financial chart used to describe
    * price movements over time.</p>
    * <p>In TypeScript the <a href="series.candlestick.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>candlestick</code> series are defined in
    * <a href="plotOptions.candlestick">plotOptions.candlestick</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.candlestick">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         candlestick: {
    *             // shared options for all candlestick series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;candlestick&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/candlestick/">Candlestick chart</a>
    */
  var candlestick: js.UndefOr[CleanJsObject[PlotOptionsCandlestick]] = js.undefined

  /**
    * <p>Commodity Channel Index (CCI). This series requires <code>linkedTo</code> option to
    * be set.</p>
    * <p>In TypeScript the <a href="series.cci.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>cci</code> series are defined in
    * <a href="plotOptions.cci">plotOptions.cci</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.cci">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         cci: {
    *             // shared options for all cci series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;cci&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/cci">CCI indicator</a>
    * @since 6.0.0
    */
  var cci: js.UndefOr[CleanJsObject[PlotOptionsCci]] = js.undefined

  /**
    * <p>Chaikin Oscillator. This series requires the <code>linkedTo</code> option to
    * be set and should be loaded after the <code>stock/indicators/indicators.js</code>.</p>
    * <p>In TypeScript the <a href="series.chaikin.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>chaikin</code> series are defined in
    * <a href="plotOptions.chaikin">plotOptions.chaikin</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.chaikin">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         chaikin: {
    *             // shared options for all chaikin series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;chaikin&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/chaikin">Chaikin Oscillator</a>
    * @since 7.0.0
    */
  var chaikin: js.UndefOr[CleanJsObject[PlotOptionsChaikin]] = js.undefined

  /**
    * <p>Chaikin Money Flow indicator (cmf).</p>
    * <p>In TypeScript the <a href="series.cmf.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>cmf</code> series are defined in
    * <a href="plotOptions.cmf">plotOptions.cmf</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.cmf">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         cmf: {
    *             // shared options for all cmf series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;cmf&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/cmf/">Chaikin Money Flow indicator</a>
    * @since 6.0.0
    */
  var cmf: js.UndefOr[CleanJsObject[PlotOptionsCmf]] = js.undefined

  /**
    * <p>Chande Momentum Oscilator (CMO) technical indicator. This series
    * requires the <code>linkedTo</code> option to be set and should be loaded after
    * the <code>stock/indicators/indicators.js</code> file.</p>
    * <p>In TypeScript the <a href="series.cmo.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>cmo</code> series are defined in
    * <a href="plotOptions.cmo">plotOptions.cmo</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.cmo">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         cmo: {
    *             // shared options for all cmo series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;cmo&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/cmo">CMO indicator</a>
    * @since 9.1.0
    */
  var cmo: js.UndefOr[CleanJsObject[PlotOptionsCmo]] = js.undefined

  /**
    * <p>Column series display one column per value along an X axis.</p>
    * <p>In TypeScript the <a href="series.column.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>column</code> series are defined in
    * <a href="plotOptions.column">plotOptions.column</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.column">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         column: {
    *             // shared options for all column series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;column&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/column-basic/">Column chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/column/">Column chart</a>
    */
  var column: js.UndefOr[CleanJsObject[PlotOptionsColumn]] = js.undefined

  /**
    * <p>Column pyramid series display one pyramid per value along an X axis.
    * To display horizontal pyramids, set <a href="#chart.inverted">chart.inverted</a> to
    * <code>true</code>.</p>
    * <p>In TypeScript the <a href="series.columnpyramid.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>columnpyramid</code> series are defined in
    * <a href="plotOptions.columnpyramid">plotOptions.columnpyramid</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.columnpyramid">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         columnpyramid: {
    *             // shared options for all columnpyramid series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;columnpyramid&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/column-pyramid/">Column pyramid</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/columnpyramid-stacked/">Column pyramid stacked</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/columnpyramid-inverted/">Column pyramid inverted</a>
    * @since 7.0.0
    */
  var columnpyramid: js.UndefOr[CleanJsObject[PlotOptionsColumnpyramid]] = js.undefined

  /**
    * <p>The column range is a cartesian series type with higher and lower
    * Y values along an X axis. To display horizontal bars, set
    * <a href="#chart.inverted">chart.inverted</a> to <code>true</code>.</p>
    * <p>In TypeScript the <a href="series.columnrange.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>columnrange</code> series are defined in
    * <a href="plotOptions.columnrange">plotOptions.columnrange</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.columnrange">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         columnrange: {
    *             // shared options for all columnrange series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;columnrange&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/columnrange/">Inverted column range</a>
    * @since 2.3.0
    */
  var columnrange: js.UndefOr[CleanJsObject[PlotOptionsColumnrange]] = js.undefined

  /**
    * <p>A cylinder graph is a variation of a 3d column graph. The cylinder graph
    * features cylindrical points.</p>
    * <p>In TypeScript the <a href="series.cylinder.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>cylinder</code> series are defined in
    * <a href="plotOptions.cylinder">plotOptions.cylinder</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.cylinder">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         cylinder: {
    *             // shared options for all cylinder series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;cylinder&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/cylinder/">Cylinder graph</a>
    * @since 7.0.0
    */
  var cylinder: js.UndefOr[CleanJsObject[PlotOptionsCylinder]] = js.undefined

  /**
    * <p>Double exponential moving average (DEMA) indicator. This series requires
    * <code>linkedTo</code> option to be set and should be loaded after the
    * <code>stock/indicators/indicators.js</code>.</p>
    * <p>In TypeScript the <a href="series.dema.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>dema</code> series are defined in
    * <a href="plotOptions.dema">plotOptions.dema</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.dema">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         dema: {
    *             // shared options for all dema series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;dema&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/dema">DEMA indicator</a>
    * @since 7.0.0
    */
  var dema: js.UndefOr[CleanJsObject[PlotOptionsDema]] = js.undefined

  /**
    * <p>A dependency wheel chart is a type of flow diagram, where all nodes are
    * laid out in a circle, and the flow between the are drawn as link bands.</p>
    * <p>In TypeScript the <a href="series.dependencywheel.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>dependencywheel</code> series are defined in
    * <a href="plotOptions.dependencywheel">plotOptions.dependencywheel</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.dependencywheel">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         dependencywheel: {
    *             // shared options for all dependencywheel series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;dependencywheel&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/dependency-wheel/">Dependency wheel</a>
    * @since 7.1.0
    */
  var dependencywheel: js.UndefOr[CleanJsObject[PlotOptionsDependencywheel]] = js.undefined

  /**
    * <p>Disparity Index.
    * This series requires the <code>linkedTo</code> option to be set and should
    * be loaded after the <code>stock/indicators/indicators.js</code> file.</p>
    * <p>In TypeScript the <a href="series.disparityindex.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>disparityindex</code> series are defined in
    * <a href="plotOptions.disparityindex">plotOptions.disparityindex</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.disparityindex">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         disparityindex: {
    *             // shared options for all disparityindex series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;disparityindex&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/disparity-index">Disparity Index indicator</a>
    * @since 9.1.0
    */
  var disparityindex: js.UndefOr[CleanJsObject[PlotOptionsDisparityindex]] = js.undefined

  /**
    * <p>Directional Movement Index (DMI).
    * This series requires the <code>linkedTo</code> option to be set and should
    * be loaded after the <code>stock/indicators/indicators.js</code> file.</p>
    * <p>In TypeScript the <a href="series.dmi.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>dmi</code> series are defined in
    * <a href="plotOptions.dmi">plotOptions.dmi</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.dmi">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         dmi: {
    *             // shared options for all dmi series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;dmi&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/dmi">DMI indicator</a>
    * @since 9.1.0
    */
  var dmi: js.UndefOr[CleanJsObject[PlotOptionsDmi]] = js.undefined

  /**
    * <p>Detrended Price Oscillator. This series requires the <code>linkedTo</code> option to
    * be set and should be loaded after the <code>stock/indicators/indicators.js</code>.</p>
    * <p>In TypeScript the <a href="series.dpo.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>dpo</code> series are defined in
    * <a href="plotOptions.dpo">plotOptions.dpo</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.dpo">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         dpo: {
    *             // shared options for all dpo series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;dpo&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/dpo">Detrended Price Oscillator</a>
    * @since 7.0.0
    */
  var dpo: js.UndefOr[CleanJsObject[PlotOptionsDpo]] = js.undefined

  /**
    * <p>The dumbbell series is a cartesian series with higher and lower values
    * for each point along an X axis, connected with a line between the
    * values.</p>
    * <p>Requires <code>highcharts-more.js</code> and <code>modules/dumbbell.js</code>.</p>
    * <p>In TypeScript the <a href="series.dumbbell.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>dumbbell</code> series are defined in
    * <a href="plotOptions.dumbbell">plotOptions.dumbbell</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.dumbbell">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         dumbbell: {
    *             // shared options for all dumbbell series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;dumbbell&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/dumbbell/">Dumbbell chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-dumbbell/styled-mode-dumbbell/">Styled mode</a>
    * @since 8.0.0
    */
  var dumbbell: js.UndefOr[CleanJsObject[PlotOptionsDumbbell]] = js.undefined

  /**
    * <p>Exponential moving average indicator (EMA). This series requires the
    * <code>linkedTo</code> option to be set.</p>
    * <p>In TypeScript the <a href="series.ema.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>ema</code> series are defined in
    * <a href="plotOptions.ema">plotOptions.ema</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.ema">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         ema: {
    *             // shared options for all ema series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;ema&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/ema">Exponential moving average indicator</a>
    * @since 6.0.0
    */
  var ema: js.UndefOr[CleanJsObject[PlotOptionsEma]] = js.undefined

  /**
    * <p>Error bars are a graphical representation of the variability of data and
    * are used on graphs to indicate the error, or uncertainty in a reported
    * measurement.</p>
    * <p>In TypeScript the <a href="series.errorbar.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>errorbar</code> series are defined in
    * <a href="plotOptions.errorbar">plotOptions.errorbar</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.errorbar">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         errorbar: {
    *             // shared options for all errorbar series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;errorbar&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/error-bar/">Error bars on a column series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-errorbar/on-scatter/">Error bars on a scatter series</a>
    */
  var errorbar: js.UndefOr[CleanJsObject[PlotOptionsErrorbar]] = js.undefined

  /**
    * <p>Flags are used to mark events in stock charts. They can be added on the
    * timeline, or attached to a specific series.</p>
    * <p>In TypeScript the <a href="series.flags.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>flags</code> series are defined in
    * <a href="plotOptions.flags">plotOptions.flags</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.flags">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         flags: {
    *             // shared options for all flags series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;flags&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/flags-general/">Flags on a line series</a>
    */
  var flags: js.UndefOr[CleanJsObject[PlotOptionsFlags]] = js.undefined

  /**
    * <p>Funnel charts are a type of chart often used to visualize stages in a
    * sales project, where the top are the initial stages with the most
    * clients. It requires that the modules/funnel.js file is loaded.</p>
    * <p>In TypeScript the <a href="series.funnel.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>funnel</code> series are defined in
    * <a href="plotOptions.funnel">plotOptions.funnel</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.funnel">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         funnel: {
    *             // shared options for all funnel series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;funnel&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/funnel/">Funnel demo</a>
    */
  var funnel: js.UndefOr[CleanJsObject[PlotOptionsFunnel]] = js.undefined

  /**
    * <p>A funnel3d is a 3d version of funnel series type. Funnel charts are
    * a type of chart often used to visualize stages in a sales project,
    * where the top are the initial stages with the most clients.</p>
    * <p>It requires that the <code>highcharts-3d.js</code>, <code>cylinder.js</code> and
    * <code>funnel3d.js</code> module are loaded.</p>
    * <p>In TypeScript the <a href="series.funnel3d.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>funnel3d</code> series are defined in
    * <a href="plotOptions.funnel3d">plotOptions.funnel3d</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.funnel3d">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         funnel3d: {
    *             // shared options for all funnel3d series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;funnel3d&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/funnel3d/">Funnel3d</a>
    * @since 7.1.0
    */
  var funnel3d: js.UndefOr[CleanJsObject[PlotOptionsFunnel3d]] = js.undefined

  /**
    * <p>A <code>gantt</code> series. If the <a href="#series.gantt.type">type</a> option is not specified,
    * it is inherited from <a href="#chart.type">chart.type</a>.</p>
    * <p>In TypeScript the <a href="series.gantt.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>gantt</code> series are defined in
    * <a href="plotOptions.gantt">plotOptions.gantt</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.gantt">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         gantt: {
    *             // shared options for all gantt series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;gantt&#39;
    *     }]
    * });
    * </code></pre>
    */
  var gantt: js.UndefOr[CleanJsObject[PlotOptionsGantt]] = js.undefined

  /**
    * <p>Gauges are circular plots displaying one or more values with a dial
    * pointing to values along the perimeter.</p>
    * <p>In TypeScript the <a href="series.gauge.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>gauge</code> series are defined in
    * <a href="plotOptions.gauge">plotOptions.gauge</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.gauge">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         gauge: {
    *             // shared options for all gauge series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;gauge&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-speedometer/">Gauge chart</a>
    */
  var gauge: js.UndefOr[CleanJsObject[PlotOptionsGauge]] = js.undefined

  /**
    * <p>A heatmap is a graphical representation of data where the individual
    * values contained in a matrix are represented as colors.</p>
    * <p>In TypeScript the <a href="series.heatmap.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>heatmap</code> series are defined in
    * <a href="plotOptions.heatmap">plotOptions.heatmap</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.heatmap">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         heatmap: {
    *             // shared options for all heatmap series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;heatmap&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/heatmap/">Simple heatmap</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/heatmap-canvas/">Heavy heatmap</a>
    */
  var heatmap: js.UndefOr[CleanJsObject[PlotOptionsHeatmap]] = js.undefined

  /**
    * <p>An HeikinAshi series is a style of financial chart used to describe price
    * movements over time. It displays open, high, low and close values per
    * data point.</p>
    * <p>In TypeScript the <a href="series.heikinashi.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>heikinashi</code> series are defined in
    * <a href="plotOptions.heikinashi">plotOptions.heikinashi</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.heikinashi">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         heikinashi: {
    *             // shared options for all heikinashi series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;heikinashi&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/heikinashi/">Heikin Ashi series</a>
    */
  var heikinashi: js.UndefOr[CleanJsObject[PlotOptionsHeikinashi]] = js.undefined

  /**
    * <p>A histogram is a column series which represents the distribution of the
    * data set in the base series. Histogram splits data into bins and shows
    * their frequencies.</p>
    * <p>In TypeScript the <a href="series.histogram.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>histogram</code> series are defined in
    * <a href="plotOptions.histogram">plotOptions.histogram</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.histogram">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         histogram: {
    *             // shared options for all histogram series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;histogram&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/histogram/">Histogram</a>
    * @since 6.0.0
    */
  var histogram: js.UndefOr[CleanJsObject[PlotOptionsHistogram]] = js.undefined

  /**
    * <p>An HLC chart is a style of financial chart used to describe price
    * movements over time. It displays high, low and close values per
    * data point.</p>
    * <p>In TypeScript the <a href="series.hlc.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>hlc</code> series are defined in
    * <a href="plotOptions.hlc">plotOptions.hlc</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.hlc">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         hlc: {
    *             // shared options for all hlc series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;hlc&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/hlc/">HLC chart</a>
    */
  var hlc: js.UndefOr[CleanJsObject[PlotOptionsHlc]] = js.undefined

  /**
    * <p>A hollow candlestick chart is a style of financial chart used to
    * describe price movements over time.</p>
    * <p>In TypeScript the <a href="series.hollowcandlestick.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>hollowcandlestick</code> series are defined in
    * <a href="plotOptions.hollowcandlestick">plotOptions.hollowcandlestick</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.hollowcandlestick">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         hollowcandlestick: {
    *             // shared options for all hollowcandlestick series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;hollowcandlestick&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/hollow-candlestick/">Hollow Candlestick chart</a>
    */
  var hollowcandlestick: js.UndefOr[CleanJsObject[PlotOptionsHollowcandlestick]] = js.undefined

  /**
    * <p>Ichimoku Kinko Hyo (IKH). This series requires <code>linkedTo</code> option to be
    * set.</p>
    * <p>In TypeScript the <a href="series.ikh.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>ikh</code> series are defined in
    * <a href="plotOptions.ikh">plotOptions.ikh</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.ikh">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         ikh: {
    *             // shared options for all ikh series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;ikh&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/ichimoku-kinko-hyo">Ichimoku Kinko Hyo indicator</a>
    * @since 6.0.0
    */
  var ikh: js.UndefOr[CleanJsObject[PlotOptionsIkh]] = js.undefined

  /**
    * <p>An item chart is an infographic chart where a number of items are laid
    * out in either a rectangular or circular pattern. It can be used to
    * visualize counts within a group, or for the circular pattern, typically
    * a parliament.</p>
    * <p>The circular layout has much in common with a pie chart. Many of the item
    * series options, like <code>center</code>, <code>size</code> and data label positioning, are
    * inherited from the pie series and don&#39;t apply for rectangular layouts.</p>
    * <p>In TypeScript the <a href="series.item.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>item</code> series are defined in
    * <a href="plotOptions.item">plotOptions.item</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.item">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         item: {
    *             // shared options for all item series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;item&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/parliament-chart">Parliament chart (circular item chart)</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-item/rectangular">Rectangular item chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-item/symbols">Infographic with symbols</a>
    * @since 7.1.0
    */
  var item: js.UndefOr[CleanJsObject[PlotOptionsItem]] = js.undefined

  /**
    * <p>Keltner Channels. This series requires the <code>linkedTo</code> option to be set
    * and should be loaded after the <code>stock/indicators/indicators.js</code>,
    * <code>stock/indicators/atr.js</code>, and <code>stock/ema/.js</code>.</p>
    * <p>In TypeScript the <a href="series.keltnerchannels.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>keltnerchannels</code> series are defined in
    * <a href="plotOptions.keltnerchannels">plotOptions.keltnerchannels</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.keltnerchannels">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         keltnerchannels: {
    *             // shared options for all keltnerchannels series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;keltnerchannels&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/keltner-channels">Keltner Channels</a>
    * @since 7.0.0
    */
  var keltnerchannels: js.UndefOr[CleanJsObject[PlotOptionsKeltnerchannels]] = js.undefined

  /**
    * <p>Klinger oscillator. This series requires the <code>linkedTo</code> option to be set
    * and should be loaded after the <code>stock/indicators/indicators.js</code> file.</p>
    * <p>In TypeScript the <a href="series.klinger.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>klinger</code> series are defined in
    * <a href="plotOptions.klinger">plotOptions.klinger</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.klinger">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         klinger: {
    *             // shared options for all klinger series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;klinger&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/klinger">Klinger oscillator</a>
    * @since 9.1.0
    */
  var klinger: js.UndefOr[CleanJsObject[PlotOptionsKlinger]] = js.undefined

  /**
    * <p>A line series displays information as a series of data points connected by
    * straight line segments.</p>
    * <p>In TypeScript the <a href="series.line.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>line</code> series are defined in
    * <a href="plotOptions.line">plotOptions.line</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.line">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         line: {
    *             // shared options for all line series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;line&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/line-basic/">Line chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/basic-line/">Line chart</a>
    */
  var line: js.UndefOr[CleanJsObject[PlotOptionsLine]] = js.undefined

  /**
    * <p>Linear regression indicator. This series requires <code>linkedTo</code> option to be
    * set.</p>
    * <p>In TypeScript the <a href="series.linearregression.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>linearregression</code> series are defined in
    * <a href="plotOptions.linearregression">plotOptions.linearregression</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.linearregression">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         linearregression: {
    *             // shared options for all linearregression series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;linearregression&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/linear-regression">Linear regression indicator</a>
    * @since 7.0.0
    */
  var linearregression: js.UndefOr[CleanJsObject[PlotOptionsLinearregression]] = js.undefined

  /**
    * <p>Linear regression angle indicator. This series requires <code>linkedTo</code>
    * option to be set.</p>
    * <p>In TypeScript the <a href="series.linearregressionangle.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>linearregressionangle</code> series are defined in
    * <a href="plotOptions.linearregressionangle">plotOptions.linearregressionangle</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.linearregressionangle">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         linearregressionangle: {
    *             // shared options for all linearregressionangle series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;linearregressionangle&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/linear-regression-angle">Linear intercept angle indicator</a>
    * @since 7.0.0
    */
  var linearregressionangle: js.UndefOr[CleanJsObject[PlotOptionsLinearregressionangle]] = js.undefined

  /**
    * <p>Linear regression intercept indicator. This series requires <code>linkedTo</code>
    * option to be set.</p>
    * <p>In TypeScript the <a href="series.linearregressionintercept.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>linearregressionintercept</code> series are defined in
    * <a href="plotOptions.linearregressionintercept">plotOptions.linearregressionintercept</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.linearregressionintercept">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         linearregressionintercept: {
    *             // shared options for all linearregressionintercept series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;linearregressionintercept&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/linear-regression-intercept">Linear intercept slope indicator</a>
    * @since 7.0.0
    */
  var linearregressionintercept: js.UndefOr[CleanJsObject[PlotOptionsLinearregressionintercept]] = js.undefined

  /**
    * <p>Linear regression slope indicator. This series requires <code>linkedTo</code>
    * option to be set.</p>
    * <p>In TypeScript the <a href="series.linearregressionslope.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>linearregressionslope</code> series are defined in
    * <a href="plotOptions.linearregressionslope">plotOptions.linearregressionslope</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.linearregressionslope">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         linearregressionslope: {
    *             // shared options for all linearregressionslope series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;linearregressionslope&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/linear-regression-slope">Linear regression slope indicator</a>
    * @since 7.0.0
    */
  var linearregressionslope: js.UndefOr[CleanJsObject[PlotOptionsLinearregressionslope]] = js.undefined

  /**
    * <p>The lollipop series is a carteseian series with a line anchored from
    * the x axis and a dot at the end to mark the value.
    * Requires <code>highcharts-more.js</code>, <code>modules/dumbbell.js</code> and
    * <code>modules/lollipop.js</code>.</p>
    * <p>In TypeScript the <a href="series.lollipop.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>lollipop</code> series are defined in
    * <a href="plotOptions.lollipop">plotOptions.lollipop</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.lollipop">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         lollipop: {
    *             // shared options for all lollipop series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;lollipop&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/lollipop/">Lollipop chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-dumbbell/styled-mode-dumbbell/">Styled mode</a>
    * @since 8.0.0
    */
  var lollipop: js.UndefOr[CleanJsObject[PlotOptionsLollipop]] = js.undefined

  /**
    * <p>Moving Average Convergence Divergence (MACD). This series requires
    * <code>linkedTo</code> option to be set and should be loaded after the
    * <code>stock/indicators/indicators.js</code>.</p>
    * <p>In TypeScript the <a href="series.macd.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>macd</code> series are defined in
    * <a href="plotOptions.macd">plotOptions.macd</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.macd">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         macd: {
    *             // shared options for all macd series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;macd&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/macd">MACD indicator</a>
    * @since 6.0.0
    */
  var macd: js.UndefOr[CleanJsObject[PlotOptionsMacd]] = js.undefined

  /**
    * <p>The map series is used for basic choropleth maps, where each map area has
    * a color based on its value.</p>
    * <p>In TypeScript the <a href="series.map.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>map</code> series are defined in
    * <a href="plotOptions.map">plotOptions.map</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.map">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         map: {
    *             // shared options for all map series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;map&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/all-maps/">Choropleth map</a>
    */
  var map: js.UndefOr[CleanJsObject[PlotOptionsMap]] = js.undefined

  /**
    * <p>A map bubble series is a bubble series laid out on top of a map
    * series, where each bubble is tied to a specific map area.</p>
    * <p>In TypeScript the <a href="series.mapbubble.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>mapbubble</code> series are defined in
    * <a href="plotOptions.mapbubble">plotOptions.mapbubble</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.mapbubble">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         mapbubble: {
    *             // shared options for all mapbubble series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;mapbubble&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/map-bubble/">Map bubble chart</a>
    */
  var mapbubble: js.UndefOr[CleanJsObject[PlotOptionsMapbubble]] = js.undefined

  /**
    * <p>A mapline series is a special case of the map series where the value
    * colors are applied to the strokes rather than the fills. It can also be
    * used for freeform drawing, like dividers, in the map.</p>
    * <p>In TypeScript the <a href="series.mapline.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>mapline</code> series are defined in
    * <a href="plotOptions.mapline">plotOptions.mapline</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.mapline">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         mapline: {
    *             // shared options for all mapline series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;mapline&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/mapline-mappoint/">Mapline and map-point chart</a>
    */
  var mapline: js.UndefOr[CleanJsObject[PlotOptionsMapline]] = js.undefined

  /**
    * <p>A mappoint series is a special form of scatter series where the points
    * can be laid out in map coordinates on top of a map.</p>
    * <p>In TypeScript the <a href="series.mappoint.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>mappoint</code> series are defined in
    * <a href="plotOptions.mappoint">plotOptions.mappoint</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.mappoint">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         mappoint: {
    *             // shared options for all mappoint series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;mappoint&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/mapline-mappoint/">Map-line and map-point series.</a>
    */
  var mappoint: js.UndefOr[CleanJsObject[PlotOptionsMappoint]] = js.undefined

  /**
    * <p>Money Flow Index. This series requires <code>linkedTo</code> option to be set and
    * should be loaded after the <code>stock/indicators/indicators.js</code> file.</p>
    * <p>In TypeScript the <a href="series.mfi.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>mfi</code> series are defined in
    * <a href="plotOptions.mfi">plotOptions.mfi</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.mfi">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         mfi: {
    *             // shared options for all mfi series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;mfi&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/mfi">Money Flow Index Indicator</a>
    * @since 6.0.0
    */
  var mfi: js.UndefOr[CleanJsObject[PlotOptionsMfi]] = js.undefined

  /**
    * <p>Momentum. This series requires <code>linkedTo</code> option to be set.</p>
    * <p>In TypeScript the <a href="series.momentum.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>momentum</code> series are defined in
    * <a href="plotOptions.momentum">plotOptions.momentum</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.momentum">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         momentum: {
    *             // shared options for all momentum series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;momentum&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/momentum">Momentum indicator</a>
    * @since 6.0.0
    */
  var momentum: js.UndefOr[CleanJsObject[PlotOptionsMomentum]] = js.undefined

  /**
    * <p>Normalized average true range indicator (NATR). This series requires
    * <code>linkedTo</code> option to be set and should be loaded after the
    * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/atr.js</code>.</p>
    * <p>In TypeScript the <a href="series.natr.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>natr</code> series are defined in
    * <a href="plotOptions.natr">plotOptions.natr</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.natr">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         natr: {
    *             // shared options for all natr series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;natr&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/natr">NATR indicator</a>
    * @since 7.0.0
    */
  var natr: js.UndefOr[CleanJsObject[PlotOptionsNatr]] = js.undefined

  /**
    * <p>A networkgraph is a type of relationship chart, where connnections
    * (links) attracts nodes (points) and other nodes repulse each other.</p>
    * <p>In TypeScript the <a href="series.networkgraph.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>networkgraph</code> series are defined in
    * <a href="plotOptions.networkgraph">plotOptions.networkgraph</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.networkgraph">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         networkgraph: {
    *             // shared options for all networkgraph series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;networkgraph&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/network-graph/">Networkgraph</a>
    * @since 7.0.0
    */
  var networkgraph: js.UndefOr[CleanJsObject[PlotOptionsNetworkgraph]] = js.undefined

  /**
    * <p>On-Balance Volume (OBV) technical indicator. This series
    * requires the <code>linkedTo</code> option to be set and should be loaded after
    * the <code>stock/indicators/indicators.js</code> file. Through the <code>volumeSeriesID</code>
    * there also should be linked the volume series.</p>
    * <p>In TypeScript the <a href="series.obv.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>obv</code> series are defined in
    * <a href="plotOptions.obv">plotOptions.obv</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.obv">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         obv: {
    *             // shared options for all obv series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;obv&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/obv">OBV indicator</a>
    * @since 9.1.0
    */
  var obv: js.UndefOr[CleanJsObject[PlotOptionsObv]] = js.undefined

  /**
    * <p>An OHLC chart is a style of financial chart used to describe price
    * movements over time. It displays open, high, low and close values per
    * data point.</p>
    * <p>In TypeScript the <a href="series.ohlc.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>ohlc</code> series are defined in
    * <a href="plotOptions.ohlc">plotOptions.ohlc</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.ohlc">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         ohlc: {
    *             // shared options for all ohlc series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;ohlc&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/ohlc/">OHLC chart</a>
    */
  var ohlc: js.UndefOr[CleanJsObject[PlotOptionsOhlc]] = js.undefined

  /**
    * <p>An organization chart is a diagram that shows the structure of an
    * organization and the relationships and relative ranks of its parts and
    * positions.</p>
    * <p>In TypeScript the <a href="series.organization.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>organization</code> series are defined in
    * <a href="plotOptions.organization">plotOptions.organization</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.organization">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         organization: {
    *             // shared options for all organization series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;organization&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/organization-chart/">Organization chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-organization/horizontal/">Horizontal organization chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-organization/borderless">Borderless design</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-organization/center-layout">Centered layout</a>
    * @since 7.1.0
    */
  var organization: js.UndefOr[CleanJsObject[PlotOptionsOrganization]] = js.undefined

  /**
    * <p>A packed bubble series is a two dimensional series type, where each point
    * renders a value in X, Y position. Each point is drawn as a bubble
    * where the bubbles don&#39;t overlap with each other and the radius
    * of the bubble relates to the value.</p>
    * <p>In TypeScript the <a href="series.packedbubble.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>packedbubble</code> series are defined in
    * <a href="plotOptions.packedbubble">plotOptions.packedbubble</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.packedbubble">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         packedbubble: {
    *             // shared options for all packedbubble series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;packedbubble&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/packed-bubble/">Packed bubble chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/packed-bubble-split/">Split packed bubble chart</a>
    * @since 7.0.0
    */
  var packedbubble: js.UndefOr[CleanJsObject[PlotOptionsPackedbubble]] = js.undefined

  /**
    * <p>A pareto diagram is a type of chart that contains both bars and a line
    * graph, where individual values are represented in descending order by
    * bars, and the cumulative total is represented by the line.</p>
    * <p>In TypeScript the <a href="series.pareto.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>pareto</code> series are defined in
    * <a href="plotOptions.pareto">plotOptions.pareto</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.pareto">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         pareto: {
    *             // shared options for all pareto series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;pareto&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pareto/">Pareto diagram</a>
    * @since 6.0.0
    */
  var pareto: js.UndefOr[CleanJsObject[PlotOptionsPareto]] = js.undefined

  /**
    * <p>Price channel (PC). This series requires the <code>linkedTo</code> option to be
    * set and should be loaded after the <code>stock/indicators/indicators.js</code>.</p>
    * <p>In TypeScript the <a href="series.pc.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>pc</code> series are defined in
    * <a href="plotOptions.pc">plotOptions.pc</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.pc">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         pc: {
    *             // shared options for all pc series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;pc&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/price-channel">Price Channel</a>
    * @since 7.0.0
    */
  var pc: js.UndefOr[CleanJsObject[PlotOptionsPc]] = js.undefined

  /**
    * <p>A pie chart is a circular graphic which is divided into slices to
    * illustrate numerical proportion.</p>
    * <p>In TypeScript the <a href="series.pie.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>pie</code> series are defined in
    * <a href="plotOptions.pie">plotOptions.pie</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.pie">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         pie: {
    *             // shared options for all pie series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;pie&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-basic/">Pie chart</a>
    */
  var pie: js.UndefOr[CleanJsObject[PlotOptionsPie]] = js.undefined

  /**
    * <p>Pivot points indicator. This series requires the <code>linkedTo</code> option to be
    * set and should be loaded after <code>stock/indicators/indicators.js</code> file.</p>
    * <p>In TypeScript the <a href="series.pivotpoints.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>pivotpoints</code> series are defined in
    * <a href="plotOptions.pivotpoints">plotOptions.pivotpoints</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.pivotpoints">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         pivotpoints: {
    *             // shared options for all pivotpoints series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;pivotpoints&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/pivot-points">Pivot points</a>
    * @since 6.0.0
    */
  var pivotpoints: js.UndefOr[CleanJsObject[PlotOptionsPivotpoints]] = js.undefined

  /**
    * <p>A polygon series can be used to draw any freeform shape in the cartesian
    * coordinate system. A fill is applied with the <code>color</code> option, and
    * stroke is applied through <code>lineWidth</code> and <code>lineColor</code> options.</p>
    * <p>In TypeScript the <a href="series.polygon.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>polygon</code> series are defined in
    * <a href="plotOptions.polygon">plotOptions.polygon</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.polygon">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         polygon: {
    *             // shared options for all polygon series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;polygon&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polygon/">Polygon</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polygon/">Polygon</a>
    * @since 4.1.0
    */
  var polygon: js.UndefOr[CleanJsObject[PlotOptionsPolygon]] = js.undefined

  /**
    * <p>Percentage Price Oscillator. This series requires the
    * <code>linkedTo</code> option to be set and should be loaded after the
    * <code>stock/indicators/indicators.js</code>.</p>
    * <p>In TypeScript the <a href="series.ppo.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>ppo</code> series are defined in
    * <a href="plotOptions.ppo">plotOptions.ppo</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.ppo">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         ppo: {
    *             // shared options for all ppo series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;ppo&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/ppo">Percentage Price Oscillator</a>
    * @since 7.0.0
    */
  var ppo: js.UndefOr[CleanJsObject[PlotOptionsPpo]] = js.undefined

  /**
    * <p>Price envelopes indicator based on <a href="#plotOptions.sma">SMA</a> calculations.
    * This series requires the <code>linkedTo</code> option to be set and should be loaded
    * after the <code>stock/indicators/indicators.js</code> file.</p>
    * <p>In TypeScript the <a href="series.priceenvelopes.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>priceenvelopes</code> series are defined in
    * <a href="plotOptions.priceenvelopes">plotOptions.priceenvelopes</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.priceenvelopes">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         priceenvelopes: {
    *             // shared options for all priceenvelopes series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;priceenvelopes&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/price-envelopes">Price envelopes</a>
    * @since 6.0.0
    */
  var priceenvelopes: js.UndefOr[CleanJsObject[PlotOptionsPriceenvelopes]] = js.undefined

  /**
    * <p>Parabolic SAR. This series requires <code>linkedTo</code>
    * option to be set and should be loaded
    * after <code>stock/indicators/indicators.js</code> file.</p>
    * <p>In TypeScript the <a href="series.psar.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>psar</code> series are defined in
    * <a href="plotOptions.psar">plotOptions.psar</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.psar">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         psar: {
    *             // shared options for all psar series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;psar&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/psar">Parabolic SAR Indicator</a>
    * @since 6.0.0
    */
  var psar: js.UndefOr[CleanJsObject[PlotOptionsPsar]] = js.undefined

  /**
    * <p>A pyramid series is a special type of funnel, without neck and reversed
    * by default.</p>
    * <p>In TypeScript the <a href="series.pyramid.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>pyramid</code> series are defined in
    * <a href="plotOptions.pyramid">plotOptions.pyramid</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.pyramid">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         pyramid: {
    *             // shared options for all pyramid series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;pyramid&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pyramid/">Pyramid chart</a>
    */
  var pyramid: js.UndefOr[CleanJsObject[PlotOptionsPyramid]] = js.undefined

  /**
    * <p>A pyramid3d is a 3d version of pyramid series type. Pyramid charts are
    * a type of chart often used to visualize stages in a sales project,
    * where the top are the initial stages with the most clients.</p>
    * <p>In TypeScript the <a href="series.pyramid3d.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>pyramid3d</code> series are defined in
    * <a href="plotOptions.pyramid3d">plotOptions.pyramid3d</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.pyramid3d">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         pyramid3d: {
    *             // shared options for all pyramid3d series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;pyramid3d&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pyramid3d/">Pyramid3d</a>
    * @since 7.1.0
    */
  var pyramid3d: js.UndefOr[CleanJsObject[PlotOptionsPyramid3d]] = js.undefined

  /**
    * <p>Rate of change indicator (ROC). The indicator value for each point
    * is defined as:</p>
    * <p><code>(C - Cn) / Cn * 100</code></p>
    * <p>where: <code>C</code> is the close value of the point of the same x in the
    * linked series and <code>Cn</code> is the close value of the point <code>n</code> periods
    * ago. <code>n</code> is set through <a href="#plotOptions.roc.params.period">period</a>.</p>
    * <p>This series requires <code>linkedTo</code> option to be set.</p>
    * <p>In TypeScript the <a href="series.roc.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>roc</code> series are defined in
    * <a href="plotOptions.roc">plotOptions.roc</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.roc">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         roc: {
    *             // shared options for all roc series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;roc&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/roc">Rate of change indicator</a>
    * @since 6.0.0
    */
  var roc: js.UndefOr[CleanJsObject[PlotOptionsRoc]] = js.undefined

  /**
    * <p>Relative strength index (RSI) technical indicator. This series
    * requires the <code>linkedTo</code> option to be set and should be loaded after
    * the <code>stock/indicators/indicators.js</code> file.</p>
    * <p>In TypeScript the <a href="series.rsi.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>rsi</code> series are defined in
    * <a href="plotOptions.rsi">plotOptions.rsi</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.rsi">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         rsi: {
    *             // shared options for all rsi series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;rsi&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/rsi">RSI indicator</a>
    * @since 6.0.0
    */
  var rsi: js.UndefOr[CleanJsObject[PlotOptionsRsi]] = js.undefined

  /**
    * <p>A sankey diagram is a type of flow diagram, in which the width of the
    * link between two nodes is shown proportionally to the flow quantity.</p>
    * <p>In TypeScript the <a href="series.sankey.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>sankey</code> series are defined in
    * <a href="plotOptions.sankey">plotOptions.sankey</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.sankey">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         sankey: {
    *             // shared options for all sankey series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;sankey&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sankey-diagram/">Sankey diagram</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-inverted/">Inverted sankey diagram</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-outgoing">Sankey diagram with outgoing links</a>
    * @since 6.0.0
    */
  var sankey: js.UndefOr[CleanJsObject[PlotOptionsSankey]] = js.undefined

  /**
    * <p>A scatter plot uses cartesian coordinates to display values for two
    * variables for a set of data.</p>
    * <p>In TypeScript the <a href="series.scatter.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>scatter</code> series are defined in
    * <a href="plotOptions.scatter">plotOptions.scatter</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.scatter">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         scatter: {
    *             // shared options for all scatter series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;scatter&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/scatter/">Scatter plot</a>
    */
  var scatter: js.UndefOr[CleanJsObject[PlotOptionsScatter]] = js.undefined

  /**
    * <p>A 3D scatter plot uses x, y and z coordinates to display values for three
    * variables for a set of data.</p>
    * <p>In TypeScript the <a href="series.scatter3d.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>scatter3d</code> series are defined in
    * <a href="plotOptions.scatter3d">plotOptions.scatter3d</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.scatter3d">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         scatter3d: {
    *             // shared options for all scatter3d series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;scatter3d&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter/">Simple 3D scatter</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/3d-scatter-draggable">Draggable 3d scatter</a>
    */
  var scatter3d: js.UndefOr[CleanJsObject[PlotOptionsScatter3d]] = js.undefined

  /**
    * <p>General options for all series types.</p>
    * <p>In TypeScript the <a href="series.line.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>line</code> series are defined in
    * <a href="plotOptions.line">plotOptions.line</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.line">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         line: {
    *             // shared options for all line series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;line&#39;
    *     }]
    * });
    * </code></pre>
    */
  var series: js.Any = js.undefined

  /**
    * <p>Slow Stochastic oscillator. This series requires the <code>linkedTo</code> option
    * to be set and should be loaded after <code>stock/indicators/indicators.js</code>
    * and <code>stock/indicators/stochastic.js</code> files.</p>
    * <p>In TypeScript the <a href="series.slowstochastic.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>slowstochastic</code> series are defined in
    * <a href="plotOptions.slowstochastic">plotOptions.slowstochastic</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.slowstochastic">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         slowstochastic: {
    *             // shared options for all slowstochastic series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;slowstochastic&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/slow-stochastic">Slow Stochastic oscillator</a>
    * @since 8.0.0
    */
  var slowstochastic: js.UndefOr[CleanJsObject[PlotOptionsSlowstochastic]] = js.undefined

  /**
    * <p>Simple moving average indicator (SMA). This series requires <code>linkedTo</code>
    * option to be set.</p>
    * <p>In TypeScript the <a href="series.sma.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>sma</code> series are defined in
    * <a href="plotOptions.sma">plotOptions.sma</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.sma">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         sma: {
    *             // shared options for all sma series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;sma&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/sma">Simple moving average indicator</a>
    * @since 6.0.0
    */
  var sma: js.UndefOr[CleanJsObject[PlotOptionsSma]] = js.undefined

  /**
    * <p>A solid gauge is a circular gauge where the value is indicated by a filled
    * arc, and the color of the arc may variate with the value.</p>
    * <p>In TypeScript the <a href="series.solidgauge.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>solidgauge</code> series are defined in
    * <a href="plotOptions.solidgauge">plotOptions.solidgauge</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.solidgauge">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         solidgauge: {
    *             // shared options for all solidgauge series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;solidgauge&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-solid/">Solid gauges</a>
    */
  var solidgauge: js.UndefOr[CleanJsObject[PlotOptionsSolidgauge]] = js.undefined

  /**
    * <p>A spline series is a special type of line series, where the segments
    * between the data points are smoothed.</p>
    * <p>In TypeScript the <a href="series.spline.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>spline</code> series are defined in
    * <a href="plotOptions.spline">plotOptions.spline</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.spline">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         spline: {
    *             // shared options for all spline series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;spline&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/spline-irregular-time/">Spline chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/spline/">Spline chart</a>
    */
  var spline: js.UndefOr[CleanJsObject[PlotOptionsSpline]] = js.undefined

  /**
    * <p>Stochastic oscillator. This series requires the <code>linkedTo</code> option to be
    * set and should be loaded after the <code>stock/indicators/indicators.js</code> file.</p>
    * <p>In TypeScript the <a href="series.stochastic.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>stochastic</code> series are defined in
    * <a href="plotOptions.stochastic">plotOptions.stochastic</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.stochastic">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         stochastic: {
    *             // shared options for all stochastic series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;stochastic&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/stochastic">Stochastic oscillator</a>
    * @since 6.0.0
    */
  var stochastic: js.UndefOr[CleanJsObject[PlotOptionsStochastic]] = js.undefined

  /**
    * <p>A streamgraph is a type of stacked area graph which is displaced around a
    * central axis, resulting in a flowing, organic shape.</p>
    * <p>In TypeScript the <a href="series.streamgraph.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>streamgraph</code> series are defined in
    * <a href="plotOptions.streamgraph">plotOptions.streamgraph</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.streamgraph">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         streamgraph: {
    *             // shared options for all streamgraph series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;streamgraph&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/streamgraph/">Streamgraph</a>
    * @since 6.0.0
    */
  var streamgraph: js.UndefOr[CleanJsObject[PlotOptionsStreamgraph]] = js.undefined

  /**
    * <p>A Sunburst displays hierarchical data, where a level in the hierarchy is
    * represented by a circle. The center represents the root node of the tree.
    * The visualization bears a resemblance to both treemap and pie charts.</p>
    * <p>In TypeScript the <a href="series.sunburst.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>sunburst</code> series are defined in
    * <a href="plotOptions.sunburst">plotOptions.sunburst</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.sunburst">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         sunburst: {
    *             // shared options for all sunburst series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;sunburst&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst">Sunburst chart</a>
    */
  var sunburst: js.UndefOr[CleanJsObject[PlotOptionsSunburst]] = js.undefined

  /**
    * <p>Supertrend indicator. This series requires the <code>linkedTo</code> option to be
    * set and should be loaded after the <code>stock/indicators/indicators.js</code> and
    * <code>stock/indicators/sma.js</code>.</p>
    * <p>In TypeScript the <a href="series.supertrend.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>supertrend</code> series are defined in
    * <a href="plotOptions.supertrend">plotOptions.supertrend</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.supertrend">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         supertrend: {
    *             // shared options for all supertrend series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;supertrend&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/supertrend">Supertrend indicator</a>
    * @since 7.0.0
    */
  var supertrend: js.UndefOr[CleanJsObject[PlotOptionsSupertrend]] = js.undefined

  /**
    * <p>Triple exponential moving average (TEMA) indicator. This series requires
    * <code>linkedTo</code> option to be set and should be loaded after the
    * <code>stock/indicators/indicators.js</code>.</p>
    * <p>In TypeScript the <a href="series.tema.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>tema</code> series are defined in
    * <a href="plotOptions.tema">plotOptions.tema</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.tema">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         tema: {
    *             // shared options for all tema series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;tema&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/tema">TEMA indicator</a>
    * @since 7.0.0
    */
  var tema: js.UndefOr[CleanJsObject[PlotOptionsTema]] = js.undefined

  /**
    * <p>A tilemap series is a type of heatmap where the tile shapes are
    * configurable.</p>
    * <p>In TypeScript the <a href="series.tilemap.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>tilemap</code> series are defined in
    * <a href="plotOptions.tilemap">plotOptions.tilemap</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.tilemap">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         tilemap: {
    *             // shared options for all tilemap series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;tilemap&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/honeycomb-usa/">Honeycomb tilemap, USA</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/honeycomb-brazil/">Honeycomb tilemap, Brazil</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/honeycomb-china/">Honeycomb tilemap, China</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/honeycomb-europe/">Honeycomb tilemap, Europe</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/circlemap-africa/">Circlemap tilemap, Africa</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/diamondmap">Diamondmap tilemap</a>
    * @since 6.0.0
    */
  var tilemap: js.UndefOr[CleanJsObject[PlotOptionsTilemap]] = js.undefined

  /**
    * <p>The timeline series presents given events along a drawn line.</p>
    * <p>In TypeScript the <a href="series.timeline.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>timeline</code> series are defined in
    * <a href="plotOptions.timeline">plotOptions.timeline</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.timeline">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         timeline: {
    *             // shared options for all timeline series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;timeline&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-timeline/alternate-labels">Timeline series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-timeline/inverted">Inverted timeline</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-timeline/datetime-axis">With true datetime axis</a>
    * @since 7.0.0
    */
  var timeline: js.UndefOr[CleanJsObject[PlotOptionsTimeline]] = js.undefined

  /**
    * <p>A treemap displays hierarchical data using nested rectangles. The data
    * can be laid out in varying ways depending on options.</p>
    * <p>In TypeScript the <a href="series.treemap.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>treemap</code> series are defined in
    * <a href="plotOptions.treemap">plotOptions.treemap</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.treemap">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         treemap: {
    *             // shared options for all treemap series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;treemap&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/treemap-large-dataset/">Treemap</a>
    */
  var treemap: js.UndefOr[CleanJsObject[PlotOptionsTreemap]] = js.undefined

  /**
    * <p>Trendline (linear regression) fits a straight line to the selected data
    * using a method called the Sum Of Least Squares. This series requires the
    * <code>linkedTo</code> option to be set.</p>
    * <p>In TypeScript the <a href="series.trendline.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>trendline</code> series are defined in
    * <a href="plotOptions.trendline">plotOptions.trendline</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.trendline">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         trendline: {
    *             // shared options for all trendline series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;trendline&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/trendline">Trendline indicator</a>
    * @since 7.1.3
    */
  var trendline: js.UndefOr[CleanJsObject[PlotOptionsTrendline]] = js.undefined

  /**
    * <p>Triple exponential average (TRIX) oscillator. This series requires
    * <code>linkedTo</code> option to be set.</p>
    * <p>In TypeScript the <a href="series.trix.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>trix</code> series are defined in
    * <a href="plotOptions.trix">plotOptions.trix</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.trix">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         trix: {
    *             // shared options for all trix series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;trix&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/trix">TRIX indicator</a>
    * @since 7.0.0
    */
  var trix: js.UndefOr[CleanJsObject[PlotOptionsTrix]] = js.undefined

  /**
    * <p>A variable pie series is a two dimensional series type, where each point
    * renders an Y and Z value.  Each point is drawn as a pie slice where the
    * size (arc) of the slice relates to the Y value and the radius of pie
    * slice relates to the Z value.</p>
    * <p>In TypeScript the <a href="series.variablepie.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>variablepie</code> series are defined in
    * <a href="plotOptions.variablepie">plotOptions.variablepie</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.variablepie">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         variablepie: {
    *             // shared options for all variablepie series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;variablepie&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/variable-radius-pie/">Variable-radius pie chart</a>
    * @since 6.0.0
    */
  var variablepie: js.UndefOr[CleanJsObject[PlotOptionsVariablepie]] = js.undefined

  /**
    * <p>A variwide chart (related to marimekko chart) is a column chart with a
    * variable width expressing a third dimension.</p>
    * <p>In TypeScript the <a href="series.variwide.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>variwide</code> series are defined in
    * <a href="plotOptions.variwide">plotOptions.variwide</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.variwide">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         variwide: {
    *             // shared options for all variwide series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;variwide&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/variwide/">Variwide chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-variwide/inverted/">Inverted variwide chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-variwide/datetime/">Variwide columns on a datetime axis</a>
    * @since 6.0.0
    */
  var variwide: js.UndefOr[CleanJsObject[PlotOptionsVariwide]] = js.undefined

  /**
    * <p>Volume By Price indicator.</p>
    * <p>This series requires <code>linkedTo</code> option to be set.</p>
    * <p>In TypeScript the <a href="series.vbp.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>vbp</code> series are defined in
    * <a href="plotOptions.vbp">plotOptions.vbp</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.vbp">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         vbp: {
    *             // shared options for all vbp series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;vbp&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/volume-by-price">Volume By Price indicator</a>
    * @since 6.0.0
    */
  var vbp: js.UndefOr[CleanJsObject[PlotOptionsVbp]] = js.undefined

  /**
    * <p>A vector plot is a type of cartesian chart where each point has an X and
    * Y position, a length and a direction. Vectors are drawn as arrows.</p>
    * <p>In TypeScript the <a href="series.vector.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>vector</code> series are defined in
    * <a href="plotOptions.vector">plotOptions.vector</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.vector">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         vector: {
    *             // shared options for all vector series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;vector&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/vector-plot/">Vector pot</a>
    * @since 6.0.0
    */
  var vector: js.UndefOr[CleanJsObject[PlotOptionsVector]] = js.undefined

  /**
    * <p>A Venn diagram displays all possible logical relations between a
    * collection of different sets. The sets are represented by circles, and
    * the relation between the sets are displayed by the overlap or lack of
    * overlap between them. The venn diagram is a special case of Euler
    * diagrams, which can also be displayed by this series type.</p>
    * <p>In TypeScript the <a href="series.venn.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>venn</code> series are defined in
    * <a href="plotOptions.venn">plotOptions.venn</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.venn">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         venn: {
    *             // shared options for all venn series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;venn&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/venn-diagram/">Venn diagram</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/euler-diagram/">Euler diagram</a>
    */
  var venn: js.UndefOr[CleanJsObject[PlotOptionsVenn]] = js.undefined

  /**
    * <p>Volume Weighted Average Price indicator.</p>
    * <p>This series requires <code>linkedTo</code> option to be set.</p>
    * <p>In TypeScript the <a href="series.vwap.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>vwap</code> series are defined in
    * <a href="plotOptions.vwap">plotOptions.vwap</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.vwap">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         vwap: {
    *             // shared options for all vwap series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;vwap&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/vwap">Volume Weighted Average Price indicator</a>
    * @since 6.0.0
    */
  var vwap: js.UndefOr[CleanJsObject[PlotOptionsVwap]] = js.undefined

  /**
    * <p>A waterfall chart displays sequentially introduced positive or negative
    * values in cumulative columns.</p>
    * <p>In TypeScript the <a href="series.waterfall.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>waterfall</code> series are defined in
    * <a href="plotOptions.waterfall">plotOptions.waterfall</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.waterfall">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         waterfall: {
    *             // shared options for all waterfall series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;waterfall&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/waterfall/">Waterfall chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/waterfall-inverted/">Horizontal (inverted) waterfall</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/waterfall-stacked/">Stacked waterfall chart</a>
    */
  var waterfall: js.UndefOr[CleanJsObject[PlotOptionsWaterfall]] = js.undefined

  /**
    * <p>Williams %R. This series requires the <code>linkedTo</code> option to be
    * set and should be loaded after the <code>stock/indicators/indicators.js</code>.</p>
    * <p>In TypeScript the <a href="series.williamsr.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>williamsr</code> series are defined in
    * <a href="plotOptions.williamsr">plotOptions.williamsr</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.williamsr">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         williamsr: {
    *             // shared options for all williamsr series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;williamsr&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/williams-r">Williams %R</a>
    * @since 7.0.0
    */
  var williamsr: js.UndefOr[CleanJsObject[PlotOptionsWilliamsr]] = js.undefined

  /**
    * <p>Wind barbs are a convenient way to represent wind speed and direction in
    * one graphical form. Wind direction is given by the stem direction, and
    * wind speed by the number and shape of barbs.</p>
    * <p>In TypeScript the <a href="series.windbarb.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>windbarb</code> series are defined in
    * <a href="plotOptions.windbarb">plotOptions.windbarb</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.windbarb">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         windbarb: {
    *             // shared options for all windbarb series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;windbarb&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/windbarb-series/">Wind barb series</a>
    * @since 6.0.0
    */
  var windbarb: js.UndefOr[CleanJsObject[PlotOptionsWindbarb]] = js.undefined

  /**
    * <p>Weighted moving average indicator (WMA). This series requires <code>linkedTo</code>
    * option to be set.</p>
    * <p>In TypeScript the <a href="series.wma.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>wma</code> series are defined in
    * <a href="plotOptions.wma">plotOptions.wma</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.wma">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         wma: {
    *             // shared options for all wma series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;wma&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/wma">Weighted moving average indicator</a>
    * @since 6.0.0
    */
  var wma: js.UndefOr[CleanJsObject[PlotOptionsWma]] = js.undefined

  /**
    * <p>A word cloud is a visualization of a set of words, where the size and
    * placement of a word is determined by how it is weighted.</p>
    * <p>In TypeScript the <a href="series.wordcloud.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>wordcloud</code> series are defined in
    * <a href="plotOptions.wordcloud">plotOptions.wordcloud</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.wordcloud">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         wordcloud: {
    *             // shared options for all wordcloud series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;wordcloud&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/wordcloud">Word Cloud chart</a>
    * @since 6.0.0
    */
  var wordcloud: js.UndefOr[CleanJsObject[PlotOptionsWordcloud]] = js.undefined

  /**
    * <p>The X-range series displays ranges on the X axis, typically time
    * intervals with a start and end date.</p>
    * <p>In TypeScript the <a href="series.xrange.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>xrange</code> series are defined in
    * <a href="plotOptions.xrange">plotOptions.xrange</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.xrange">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         xrange: {
    *             // shared options for all xrange series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;xrange&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/x-range/">X-range</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/x-range/">Styled mode X-range</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/inverted-xrange/">Inverted X-range</a>
    * @since 6.0.0
    */
  var xrange: js.UndefOr[CleanJsObject[PlotOptionsXrange]] = js.undefined

  /**
    * <p>Zig Zag indicator.</p>
    * <p>This series requires <code>linkedTo</code> option to be set.</p>
    * <p>In TypeScript the <a href="series.zigzag.type">type</a> option must always be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>zigzag</code> series are defined in
    * <a href="plotOptions.zigzag">plotOptions.zigzag</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.zigzag">the series instance array</a>.</li>
    * </ol>
    * <pre><code>Highcharts.chart(&#39;container&#39;, {
    *     plotOptions: {
    *         series: {
    *             // general options for all series
    *         },
    *         zigzag: {
    *             // shared options for all zigzag series
    *         }
    *     },
    *     series: [{
    *         // specific options for this series instance
    *         type: &#39;zigzag&#39;
    *     }]
    * });
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/zigzag">Zig Zag indicator</a>
    * @since 6.0.0
    */
  var zigzag: js.UndefOr[CleanJsObject[PlotOptionsZigzag]] = js.undefined
}

object PlotOptions {
  /**
    * @param abands <p>Acceleration bands (ABANDS). This series requires the <code>linkedTo</code> option. to be set and should be loaded after the. <code>stock/indicators/indicators.js</code>.</p>. <p>In TypeScript the <a href="series.abands.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>abands</code> series are defined in. <a href="plotOptions.abands">plotOptions.abands</a>.</li>. <li>Options for one single series are given in. <a href="series.abands">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         abands: {.             // shared options for all abands series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;abands&#39;.     }]. });. </code></pre>
    * @param ad <p>Accumulation Distribution (AD). This series requires <code>linkedTo</code> option to. be set.</p>. <p>In TypeScript the <a href="series.ad.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>ad</code> series are defined in. <a href="plotOptions.ad">plotOptions.ad</a>.</li>. <li>Options for one single series are given in. <a href="series.ad">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         ad: {.             // shared options for all ad series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;ad&#39;.     }]. });. </code></pre>
    * @param ao <p>Awesome Oscillator. This series requires the <code>linkedTo</code> option to. be set and should be loaded after the <code>stock/indicators/indicators.js</code></p>. <p>In TypeScript the <a href="series.ao.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>ao</code> series are defined in. <a href="plotOptions.ao">plotOptions.ao</a>.</li>. <li>Options for one single series are given in. <a href="series.ao">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         ao: {.             // shared options for all ao series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;ao&#39;.     }]. });. </code></pre>
    * @param apo <p>Absolute Price Oscillator. This series requires the <code>linkedTo</code> option to. be set and should be loaded after the <code>stock/indicators/indicators.js</code>.</p>. <p>In TypeScript the <a href="series.apo.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>apo</code> series are defined in. <a href="plotOptions.apo">plotOptions.apo</a>.</li>. <li>Options for one single series are given in. <a href="series.apo">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         apo: {.             // shared options for all apo series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;apo&#39;.     }]. });. </code></pre>
    * @param area <p>The area series type.</p>. <p>In TypeScript the <a href="series.area.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>area</code> series are defined in. <a href="plotOptions.area">plotOptions.area</a>.</li>. <li>Options for one single series are given in. <a href="series.area">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         area: {.             // shared options for all area series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;area&#39;.     }]. });. </code></pre>
    * @param arearange <p>The area range series is a carteseian series with higher and lower. values for each point along an X axis, where the area between the. values is shaded.</p>. <p>In TypeScript the <a href="series.arearange.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>arearange</code> series are defined in. <a href="plotOptions.arearange">plotOptions.arearange</a>.</li>. <li>Options for one single series are given in. <a href="series.arearange">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         arearange: {.             // shared options for all arearange series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;arearange&#39;.     }]. });. </code></pre>
    * @param areaspline <p>The area spline series is an area series where the graph between the. points is smoothed into a spline.</p>. <p>In TypeScript the <a href="series.areaspline.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>areaspline</code> series are defined in. <a href="plotOptions.areaspline">plotOptions.areaspline</a>.</li>. <li>Options for one single series are given in. <a href="series.areaspline">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         areaspline: {.             // shared options for all areaspline series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;areaspline&#39;.     }]. });. </code></pre>
    * @param areasplinerange <p>The area spline range is a cartesian series type with higher and. lower Y values along an X axis. The area inside the range is colored, and. the graph outlining the area is a smoothed spline.</p>. <p>In TypeScript the <a href="series.areasplinerange.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>areasplinerange</code> series are defined in. <a href="plotOptions.areasplinerange">plotOptions.areasplinerange</a>.</li>. <li>Options for one single series are given in. <a href="series.areasplinerange">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         areasplinerange: {.             // shared options for all areasplinerange series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;areasplinerange&#39;.     }]. });. </code></pre>
    * @param aroon <p>Aroon. This series requires the <code>linkedTo</code> option to be. set and should be loaded after the <code>stock/indicators/indicators.js</code>.</p>. <p>In TypeScript the <a href="series.aroon.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>aroon</code> series are defined in. <a href="plotOptions.aroon">plotOptions.aroon</a>.</li>. <li>Options for one single series are given in. <a href="series.aroon">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         aroon: {.             // shared options for all aroon series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;aroon&#39;.     }]. });. </code></pre>
    * @param aroonoscillator <p>Aroon Oscillator. This series requires the <code>linkedTo</code> option to be set. and should be loaded after the <code>stock/indicators/indicators.js</code> and. <code>stock/indicators/aroon.js</code>.</p>. <p>In TypeScript the <a href="series.aroonoscillator.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>aroonoscillator</code> series are defined in. <a href="plotOptions.aroonoscillator">plotOptions.aroonoscillator</a>.</li>. <li>Options for one single series are given in. <a href="series.aroonoscillator">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         aroonoscillator: {.             // shared options for all aroonoscillator series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;aroonoscillator&#39;.     }]. });. </code></pre>
    * @param atr <p>Average true range indicator (ATR). This series requires <code>linkedTo</code>. option to be set.</p>. <p>In TypeScript the <a href="series.atr.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>atr</code> series are defined in. <a href="plotOptions.atr">plotOptions.atr</a>.</li>. <li>Options for one single series are given in. <a href="series.atr">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         atr: {.             // shared options for all atr series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;atr&#39;.     }]. });. </code></pre>
    * @param bar <p>A bar series is a special type of column series where the columns are. horizontal.</p>. <p>In TypeScript the <a href="series.bar.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>bar</code> series are defined in. <a href="plotOptions.bar">plotOptions.bar</a>.</li>. <li>Options for one single series are given in. <a href="series.bar">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         bar: {.             // shared options for all bar series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;bar&#39;.     }]. });. </code></pre>
    * @param bb <p>Bollinger bands (BB). This series requires the <code>linkedTo</code> option to be. set and should be loaded after the <code>stock/indicators/indicators.js</code> file.</p>. <p>In TypeScript the <a href="series.bb.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>bb</code> series are defined in. <a href="plotOptions.bb">plotOptions.bb</a>.</li>. <li>Options for one single series are given in. <a href="series.bb">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         bb: {.             // shared options for all bb series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;bb&#39;.     }]. });. </code></pre>
    * @param bellcurve <p>A bell curve is an areaspline series which represents the probability. density function of the normal distribution. It calculates mean and. standard deviation of the base series data and plots the curve according. to the calculated parameters.</p>. <p>In TypeScript the <a href="series.bellcurve.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>bellcurve</code> series are defined in. <a href="plotOptions.bellcurve">plotOptions.bellcurve</a>.</li>. <li>Options for one single series are given in. <a href="series.bellcurve">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         bellcurve: {.             // shared options for all bellcurve series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;bellcurve&#39;.     }]. });. </code></pre>
    * @param boxplot <p>A box plot is a convenient way of depicting groups of data through their. five-number summaries: the smallest observation (sample minimum), lower. quartile (Q1), median (Q2), upper quartile (Q3), and largest observation. (sample maximum).</p>. <p>In TypeScript the <a href="series.boxplot.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>boxplot</code> series are defined in. <a href="plotOptions.boxplot">plotOptions.boxplot</a>.</li>. <li>Options for one single series are given in. <a href="series.boxplot">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         boxplot: {.             // shared options for all boxplot series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;boxplot&#39;.     }]. });. </code></pre>
    * @param bubble <p>A bubble series is a three dimensional series type where each point. renders an X, Y and Z value. Each points is drawn as a bubble where the. position along the X and Y axes mark the X and Y values, and the size of. the bubble relates to the Z value.</p>. <p>In TypeScript the <a href="series.bubble.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>bubble</code> series are defined in. <a href="plotOptions.bubble">plotOptions.bubble</a>.</li>. <li>Options for one single series are given in. <a href="series.bubble">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         bubble: {.             // shared options for all bubble series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;bubble&#39;.     }]. });. </code></pre>
    * @param bullet <p>A bullet graph is a variation of a bar graph. The bullet graph features. a single measure, compares it to a target, and displays it in the context. of qualitative ranges of performance that could be set using. <a href="#yAxis.plotBands">plotBands</a> on <a href="#yAxis">yAxis</a>.</p>. <p>In TypeScript the <a href="series.bullet.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>bullet</code> series are defined in. <a href="plotOptions.bullet">plotOptions.bullet</a>.</li>. <li>Options for one single series are given in. <a href="series.bullet">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         bullet: {.             // shared options for all bullet series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;bullet&#39;.     }]. });. </code></pre>
    * @param candlestick <p>A candlestick chart is a style of financial chart used to describe. price movements over time.</p>. <p>In TypeScript the <a href="series.candlestick.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>candlestick</code> series are defined in. <a href="plotOptions.candlestick">plotOptions.candlestick</a>.</li>. <li>Options for one single series are given in. <a href="series.candlestick">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         candlestick: {.             // shared options for all candlestick series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;candlestick&#39;.     }]. });. </code></pre>
    * @param cci <p>Commodity Channel Index (CCI). This series requires <code>linkedTo</code> option to. be set.</p>. <p>In TypeScript the <a href="series.cci.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>cci</code> series are defined in. <a href="plotOptions.cci">plotOptions.cci</a>.</li>. <li>Options for one single series are given in. <a href="series.cci">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         cci: {.             // shared options for all cci series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;cci&#39;.     }]. });. </code></pre>
    * @param chaikin <p>Chaikin Oscillator. This series requires the <code>linkedTo</code> option to. be set and should be loaded after the <code>stock/indicators/indicators.js</code>.</p>. <p>In TypeScript the <a href="series.chaikin.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>chaikin</code> series are defined in. <a href="plotOptions.chaikin">plotOptions.chaikin</a>.</li>. <li>Options for one single series are given in. <a href="series.chaikin">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         chaikin: {.             // shared options for all chaikin series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;chaikin&#39;.     }]. });. </code></pre>
    * @param cmf <p>Chaikin Money Flow indicator (cmf).</p>. <p>In TypeScript the <a href="series.cmf.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>cmf</code> series are defined in. <a href="plotOptions.cmf">plotOptions.cmf</a>.</li>. <li>Options for one single series are given in. <a href="series.cmf">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         cmf: {.             // shared options for all cmf series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;cmf&#39;.     }]. });. </code></pre>
    * @param cmo <p>Chande Momentum Oscilator (CMO) technical indicator. This series. requires the <code>linkedTo</code> option to be set and should be loaded after. the <code>stock/indicators/indicators.js</code> file.</p>. <p>In TypeScript the <a href="series.cmo.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>cmo</code> series are defined in. <a href="plotOptions.cmo">plotOptions.cmo</a>.</li>. <li>Options for one single series are given in. <a href="series.cmo">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         cmo: {.             // shared options for all cmo series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;cmo&#39;.     }]. });. </code></pre>
    * @param column <p>Column series display one column per value along an X axis.</p>. <p>In TypeScript the <a href="series.column.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>column</code> series are defined in. <a href="plotOptions.column">plotOptions.column</a>.</li>. <li>Options for one single series are given in. <a href="series.column">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         column: {.             // shared options for all column series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;column&#39;.     }]. });. </code></pre>
    * @param columnpyramid <p>Column pyramid series display one pyramid per value along an X axis.. To display horizontal pyramids, set <a href="#chart.inverted">chart.inverted</a> to. <code>true</code>.</p>. <p>In TypeScript the <a href="series.columnpyramid.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>columnpyramid</code> series are defined in. <a href="plotOptions.columnpyramid">plotOptions.columnpyramid</a>.</li>. <li>Options for one single series are given in. <a href="series.columnpyramid">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         columnpyramid: {.             // shared options for all columnpyramid series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;columnpyramid&#39;.     }]. });. </code></pre>
    * @param columnrange <p>The column range is a cartesian series type with higher and lower. Y values along an X axis. To display horizontal bars, set. <a href="#chart.inverted">chart.inverted</a> to <code>true</code>.</p>. <p>In TypeScript the <a href="series.columnrange.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>columnrange</code> series are defined in. <a href="plotOptions.columnrange">plotOptions.columnrange</a>.</li>. <li>Options for one single series are given in. <a href="series.columnrange">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         columnrange: {.             // shared options for all columnrange series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;columnrange&#39;.     }]. });. </code></pre>
    * @param cylinder <p>A cylinder graph is a variation of a 3d column graph. The cylinder graph. features cylindrical points.</p>. <p>In TypeScript the <a href="series.cylinder.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>cylinder</code> series are defined in. <a href="plotOptions.cylinder">plotOptions.cylinder</a>.</li>. <li>Options for one single series are given in. <a href="series.cylinder">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         cylinder: {.             // shared options for all cylinder series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;cylinder&#39;.     }]. });. </code></pre>
    * @param dema <p>Double exponential moving average (DEMA) indicator. This series requires. <code>linkedTo</code> option to be set and should be loaded after the. <code>stock/indicators/indicators.js</code>.</p>. <p>In TypeScript the <a href="series.dema.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>dema</code> series are defined in. <a href="plotOptions.dema">plotOptions.dema</a>.</li>. <li>Options for one single series are given in. <a href="series.dema">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         dema: {.             // shared options for all dema series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;dema&#39;.     }]. });. </code></pre>
    * @param dependencywheel <p>A dependency wheel chart is a type of flow diagram, where all nodes are. laid out in a circle, and the flow between the are drawn as link bands.</p>. <p>In TypeScript the <a href="series.dependencywheel.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>dependencywheel</code> series are defined in. <a href="plotOptions.dependencywheel">plotOptions.dependencywheel</a>.</li>. <li>Options for one single series are given in. <a href="series.dependencywheel">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         dependencywheel: {.             // shared options for all dependencywheel series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;dependencywheel&#39;.     }]. });. </code></pre>
    * @param disparityindex <p>Disparity Index.. This series requires the <code>linkedTo</code> option to be set and should. be loaded after the <code>stock/indicators/indicators.js</code> file.</p>. <p>In TypeScript the <a href="series.disparityindex.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>disparityindex</code> series are defined in. <a href="plotOptions.disparityindex">plotOptions.disparityindex</a>.</li>. <li>Options for one single series are given in. <a href="series.disparityindex">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         disparityindex: {.             // shared options for all disparityindex series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;disparityindex&#39;.     }]. });. </code></pre>
    * @param dmi <p>Directional Movement Index (DMI).. This series requires the <code>linkedTo</code> option to be set and should. be loaded after the <code>stock/indicators/indicators.js</code> file.</p>. <p>In TypeScript the <a href="series.dmi.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>dmi</code> series are defined in. <a href="plotOptions.dmi">plotOptions.dmi</a>.</li>. <li>Options for one single series are given in. <a href="series.dmi">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         dmi: {.             // shared options for all dmi series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;dmi&#39;.     }]. });. </code></pre>
    * @param dpo <p>Detrended Price Oscillator. This series requires the <code>linkedTo</code> option to. be set and should be loaded after the <code>stock/indicators/indicators.js</code>.</p>. <p>In TypeScript the <a href="series.dpo.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>dpo</code> series are defined in. <a href="plotOptions.dpo">plotOptions.dpo</a>.</li>. <li>Options for one single series are given in. <a href="series.dpo">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         dpo: {.             // shared options for all dpo series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;dpo&#39;.     }]. });. </code></pre>
    * @param dumbbell <p>The dumbbell series is a cartesian series with higher and lower values. for each point along an X axis, connected with a line between the. values.</p>. <p>Requires <code>highcharts-more.js</code> and <code>modules/dumbbell.js</code>.</p>. <p>In TypeScript the <a href="series.dumbbell.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>dumbbell</code> series are defined in. <a href="plotOptions.dumbbell">plotOptions.dumbbell</a>.</li>. <li>Options for one single series are given in. <a href="series.dumbbell">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         dumbbell: {.             // shared options for all dumbbell series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;dumbbell&#39;.     }]. });. </code></pre>
    * @param ema <p>Exponential moving average indicator (EMA). This series requires the. <code>linkedTo</code> option to be set.</p>. <p>In TypeScript the <a href="series.ema.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>ema</code> series are defined in. <a href="plotOptions.ema">plotOptions.ema</a>.</li>. <li>Options for one single series are given in. <a href="series.ema">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         ema: {.             // shared options for all ema series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;ema&#39;.     }]. });. </code></pre>
    * @param errorbar <p>Error bars are a graphical representation of the variability of data and. are used on graphs to indicate the error, or uncertainty in a reported. measurement.</p>. <p>In TypeScript the <a href="series.errorbar.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>errorbar</code> series are defined in. <a href="plotOptions.errorbar">plotOptions.errorbar</a>.</li>. <li>Options for one single series are given in. <a href="series.errorbar">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         errorbar: {.             // shared options for all errorbar series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;errorbar&#39;.     }]. });. </code></pre>
    * @param flags <p>Flags are used to mark events in stock charts. They can be added on the. timeline, or attached to a specific series.</p>. <p>In TypeScript the <a href="series.flags.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>flags</code> series are defined in. <a href="plotOptions.flags">plotOptions.flags</a>.</li>. <li>Options for one single series are given in. <a href="series.flags">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         flags: {.             // shared options for all flags series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;flags&#39;.     }]. });. </code></pre>
    * @param funnel <p>Funnel charts are a type of chart often used to visualize stages in a. sales project, where the top are the initial stages with the most. clients. It requires that the modules/funnel.js file is loaded.</p>. <p>In TypeScript the <a href="series.funnel.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>funnel</code> series are defined in. <a href="plotOptions.funnel">plotOptions.funnel</a>.</li>. <li>Options for one single series are given in. <a href="series.funnel">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         funnel: {.             // shared options for all funnel series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;funnel&#39;.     }]. });. </code></pre>
    * @param funnel3d <p>A funnel3d is a 3d version of funnel series type. Funnel charts are. a type of chart often used to visualize stages in a sales project,. where the top are the initial stages with the most clients.</p>. <p>It requires that the <code>highcharts-3d.js</code>, <code>cylinder.js</code> and. <code>funnel3d.js</code> module are loaded.</p>. <p>In TypeScript the <a href="series.funnel3d.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>funnel3d</code> series are defined in. <a href="plotOptions.funnel3d">plotOptions.funnel3d</a>.</li>. <li>Options for one single series are given in. <a href="series.funnel3d">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         funnel3d: {.             // shared options for all funnel3d series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;funnel3d&#39;.     }]. });. </code></pre>
    * @param gantt <p>A <code>gantt</code> series. If the <a href="#series.gantt.type">type</a> option is not specified,. it is inherited from <a href="#chart.type">chart.type</a>.</p>. <p>In TypeScript the <a href="series.gantt.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>gantt</code> series are defined in. <a href="plotOptions.gantt">plotOptions.gantt</a>.</li>. <li>Options for one single series are given in. <a href="series.gantt">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         gantt: {.             // shared options for all gantt series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;gantt&#39;.     }]. });. </code></pre>
    * @param gauge <p>Gauges are circular plots displaying one or more values with a dial. pointing to values along the perimeter.</p>. <p>In TypeScript the <a href="series.gauge.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>gauge</code> series are defined in. <a href="plotOptions.gauge">plotOptions.gauge</a>.</li>. <li>Options for one single series are given in. <a href="series.gauge">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         gauge: {.             // shared options for all gauge series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;gauge&#39;.     }]. });. </code></pre>
    * @param heatmap <p>A heatmap is a graphical representation of data where the individual. values contained in a matrix are represented as colors.</p>. <p>In TypeScript the <a href="series.heatmap.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>heatmap</code> series are defined in. <a href="plotOptions.heatmap">plotOptions.heatmap</a>.</li>. <li>Options for one single series are given in. <a href="series.heatmap">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         heatmap: {.             // shared options for all heatmap series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;heatmap&#39;.     }]. });. </code></pre>
    * @param heikinashi <p>An HeikinAshi series is a style of financial chart used to describe price. movements over time. It displays open, high, low and close values per. data point.</p>. <p>In TypeScript the <a href="series.heikinashi.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>heikinashi</code> series are defined in. <a href="plotOptions.heikinashi">plotOptions.heikinashi</a>.</li>. <li>Options for one single series are given in. <a href="series.heikinashi">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         heikinashi: {.             // shared options for all heikinashi series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;heikinashi&#39;.     }]. });. </code></pre>
    * @param histogram <p>A histogram is a column series which represents the distribution of the. data set in the base series. Histogram splits data into bins and shows. their frequencies.</p>. <p>In TypeScript the <a href="series.histogram.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>histogram</code> series are defined in. <a href="plotOptions.histogram">plotOptions.histogram</a>.</li>. <li>Options for one single series are given in. <a href="series.histogram">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         histogram: {.             // shared options for all histogram series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;histogram&#39;.     }]. });. </code></pre>
    * @param hlc <p>An HLC chart is a style of financial chart used to describe price. movements over time. It displays high, low and close values per. data point.</p>. <p>In TypeScript the <a href="series.hlc.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>hlc</code> series are defined in. <a href="plotOptions.hlc">plotOptions.hlc</a>.</li>. <li>Options for one single series are given in. <a href="series.hlc">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         hlc: {.             // shared options for all hlc series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;hlc&#39;.     }]. });. </code></pre>
    * @param hollowcandlestick <p>A hollow candlestick chart is a style of financial chart used to. describe price movements over time.</p>. <p>In TypeScript the <a href="series.hollowcandlestick.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>hollowcandlestick</code> series are defined in. <a href="plotOptions.hollowcandlestick">plotOptions.hollowcandlestick</a>.</li>. <li>Options for one single series are given in. <a href="series.hollowcandlestick">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         hollowcandlestick: {.             // shared options for all hollowcandlestick series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;hollowcandlestick&#39;.     }]. });. </code></pre>
    * @param ikh <p>Ichimoku Kinko Hyo (IKH). This series requires <code>linkedTo</code> option to be. set.</p>. <p>In TypeScript the <a href="series.ikh.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>ikh</code> series are defined in. <a href="plotOptions.ikh">plotOptions.ikh</a>.</li>. <li>Options for one single series are given in. <a href="series.ikh">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         ikh: {.             // shared options for all ikh series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;ikh&#39;.     }]. });. </code></pre>
    * @param item <p>An item chart is an infographic chart where a number of items are laid. out in either a rectangular or circular pattern. It can be used to. visualize counts within a group, or for the circular pattern, typically. a parliament.</p>. <p>The circular layout has much in common with a pie chart. Many of the item. series options, like <code>center</code>, <code>size</code> and data label positioning, are. inherited from the pie series and don&#39;t apply for rectangular layouts.</p>. <p>In TypeScript the <a href="series.item.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>item</code> series are defined in. <a href="plotOptions.item">plotOptions.item</a>.</li>. <li>Options for one single series are given in. <a href="series.item">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         item: {.             // shared options for all item series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;item&#39;.     }]. });. </code></pre>
    * @param keltnerchannels <p>Keltner Channels. This series requires the <code>linkedTo</code> option to be set. and should be loaded after the <code>stock/indicators/indicators.js</code>,. <code>stock/indicators/atr.js</code>, and <code>stock/ema/.js</code>.</p>. <p>In TypeScript the <a href="series.keltnerchannels.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>keltnerchannels</code> series are defined in. <a href="plotOptions.keltnerchannels">plotOptions.keltnerchannels</a>.</li>. <li>Options for one single series are given in. <a href="series.keltnerchannels">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         keltnerchannels: {.             // shared options for all keltnerchannels series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;keltnerchannels&#39;.     }]. });. </code></pre>
    * @param klinger <p>Klinger oscillator. This series requires the <code>linkedTo</code> option to be set. and should be loaded after the <code>stock/indicators/indicators.js</code> file.</p>. <p>In TypeScript the <a href="series.klinger.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>klinger</code> series are defined in. <a href="plotOptions.klinger">plotOptions.klinger</a>.</li>. <li>Options for one single series are given in. <a href="series.klinger">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         klinger: {.             // shared options for all klinger series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;klinger&#39;.     }]. });. </code></pre>
    * @param line <p>A line series displays information as a series of data points connected by. straight line segments.</p>. <p>In TypeScript the <a href="series.line.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>line</code> series are defined in. <a href="plotOptions.line">plotOptions.line</a>.</li>. <li>Options for one single series are given in. <a href="series.line">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         line: {.             // shared options for all line series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;line&#39;.     }]. });. </code></pre>
    * @param linearregression <p>Linear regression indicator. This series requires <code>linkedTo</code> option to be. set.</p>. <p>In TypeScript the <a href="series.linearregression.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>linearregression</code> series are defined in. <a href="plotOptions.linearregression">plotOptions.linearregression</a>.</li>. <li>Options for one single series are given in. <a href="series.linearregression">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         linearregression: {.             // shared options for all linearregression series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;linearregression&#39;.     }]. });. </code></pre>
    * @param linearregressionangle <p>Linear regression angle indicator. This series requires <code>linkedTo</code>. option to be set.</p>. <p>In TypeScript the <a href="series.linearregressionangle.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>linearregressionangle</code> series are defined in. <a href="plotOptions.linearregressionangle">plotOptions.linearregressionangle</a>.</li>. <li>Options for one single series are given in. <a href="series.linearregressionangle">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         linearregressionangle: {.             // shared options for all linearregressionangle series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;linearregressionangle&#39;.     }]. });. </code></pre>
    * @param linearregressionintercept <p>Linear regression intercept indicator. This series requires <code>linkedTo</code>. option to be set.</p>. <p>In TypeScript the <a href="series.linearregressionintercept.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>linearregressionintercept</code> series are defined in. <a href="plotOptions.linearregressionintercept">plotOptions.linearregressionintercept</a>.</li>. <li>Options for one single series are given in. <a href="series.linearregressionintercept">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         linearregressionintercept: {.             // shared options for all linearregressionintercept series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;linearregressionintercept&#39;.     }]. });. </code></pre>
    * @param linearregressionslope <p>Linear regression slope indicator. This series requires <code>linkedTo</code>. option to be set.</p>. <p>In TypeScript the <a href="series.linearregressionslope.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>linearregressionslope</code> series are defined in. <a href="plotOptions.linearregressionslope">plotOptions.linearregressionslope</a>.</li>. <li>Options for one single series are given in. <a href="series.linearregressionslope">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         linearregressionslope: {.             // shared options for all linearregressionslope series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;linearregressionslope&#39;.     }]. });. </code></pre>
    * @param lollipop <p>The lollipop series is a carteseian series with a line anchored from. the x axis and a dot at the end to mark the value.. Requires <code>highcharts-more.js</code>, <code>modules/dumbbell.js</code> and. <code>modules/lollipop.js</code>.</p>. <p>In TypeScript the <a href="series.lollipop.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>lollipop</code> series are defined in. <a href="plotOptions.lollipop">plotOptions.lollipop</a>.</li>. <li>Options for one single series are given in. <a href="series.lollipop">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         lollipop: {.             // shared options for all lollipop series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;lollipop&#39;.     }]. });. </code></pre>
    * @param macd <p>Moving Average Convergence Divergence (MACD). This series requires. <code>linkedTo</code> option to be set and should be loaded after the. <code>stock/indicators/indicators.js</code>.</p>. <p>In TypeScript the <a href="series.macd.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>macd</code> series are defined in. <a href="plotOptions.macd">plotOptions.macd</a>.</li>. <li>Options for one single series are given in. <a href="series.macd">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         macd: {.             // shared options for all macd series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;macd&#39;.     }]. });. </code></pre>
    * @param map <p>The map series is used for basic choropleth maps, where each map area has. a color based on its value.</p>. <p>In TypeScript the <a href="series.map.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>map</code> series are defined in. <a href="plotOptions.map">plotOptions.map</a>.</li>. <li>Options for one single series are given in. <a href="series.map">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         map: {.             // shared options for all map series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;map&#39;.     }]. });. </code></pre>
    * @param mapbubble <p>A map bubble series is a bubble series laid out on top of a map. series, where each bubble is tied to a specific map area.</p>. <p>In TypeScript the <a href="series.mapbubble.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>mapbubble</code> series are defined in. <a href="plotOptions.mapbubble">plotOptions.mapbubble</a>.</li>. <li>Options for one single series are given in. <a href="series.mapbubble">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         mapbubble: {.             // shared options for all mapbubble series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;mapbubble&#39;.     }]. });. </code></pre>
    * @param mapline <p>A mapline series is a special case of the map series where the value. colors are applied to the strokes rather than the fills. It can also be. used for freeform drawing, like dividers, in the map.</p>. <p>In TypeScript the <a href="series.mapline.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>mapline</code> series are defined in. <a href="plotOptions.mapline">plotOptions.mapline</a>.</li>. <li>Options for one single series are given in. <a href="series.mapline">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         mapline: {.             // shared options for all mapline series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;mapline&#39;.     }]. });. </code></pre>
    * @param mappoint <p>A mappoint series is a special form of scatter series where the points. can be laid out in map coordinates on top of a map.</p>. <p>In TypeScript the <a href="series.mappoint.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>mappoint</code> series are defined in. <a href="plotOptions.mappoint">plotOptions.mappoint</a>.</li>. <li>Options for one single series are given in. <a href="series.mappoint">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         mappoint: {.             // shared options for all mappoint series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;mappoint&#39;.     }]. });. </code></pre>
    * @param mfi <p>Money Flow Index. This series requires <code>linkedTo</code> option to be set and. should be loaded after the <code>stock/indicators/indicators.js</code> file.</p>. <p>In TypeScript the <a href="series.mfi.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>mfi</code> series are defined in. <a href="plotOptions.mfi">plotOptions.mfi</a>.</li>. <li>Options for one single series are given in. <a href="series.mfi">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         mfi: {.             // shared options for all mfi series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;mfi&#39;.     }]. });. </code></pre>
    * @param momentum <p>Momentum. This series requires <code>linkedTo</code> option to be set.</p>. <p>In TypeScript the <a href="series.momentum.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>momentum</code> series are defined in. <a href="plotOptions.momentum">plotOptions.momentum</a>.</li>. <li>Options for one single series are given in. <a href="series.momentum">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         momentum: {.             // shared options for all momentum series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;momentum&#39;.     }]. });. </code></pre>
    * @param natr <p>Normalized average true range indicator (NATR). This series requires. <code>linkedTo</code> option to be set and should be loaded after the. <code>stock/indicators/indicators.js</code> and <code>stock/indicators/atr.js</code>.</p>. <p>In TypeScript the <a href="series.natr.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>natr</code> series are defined in. <a href="plotOptions.natr">plotOptions.natr</a>.</li>. <li>Options for one single series are given in. <a href="series.natr">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         natr: {.             // shared options for all natr series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;natr&#39;.     }]. });. </code></pre>
    * @param networkgraph <p>A networkgraph is a type of relationship chart, where connnections. (links) attracts nodes (points) and other nodes repulse each other.</p>. <p>In TypeScript the <a href="series.networkgraph.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>networkgraph</code> series are defined in. <a href="plotOptions.networkgraph">plotOptions.networkgraph</a>.</li>. <li>Options for one single series are given in. <a href="series.networkgraph">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         networkgraph: {.             // shared options for all networkgraph series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;networkgraph&#39;.     }]. });. </code></pre>
    * @param obv <p>On-Balance Volume (OBV) technical indicator. This series. requires the <code>linkedTo</code> option to be set and should be loaded after. the <code>stock/indicators/indicators.js</code> file. Through the <code>volumeSeriesID</code>. there also should be linked the volume series.</p>. <p>In TypeScript the <a href="series.obv.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>obv</code> series are defined in. <a href="plotOptions.obv">plotOptions.obv</a>.</li>. <li>Options for one single series are given in. <a href="series.obv">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         obv: {.             // shared options for all obv series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;obv&#39;.     }]. });. </code></pre>
    * @param ohlc <p>An OHLC chart is a style of financial chart used to describe price. movements over time. It displays open, high, low and close values per. data point.</p>. <p>In TypeScript the <a href="series.ohlc.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>ohlc</code> series are defined in. <a href="plotOptions.ohlc">plotOptions.ohlc</a>.</li>. <li>Options for one single series are given in. <a href="series.ohlc">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         ohlc: {.             // shared options for all ohlc series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;ohlc&#39;.     }]. });. </code></pre>
    * @param organization <p>An organization chart is a diagram that shows the structure of an. organization and the relationships and relative ranks of its parts and. positions.</p>. <p>In TypeScript the <a href="series.organization.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>organization</code> series are defined in. <a href="plotOptions.organization">plotOptions.organization</a>.</li>. <li>Options for one single series are given in. <a href="series.organization">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         organization: {.             // shared options for all organization series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;organization&#39;.     }]. });. </code></pre>
    * @param packedbubble <p>A packed bubble series is a two dimensional series type, where each point. renders a value in X, Y position. Each point is drawn as a bubble. where the bubbles don&#39;t overlap with each other and the radius. of the bubble relates to the value.</p>. <p>In TypeScript the <a href="series.packedbubble.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>packedbubble</code> series are defined in. <a href="plotOptions.packedbubble">plotOptions.packedbubble</a>.</li>. <li>Options for one single series are given in. <a href="series.packedbubble">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         packedbubble: {.             // shared options for all packedbubble series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;packedbubble&#39;.     }]. });. </code></pre>
    * @param pareto <p>A pareto diagram is a type of chart that contains both bars and a line. graph, where individual values are represented in descending order by. bars, and the cumulative total is represented by the line.</p>. <p>In TypeScript the <a href="series.pareto.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>pareto</code> series are defined in. <a href="plotOptions.pareto">plotOptions.pareto</a>.</li>. <li>Options for one single series are given in. <a href="series.pareto">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         pareto: {.             // shared options for all pareto series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;pareto&#39;.     }]. });. </code></pre>
    * @param pc <p>Price channel (PC). This series requires the <code>linkedTo</code> option to be. set and should be loaded after the <code>stock/indicators/indicators.js</code>.</p>. <p>In TypeScript the <a href="series.pc.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>pc</code> series are defined in. <a href="plotOptions.pc">plotOptions.pc</a>.</li>. <li>Options for one single series are given in. <a href="series.pc">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         pc: {.             // shared options for all pc series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;pc&#39;.     }]. });. </code></pre>
    * @param pie <p>A pie chart is a circular graphic which is divided into slices to. illustrate numerical proportion.</p>. <p>In TypeScript the <a href="series.pie.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>pie</code> series are defined in. <a href="plotOptions.pie">plotOptions.pie</a>.</li>. <li>Options for one single series are given in. <a href="series.pie">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         pie: {.             // shared options for all pie series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;pie&#39;.     }]. });. </code></pre>
    * @param pivotpoints <p>Pivot points indicator. This series requires the <code>linkedTo</code> option to be. set and should be loaded after <code>stock/indicators/indicators.js</code> file.</p>. <p>In TypeScript the <a href="series.pivotpoints.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>pivotpoints</code> series are defined in. <a href="plotOptions.pivotpoints">plotOptions.pivotpoints</a>.</li>. <li>Options for one single series are given in. <a href="series.pivotpoints">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         pivotpoints: {.             // shared options for all pivotpoints series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;pivotpoints&#39;.     }]. });. </code></pre>
    * @param polygon <p>A polygon series can be used to draw any freeform shape in the cartesian. coordinate system. A fill is applied with the <code>color</code> option, and. stroke is applied through <code>lineWidth</code> and <code>lineColor</code> options.</p>. <p>In TypeScript the <a href="series.polygon.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>polygon</code> series are defined in. <a href="plotOptions.polygon">plotOptions.polygon</a>.</li>. <li>Options for one single series are given in. <a href="series.polygon">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         polygon: {.             // shared options for all polygon series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;polygon&#39;.     }]. });. </code></pre>
    * @param ppo <p>Percentage Price Oscillator. This series requires the. <code>linkedTo</code> option to be set and should be loaded after the. <code>stock/indicators/indicators.js</code>.</p>. <p>In TypeScript the <a href="series.ppo.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>ppo</code> series are defined in. <a href="plotOptions.ppo">plotOptions.ppo</a>.</li>. <li>Options for one single series are given in. <a href="series.ppo">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         ppo: {.             // shared options for all ppo series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;ppo&#39;.     }]. });. </code></pre>
    * @param priceenvelopes <p>Price envelopes indicator based on <a href="#plotOptions.sma">SMA</a> calculations.. This series requires the <code>linkedTo</code> option to be set and should be loaded. after the <code>stock/indicators/indicators.js</code> file.</p>. <p>In TypeScript the <a href="series.priceenvelopes.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>priceenvelopes</code> series are defined in. <a href="plotOptions.priceenvelopes">plotOptions.priceenvelopes</a>.</li>. <li>Options for one single series are given in. <a href="series.priceenvelopes">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         priceenvelopes: {.             // shared options for all priceenvelopes series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;priceenvelopes&#39;.     }]. });. </code></pre>
    * @param psar <p>Parabolic SAR. This series requires <code>linkedTo</code>. option to be set and should be loaded. after <code>stock/indicators/indicators.js</code> file.</p>. <p>In TypeScript the <a href="series.psar.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>psar</code> series are defined in. <a href="plotOptions.psar">plotOptions.psar</a>.</li>. <li>Options for one single series are given in. <a href="series.psar">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         psar: {.             // shared options for all psar series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;psar&#39;.     }]. });. </code></pre>
    * @param pyramid <p>A pyramid series is a special type of funnel, without neck and reversed. by default.</p>. <p>In TypeScript the <a href="series.pyramid.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>pyramid</code> series are defined in. <a href="plotOptions.pyramid">plotOptions.pyramid</a>.</li>. <li>Options for one single series are given in. <a href="series.pyramid">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         pyramid: {.             // shared options for all pyramid series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;pyramid&#39;.     }]. });. </code></pre>
    * @param pyramid3d <p>A pyramid3d is a 3d version of pyramid series type. Pyramid charts are. a type of chart often used to visualize stages in a sales project,. where the top are the initial stages with the most clients.</p>. <p>In TypeScript the <a href="series.pyramid3d.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>pyramid3d</code> series are defined in. <a href="plotOptions.pyramid3d">plotOptions.pyramid3d</a>.</li>. <li>Options for one single series are given in. <a href="series.pyramid3d">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         pyramid3d: {.             // shared options for all pyramid3d series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;pyramid3d&#39;.     }]. });. </code></pre>
    * @param roc <p>Rate of change indicator (ROC). The indicator value for each point. is defined as:</p>. <p><code>(C - Cn) / Cn * 100</code></p>. <p>where: <code>C</code> is the close value of the point of the same x in the. linked series and <code>Cn</code> is the close value of the point <code>n</code> periods. ago. <code>n</code> is set through <a href="#plotOptions.roc.params.period">period</a>.</p>. <p>This series requires <code>linkedTo</code> option to be set.</p>. <p>In TypeScript the <a href="series.roc.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>roc</code> series are defined in. <a href="plotOptions.roc">plotOptions.roc</a>.</li>. <li>Options for one single series are given in. <a href="series.roc">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         roc: {.             // shared options for all roc series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;roc&#39;.     }]. });. </code></pre>
    * @param rsi <p>Relative strength index (RSI) technical indicator. This series. requires the <code>linkedTo</code> option to be set and should be loaded after. the <code>stock/indicators/indicators.js</code> file.</p>. <p>In TypeScript the <a href="series.rsi.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>rsi</code> series are defined in. <a href="plotOptions.rsi">plotOptions.rsi</a>.</li>. <li>Options for one single series are given in. <a href="series.rsi">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         rsi: {.             // shared options for all rsi series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;rsi&#39;.     }]. });. </code></pre>
    * @param sankey <p>A sankey diagram is a type of flow diagram, in which the width of the. link between two nodes is shown proportionally to the flow quantity.</p>. <p>In TypeScript the <a href="series.sankey.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>sankey</code> series are defined in. <a href="plotOptions.sankey">plotOptions.sankey</a>.</li>. <li>Options for one single series are given in. <a href="series.sankey">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         sankey: {.             // shared options for all sankey series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;sankey&#39;.     }]. });. </code></pre>
    * @param scatter <p>A scatter plot uses cartesian coordinates to display values for two. variables for a set of data.</p>. <p>In TypeScript the <a href="series.scatter.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>scatter</code> series are defined in. <a href="plotOptions.scatter">plotOptions.scatter</a>.</li>. <li>Options for one single series are given in. <a href="series.scatter">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         scatter: {.             // shared options for all scatter series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;scatter&#39;.     }]. });. </code></pre>
    * @param scatter3d <p>A 3D scatter plot uses x, y and z coordinates to display values for three. variables for a set of data.</p>. <p>In TypeScript the <a href="series.scatter3d.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>scatter3d</code> series are defined in. <a href="plotOptions.scatter3d">plotOptions.scatter3d</a>.</li>. <li>Options for one single series are given in. <a href="series.scatter3d">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         scatter3d: {.             // shared options for all scatter3d series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;scatter3d&#39;.     }]. });. </code></pre>
    * @param series <p>General options for all series types.</p>. <p>In TypeScript the <a href="series.line.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>line</code> series are defined in. <a href="plotOptions.line">plotOptions.line</a>.</li>. <li>Options for one single series are given in. <a href="series.line">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         line: {.             // shared options for all line series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;line&#39;.     }]. });. </code></pre>
    * @param slowstochastic <p>Slow Stochastic oscillator. This series requires the <code>linkedTo</code> option. to be set and should be loaded after <code>stock/indicators/indicators.js</code>. and <code>stock/indicators/stochastic.js</code> files.</p>. <p>In TypeScript the <a href="series.slowstochastic.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>slowstochastic</code> series are defined in. <a href="plotOptions.slowstochastic">plotOptions.slowstochastic</a>.</li>. <li>Options for one single series are given in. <a href="series.slowstochastic">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         slowstochastic: {.             // shared options for all slowstochastic series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;slowstochastic&#39;.     }]. });. </code></pre>
    * @param sma <p>Simple moving average indicator (SMA). This series requires <code>linkedTo</code>. option to be set.</p>. <p>In TypeScript the <a href="series.sma.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>sma</code> series are defined in. <a href="plotOptions.sma">plotOptions.sma</a>.</li>. <li>Options for one single series are given in. <a href="series.sma">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         sma: {.             // shared options for all sma series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;sma&#39;.     }]. });. </code></pre>
    * @param solidgauge <p>A solid gauge is a circular gauge where the value is indicated by a filled. arc, and the color of the arc may variate with the value.</p>. <p>In TypeScript the <a href="series.solidgauge.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>solidgauge</code> series are defined in. <a href="plotOptions.solidgauge">plotOptions.solidgauge</a>.</li>. <li>Options for one single series are given in. <a href="series.solidgauge">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         solidgauge: {.             // shared options for all solidgauge series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;solidgauge&#39;.     }]. });. </code></pre>
    * @param spline <p>A spline series is a special type of line series, where the segments. between the data points are smoothed.</p>. <p>In TypeScript the <a href="series.spline.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>spline</code> series are defined in. <a href="plotOptions.spline">plotOptions.spline</a>.</li>. <li>Options for one single series are given in. <a href="series.spline">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         spline: {.             // shared options for all spline series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;spline&#39;.     }]. });. </code></pre>
    * @param stochastic <p>Stochastic oscillator. This series requires the <code>linkedTo</code> option to be. set and should be loaded after the <code>stock/indicators/indicators.js</code> file.</p>. <p>In TypeScript the <a href="series.stochastic.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>stochastic</code> series are defined in. <a href="plotOptions.stochastic">plotOptions.stochastic</a>.</li>. <li>Options for one single series are given in. <a href="series.stochastic">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         stochastic: {.             // shared options for all stochastic series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;stochastic&#39;.     }]. });. </code></pre>
    * @param streamgraph <p>A streamgraph is a type of stacked area graph which is displaced around a. central axis, resulting in a flowing, organic shape.</p>. <p>In TypeScript the <a href="series.streamgraph.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>streamgraph</code> series are defined in. <a href="plotOptions.streamgraph">plotOptions.streamgraph</a>.</li>. <li>Options for one single series are given in. <a href="series.streamgraph">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         streamgraph: {.             // shared options for all streamgraph series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;streamgraph&#39;.     }]. });. </code></pre>
    * @param sunburst <p>A Sunburst displays hierarchical data, where a level in the hierarchy is. represented by a circle. The center represents the root node of the tree.. The visualization bears a resemblance to both treemap and pie charts.</p>. <p>In TypeScript the <a href="series.sunburst.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>sunburst</code> series are defined in. <a href="plotOptions.sunburst">plotOptions.sunburst</a>.</li>. <li>Options for one single series are given in. <a href="series.sunburst">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         sunburst: {.             // shared options for all sunburst series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;sunburst&#39;.     }]. });. </code></pre>
    * @param supertrend <p>Supertrend indicator. This series requires the <code>linkedTo</code> option to be. set and should be loaded after the <code>stock/indicators/indicators.js</code> and. <code>stock/indicators/sma.js</code>.</p>. <p>In TypeScript the <a href="series.supertrend.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>supertrend</code> series are defined in. <a href="plotOptions.supertrend">plotOptions.supertrend</a>.</li>. <li>Options for one single series are given in. <a href="series.supertrend">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         supertrend: {.             // shared options for all supertrend series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;supertrend&#39;.     }]. });. </code></pre>
    * @param tema <p>Triple exponential moving average (TEMA) indicator. This series requires. <code>linkedTo</code> option to be set and should be loaded after the. <code>stock/indicators/indicators.js</code>.</p>. <p>In TypeScript the <a href="series.tema.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>tema</code> series are defined in. <a href="plotOptions.tema">plotOptions.tema</a>.</li>. <li>Options for one single series are given in. <a href="series.tema">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         tema: {.             // shared options for all tema series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;tema&#39;.     }]. });. </code></pre>
    * @param tilemap <p>A tilemap series is a type of heatmap where the tile shapes are. configurable.</p>. <p>In TypeScript the <a href="series.tilemap.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>tilemap</code> series are defined in. <a href="plotOptions.tilemap">plotOptions.tilemap</a>.</li>. <li>Options for one single series are given in. <a href="series.tilemap">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         tilemap: {.             // shared options for all tilemap series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;tilemap&#39;.     }]. });. </code></pre>
    * @param timeline <p>The timeline series presents given events along a drawn line.</p>. <p>In TypeScript the <a href="series.timeline.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>timeline</code> series are defined in. <a href="plotOptions.timeline">plotOptions.timeline</a>.</li>. <li>Options for one single series are given in. <a href="series.timeline">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         timeline: {.             // shared options for all timeline series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;timeline&#39;.     }]. });. </code></pre>
    * @param treemap <p>A treemap displays hierarchical data using nested rectangles. The data. can be laid out in varying ways depending on options.</p>. <p>In TypeScript the <a href="series.treemap.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>treemap</code> series are defined in. <a href="plotOptions.treemap">plotOptions.treemap</a>.</li>. <li>Options for one single series are given in. <a href="series.treemap">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         treemap: {.             // shared options for all treemap series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;treemap&#39;.     }]. });. </code></pre>
    * @param trendline <p>Trendline (linear regression) fits a straight line to the selected data. using a method called the Sum Of Least Squares. This series requires the. <code>linkedTo</code> option to be set.</p>. <p>In TypeScript the <a href="series.trendline.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>trendline</code> series are defined in. <a href="plotOptions.trendline">plotOptions.trendline</a>.</li>. <li>Options for one single series are given in. <a href="series.trendline">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         trendline: {.             // shared options for all trendline series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;trendline&#39;.     }]. });. </code></pre>
    * @param trix <p>Triple exponential average (TRIX) oscillator. This series requires. <code>linkedTo</code> option to be set.</p>. <p>In TypeScript the <a href="series.trix.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>trix</code> series are defined in. <a href="plotOptions.trix">plotOptions.trix</a>.</li>. <li>Options for one single series are given in. <a href="series.trix">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         trix: {.             // shared options for all trix series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;trix&#39;.     }]. });. </code></pre>
    * @param variablepie <p>A variable pie series is a two dimensional series type, where each point. renders an Y and Z value.  Each point is drawn as a pie slice where the. size (arc) of the slice relates to the Y value and the radius of pie. slice relates to the Z value.</p>. <p>In TypeScript the <a href="series.variablepie.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>variablepie</code> series are defined in. <a href="plotOptions.variablepie">plotOptions.variablepie</a>.</li>. <li>Options for one single series are given in. <a href="series.variablepie">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         variablepie: {.             // shared options for all variablepie series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;variablepie&#39;.     }]. });. </code></pre>
    * @param variwide <p>A variwide chart (related to marimekko chart) is a column chart with a. variable width expressing a third dimension.</p>. <p>In TypeScript the <a href="series.variwide.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>variwide</code> series are defined in. <a href="plotOptions.variwide">plotOptions.variwide</a>.</li>. <li>Options for one single series are given in. <a href="series.variwide">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         variwide: {.             // shared options for all variwide series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;variwide&#39;.     }]. });. </code></pre>
    * @param vbp <p>Volume By Price indicator.</p>. <p>This series requires <code>linkedTo</code> option to be set.</p>. <p>In TypeScript the <a href="series.vbp.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>vbp</code> series are defined in. <a href="plotOptions.vbp">plotOptions.vbp</a>.</li>. <li>Options for one single series are given in. <a href="series.vbp">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         vbp: {.             // shared options for all vbp series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;vbp&#39;.     }]. });. </code></pre>
    * @param vector <p>A vector plot is a type of cartesian chart where each point has an X and. Y position, a length and a direction. Vectors are drawn as arrows.</p>. <p>In TypeScript the <a href="series.vector.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>vector</code> series are defined in. <a href="plotOptions.vector">plotOptions.vector</a>.</li>. <li>Options for one single series are given in. <a href="series.vector">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         vector: {.             // shared options for all vector series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;vector&#39;.     }]. });. </code></pre>
    * @param venn <p>A Venn diagram displays all possible logical relations between a. collection of different sets. The sets are represented by circles, and. the relation between the sets are displayed by the overlap or lack of. overlap between them. The venn diagram is a special case of Euler. diagrams, which can also be displayed by this series type.</p>. <p>In TypeScript the <a href="series.venn.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>venn</code> series are defined in. <a href="plotOptions.venn">plotOptions.venn</a>.</li>. <li>Options for one single series are given in. <a href="series.venn">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         venn: {.             // shared options for all venn series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;venn&#39;.     }]. });. </code></pre>
    * @param vwap <p>Volume Weighted Average Price indicator.</p>. <p>This series requires <code>linkedTo</code> option to be set.</p>. <p>In TypeScript the <a href="series.vwap.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>vwap</code> series are defined in. <a href="plotOptions.vwap">plotOptions.vwap</a>.</li>. <li>Options for one single series are given in. <a href="series.vwap">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         vwap: {.             // shared options for all vwap series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;vwap&#39;.     }]. });. </code></pre>
    * @param waterfall <p>A waterfall chart displays sequentially introduced positive or negative. values in cumulative columns.</p>. <p>In TypeScript the <a href="series.waterfall.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>waterfall</code> series are defined in. <a href="plotOptions.waterfall">plotOptions.waterfall</a>.</li>. <li>Options for one single series are given in. <a href="series.waterfall">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         waterfall: {.             // shared options for all waterfall series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;waterfall&#39;.     }]. });. </code></pre>
    * @param williamsr <p>Williams %R. This series requires the <code>linkedTo</code> option to be. set and should be loaded after the <code>stock/indicators/indicators.js</code>.</p>. <p>In TypeScript the <a href="series.williamsr.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>williamsr</code> series are defined in. <a href="plotOptions.williamsr">plotOptions.williamsr</a>.</li>. <li>Options for one single series are given in. <a href="series.williamsr">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         williamsr: {.             // shared options for all williamsr series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;williamsr&#39;.     }]. });. </code></pre>
    * @param windbarb <p>Wind barbs are a convenient way to represent wind speed and direction in. one graphical form. Wind direction is given by the stem direction, and. wind speed by the number and shape of barbs.</p>. <p>In TypeScript the <a href="series.windbarb.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>windbarb</code> series are defined in. <a href="plotOptions.windbarb">plotOptions.windbarb</a>.</li>. <li>Options for one single series are given in. <a href="series.windbarb">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         windbarb: {.             // shared options for all windbarb series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;windbarb&#39;.     }]. });. </code></pre>
    * @param wma <p>Weighted moving average indicator (WMA). This series requires <code>linkedTo</code>. option to be set.</p>. <p>In TypeScript the <a href="series.wma.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>wma</code> series are defined in. <a href="plotOptions.wma">plotOptions.wma</a>.</li>. <li>Options for one single series are given in. <a href="series.wma">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         wma: {.             // shared options for all wma series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;wma&#39;.     }]. });. </code></pre>
    * @param wordcloud <p>A word cloud is a visualization of a set of words, where the size and. placement of a word is determined by how it is weighted.</p>. <p>In TypeScript the <a href="series.wordcloud.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>wordcloud</code> series are defined in. <a href="plotOptions.wordcloud">plotOptions.wordcloud</a>.</li>. <li>Options for one single series are given in. <a href="series.wordcloud">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         wordcloud: {.             // shared options for all wordcloud series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;wordcloud&#39;.     }]. });. </code></pre>
    * @param xrange <p>The X-range series displays ranges on the X axis, typically time. intervals with a start and end date.</p>. <p>In TypeScript the <a href="series.xrange.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>xrange</code> series are defined in. <a href="plotOptions.xrange">plotOptions.xrange</a>.</li>. <li>Options for one single series are given in. <a href="series.xrange">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         xrange: {.             // shared options for all xrange series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;xrange&#39;.     }]. });. </code></pre>
    * @param zigzag <p>Zig Zag indicator.</p>. <p>This series requires <code>linkedTo</code> option to be set.</p>. <p>In TypeScript the <a href="series.zigzag.type">type</a> option must always be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>zigzag</code> series are defined in. <a href="plotOptions.zigzag">plotOptions.zigzag</a>.</li>. <li>Options for one single series are given in. <a href="series.zigzag">the series instance array</a>.</li>. </ol>. <pre><code>Highcharts.chart(&#39;container&#39;, {.     plotOptions: {.         series: {.             // general options for all series.         },.         zigzag: {.             // shared options for all zigzag series.         }.     },.     series: [{.         // specific options for this series instance.         type: &#39;zigzag&#39;.     }]. });. </code></pre>
    */
  def apply(abands: js.UndefOr[CleanJsObject[PlotOptionsAbands]] = js.undefined, ad: js.UndefOr[CleanJsObject[PlotOptionsAd]] = js.undefined, ao: js.UndefOr[CleanJsObject[PlotOptionsAo]] = js.undefined, apo: js.UndefOr[CleanJsObject[PlotOptionsApo]] = js.undefined, area: js.UndefOr[CleanJsObject[PlotOptionsArea]] = js.undefined, arearange: js.UndefOr[CleanJsObject[PlotOptionsArearange]] = js.undefined, areaspline: js.UndefOr[CleanJsObject[PlotOptionsAreaspline]] = js.undefined, areasplinerange: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerange]] = js.undefined, aroon: js.UndefOr[CleanJsObject[PlotOptionsAroon]] = js.undefined, aroonoscillator: js.UndefOr[CleanJsObject[PlotOptionsAroonoscillator]] = js.undefined, atr: js.UndefOr[CleanJsObject[PlotOptionsAtr]] = js.undefined, bar: js.UndefOr[CleanJsObject[PlotOptionsBar]] = js.undefined, bb: js.UndefOr[CleanJsObject[PlotOptionsBb]] = js.undefined, bellcurve: js.UndefOr[CleanJsObject[PlotOptionsBellcurve]] = js.undefined, boxplot: js.UndefOr[CleanJsObject[PlotOptionsBoxplot]] = js.undefined, bubble: js.UndefOr[CleanJsObject[PlotOptionsBubble]] = js.undefined, bullet: js.UndefOr[CleanJsObject[PlotOptionsBullet]] = js.undefined, candlestick: js.UndefOr[CleanJsObject[PlotOptionsCandlestick]] = js.undefined, cci: js.UndefOr[CleanJsObject[PlotOptionsCci]] = js.undefined, chaikin: js.UndefOr[CleanJsObject[PlotOptionsChaikin]] = js.undefined, cmf: js.UndefOr[CleanJsObject[PlotOptionsCmf]] = js.undefined, cmo: js.UndefOr[CleanJsObject[PlotOptionsCmo]] = js.undefined, column: js.UndefOr[CleanJsObject[PlotOptionsColumn]] = js.undefined, columnpyramid: js.UndefOr[CleanJsObject[PlotOptionsColumnpyramid]] = js.undefined, columnrange: js.UndefOr[CleanJsObject[PlotOptionsColumnrange]] = js.undefined, cylinder: js.UndefOr[CleanJsObject[PlotOptionsCylinder]] = js.undefined, dema: js.UndefOr[CleanJsObject[PlotOptionsDema]] = js.undefined, dependencywheel: js.UndefOr[CleanJsObject[PlotOptionsDependencywheel]] = js.undefined, disparityindex: js.UndefOr[CleanJsObject[PlotOptionsDisparityindex]] = js.undefined, dmi: js.UndefOr[CleanJsObject[PlotOptionsDmi]] = js.undefined, dpo: js.UndefOr[CleanJsObject[PlotOptionsDpo]] = js.undefined, dumbbell: js.UndefOr[CleanJsObject[PlotOptionsDumbbell]] = js.undefined, ema: js.UndefOr[CleanJsObject[PlotOptionsEma]] = js.undefined, errorbar: js.UndefOr[CleanJsObject[PlotOptionsErrorbar]] = js.undefined, flags: js.UndefOr[CleanJsObject[PlotOptionsFlags]] = js.undefined, funnel: js.UndefOr[CleanJsObject[PlotOptionsFunnel]] = js.undefined, funnel3d: js.UndefOr[CleanJsObject[PlotOptionsFunnel3d]] = js.undefined, gantt: js.UndefOr[CleanJsObject[PlotOptionsGantt]] = js.undefined, gauge: js.UndefOr[CleanJsObject[PlotOptionsGauge]] = js.undefined, heatmap: js.UndefOr[CleanJsObject[PlotOptionsHeatmap]] = js.undefined, heikinashi: js.UndefOr[CleanJsObject[PlotOptionsHeikinashi]] = js.undefined, histogram: js.UndefOr[CleanJsObject[PlotOptionsHistogram]] = js.undefined, hlc: js.UndefOr[CleanJsObject[PlotOptionsHlc]] = js.undefined, hollowcandlestick: js.UndefOr[CleanJsObject[PlotOptionsHollowcandlestick]] = js.undefined, ikh: js.UndefOr[CleanJsObject[PlotOptionsIkh]] = js.undefined, item: js.UndefOr[CleanJsObject[PlotOptionsItem]] = js.undefined, keltnerchannels: js.UndefOr[CleanJsObject[PlotOptionsKeltnerchannels]] = js.undefined, klinger: js.UndefOr[CleanJsObject[PlotOptionsKlinger]] = js.undefined, line: js.UndefOr[CleanJsObject[PlotOptionsLine]] = js.undefined, linearregression: js.UndefOr[CleanJsObject[PlotOptionsLinearregression]] = js.undefined, linearregressionangle: js.UndefOr[CleanJsObject[PlotOptionsLinearregressionangle]] = js.undefined, linearregressionintercept: js.UndefOr[CleanJsObject[PlotOptionsLinearregressionintercept]] = js.undefined, linearregressionslope: js.UndefOr[CleanJsObject[PlotOptionsLinearregressionslope]] = js.undefined, lollipop: js.UndefOr[CleanJsObject[PlotOptionsLollipop]] = js.undefined, macd: js.UndefOr[CleanJsObject[PlotOptionsMacd]] = js.undefined, map: js.UndefOr[CleanJsObject[PlotOptionsMap]] = js.undefined, mapbubble: js.UndefOr[CleanJsObject[PlotOptionsMapbubble]] = js.undefined, mapline: js.UndefOr[CleanJsObject[PlotOptionsMapline]] = js.undefined, mappoint: js.UndefOr[CleanJsObject[PlotOptionsMappoint]] = js.undefined, mfi: js.UndefOr[CleanJsObject[PlotOptionsMfi]] = js.undefined, momentum: js.UndefOr[CleanJsObject[PlotOptionsMomentum]] = js.undefined, natr: js.UndefOr[CleanJsObject[PlotOptionsNatr]] = js.undefined, networkgraph: js.UndefOr[CleanJsObject[PlotOptionsNetworkgraph]] = js.undefined, obv: js.UndefOr[CleanJsObject[PlotOptionsObv]] = js.undefined, ohlc: js.UndefOr[CleanJsObject[PlotOptionsOhlc]] = js.undefined, organization: js.UndefOr[CleanJsObject[PlotOptionsOrganization]] = js.undefined, packedbubble: js.UndefOr[CleanJsObject[PlotOptionsPackedbubble]] = js.undefined, pareto: js.UndefOr[CleanJsObject[PlotOptionsPareto]] = js.undefined, pc: js.UndefOr[CleanJsObject[PlotOptionsPc]] = js.undefined, pie: js.UndefOr[CleanJsObject[PlotOptionsPie]] = js.undefined, pivotpoints: js.UndefOr[CleanJsObject[PlotOptionsPivotpoints]] = js.undefined, polygon: js.UndefOr[CleanJsObject[PlotOptionsPolygon]] = js.undefined, ppo: js.UndefOr[CleanJsObject[PlotOptionsPpo]] = js.undefined, priceenvelopes: js.UndefOr[CleanJsObject[PlotOptionsPriceenvelopes]] = js.undefined, psar: js.UndefOr[CleanJsObject[PlotOptionsPsar]] = js.undefined, pyramid: js.UndefOr[CleanJsObject[PlotOptionsPyramid]] = js.undefined, pyramid3d: js.UndefOr[CleanJsObject[PlotOptionsPyramid3d]] = js.undefined, roc: js.UndefOr[CleanJsObject[PlotOptionsRoc]] = js.undefined, rsi: js.UndefOr[CleanJsObject[PlotOptionsRsi]] = js.undefined, sankey: js.UndefOr[CleanJsObject[PlotOptionsSankey]] = js.undefined, scatter: js.UndefOr[CleanJsObject[PlotOptionsScatter]] = js.undefined, scatter3d: js.UndefOr[CleanJsObject[PlotOptionsScatter3d]] = js.undefined, series: js.UndefOr[js.Any] = js.undefined, slowstochastic: js.UndefOr[CleanJsObject[PlotOptionsSlowstochastic]] = js.undefined, sma: js.UndefOr[CleanJsObject[PlotOptionsSma]] = js.undefined, solidgauge: js.UndefOr[CleanJsObject[PlotOptionsSolidgauge]] = js.undefined, spline: js.UndefOr[CleanJsObject[PlotOptionsSpline]] = js.undefined, stochastic: js.UndefOr[CleanJsObject[PlotOptionsStochastic]] = js.undefined, streamgraph: js.UndefOr[CleanJsObject[PlotOptionsStreamgraph]] = js.undefined, sunburst: js.UndefOr[CleanJsObject[PlotOptionsSunburst]] = js.undefined, supertrend: js.UndefOr[CleanJsObject[PlotOptionsSupertrend]] = js.undefined, tema: js.UndefOr[CleanJsObject[PlotOptionsTema]] = js.undefined, tilemap: js.UndefOr[CleanJsObject[PlotOptionsTilemap]] = js.undefined, timeline: js.UndefOr[CleanJsObject[PlotOptionsTimeline]] = js.undefined, treemap: js.UndefOr[CleanJsObject[PlotOptionsTreemap]] = js.undefined, trendline: js.UndefOr[CleanJsObject[PlotOptionsTrendline]] = js.undefined, trix: js.UndefOr[CleanJsObject[PlotOptionsTrix]] = js.undefined, variablepie: js.UndefOr[CleanJsObject[PlotOptionsVariablepie]] = js.undefined, variwide: js.UndefOr[CleanJsObject[PlotOptionsVariwide]] = js.undefined, vbp: js.UndefOr[CleanJsObject[PlotOptionsVbp]] = js.undefined, vector: js.UndefOr[CleanJsObject[PlotOptionsVector]] = js.undefined, venn: js.UndefOr[CleanJsObject[PlotOptionsVenn]] = js.undefined, vwap: js.UndefOr[CleanJsObject[PlotOptionsVwap]] = js.undefined, waterfall: js.UndefOr[CleanJsObject[PlotOptionsWaterfall]] = js.undefined, williamsr: js.UndefOr[CleanJsObject[PlotOptionsWilliamsr]] = js.undefined, windbarb: js.UndefOr[CleanJsObject[PlotOptionsWindbarb]] = js.undefined, wma: js.UndefOr[CleanJsObject[PlotOptionsWma]] = js.undefined, wordcloud: js.UndefOr[CleanJsObject[PlotOptionsWordcloud]] = js.undefined, xrange: js.UndefOr[CleanJsObject[PlotOptionsXrange]] = js.undefined, zigzag: js.UndefOr[CleanJsObject[PlotOptionsZigzag]] = js.undefined): PlotOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptions {
      this.abands = abands
      this.ad = ad
      this.ao = ao
      this.apo = apo
      this.area = area
      this.arearange = arearange
      this.areaspline = areaspline
      this.areasplinerange = areasplinerange
      this.aroon = aroon
      this.aroonoscillator = aroonoscillator
      this.atr = atr
      this.bar = bar
      this.bb = bb
      this.bellcurve = bellcurve
      this.boxplot = boxplot
      this.bubble = bubble
      this.bullet = bullet
      this.candlestick = candlestick
      this.cci = cci
      this.chaikin = chaikin
      this.cmf = cmf
      this.cmo = cmo
      this.column = column
      this.columnpyramid = columnpyramid
      this.columnrange = columnrange
      this.cylinder = cylinder
      this.dema = dema
      this.dependencywheel = dependencywheel
      this.disparityindex = disparityindex
      this.dmi = dmi
      this.dpo = dpo
      this.dumbbell = dumbbell
      this.ema = ema
      this.errorbar = errorbar
      this.flags = flags
      this.funnel = funnel
      this.funnel3d = funnel3d
      this.gantt = gantt
      this.gauge = gauge
      this.heatmap = heatmap
      this.heikinashi = heikinashi
      this.histogram = histogram
      this.hlc = hlc
      this.hollowcandlestick = hollowcandlestick
      this.ikh = ikh
      this.item = item
      this.keltnerchannels = keltnerchannels
      this.klinger = klinger
      this.line = line
      this.linearregression = linearregression
      this.linearregressionangle = linearregressionangle
      this.linearregressionintercept = linearregressionintercept
      this.linearregressionslope = linearregressionslope
      this.lollipop = lollipop
      this.macd = macd
      this.map = map
      this.mapbubble = mapbubble
      this.mapline = mapline
      this.mappoint = mappoint
      this.mfi = mfi
      this.momentum = momentum
      this.natr = natr
      this.networkgraph = networkgraph
      this.obv = obv
      this.ohlc = ohlc
      this.organization = organization
      this.packedbubble = packedbubble
      this.pareto = pareto
      this.pc = pc
      this.pie = pie
      this.pivotpoints = pivotpoints
      this.polygon = polygon
      this.ppo = ppo
      this.priceenvelopes = priceenvelopes
      this.psar = psar
      this.pyramid = pyramid
      this.pyramid3d = pyramid3d
      this.roc = roc
      this.rsi = rsi
      this.sankey = sankey
      this.scatter = scatter
      this.scatter3d = scatter3d
      this.series = series
      this.slowstochastic = slowstochastic
      this.sma = sma
      this.solidgauge = solidgauge
      this.spline = spline
      this.stochastic = stochastic
      this.streamgraph = streamgraph
      this.sunburst = sunburst
      this.supertrend = supertrend
      this.tema = tema
      this.tilemap = tilemap
      this.timeline = timeline
      this.treemap = treemap
      this.trendline = trendline
      this.trix = trix
      this.variablepie = variablepie
      this.variwide = variwide
      this.vbp = vbp
      this.vector = vector
      this.venn = venn
      this.vwap = vwap
      this.waterfall = waterfall
      this.williamsr = williamsr
      this.windbarb = windbarb
      this.wma = wma
      this.wordcloud = wordcloud
      this.xrange = xrange
      this.zigzag = zigzag
    })
  }
}
