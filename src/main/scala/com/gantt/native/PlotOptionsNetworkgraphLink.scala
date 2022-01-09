/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-networkgraph-link</code>
  */
class PlotOptionsNetworkgraphLink extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Color of the link between two nodes.</p>
    * @since 7.0.0
    */
  var color: js.UndefOr[String] = js.undefined

  /**
    * <p>A name for the dash style to use for links.</p>
    * @since 7.0.0
    */
  var dashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Width (px) of the link between two nodes.</p>
    * @since 7.0.0
    */
  var width: js.UndefOr[Double] = js.undefined
}

object PlotOptionsNetworkgraphLink {
  /**
    * @param color <p>Color of the link between two nodes.</p>
    * @param dashStyle <p>A name for the dash style to use for links.</p>
    * @param width <p>Width (px) of the link between two nodes.</p>
    */
  def apply(color: js.UndefOr[String] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double] = js.undefined): PlotOptionsNetworkgraphLink = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsNetworkgraphLink {
      this.color = color
      this.dashStyle = dashStyle
      this.width = width
    })
  }
}
