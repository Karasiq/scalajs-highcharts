/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>drilldown-drillUpButton</code>
  */
@js.annotation.ScalaJSDefined
class DrilldownDrillUpButton extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Positioning options for the button within the <code>relativeTo</code> box.
    * Available properties are <code>x</code>, <code>y</code>, <code>align</code> and <code>verticalAlign</code>.</p>
    * @since 3.0.8
    */
  val position: js.UndefOr[CleanJsObject[DrilldownDrillUpButtonPosition]] = js.undefined

  /**
    * <p>What box to align the button to. Can be either <code>plotBox</code> or
    * <code>spacingBox</code>.</p>
    * @since 3.0.8
    */
  val relativeTo: js.UndefOr[String] = js.undefined

  /**
    * <p>A collection of attributes for the button. The object takes SVG
    * attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the border
    * radius. The theme also supports <code>style</code>, a collection of CSS
    * properties for the text. Equivalent attributes for the hover state
    * are given in <code>theme.states.hover</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/drillupbutton/">Button theming</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/drillupbutton/">Button theming</a>
    * @since 3.0.8
    */
  val theme: js.UndefOr[js.Object] = js.undefined
}

object DrilldownDrillUpButton {
  /**
    * @param position <p>Positioning options for the button within the <code>relativeTo</code> box.. Available properties are <code>x</code>, <code>y</code>, <code>align</code> and <code>verticalAlign</code>.</p>
    * @param relativeTo <p>What box to align the button to. Can be either <code>plotBox</code> or. <code>spacingBox</code>.</p>
    * @param theme <p>A collection of attributes for the button. The object takes SVG. attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the border. radius. The theme also supports <code>style</code>, a collection of CSS. properties for the text. Equivalent attributes for the hover state. are given in <code>theme.states.hover</code>.</p>
    */
  def apply(position: js.UndefOr[CleanJsObject[DrilldownDrillUpButtonPosition]] = js.undefined, relativeTo: js.UndefOr[String] = js.undefined, theme: js.UndefOr[js.Object] = js.undefined): DrilldownDrillUpButton = {
    val positionOuter: js.UndefOr[CleanJsObject[DrilldownDrillUpButtonPosition]] = position
    val relativeToOuter: js.UndefOr[String] = relativeTo
    val themeOuter: js.UndefOr[js.Object] = theme
    com.highcharts.HighchartsGenericObject.toCleanObject(new DrilldownDrillUpButton {
      override val position: js.UndefOr[CleanJsObject[DrilldownDrillUpButtonPosition]] = positionOuter
      override val relativeTo: js.UndefOr[String] = relativeToOuter
      override val theme: js.UndefOr[js.Object] = themeOuter
    })
  }
}
