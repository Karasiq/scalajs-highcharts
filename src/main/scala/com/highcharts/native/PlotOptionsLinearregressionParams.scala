/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-linearregression-params</code>
  */
class PlotOptionsLinearregressionParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Unit (in milliseconds) for the x axis distances used to
    * compute the regression line paramters (slope &amp; intercept) for
    * every range. In Highcharts Stock the x axis values are always
    * represented in milliseconds which may cause that distances
    * between points are &quot;big&quot; integer numbers.</p>
    * <p>Highcharts Stock&#39;s linear regression algorithm (least squares
    * method) will utilize these &quot;big&quot; integers for finding the
    * slope and the intercept of the regression line for each
    * period. In consequence, this value may be a very &quot;small&quot;
    * decimal number that&#39;s hard to interpret by a human.</p>
    * <p>For instance: <code>xAxisUnit</code> equealed to <code>86400000</code> ms (1 day)
    * forces the algorithm to treat <code>86400000</code> as <code>1</code> while
    * computing the slope and the intercept. This may enchance the
    * legiblitity of the indicator&#39;s values.</p>
    * <p>Default value is the closest distance between two data
    * points.</p>
    * <p>In <code>v9.0.2</code>, the default value has been changed
    * from <code>undefined</code> to <code>null</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/linear-regression-xaxisunit">xAxisUnit set to 1 minute</a>
    * @since 6.0.0
    */
  var xAxisUnit: js.UndefOr[Null | Double] = js.undefined

  /**
    * <p>The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.</p>
    * @since 6.0.0
    */
  var index: js.UndefOr[Double] = js.undefined

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotOptionsLinearregressionParams {
  /**
    * @param xAxisUnit <p>Unit (in milliseconds) for the x axis distances used to. compute the regression line paramters (slope &amp; intercept) for. every range. In Highcharts Stock the x axis values are always. represented in milliseconds which may cause that distances. between points are &quot;big&quot; integer numbers.</p>. <p>Highcharts Stock&#39;s linear regression algorithm (least squares. method) will utilize these &quot;big&quot; integers for finding the. slope and the intercept of the regression line for each. period. In consequence, this value may be a very &quot;small&quot;. decimal number that&#39;s hard to interpret by a human.</p>. <p>For instance: <code>xAxisUnit</code> equealed to <code>86400000</code> ms (1 day). forces the algorithm to treat <code>86400000</code> as <code>1</code> while. computing the slope and the intercept. This may enchance the. legiblitity of the indicator&#39;s values.</p>. <p>Default value is the closest distance between two data. points.</p>. <p>In <code>v9.0.2</code>, the default value has been changed. from <code>undefined</code> to <code>null</code>.</p>
    * @param index <p>The point index which indicator calculations will base. For. example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    */
  def apply(xAxisUnit: js.UndefOr[Null | Double] = js.undefined, index: js.UndefOr[Double] = js.undefined, period: js.UndefOr[Double] = js.undefined): PlotOptionsLinearregressionParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsLinearregressionParams {
      this.xAxisUnit = xAxisUnit
      this.index = index
      this.period = period
    })
  }
}
