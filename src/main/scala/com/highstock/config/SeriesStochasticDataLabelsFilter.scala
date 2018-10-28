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
  * @note JavaScript name: <code>series&lt;stochastic&gt;-dataLabels-filter</code>
  */
@js.annotation.ScalaJSDefined
class SeriesStochasticDataLabelsFilter extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The point property to filter by. Point options are passed directly to
    * properties, additionally there are <code>y</code> value, <code>percentage</code> and others
    * listed under <a href="https://api.highcharts.com/class-reference/Highcharts.Point">Point</a>
    * members.</p>
    * @since 6.0.3
    */
  val property: js.UndefOr[String] = js.undefined

  /**
    * <p>The operator to compare by. Can be one of <code>&gt;</code>, <code>&lt;</code>, <code>&gt;=</code>, <code>&lt;=</code>, <code>==</code>,
    * and <code>===</code>.</p>
    * @since 6.0.3
    */
  val operator: js.UndefOr[String] = js.undefined

  /**
    * <p>The value to compare against.</p>
    * @since 6.0.3
    */
  val value: js.Any = js.undefined
}

object SeriesStochasticDataLabelsFilter {
  /**
    * @param property <p>The point property to filter by. Point options are passed directly to. properties, additionally there are <code>y</code> value, <code>percentage</code> and others. listed under <a href="https://api.highcharts.com/class-reference/Highcharts.Point">Point</a>. members.</p>
    * @param operator <p>The operator to compare by. Can be one of <code>&gt;</code>, <code>&lt;</code>, <code>&gt;=</code>, <code>&lt;=</code>, <code>==</code>,. and <code>===</code>.</p>
    * @param value <p>The value to compare against.</p>
    */
  def apply(property: js.UndefOr[String] = js.undefined, operator: js.UndefOr[String] = js.undefined, value: js.UndefOr[js.Any] = js.undefined): SeriesStochasticDataLabelsFilter = {
    val propertyOuter: js.UndefOr[String] = property
    val operatorOuter: js.UndefOr[String] = operator
    val valueOuter: js.Any = value
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesStochasticDataLabelsFilter {
      override val property: js.UndefOr[String] = propertyOuter
      override val operator: js.UndefOr[String] = operatorOuter
      override val value: js.Any = valueOuter
    })
  }
}
