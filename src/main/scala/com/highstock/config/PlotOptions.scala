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
  * @note JavaScript name: <code>plotOptions</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptions extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Accumulation Distribution (AD). This series requires <code>linkedTo</code> option to
    * be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>ad</code> series are defined in
    * <a href="plotOptions.ad">plotOptions.ad</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.ad">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'ad'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/accumulation-distribution">Accumulation/Distribution indicator</a>
    * @since 6.0.0
    */
  val ad: js.Any = js.undefined

  /**
    * <p>Average true range indicator (ATR). This series requires <code>linkedTo</code>
    * option to be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>atr</code> series are defined in
    * <a href="plotOptions.atr">plotOptions.atr</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.atr">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'atr'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/atr">ATR indicator</a>
    * @since 6.0.0
    */
  val atr: js.Any = js.undefined

  /**
    * <p>Bollinger bands (BB). This series requires the <code>linkedTo</code> option to be
    * set and should be loaded after the <code>stock/indicators/indicators.js</code> file.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>bb</code> series are defined in
    * <a href="plotOptions.bb">plotOptions.bb</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.bb">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'bb'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/bollinger-bands">Bollinger bands</a>
    * @since 6.0.0
    */
  val bb: js.Any = js.undefined

  /**
    * <p>Commodity Channel Index (CCI). This series requires <code>linkedTo</code> option to
    * be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>cci</code> series are defined in
    * <a href="plotOptions.cci">plotOptions.cci</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.cci">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'cci'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/cci">CCI indicator</a>
    * @since 6.0.0
    */
  val cci: js.Any = js.undefined

  /**
    * <p>Chaikin Money Flow indicator (cmf).</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>cmf</code> series are defined in
    * <a href="plotOptions.cmf">plotOptions.cmf</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.cmf">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'cmf'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/cmf/">Chaikin Money Flow indicator</a>
    * @since 6.0.0
    */
  val cmf: js.UndefOr[CleanJsObject[PlotOptionsCmf]] = js.undefined

  /**
    * <p>Exponential moving average indicator (EMA). This series requires the
    * <code>linkedTo</code> option to be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>ema</code> series are defined in
    * <a href="plotOptions.ema">plotOptions.ema</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.ema">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'ema'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/ema">Exponential moving average indicator</a>
    * @since 6.0.0
    */
  val ema: js.Any = js.undefined

  /**
    * <p>Ichimoku Kinko Hyo (IKH). This series requires <code>linkedTo</code> option to be
    * set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>ikh</code> series are defined in
    * <a href="plotOptions.ikh">plotOptions.ikh</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.ikh">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'ikh'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/ichimoku-kinko-hyo">Ichimoku Kinko Hyo indicator</a>
    * @since 6.0.0
    */
  val ikh: js.Any = js.undefined

  /**
    * <p>Simple moving average indicator (SMA). This series requires <code>linkedTo</code>
    * option to be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>sma</code> series are defined in
    * <a href="plotOptions.sma">plotOptions.sma</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.sma">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'sma'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/sma">Simple moving average indicator</a>
    * @since 6.0.0
    */
  val sma: js.Any = js.undefined

  /**
    * <p>Moving Average Convergence Divergence (MACD). This series requires
    * <code>linkedTo</code> option to be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>macd</code> series are defined in
    * <a href="plotOptions.macd">plotOptions.macd</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.macd">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'macd'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/macd">MACD indicator</a>
    * @since 6.0.0
    */
  val macd: js.Any = js.undefined

  /**
    * <p>Money Flow Index. This series requires <code>linkedTo</code> option to be set and
    * should be loaded after the <code>stock/indicators/indicators.js</code> file.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>mfi</code> series are defined in
    * <a href="plotOptions.mfi">plotOptions.mfi</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.mfi">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'mfi'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/mfi">Money Flow Index Indicator</a>
    * @since 6.0.0
    */
  val mfi: js.Any = js.undefined

  /**
    * <p>Momentum. This series requires <code>linkedTo</code> option to be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>momentum</code> series are defined in
    * <a href="plotOptions.momentum">plotOptions.momentum</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.momentum">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'momentum'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/momentum">Momentum indicator</a>
    * @since 6.0.0
    */
  val momentum: js.Any = js.undefined

  /**
    * <p>Pivot points indicator. This series requires the <code>linkedTo</code> option to be
    * set and should be loaded after <code>stock/indicators/indicators.js</code> file.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>pivotpoints</code> series are defined in
    * <a href="plotOptions.pivotpoints">plotOptions.pivotpoints</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.pivotpoints">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'pivotpoints'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/pivot-points">Pivot points</a>
    * @since 6.0.0
    */
  val pivotpoints: js.Any = js.undefined

  /**
    * <p>Price envelopes indicator based on <a href="#plotOptions.sma">SMA</a> calculations.
    * This series requires the <code>linkedTo</code> option to be set and should be loaded
    * after the <code>stock/indicators/indicators.js</code> file.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>priceenvelopes</code> series are defined in
    * <a href="plotOptions.priceenvelopes">plotOptions.priceenvelopes</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.priceenvelopes">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'priceenvelopes'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/price-envelopes">Price envelopes</a>
    * @since 6.0.0
    */
  val priceenvelopes: js.Any = js.undefined

  /**
    * <p>Parabolic SAR. This series requires <code>linkedTo</code>
    * option to be set and should be loaded
    * after <code>stock/indicators/indicators.js</code> file.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>psar</code> series are defined in
    * <a href="plotOptions.psar">plotOptions.psar</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.psar">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'psar'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/psar">Parabolic SAR Indicator</a>
    * @since 6.0.0
    */
  val psar: js.Any = js.undefined

  /**
    * <p>Rate of change indicator (ROC). The indicator value for each point
    * is defined as:</p>
    * <p><code>(C - Cn) / Cn * 100</code></p>
    * <p>where: <code>C</code> is the close value of the point of the same x in the
    * linked series and <code>Cn</code> is the close value of the point <code>n</code> periods
    * ago. <code>n</code> is set through <a href="#plotOptions.roc.params.period">period</a>.</p>
    * <p>This series requires <code>linkedTo</code> option to be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>roc</code> series are defined in
    * <a href="plotOptions.roc">plotOptions.roc</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.roc">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'roc'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/roc">Rate of change indicator</a>
    * @since 6.0.0
    */
  val roc: js.Any = js.undefined

  /**
    * <p>Relative strength index (RSI) technical indicator. This series
    * requires the <code>linkedTo</code> option to be set and should be loaded after
    * the <code>stock/indicators/indicators.js</code> file.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>rsi</code> series are defined in
    * <a href="plotOptions.rsi">plotOptions.rsi</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.rsi">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'rsi'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/rsi">RSI indicator</a>
    * @since 6.0.0
    */
  val rsi: js.Any = js.undefined

  /**
    * <p>Stochastic oscillator. This series requires the <code>linkedTo</code> option to be
    * set and should be loaded after the <code>stock/indicators/indicators.js</code> file.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>stochastic</code> series are defined in
    * <a href="plotOptions.stochastic">plotOptions.stochastic</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.stochastic">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'stochastic'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/stochastic">Stochastic oscillator</a>
    * @since 6.0.0
    */
  val stochastic: js.Any = js.undefined

  /**
    * <p>Volume By Price indicator.</p>
    * <p>This series requires <code>linkedTo</code> option to be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>vbp</code> series are defined in
    * <a href="plotOptions.vbp">plotOptions.vbp</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.vbp">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'vbp'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/volume-by-price">Volume By Price indicator</a>
    * @since 6.0.0
    */
  val vbp: js.Any = js.undefined

  /**
    * <p>Volume Weighted Average Price indicator.</p>
    * <p>This series requires <code>linkedTo</code> option to be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>vwap</code> series are defined in
    * <a href="plotOptions.vwap">plotOptions.vwap</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.vwap">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'vwap'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/vwap">Volume Weighted Average Price indicator</a>
    * @since 6.0.0
    */
  val vwap: js.Any = js.undefined

  /**
    * <p>Weighted moving average indicator (WMA). This series requires <code>linkedTo</code>
    * option to be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>wma</code> series are defined in
    * <a href="plotOptions.wma">plotOptions.wma</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.wma">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'wma'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/wma">Weighted moving average indicator</a>
    * @since 6.0.0
    */
  val wma: js.Any = js.undefined

  /**
    * <p>Zig Zag indicator.</p>
    * <p>This series requires <code>linkedTo</code> option to be set.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>zigzag</code> series are defined in
    * <a href="plotOptions.zigzag">plotOptions.zigzag</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.zigzag">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'zigzag'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/zigzag">Zig Zag indicator</a>
    * @since 6.0.0
    */
  val zigzag: js.Any = js.undefined

  /**
    * <p>A bell curve is an areaspline series which represents the probability density
    * function of the normal distribution. It calculates mean and standard
    * deviation of the base series data and plots the curve according to the
    * calculated parameters.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>bellcurve</code> series are defined in
    * <a href="plotOptions.bellcurve">plotOptions.bellcurve</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.bellcurve">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'bellcurve'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bellcurve/">Bell curve</a>
    * @since 6.0.0
    */
  val bellcurve: js.Any = js.undefined

  /**
    * <p>General options for all series types.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>line</code> series are defined in
    * <a href="plotOptions.line">plotOptions.line</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.line">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'line'
    *     }]
    * });
    * </pre>
    */
  val series: js.Any = js.undefined

  /**
    * <p>A bullet graph is a variation of a bar graph. The bullet graph features
    * a single measure, compares it to a target, and displays it in the context
    * of qualitative ranges of performance that could be set using
    * <a href="#yAxis.plotBands">plotBands</a> on <a href="#yAxis">yAxis</a>.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>bullet</code> series are defined in
    * <a href="plotOptions.bullet">plotOptions.bullet</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.bullet">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'bullet'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bullet-graph/">Bullet graph</a>
    * @since 6.0.0
    */
  val bullet: js.Any = js.undefined

  /**
    * <p>The column range is a cartesian series type with higher and lower
    * Y values along an X axis. Requires <code>highcharts-more.js</code>. To display
    * horizontal bars, set <a href="#chart.inverted">chart.inverted</a> to <code>true</code>.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>columnrange</code> series are defined in
    * <a href="plotOptions.columnrange">plotOptions.columnrange</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.columnrange">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'columnrange'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/columnrange/">Inverted column range</a>
    * @since 2.3.0
    */
  val columnrange: js.UndefOr[CleanJsObject[PlotOptionsColumnrange]] = js.undefined

  /**
    * <p>A box plot is a convenient way of depicting groups of data through their
    * five-number summaries: the smallest observation (sample minimum), lower
    * quartile (Q1), median (Q2), upper quartile (Q3), and largest observation
    * (sample maximum).</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>boxplot</code> series are defined in
    * <a href="plotOptions.boxplot">plotOptions.boxplot</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.boxplot">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'boxplot'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/box-plot/">Box plot</a>
    */
  val boxplot: js.Any = js.undefined

  /**
    * <p>An OHLC chart is a style of financial chart used to describe price
    * movements over time. It displays open, high, low and close values per data
    * point.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>ohlc</code> series are defined in
    * <a href="plotOptions.ohlc">plotOptions.ohlc</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.ohlc">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'ohlc'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/ohlc/">OHLC chart</a>
    */
  val ohlc: js.Any = js.undefined

  /**
    * <p>The area range series is a carteseian series with higher and lower values
    * for each point along an X axis, where the area between the values is shaded.
    * Requires <code>highcharts-more.js</code>.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>arearange</code> series are defined in
    * <a href="plotOptions.arearange">plotOptions.arearange</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.arearange">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'arearange'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/arearange/">Area range chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/arearange/">Area range chart</a>
    */
  val arearange: js.Any = js.undefined

  /**
    * <p>The X-range series displays ranges on the X axis, typically time intervals
    * with a start and end date.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>xrange</code> series are defined in
    * <a href="plotOptions.xrange">plotOptions.xrange</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.xrange">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'xrange'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/x-range/">X-range</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/x-range/">Styled mode X-range</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/inverted-xrange/">Inverted X-range</a>
    * @since 6.0.0
    */
  val xrange: js.Any = js.undefined

  /**
    * <p>A <code>gantt</code> series. If the <a href="#series.gantt.type">type</a> option is not specified,
    * it is inherited from <a href="#chart.type">chart.type</a>.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>gantt</code> series are defined in
    * <a href="plotOptions.gantt">plotOptions.gantt</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.gantt">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'gantt'
    *     }]
    * });
    * </pre>
    */
  val gantt: js.UndefOr[CleanJsObject[PlotOptionsGantt]] = js.undefined

  /**
    * <p>Funnel charts are a type of chart often used to visualize stages in a sales
    * project, where the top are the initial stages with the most clients.
    * It requires that the modules/funnel.js file is loaded.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>funnel</code> series are defined in
    * <a href="plotOptions.funnel">plotOptions.funnel</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.funnel">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'funnel'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/funnel/">Funnel demo</a>
    */
  val funnel: js.Any = js.undefined

  /**
    * <p>A pyramid series is a special type of funnel, without neck and reversed by
    * default.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>pyramid</code> series are defined in
    * <a href="plotOptions.pyramid">plotOptions.pyramid</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.pyramid">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'pyramid'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pyramid/">Pyramid chart</a>
    */
  val pyramid: js.Any = js.undefined

  /**
    * <p>A histogram is a column series which represents the distribution of the data
    * set in the base series. Histogram splits data into bins and shows their
    * frequencies.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>histogram</code> series are defined in
    * <a href="plotOptions.histogram">plotOptions.histogram</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.histogram">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'histogram'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/histogram/">Histogram</a>
    * @since 6.0.0
    */
  val histogram: js.Any = js.undefined

  /**
    * <p>A pareto diagram is a type of chart that contains both bars and a line graph,
    * where individual values are represented in descending order by bars,
    * and the cumulative total is represented by the line.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>pareto</code> series are defined in
    * <a href="plotOptions.pareto">plotOptions.pareto</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.pareto">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'pareto'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pareto/">Pareto diagram</a>
    * @since 6.0.0
    */
  val pareto: js.Any = js.undefined

  /**
    * <p>A sankey diagram is a type of flow diagram, in which the width of the
    * link between two nodes is shown proportionally to the flow quantity.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>sankey</code> series are defined in
    * <a href="plotOptions.sankey">plotOptions.sankey</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.sankey">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'sankey'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sankey-diagram/">Sankey diagram</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-inverted/">Inverted sankey diagram</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-outgoing">Sankey diagram with outgoing links</a>
    * @since 6.0.0
    */
  val sankey: js.Any = js.undefined

  /**
    * <p>A solid gauge is a circular gauge where the value is indicated by a filled
    * arc, and the color of the arc may variate with the value.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>solidgauge</code> series are defined in
    * <a href="plotOptions.solidgauge">plotOptions.solidgauge</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.solidgauge">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'solidgauge'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-solid/">Solid gauges</a>
    */
  val solidgauge: js.Any = js.undefined

  /**
    * <p>A streamgraph is a type of stacked area graph which is displaced around a
    * central axis, resulting in a flowing, organic shape.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>streamgraph</code> series are defined in
    * <a href="plotOptions.streamgraph">plotOptions.streamgraph</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.streamgraph">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'streamgraph'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/streamgraph/">Streamgraph</a>
    * @since 6.0.0
    */
  val streamgraph: js.Any = js.undefined

  /**
    * <p>A Sunburst displays hierarchical data, where a level in the hierarchy is
    * represented by a circle. The center represents the root node of the tree.
    * The visualization bears a resemblance to both treemap and pie charts.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>sunburst</code> series are defined in
    * <a href="plotOptions.sunburst">plotOptions.sunburst</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.sunburst">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'sunburst'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst">Sunburst chart</a>
    */
  val sunburst: js.Any = js.undefined

  /**
    * <p>A tilemap series is a type of heatmap where the tile shapes are configurable.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>tilemap</code> series are defined in
    * <a href="plotOptions.tilemap">plotOptions.tilemap</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.tilemap">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'tilemap'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/honeycomb-usa/">Honeycomb tilemap, USA</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/honeycomb-brazil/">Honeycomb tilemap, Brazil</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/honeycomb-china/">Honeycomb tilemap, China</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/honeycomb-europe/">Honeycomb tilemap, Europe</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/circlemap-africa/">Circlemap tilemap, Africa</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/diamondmap">Diamondmap tilemap</a>
    * @since 6.0.0
    */
  val tilemap: js.Any = js.undefined

  /**
    * <p>A treemap displays hierarchical data using nested rectangles. The data can be
    * laid out in varying ways depending on options.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>treemap</code> series are defined in
    * <a href="plotOptions.treemap">plotOptions.treemap</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.treemap">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'treemap'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/treemap-large-dataset/">Treemap</a>
    */
  val treemap: js.Any = js.undefined

  /**
    * <p>A variable pie series is a two dimensional series type, where each point
    * renders an Y and Z value.  Each point is drawn as a pie slice where the
    * size (arc) of the slice relates to the Y value and the radius of pie
    * slice relates to the Z value. Requires <code>highcharts-more.js</code>.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>variablepie</code> series are defined in
    * <a href="plotOptions.variablepie">plotOptions.variablepie</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.variablepie">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'variablepie'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/variable-radius-pie/">Variable-radius pie chart</a>
    * @since 6.0.0
    */
  val variablepie: js.Any = js.undefined

  /**
    * <p>A variwide chart (related to marimekko chart) is a column chart with a
    * variable width expressing a third dimension.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>variwide</code> series are defined in
    * <a href="plotOptions.variwide">plotOptions.variwide</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.variwide">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'variwide'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/variwide/">Variwide chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-variwide/inverted/">Inverted variwide chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-variwide/datetime/">Variwide columns on a datetime axis</a>
    * @since 6.0.0
    */
  val variwide: js.Any = js.undefined

  /**
    * <p>A vector plot is a type of cartesian chart where each point has an X and Y
    * position, a length and a direction. Vectors are drawn as arrows.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>vector</code> series are defined in
    * <a href="plotOptions.vector">plotOptions.vector</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.vector">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'vector'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/vector-plot/">Vector pot</a>
    * @since 6.0.0
    */
  val vector: js.Any = js.undefined

  /**
    * <p>Wind barbs are a convenient way to represent wind speed and direction in one
    * graphical form. Wind direction is given by the stem direction, and wind speed
    * by the number and shape of barbs.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>windbarb</code> series are defined in
    * <a href="plotOptions.windbarb">plotOptions.windbarb</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.windbarb">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'windbarb'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/windbarb-series/">Wind barb series</a>
    * @since 6.0.0
    */
  val windbarb: js.Any = js.undefined

  /**
    * <p>A word cloud is a visualization of a set of words, where the size and
    * placement of a word is determined by how it is weighted.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>wordcloud</code> series are defined in
    * <a href="plotOptions.wordcloud">plotOptions.wordcloud</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.wordcloud">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'wordcloud'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/wordcloud">Word Cloud chart</a>
    * @since 6.0.0
    */
  val wordcloud: js.Any = js.undefined

  /**
    * <p>The area series type.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>area</code> series are defined in
    * <a href="plotOptions.area">plotOptions.area</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.area">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'area'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/area-basic/">Area chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/area/">Area chart</a>
    */
  val area: js.Any = js.undefined

  /**
    * <p>The area spline series is an area series where the graph between the
    * points is smoothed into a spline.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>areaspline</code> series are defined in
    * <a href="plotOptions.areaspline">plotOptions.areaspline</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.areaspline">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'areaspline'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/areaspline/">Area spline chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/areaspline/">Area spline chart</a>
    */
  val areaspline: js.UndefOr[CleanJsObject[PlotOptionsAreaspline]] = js.undefined

  /**
    * <p>A bar series is a special type of column series where the columns are
    * horizontal.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>bar</code> series are defined in
    * <a href="plotOptions.bar">plotOptions.bar</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.bar">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'bar'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bar-basic/">Bar chart</a>
    */
  val bar: js.Any = js.undefined

  /**
    * <p>A candlestick chart is a style of financial chart used to describe price
    * movements over time.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>candlestick</code> series are defined in
    * <a href="plotOptions.candlestick">plotOptions.candlestick</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.candlestick">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'candlestick'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/candlestick/">Candlestick chart</a>
    */
  val candlestick: js.Any = js.undefined

  /**
    * <p>Column series display one column per value along an X axis.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>column</code> series are defined in
    * <a href="plotOptions.column">plotOptions.column</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.column">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'column'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/column-basic/">Column chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/column/">Column chart</a>
    */
  val column: js.Any = js.undefined

  /**
    * <p>Flags are used to mark events in stock charts. They can be added on the
    * timeline, or attached to a specific series.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>flags</code> series are defined in
    * <a href="plotOptions.flags">plotOptions.flags</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.flags">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'flags'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/flags-general/">Flags on a line series</a>
    */
  val flags: js.Any = js.undefined

  /**
    * <p>A pie chart is a circular graphic which is divided into slices to illustrate
    * numerical proportion.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>pie</code> series are defined in
    * <a href="plotOptions.pie">plotOptions.pie</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.pie">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'pie'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-basic/">Pie chart</a>
    */
  val pie: js.Any = js.undefined

  /**
    * <p>A scatter plot uses cartesian coordinates to display values for two
    * variables for a set of data.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>scatter</code> series are defined in
    * <a href="plotOptions.scatter">plotOptions.scatter</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.scatter">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'scatter'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/scatter/">Scatter plot</a>
    */
  val scatter: js.Any = js.undefined

  /**
    * <p>A line series displays information as a series of data points connected by
    * straight line segments.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>line</code> series are defined in
    * <a href="plotOptions.line">plotOptions.line</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.line">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'line'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/line-basic/">Line chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/basic-line/">Line chart</a>
    */
  val line: js.Any = js.undefined

  /**
    * <p>A spline series is a special type of line series, where the segments
    * between the data points are smoothed.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>spline</code> series are defined in
    * <a href="plotOptions.spline">plotOptions.spline</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.spline">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'spline'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/spline-irregular-time/">Spline chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/spline/">Spline chart</a>
    */
  val spline: js.UndefOr[CleanJsObject[PlotOptionsSpline]] = js.undefined

  /**
    * <p>A 3D scatter plot uses x, y and z coordinates to display values for three
    * variables for a set of data.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>scatter3d</code> series are defined in
    * <a href="plotOptions.scatter3d">plotOptions.scatter3d</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.scatter3d">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'scatter3d'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter/">Simple 3D scatter</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/3d-scatter-draggable">Draggable 3d scatter</a>
    */
  val scatter3d: js.Any = js.undefined

  /**
    * <p>The area spline range is a cartesian series type with higher and
    * lower Y values along an X axis. The area inside the range is colored, and
    * the graph outlining the area is a smoothed spline. Requires
    * <code>highcharts-more.js</code>.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>areasplinerange</code> series are defined in
    * <a href="plotOptions.areasplinerange">plotOptions.areasplinerange</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.areasplinerange">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'areasplinerange'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/areasplinerange/">Area spline range</a>
    * @since 2.3.0
    */
  val areasplinerange: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerange]] = js.undefined

  /**
    * <p>A bubble series is a three dimensional series type where each point renders
    * an X, Y and Z value. Each points is drawn as a bubble where the position
    * along the X and Y axes mark the X and Y values, and the size of the bubble
    * relates to the Z value. Requires <code>highcharts-more.js</code>.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>bubble</code> series are defined in
    * <a href="plotOptions.bubble">plotOptions.bubble</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.bubble">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'bubble'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bubble/">Bubble chart</a>
    */
  val bubble: js.Any = js.undefined

  /**
    * <p>Error bars are a graphical representation of the variability of data and are
    * used on graphs to indicate the error, or uncertainty in a reported
    * measurement.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>errorbar</code> series are defined in
    * <a href="plotOptions.errorbar">plotOptions.errorbar</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.errorbar">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'errorbar'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/error-bar/">Error bars on a column series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-errorbar/on-scatter/">Error bars on a scatter series</a>
    */
  val errorbar: js.Any = js.undefined

  /**
    * <p>Gauges are circular plots displaying one or more values with a dial pointing
    * to values along the perimeter.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>gauge</code> series are defined in
    * <a href="plotOptions.gauge">plotOptions.gauge</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.gauge">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'gauge'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-speedometer/">Gauge chart</a>
    */
  val gauge: js.Any = js.undefined

  /**
    * <p>A polygon series can be used to draw any freeform shape in the cartesian
    * coordinate system. A fill is applied with the <code>color</code> option, and
    * stroke is applied through <code>lineWidth</code> and <code>lineColor</code> options. Requires
    * the <code>highcharts-more.js</code> file.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>polygon</code> series are defined in
    * <a href="plotOptions.polygon">plotOptions.polygon</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.polygon">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'polygon'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polygon/">Polygon</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polygon/">Polygon</a>
    * @since 4.1.0
    */
  val polygon: js.UndefOr[CleanJsObject[PlotOptionsPolygon]] = js.undefined

  /**
    * <p>A waterfall chart displays sequentially introduced positive or negative
    * values in cumulative columns.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>waterfall</code> series are defined in
    * <a href="plotOptions.waterfall">plotOptions.waterfall</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.waterfall">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'waterfall'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/waterfall/">Waterfall chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/waterfall-inverted/">Horizontal (inverted) waterfall</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/waterfall-stacked/">Stacked waterfall chart</a>
    */
  val waterfall: js.Any = js.undefined

  /**
    * <p>A heatmap is a graphical representation of data where the individual values
    * contained in a matrix are represented as colors.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>heatmap</code> series are defined in
    * <a href="plotOptions.heatmap">plotOptions.heatmap</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.heatmap">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'heatmap'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/heatmap/">Simple heatmap</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/heatmap-canvas/">Heavy heatmap</a>
    */
  val heatmap: js.Any = js.undefined

  /**
    * <p>A map bubble series is a bubble series laid out on top of a map series,
    * where each bubble is tied to a specific map area.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>mapbubble</code> series are defined in
    * <a href="plotOptions.mapbubble">plotOptions.mapbubble</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.mapbubble">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'mapbubble'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/map-bubble/">Map bubble chart</a>
    */
  val mapbubble: js.Any = js.undefined

  /**
    * <p>A mapline series is a special case of the map series where the value colors
    * are applied to the strokes rather than the fills. It can also be used for
    * freeform drawing, like dividers, in the map.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>mapline</code> series are defined in
    * <a href="plotOptions.mapline">plotOptions.mapline</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.mapline">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'mapline'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/mapline-mappoint/">Mapline and map-point chart</a>
    */
  val mapline: js.Any = js.undefined

  /**
    * <p>A mappoint series is a special form of scatter series where the points can
    * be laid out in map coordinates on top of a map.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>mappoint</code> series are defined in
    * <a href="plotOptions.mappoint">plotOptions.mappoint</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.mappoint">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'mappoint'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/mapline-mappoint/">Map-line and map-point series.</a>
    */
  val mappoint: js.Any = js.undefined

  /**
    * <p>The map series is used for basic choropleth maps, where each map area has a
    * color based on its value.</p>
    * <p>Configuration options for the series are given in three levels:</p>
    * <ol>
    * <li>Options for all series in a chart are defined in the
    * <a href="plotOptions.series">plotOptions.series</a> object.</li>
    * <li>Options for all <code>map</code> series are defined in
    * <a href="plotOptions.map">plotOptions.map</a>.</li>
    * <li>Options for one single series are given in
    * <a href="series.map">the series instance array</a>.</li>
    * </ol>
    * <pre>
    * Highcharts.chart('container', {
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
    *         type: 'map'
    *     }]
    * });
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/all-maps/">Choropleth map</a>
    */
  val map: js.Any = js.undefined
}

