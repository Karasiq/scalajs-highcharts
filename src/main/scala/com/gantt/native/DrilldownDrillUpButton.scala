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
  * @note JavaScript name: <code>drilldown-drillUpButton</code>
  */
class DrilldownDrillUpButton extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Positioning options for the button within the <code>relativeTo</code> box.
    * Available properties are <code>x</code>, <code>y</code>, <code>align</code> and <code>verticalAlign</code>.</p>
    * @since 3.0.8
    */
  var position: js.Any = js.undefined

  /**
    * <p>What box to align the button to. Can be either <code>plotBox</code> or
    * <code>spacingBox</code>.</p>
    * @since 3.0.8
    */
  var relativeTo: js.Any = js.undefined

  /**
    * <p>A collection of attributes for the button. The object takes SVG
    * attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the border
    * radius. The theme also supports <code>style</code>, a collection of CSS
    * properties for the text. Equivalent attributes for the hover state
    * are given in <code>theme.states.hover</code>.</p>
    * <p>In styled mode, drill-up button styles can be applied with the
    * <code>.highcharts-drillup-button</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/drillupbutton/">Button theming</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/drillupbutton/">Button theming</a>
    * @since 3.0.8
    */
  var theme: js.UndefOr[js.Object] = js.undefined
}

object DrilldownDrillUpButton {
  /**
    * @param position <p>Positioning options for the button within the <code>relativeTo</code> box.. Available properties are <code>x</code>, <code>y</code>, <code>align</code> and <code>verticalAlign</code>.</p>
    * @param relativeTo <p>What box to align the button to. Can be either <code>plotBox</code> or. <code>spacingBox</code>.</p>
    * @param theme <p>A collection of attributes for the button. The object takes SVG. attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the border. radius. The theme also supports <code>style</code>, a collection of CSS. properties for the text. Equivalent attributes for the hover state. are given in <code>theme.states.hover</code>.</p>. <p>In styled mode, drill-up button styles can be applied with the. <code>.highcharts-drillup-button</code> class.</p>
    */
  def apply(position: js.UndefOr[js.Any] = js.undefined, relativeTo: js.UndefOr[js.Any] = js.undefined, theme: js.UndefOr[js.Object] = js.undefined): DrilldownDrillUpButton = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new DrilldownDrillUpButton {
      this.position = position
      this.relativeTo = relativeTo
      this.theme = theme
    })
  }
}
