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
  * @note JavaScript name: <code>accessibility-series</code>
  */
class AccessibilitySeries extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Whether or not to add series descriptions to charts with a single
    * series.</p>
    * @since 8.0.0
    */
  var describeSingleSeries: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Formatter function to use instead of the default for series
    * descriptions. Receives one argument, <code>series</code>, referring to the
    * series to describe. Should return a string with the description
    * of the series for a screen reader user. If <code>false</code> is returned,
    * the default formatter will be used for that series.</p>
    * @since 8.0.0
    */
  var descriptionFormatter: js.Any = js.undefined

  /**
    * <p>When a series contains more points than this, we no longer expose
    * information about individual points to screen readers.</p>
    * <p>Set to <code>false</code> to disable.</p>
    * @since 8.0.0
    */
  var pointDescriptionEnabledThreshold: js.UndefOr[Boolean | Double] = js.undefined
}

object AccessibilitySeries {
  /**
    * @param describeSingleSeries <p>Whether or not to add series descriptions to charts with a single. series.</p>
    * @param descriptionFormatter <p>Formatter function to use instead of the default for series. descriptions. Receives one argument, <code>series</code>, referring to the. series to describe. Should return a string with the description. of the series for a screen reader user. If <code>false</code> is returned,. the default formatter will be used for that series.</p>
    * @param pointDescriptionEnabledThreshold <p>When a series contains more points than this, we no longer expose. information about individual points to screen readers.</p>. <p>Set to <code>false</code> to disable.</p>
    */
  def apply(describeSingleSeries: js.UndefOr[Boolean] = js.undefined, descriptionFormatter: js.UndefOr[js.Any] = js.undefined, pointDescriptionEnabledThreshold: js.UndefOr[Boolean | Double] = js.undefined): AccessibilitySeries = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AccessibilitySeries {
      this.describeSingleSeries = describeSingleSeries
      this.descriptionFormatter = descriptionFormatter
      this.pointDescriptionEnabledThreshold = pointDescriptionEnabledThreshold
    })
  }
}