object PlotOptions {
  /**
    * @param ad <p>Accumulation Distribution (AD). This series requires <code>linkedTo</code> option to. be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>ad</code> series are defined in. <a href="plotOptions.ad">plotOptions.ad</a>.</li>. <li>Options for one single series are given in. <a href="series.ad">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         ad: {.             // shared options for all ad series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'ad'.     }]. });. </pre>
    * @param atr <p>Average true range indicator (ATR). This series requires <code>linkedTo</code>. option to be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>atr</code> series are defined in. <a href="plotOptions.atr">plotOptions.atr</a>.</li>. <li>Options for one single series are given in. <a href="series.atr">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         atr: {.             // shared options for all atr series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'atr'.     }]. });. </pre>
    * @param bb <p>Bollinger bands (BB). This series requires the <code>linkedTo</code> option to be. set and should be loaded after the <code>stock/indicators/indicators.js</code> file.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>bb</code> series are defined in. <a href="plotOptions.bb">plotOptions.bb</a>.</li>. <li>Options for one single series are given in. <a href="series.bb">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         bb: {.             // shared options for all bb series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'bb'.     }]. });. </pre>
    * @param cci <p>Commodity Channel Index (CCI). This series requires <code>linkedTo</code> option to. be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>cci</code> series are defined in. <a href="plotOptions.cci">plotOptions.cci</a>.</li>. <li>Options for one single series are given in. <a href="series.cci">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         cci: {.             // shared options for all cci series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'cci'.     }]. });. </pre>
    * @param cmf <p>Chaikin Money Flow indicator (cmf).</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>cmf</code> series are defined in. <a href="plotOptions.cmf">plotOptions.cmf</a>.</li>. <li>Options for one single series are given in. <a href="series.cmf">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         cmf: {.             // shared options for all cmf series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'cmf'.     }]. });. </pre>
    * @param ema <p>Exponential moving average indicator (EMA). This series requires the. <code>linkedTo</code> option to be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>ema</code> series are defined in. <a href="plotOptions.ema">plotOptions.ema</a>.</li>. <li>Options for one single series are given in. <a href="series.ema">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         ema: {.             // shared options for all ema series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'ema'.     }]. });. </pre>
    * @param ikh <p>Ichimoku Kinko Hyo (IKH). This series requires <code>linkedTo</code> option to be. set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>ikh</code> series are defined in. <a href="plotOptions.ikh">plotOptions.ikh</a>.</li>. <li>Options for one single series are given in. <a href="series.ikh">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         ikh: {.             // shared options for all ikh series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'ikh'.     }]. });. </pre>
    * @param sma <p>Simple moving average indicator (SMA). This series requires <code>linkedTo</code>. option to be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>sma</code> series are defined in. <a href="plotOptions.sma">plotOptions.sma</a>.</li>. <li>Options for one single series are given in. <a href="series.sma">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         sma: {.             // shared options for all sma series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'sma'.     }]. });. </pre>
    * @param macd <p>Moving Average Convergence Divergence (MACD). This series requires. <code>linkedTo</code> option to be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>macd</code> series are defined in. <a href="plotOptions.macd">plotOptions.macd</a>.</li>. <li>Options for one single series are given in. <a href="series.macd">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         macd: {.             // shared options for all macd series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'macd'.     }]. });. </pre>
    * @param mfi <p>Money Flow Index. This series requires <code>linkedTo</code> option to be set and. should be loaded after the <code>stock/indicators/indicators.js</code> file.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>mfi</code> series are defined in. <a href="plotOptions.mfi">plotOptions.mfi</a>.</li>. <li>Options for one single series are given in. <a href="series.mfi">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         mfi: {.             // shared options for all mfi series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'mfi'.     }]. });. </pre>
    * @param momentum <p>Momentum. This series requires <code>linkedTo</code> option to be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>momentum</code> series are defined in. <a href="plotOptions.momentum">plotOptions.momentum</a>.</li>. <li>Options for one single series are given in. <a href="series.momentum">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         momentum: {.             // shared options for all momentum series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'momentum'.     }]. });. </pre>
    * @param pivotpoints <p>Pivot points indicator. This series requires the <code>linkedTo</code> option to be. set and should be loaded after <code>stock/indicators/indicators.js</code> file.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>pivotpoints</code> series are defined in. <a href="plotOptions.pivotpoints">plotOptions.pivotpoints</a>.</li>. <li>Options for one single series are given in. <a href="series.pivotpoints">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         pivotpoints: {.             // shared options for all pivotpoints series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'pivotpoints'.     }]. });. </pre>
    * @param priceenvelopes <p>Price envelopes indicator based on <a href="#plotOptions.sma">SMA</a> calculations.. This series requires the <code>linkedTo</code> option to be set and should be loaded. after the <code>stock/indicators/indicators.js</code> file.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>priceenvelopes</code> series are defined in. <a href="plotOptions.priceenvelopes">plotOptions.priceenvelopes</a>.</li>. <li>Options for one single series are given in. <a href="series.priceenvelopes">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         priceenvelopes: {.             // shared options for all priceenvelopes series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'priceenvelopes'.     }]. });. </pre>
    * @param psar <p>Parabolic SAR. This series requires <code>linkedTo</code>. option to be set and should be loaded. after <code>stock/indicators/indicators.js</code> file.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>psar</code> series are defined in. <a href="plotOptions.psar">plotOptions.psar</a>.</li>. <li>Options for one single series are given in. <a href="series.psar">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         psar: {.             // shared options for all psar series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'psar'.     }]. });. </pre>
    * @param roc <p>Rate of change indicator (ROC). The indicator value for each point. is defined as:</p>. <p><code>(C - Cn) / Cn * 100</code></p>. <p>where: <code>C</code> is the close value of the point of the same x in the. linked series and <code>Cn</code> is the close value of the point <code>n</code> periods. ago. <code>n</code> is set through <a href="#plotOptions.roc.params.period">period</a>.</p>. <p>This series requires <code>linkedTo</code> option to be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>roc</code> series are defined in. <a href="plotOptions.roc">plotOptions.roc</a>.</li>. <li>Options for one single series are given in. <a href="series.roc">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         roc: {.             // shared options for all roc series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'roc'.     }]. });. </pre>
    * @param rsi <p>Relative strength index (RSI) technical indicator. This series. requires the <code>linkedTo</code> option to be set and should be loaded after. the <code>stock/indicators/indicators.js</code> file.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>rsi</code> series are defined in. <a href="plotOptions.rsi">plotOptions.rsi</a>.</li>. <li>Options for one single series are given in. <a href="series.rsi">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         rsi: {.             // shared options for all rsi series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'rsi'.     }]. });. </pre>
    * @param stochastic <p>Stochastic oscillator. This series requires the <code>linkedTo</code> option to be. set and should be loaded after the <code>stock/indicators/indicators.js</code> file.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>stochastic</code> series are defined in. <a href="plotOptions.stochastic">plotOptions.stochastic</a>.</li>. <li>Options for one single series are given in. <a href="series.stochastic">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         stochastic: {.             // shared options for all stochastic series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'stochastic'.     }]. });. </pre>
    * @param vbp <p>Volume By Price indicator.</p>. <p>This series requires <code>linkedTo</code> option to be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>vbp</code> series are defined in. <a href="plotOptions.vbp">plotOptions.vbp</a>.</li>. <li>Options for one single series are given in. <a href="series.vbp">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         vbp: {.             // shared options for all vbp series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'vbp'.     }]. });. </pre>
    * @param vwap <p>Volume Weighted Average Price indicator.</p>. <p>This series requires <code>linkedTo</code> option to be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>vwap</code> series are defined in. <a href="plotOptions.vwap">plotOptions.vwap</a>.</li>. <li>Options for one single series are given in. <a href="series.vwap">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         vwap: {.             // shared options for all vwap series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'vwap'.     }]. });. </pre>
    * @param wma <p>Weighted moving average indicator (WMA). This series requires <code>linkedTo</code>. option to be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>wma</code> series are defined in. <a href="plotOptions.wma">plotOptions.wma</a>.</li>. <li>Options for one single series are given in. <a href="series.wma">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         wma: {.             // shared options for all wma series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'wma'.     }]. });. </pre>
    * @param zigzag <p>Zig Zag indicator.</p>. <p>This series requires <code>linkedTo</code> option to be set.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>zigzag</code> series are defined in. <a href="plotOptions.zigzag">plotOptions.zigzag</a>.</li>. <li>Options for one single series are given in. <a href="series.zigzag">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         zigzag: {.             // shared options for all zigzag series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'zigzag'.     }]. });. </pre>
    * @param bellcurve <p>A bell curve is an areaspline series which represents the probability density. function of the normal distribution. It calculates mean and standard. deviation of the base series data and plots the curve according to the. calculated parameters.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>bellcurve</code> series are defined in. <a href="plotOptions.bellcurve">plotOptions.bellcurve</a>.</li>. <li>Options for one single series are given in. <a href="series.bellcurve">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         bellcurve: {.             // shared options for all bellcurve series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'bellcurve'.     }]. });. </pre>
    * @param series <p>General options for all series types.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>line</code> series are defined in. <a href="plotOptions.line">plotOptions.line</a>.</li>. <li>Options for one single series are given in. <a href="series.line">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         line: {.             // shared options for all line series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'line'.     }]. });. </pre>
    * @param bullet <p>A bullet graph is a variation of a bar graph. The bullet graph features. a single measure, compares it to a target, and displays it in the context. of qualitative ranges of performance that could be set using. <a href="#yAxis.plotBands">plotBands</a> on <a href="#yAxis">yAxis</a>.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>bullet</code> series are defined in. <a href="plotOptions.bullet">plotOptions.bullet</a>.</li>. <li>Options for one single series are given in. <a href="series.bullet">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         bullet: {.             // shared options for all bullet series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'bullet'.     }]. });. </pre>
    * @param columnrange <p>The column range is a cartesian series type with higher and lower. Y values along an X axis. Requires <code>highcharts-more.js</code>. To display. horizontal bars, set <a href="#chart.inverted">chart.inverted</a> to <code>true</code>.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>columnrange</code> series are defined in. <a href="plotOptions.columnrange">plotOptions.columnrange</a>.</li>. <li>Options for one single series are given in. <a href="series.columnrange">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         columnrange: {.             // shared options for all columnrange series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'columnrange'.     }]. });. </pre>
    * @param boxplot <p>A box plot is a convenient way of depicting groups of data through their. five-number summaries: the smallest observation (sample minimum), lower. quartile (Q1), median (Q2), upper quartile (Q3), and largest observation. (sample maximum).</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>boxplot</code> series are defined in. <a href="plotOptions.boxplot">plotOptions.boxplot</a>.</li>. <li>Options for one single series are given in. <a href="series.boxplot">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         boxplot: {.             // shared options for all boxplot series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'boxplot'.     }]. });. </pre>
    * @param ohlc <p>An OHLC chart is a style of financial chart used to describe price. movements over time. It displays open, high, low and close values per data. point.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>ohlc</code> series are defined in. <a href="plotOptions.ohlc">plotOptions.ohlc</a>.</li>. <li>Options for one single series are given in. <a href="series.ohlc">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         ohlc: {.             // shared options for all ohlc series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'ohlc'.     }]. });. </pre>
    * @param arearange <p>The area range series is a carteseian series with higher and lower values. for each point along an X axis, where the area between the values is shaded.. Requires <code>highcharts-more.js</code>.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>arearange</code> series are defined in. <a href="plotOptions.arearange">plotOptions.arearange</a>.</li>. <li>Options for one single series are given in. <a href="series.arearange">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         arearange: {.             // shared options for all arearange series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'arearange'.     }]. });. </pre>
    * @param xrange <p>The X-range series displays ranges on the X axis, typically time intervals. with a start and end date.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>xrange</code> series are defined in. <a href="plotOptions.xrange">plotOptions.xrange</a>.</li>. <li>Options for one single series are given in. <a href="series.xrange">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         xrange: {.             // shared options for all xrange series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'xrange'.     }]. });. </pre>
    * @param gantt <p>A <code>gantt</code> series. If the <a href="#series.gantt.type">type</a> option is not specified,. it is inherited from <a href="#chart.type">chart.type</a>.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>gantt</code> series are defined in. <a href="plotOptions.gantt">plotOptions.gantt</a>.</li>. <li>Options for one single series are given in. <a href="series.gantt">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         gantt: {.             // shared options for all gantt series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'gantt'.     }]. });. </pre>
    * @param funnel <p>Funnel charts are a type of chart often used to visualize stages in a sales. project, where the top are the initial stages with the most clients.. It requires that the modules/funnel.js file is loaded.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>funnel</code> series are defined in. <a href="plotOptions.funnel">plotOptions.funnel</a>.</li>. <li>Options for one single series are given in. <a href="series.funnel">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         funnel: {.             // shared options for all funnel series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'funnel'.     }]. });. </pre>
    * @param pyramid <p>A pyramid series is a special type of funnel, without neck and reversed by. default.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>pyramid</code> series are defined in. <a href="plotOptions.pyramid">plotOptions.pyramid</a>.</li>. <li>Options for one single series are given in. <a href="series.pyramid">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         pyramid: {.             // shared options for all pyramid series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'pyramid'.     }]. });. </pre>
    * @param histogram <p>A histogram is a column series which represents the distribution of the data. set in the base series. Histogram splits data into bins and shows their. frequencies.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>histogram</code> series are defined in. <a href="plotOptions.histogram">plotOptions.histogram</a>.</li>. <li>Options for one single series are given in. <a href="series.histogram">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         histogram: {.             // shared options for all histogram series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'histogram'.     }]. });. </pre>
    * @param pareto <p>A pareto diagram is a type of chart that contains both bars and a line graph,. where individual values are represented in descending order by bars,. and the cumulative total is represented by the line.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>pareto</code> series are defined in. <a href="plotOptions.pareto">plotOptions.pareto</a>.</li>. <li>Options for one single series are given in. <a href="series.pareto">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         pareto: {.             // shared options for all pareto series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'pareto'.     }]. });. </pre>
    * @param sankey <p>A sankey diagram is a type of flow diagram, in which the width of the. link between two nodes is shown proportionally to the flow quantity.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>sankey</code> series are defined in. <a href="plotOptions.sankey">plotOptions.sankey</a>.</li>. <li>Options for one single series are given in. <a href="series.sankey">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         sankey: {.             // shared options for all sankey series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'sankey'.     }]. });. </pre>
    * @param solidgauge <p>A solid gauge is a circular gauge where the value is indicated by a filled. arc, and the color of the arc may variate with the value.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>solidgauge</code> series are defined in. <a href="plotOptions.solidgauge">plotOptions.solidgauge</a>.</li>. <li>Options for one single series are given in. <a href="series.solidgauge">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         solidgauge: {.             // shared options for all solidgauge series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'solidgauge'.     }]. });. </pre>
    * @param streamgraph <p>A streamgraph is a type of stacked area graph which is displaced around a. central axis, resulting in a flowing, organic shape.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>streamgraph</code> series are defined in. <a href="plotOptions.streamgraph">plotOptions.streamgraph</a>.</li>. <li>Options for one single series are given in. <a href="series.streamgraph">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         streamgraph: {.             // shared options for all streamgraph series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'streamgraph'.     }]. });. </pre>
    * @param sunburst <p>A Sunburst displays hierarchical data, where a level in the hierarchy is. represented by a circle. The center represents the root node of the tree.. The visualization bears a resemblance to both treemap and pie charts.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>sunburst</code> series are defined in. <a href="plotOptions.sunburst">plotOptions.sunburst</a>.</li>. <li>Options for one single series are given in. <a href="series.sunburst">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         sunburst: {.             // shared options for all sunburst series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'sunburst'.     }]. });. </pre>
    * @param tilemap <p>A tilemap series is a type of heatmap where the tile shapes are configurable.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>tilemap</code> series are defined in. <a href="plotOptions.tilemap">plotOptions.tilemap</a>.</li>. <li>Options for one single series are given in. <a href="series.tilemap">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         tilemap: {.             // shared options for all tilemap series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'tilemap'.     }]. });. </pre>
    * @param treemap <p>A treemap displays hierarchical data using nested rectangles. The data can be. laid out in varying ways depending on options.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>treemap</code> series are defined in. <a href="plotOptions.treemap">plotOptions.treemap</a>.</li>. <li>Options for one single series are given in. <a href="series.treemap">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         treemap: {.             // shared options for all treemap series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'treemap'.     }]. });. </pre>
    * @param variablepie <p>A variable pie series is a two dimensional series type, where each point. renders an Y and Z value.  Each point is drawn as a pie slice where the. size (arc) of the slice relates to the Y value and the radius of pie. slice relates to the Z value. Requires <code>highcharts-more.js</code>.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>variablepie</code> series are defined in. <a href="plotOptions.variablepie">plotOptions.variablepie</a>.</li>. <li>Options for one single series are given in. <a href="series.variablepie">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         variablepie: {.             // shared options for all variablepie series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'variablepie'.     }]. });. </pre>
    * @param variwide <p>A variwide chart (related to marimekko chart) is a column chart with a. variable width expressing a third dimension.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>variwide</code> series are defined in. <a href="plotOptions.variwide">plotOptions.variwide</a>.</li>. <li>Options for one single series are given in. <a href="series.variwide">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         variwide: {.             // shared options for all variwide series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'variwide'.     }]. });. </pre>
    * @param vector <p>A vector plot is a type of cartesian chart where each point has an X and Y. position, a length and a direction. Vectors are drawn as arrows.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>vector</code> series are defined in. <a href="plotOptions.vector">plotOptions.vector</a>.</li>. <li>Options for one single series are given in. <a href="series.vector">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         vector: {.             // shared options for all vector series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'vector'.     }]. });. </pre>
    * @param windbarb <p>Wind barbs are a convenient way to represent wind speed and direction in one. graphical form. Wind direction is given by the stem direction, and wind speed. by the number and shape of barbs.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>windbarb</code> series are defined in. <a href="plotOptions.windbarb">plotOptions.windbarb</a>.</li>. <li>Options for one single series are given in. <a href="series.windbarb">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         windbarb: {.             // shared options for all windbarb series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'windbarb'.     }]. });. </pre>
    * @param wordcloud <p>A word cloud is a visualization of a set of words, where the size and. placement of a word is determined by how it is weighted.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>wordcloud</code> series are defined in. <a href="plotOptions.wordcloud">plotOptions.wordcloud</a>.</li>. <li>Options for one single series are given in. <a href="series.wordcloud">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         wordcloud: {.             // shared options for all wordcloud series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'wordcloud'.     }]. });. </pre>
    * @param area <p>The area series type.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>area</code> series are defined in. <a href="plotOptions.area">plotOptions.area</a>.</li>. <li>Options for one single series are given in. <a href="series.area">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         area: {.             // shared options for all area series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'area'.     }]. });. </pre>
    * @param areaspline <p>The area spline series is an area series where the graph between the. points is smoothed into a spline.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>areaspline</code> series are defined in. <a href="plotOptions.areaspline">plotOptions.areaspline</a>.</li>. <li>Options for one single series are given in. <a href="series.areaspline">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         areaspline: {.             // shared options for all areaspline series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'areaspline'.     }]. });. </pre>
    * @param bar <p>A bar series is a special type of column series where the columns are. horizontal.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>bar</code> series are defined in. <a href="plotOptions.bar">plotOptions.bar</a>.</li>. <li>Options for one single series are given in. <a href="series.bar">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         bar: {.             // shared options for all bar series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'bar'.     }]. });. </pre>
    * @param candlestick <p>A candlestick chart is a style of financial chart used to describe price. movements over time.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>candlestick</code> series are defined in. <a href="plotOptions.candlestick">plotOptions.candlestick</a>.</li>. <li>Options for one single series are given in. <a href="series.candlestick">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         candlestick: {.             // shared options for all candlestick series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'candlestick'.     }]. });. </pre>
    * @param column <p>Column series display one column per value along an X axis.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>column</code> series are defined in. <a href="plotOptions.column">plotOptions.column</a>.</li>. <li>Options for one single series are given in. <a href="series.column">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         column: {.             // shared options for all column series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'column'.     }]. });. </pre>
    * @param flags <p>Flags are used to mark events in stock charts. They can be added on the. timeline, or attached to a specific series.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>flags</code> series are defined in. <a href="plotOptions.flags">plotOptions.flags</a>.</li>. <li>Options for one single series are given in. <a href="series.flags">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         flags: {.             // shared options for all flags series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'flags'.     }]. });. </pre>
    * @param pie <p>A pie chart is a circular graphic which is divided into slices to illustrate. numerical proportion.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>pie</code> series are defined in. <a href="plotOptions.pie">plotOptions.pie</a>.</li>. <li>Options for one single series are given in. <a href="series.pie">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         pie: {.             // shared options for all pie series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'pie'.     }]. });. </pre>
    * @param scatter <p>A scatter plot uses cartesian coordinates to display values for two. variables for a set of data.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>scatter</code> series are defined in. <a href="plotOptions.scatter">plotOptions.scatter</a>.</li>. <li>Options for one single series are given in. <a href="series.scatter">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         scatter: {.             // shared options for all scatter series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'scatter'.     }]. });. </pre>
    * @param line <p>A line series displays information as a series of data points connected by. straight line segments.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>line</code> series are defined in. <a href="plotOptions.line">plotOptions.line</a>.</li>. <li>Options for one single series are given in. <a href="series.line">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         line: {.             // shared options for all line series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'line'.     }]. });. </pre>
    * @param spline <p>A spline series is a special type of line series, where the segments. between the data points are smoothed.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>spline</code> series are defined in. <a href="plotOptions.spline">plotOptions.spline</a>.</li>. <li>Options for one single series are given in. <a href="series.spline">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         spline: {.             // shared options for all spline series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'spline'.     }]. });. </pre>
    * @param scatter3d <p>A 3D scatter plot uses x, y and z coordinates to display values for three. variables for a set of data.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>scatter3d</code> series are defined in. <a href="plotOptions.scatter3d">plotOptions.scatter3d</a>.</li>. <li>Options for one single series are given in. <a href="series.scatter3d">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         scatter3d: {.             // shared options for all scatter3d series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'scatter3d'.     }]. });. </pre>
    * @param areasplinerange <p>The area spline range is a cartesian series type with higher and. lower Y values along an X axis. The area inside the range is colored, and. the graph outlining the area is a smoothed spline. Requires. <code>highcharts-more.js</code>.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>areasplinerange</code> series are defined in. <a href="plotOptions.areasplinerange">plotOptions.areasplinerange</a>.</li>. <li>Options for one single series are given in. <a href="series.areasplinerange">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         areasplinerange: {.             // shared options for all areasplinerange series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'areasplinerange'.     }]. });. </pre>
    * @param bubble <p>A bubble series is a three dimensional series type where each point renders. an X, Y and Z value. Each points is drawn as a bubble where the position. along the X and Y axes mark the X and Y values, and the size of the bubble. relates to the Z value. Requires <code>highcharts-more.js</code>.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>bubble</code> series are defined in. <a href="plotOptions.bubble">plotOptions.bubble</a>.</li>. <li>Options for one single series are given in. <a href="series.bubble">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         bubble: {.             // shared options for all bubble series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'bubble'.     }]. });. </pre>
    * @param errorbar <p>Error bars are a graphical representation of the variability of data and are. used on graphs to indicate the error, or uncertainty in a reported. measurement.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>errorbar</code> series are defined in. <a href="plotOptions.errorbar">plotOptions.errorbar</a>.</li>. <li>Options for one single series are given in. <a href="series.errorbar">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         errorbar: {.             // shared options for all errorbar series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'errorbar'.     }]. });. </pre>
    * @param gauge <p>Gauges are circular plots displaying one or more values with a dial pointing. to values along the perimeter.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>gauge</code> series are defined in. <a href="plotOptions.gauge">plotOptions.gauge</a>.</li>. <li>Options for one single series are given in. <a href="series.gauge">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         gauge: {.             // shared options for all gauge series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'gauge'.     }]. });. </pre>
    * @param polygon <p>A polygon series can be used to draw any freeform shape in the cartesian. coordinate system. A fill is applied with the <code>color</code> option, and. stroke is applied through <code>lineWidth</code> and <code>lineColor</code> options. Requires. the <code>highcharts-more.js</code> file.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>polygon</code> series are defined in. <a href="plotOptions.polygon">plotOptions.polygon</a>.</li>. <li>Options for one single series are given in. <a href="series.polygon">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         polygon: {.             // shared options for all polygon series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'polygon'.     }]. });. </pre>
    * @param waterfall <p>A waterfall chart displays sequentially introduced positive or negative. values in cumulative columns.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>waterfall</code> series are defined in. <a href="plotOptions.waterfall">plotOptions.waterfall</a>.</li>. <li>Options for one single series are given in. <a href="series.waterfall">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         waterfall: {.             // shared options for all waterfall series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'waterfall'.     }]. });. </pre>
    * @param heatmap <p>A heatmap is a graphical representation of data where the individual values. contained in a matrix are represented as colors.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>heatmap</code> series are defined in. <a href="plotOptions.heatmap">plotOptions.heatmap</a>.</li>. <li>Options for one single series are given in. <a href="series.heatmap">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         heatmap: {.             // shared options for all heatmap series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'heatmap'.     }]. });. </pre>
    * @param mapbubble <p>A map bubble series is a bubble series laid out on top of a map series,. where each bubble is tied to a specific map area.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>mapbubble</code> series are defined in. <a href="plotOptions.mapbubble">plotOptions.mapbubble</a>.</li>. <li>Options for one single series are given in. <a href="series.mapbubble">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         mapbubble: {.             // shared options for all mapbubble series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'mapbubble'.     }]. });. </pre>
    * @param mapline <p>A mapline series is a special case of the map series where the value colors. are applied to the strokes rather than the fills. It can also be used for. freeform drawing, like dividers, in the map.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>mapline</code> series are defined in. <a href="plotOptions.mapline">plotOptions.mapline</a>.</li>. <li>Options for one single series are given in. <a href="series.mapline">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         mapline: {.             // shared options for all mapline series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'mapline'.     }]. });. </pre>
    * @param mappoint <p>A mappoint series is a special form of scatter series where the points can. be laid out in map coordinates on top of a map.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>mappoint</code> series are defined in. <a href="plotOptions.mappoint">plotOptions.mappoint</a>.</li>. <li>Options for one single series are given in. <a href="series.mappoint">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         mappoint: {.             // shared options for all mappoint series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'mappoint'.     }]. });. </pre>
    * @param map <p>The map series is used for basic choropleth maps, where each map area has a. color based on its value.</p>. <p>Configuration options for the series are given in three levels:</p>. <ol>. <li>Options for all series in a chart are defined in the. <a href="plotOptions.series">plotOptions.series</a> object.</li>. <li>Options for all <code>map</code> series are defined in. <a href="plotOptions.map">plotOptions.map</a>.</li>. <li>Options for one single series are given in. <a href="series.map">the series instance array</a>.</li>. </ol>. <pre>. Highcharts.chart('container', {.     plotOptions: {.         series: {.             // general options for all series.         },.         map: {.             // shared options for all map series.         }.     },.     series: [{.         // specific options for this series instance.         type: 'map'.     }]. });. </pre>
    */
  def apply(ad: js.UndefOr[js.Any] = js.undefined, atr: js.UndefOr[js.Any] = js.undefined, bb: js.UndefOr[js.Any] = js.undefined, cci: js.UndefOr[js.Any] = js.undefined, cmf: js.UndefOr[CleanJsObject[PlotOptionsCmf]] = js.undefined, ema: js.UndefOr[js.Any] = js.undefined, ikh: js.UndefOr[js.Any] = js.undefined, sma: js.UndefOr[js.Any] = js.undefined, macd: js.UndefOr[js.Any] = js.undefined, mfi: js.UndefOr[js.Any] = js.undefined, momentum: js.UndefOr[js.Any] = js.undefined, pivotpoints: js.UndefOr[js.Any] = js.undefined, priceenvelopes: js.UndefOr[js.Any] = js.undefined, psar: js.UndefOr[js.Any] = js.undefined, roc: js.UndefOr[js.Any] = js.undefined, rsi: js.UndefOr[js.Any] = js.undefined, stochastic: js.UndefOr[js.Any] = js.undefined, vbp: js.UndefOr[js.Any] = js.undefined, vwap: js.UndefOr[js.Any] = js.undefined, wma: js.UndefOr[js.Any] = js.undefined, zigzag: js.UndefOr[js.Any] = js.undefined, bellcurve: js.UndefOr[js.Any] = js.undefined, series: js.UndefOr[js.Any] = js.undefined, bullet: js.UndefOr[js.Any] = js.undefined, columnrange: js.UndefOr[CleanJsObject[PlotOptionsColumnrange]] = js.undefined, boxplot: js.UndefOr[js.Any] = js.undefined, ohlc: js.UndefOr[js.Any] = js.undefined, arearange: js.UndefOr[js.Any] = js.undefined, xrange: js.UndefOr[js.Any] = js.undefined, gantt: js.UndefOr[CleanJsObject[PlotOptionsGantt]] = js.undefined, funnel: js.UndefOr[js.Any] = js.undefined, pyramid: js.UndefOr[js.Any] = js.undefined, histogram: js.UndefOr[js.Any] = js.undefined, pareto: js.UndefOr[js.Any] = js.undefined, sankey: js.UndefOr[js.Any] = js.undefined, solidgauge: js.UndefOr[js.Any] = js.undefined, streamgraph: js.UndefOr[js.Any] = js.undefined, sunburst: js.UndefOr[js.Any] = js.undefined, tilemap: js.UndefOr[js.Any] = js.undefined, treemap: js.UndefOr[js.Any] = js.undefined, variablepie: js.UndefOr[js.Any] = js.undefined, variwide: js.UndefOr[js.Any] = js.undefined, vector: js.UndefOr[js.Any] = js.undefined, windbarb: js.UndefOr[js.Any] = js.undefined, wordcloud: js.UndefOr[js.Any] = js.undefined, area: js.UndefOr[js.Any] = js.undefined, areaspline: js.UndefOr[CleanJsObject[PlotOptionsAreaspline]] = js.undefined, bar: js.UndefOr[js.Any] = js.undefined, candlestick: js.UndefOr[js.Any] = js.undefined, column: js.UndefOr[js.Any] = js.undefined, flags: js.UndefOr[js.Any] = js.undefined, pie: js.UndefOr[js.Any] = js.undefined, scatter: js.UndefOr[js.Any] = js.undefined, line: js.UndefOr[js.Any] = js.undefined, spline: js.UndefOr[CleanJsObject[PlotOptionsSpline]] = js.undefined, scatter3d: js.UndefOr[js.Any] = js.undefined, areasplinerange: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerange]] = js.undefined, bubble: js.UndefOr[js.Any] = js.undefined, errorbar: js.UndefOr[js.Any] = js.undefined, gauge: js.UndefOr[js.Any] = js.undefined, polygon: js.UndefOr[CleanJsObject[PlotOptionsPolygon]] = js.undefined, waterfall: js.UndefOr[js.Any] = js.undefined, heatmap: js.UndefOr[js.Any] = js.undefined, mapbubble: js.UndefOr[js.Any] = js.undefined, mapline: js.UndefOr[js.Any] = js.undefined, mappoint: js.UndefOr[js.Any] = js.undefined, map: js.UndefOr[js.Any] = js.undefined): PlotOptions = {
    val adOuter: js.Any = ad
    val atrOuter: js.Any = atr
    val bbOuter: js.Any = bb
    val cciOuter: js.Any = cci
    val cmfOuter: js.UndefOr[CleanJsObject[PlotOptionsCmf]] = cmf
    val emaOuter: js.Any = ema
    val ikhOuter: js.Any = ikh
    val smaOuter: js.Any = sma
    val macdOuter: js.Any = macd
    val mfiOuter: js.Any = mfi
    val momentumOuter: js.Any = momentum
    val pivotpointsOuter: js.Any = pivotpoints
    val priceenvelopesOuter: js.Any = priceenvelopes
    val psarOuter: js.Any = psar
    val rocOuter: js.Any = roc
    val rsiOuter: js.Any = rsi
    val stochasticOuter: js.Any = stochastic
    val vbpOuter: js.Any = vbp
    val vwapOuter: js.Any = vwap
    val wmaOuter: js.Any = wma
    val zigzagOuter: js.Any = zigzag
    val bellcurveOuter: js.Any = bellcurve
    val seriesOuter: js.Any = series
    val bulletOuter: js.Any = bullet
    val columnrangeOuter: js.UndefOr[CleanJsObject[PlotOptionsColumnrange]] = columnrange
    val boxplotOuter: js.Any = boxplot
    val ohlcOuter: js.Any = ohlc
    val arearangeOuter: js.Any = arearange
    val xrangeOuter: js.Any = xrange
    val ganttOuter: js.UndefOr[CleanJsObject[PlotOptionsGantt]] = gantt
    val funnelOuter: js.Any = funnel
    val pyramidOuter: js.Any = pyramid
    val histogramOuter: js.Any = histogram
    val paretoOuter: js.Any = pareto
    val sankeyOuter: js.Any = sankey
    val solidgaugeOuter: js.Any = solidgauge
    val streamgraphOuter: js.Any = streamgraph
    val sunburstOuter: js.Any = sunburst
    val tilemapOuter: js.Any = tilemap
    val treemapOuter: js.Any = treemap
    val variablepieOuter: js.Any = variablepie
    val variwideOuter: js.Any = variwide
    val vectorOuter: js.Any = vector
    val windbarbOuter: js.Any = windbarb
    val wordcloudOuter: js.Any = wordcloud
    val areaOuter: js.Any = area
    val areasplineOuter: js.UndefOr[CleanJsObject[PlotOptionsAreaspline]] = areaspline
    val barOuter: js.Any = bar
    val candlestickOuter: js.Any = candlestick
    val columnOuter: js.Any = column
    val flagsOuter: js.Any = flags
    val pieOuter: js.Any = pie
    val scatterOuter: js.Any = scatter
    val lineOuter: js.Any = line
    val splineOuter: js.UndefOr[CleanJsObject[PlotOptionsSpline]] = spline
    val scatter3dOuter: js.Any = scatter3d
    val areasplinerangeOuter: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerange]] = areasplinerange
    val bubbleOuter: js.Any = bubble
    val errorbarOuter: js.Any = errorbar
    val gaugeOuter: js.Any = gauge
    val polygonOuter: js.UndefOr[CleanJsObject[PlotOptionsPolygon]] = polygon
    val waterfallOuter: js.Any = waterfall
    val heatmapOuter: js.Any = heatmap
    val mapbubbleOuter: js.Any = mapbubble
    val maplineOuter: js.Any = mapline
    val mappointOuter: js.Any = mappoint
    val mapOuter: js.Any = map
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptions {
      override val ad: js.Any = adOuter
      override val atr: js.Any = atrOuter
      override val bb: js.Any = bbOuter
      override val cci: js.Any = cciOuter
      override val cmf: js.UndefOr[CleanJsObject[PlotOptionsCmf]] = cmfOuter
      override val ema: js.Any = emaOuter
      override val ikh: js.Any = ikhOuter
      override val sma: js.Any = smaOuter
      override val macd: js.Any = macdOuter
      override val mfi: js.Any = mfiOuter
      override val momentum: js.Any = momentumOuter
      override val pivotpoints: js.Any = pivotpointsOuter
      override val priceenvelopes: js.Any = priceenvelopesOuter
      override val psar: js.Any = psarOuter
      override val roc: js.Any = rocOuter
      override val rsi: js.Any = rsiOuter
      override val stochastic: js.Any = stochasticOuter
      override val vbp: js.Any = vbpOuter
      override val vwap: js.Any = vwapOuter
      override val wma: js.Any = wmaOuter
      override val zigzag: js.Any = zigzagOuter
      override val bellcurve: js.Any = bellcurveOuter
      override val series: js.Any = seriesOuter
      override val bullet: js.Any = bulletOuter
      override val columnrange: js.UndefOr[CleanJsObject[PlotOptionsColumnrange]] = columnrangeOuter
      override val boxplot: js.Any = boxplotOuter
      override val ohlc: js.Any = ohlcOuter
      override val arearange: js.Any = arearangeOuter
      override val xrange: js.Any = xrangeOuter
      override val gantt: js.UndefOr[CleanJsObject[PlotOptionsGantt]] = ganttOuter
      override val funnel: js.Any = funnelOuter
      override val pyramid: js.Any = pyramidOuter
      override val histogram: js.Any = histogramOuter
      override val pareto: js.Any = paretoOuter
      override val sankey: js.Any = sankeyOuter
      override val solidgauge: js.Any = solidgaugeOuter
      override val streamgraph: js.Any = streamgraphOuter
      override val sunburst: js.Any = sunburstOuter
      override val tilemap: js.Any = tilemapOuter
      override val treemap: js.Any = treemapOuter
      override val variablepie: js.Any = variablepieOuter
      override val variwide: js.Any = variwideOuter
      override val vector: js.Any = vectorOuter
      override val windbarb: js.Any = windbarbOuter
      override val wordcloud: js.Any = wordcloudOuter
      override val area: js.Any = areaOuter
      override val areaspline: js.UndefOr[CleanJsObject[PlotOptionsAreaspline]] = areasplineOuter
      override val bar: js.Any = barOuter
      override val candlestick: js.Any = candlestickOuter
      override val column: js.Any = columnOuter
      override val flags: js.Any = flagsOuter
      override val pie: js.Any = pieOuter
      override val scatter: js.Any = scatterOuter
      override val line: js.Any = lineOuter
      override val spline: js.UndefOr[CleanJsObject[PlotOptionsSpline]] = splineOuter
      override val scatter3d: js.Any = scatter3dOuter
      override val areasplinerange: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerange]] = areasplinerangeOuter
      override val bubble: js.Any = bubbleOuter
      override val errorbar: js.Any = errorbarOuter
      override val gauge: js.Any = gaugeOuter
      override val polygon: js.UndefOr[CleanJsObject[PlotOptionsPolygon]] = polygonOuter
      override val waterfall: js.Any = waterfallOuter
      override val heatmap: js.Any = heatmapOuter
      override val mapbubble: js.Any = mapbubbleOuter
      override val mapline: js.Any = maplineOuter
      override val mappoint: js.Any = mappointOuter
      override val map: js.Any = mapOuter
    })
  }
}
