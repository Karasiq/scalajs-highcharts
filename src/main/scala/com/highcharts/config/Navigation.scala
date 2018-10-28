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
  * @note JavaScript name: <code>navigation</code>
  */
@js.annotation.ScalaJSDefined
class Navigation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A collection of options for buttons appearing in the exporting module.</p>
    * <p>In styled mode, the buttons are styled with the
    * <code>.highcharts-contextbutton</code> and <code>.highcharts-button-symbol</code> classes.</p>
    */
  val buttonOptions: js.Any = js.undefined

  /**
    * <p>CSS styles for the popup menu appearing by default when the export
    * icon is clicked. This menu is rendered in HTML.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menustyle/">Light gray menu background</a>
    * @since 2.0
    */
  val menuStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>CSS styles for the individual items within the popup menu appearing
    * by default when the export icon is clicked. The menu items are rendered
    * in HTML.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menuitemstyle/">Add a grey stripe to the left</a>
    * @since 2.0
    */
  val menuItemStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>CSS styles for the hover state of the individual items within the
    * popup menu appearing by default when the export icon is clicked.
    *  The menu items are rendered in HTML.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menuitemhoverstyle/">Bold text on hover</a>
    * @since 2.0
    */
  val menuItemHoverStyle: js.UndefOr[js.Object] = js.undefined
}

object Navigation {
  /**
    * @param buttonOptions <p>A collection of options for buttons appearing in the exporting module.</p>. <p>In styled mode, the buttons are styled with the. <code>.highcharts-contextbutton</code> and <code>.highcharts-button-symbol</code> classes.</p>
    * @param menuStyle <p>CSS styles for the popup menu appearing by default when the export. icon is clicked. This menu is rendered in HTML.</p>
    * @param menuItemStyle <p>CSS styles for the individual items within the popup menu appearing. by default when the export icon is clicked. The menu items are rendered. in HTML.</p>
    * @param menuItemHoverStyle <p>CSS styles for the hover state of the individual items within the. popup menu appearing by default when the export icon is clicked..  The menu items are rendered in HTML.</p>
    */
  def apply(buttonOptions: js.UndefOr[js.Any] = js.undefined, menuStyle: js.UndefOr[js.Object] = js.undefined, menuItemStyle: js.UndefOr[js.Object] = js.undefined, menuItemHoverStyle: js.UndefOr[js.Object] = js.undefined): Navigation = {
    val buttonOptionsOuter: js.Any = buttonOptions
    val menuStyleOuter: js.UndefOr[js.Object] = menuStyle
    val menuItemStyleOuter: js.UndefOr[js.Object] = menuItemStyle
    val menuItemHoverStyleOuter: js.UndefOr[js.Object] = menuItemHoverStyle
    com.highcharts.HighchartsGenericObject.toCleanObject(new Navigation {
      override val buttonOptions: js.Any = buttonOptionsOuter
      override val menuStyle: js.UndefOr[js.Object] = menuStyleOuter
      override val menuItemStyle: js.UndefOr[js.Object] = menuItemStyleOuter
      override val menuItemHoverStyle: js.UndefOr[js.Object] = menuItemHoverStyleOuter
    })
  }
}
