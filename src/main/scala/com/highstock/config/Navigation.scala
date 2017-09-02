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
  * @note JavaScript name: <code>navigation</code>
  */
@js.annotation.ScalaJSDefined
class Navigation extends js.Object {

  /**
    * <p>A collection of options for buttons appearing in the exporting module.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the buttons are styled with the <code>.highcharts-contextbutton</code> and <code>.highcharts-button-symbol</code> class.</p>
    */
  val buttonOptions: js.UndefOr[CleanJsObject[NavigationButtonOptions]] = js.undefined

  /**
    * CSS styles for the hover state of the individual items within the popup menu appearing by  default when the export icon is clicked. The menu items are rendered in HTML.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menuitemhoverstyle/" target="_blank">Bold text on hover</a>
    */
  val menuItemHoverStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * CSS styles for the individual items within the popup menu appearing by  default when the export icon is clicked. The menu items are rendered in HTML.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menuitemstyle/" target="_blank">Add a grey stripe to the left</a>
    */
  val menuItemStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * CSS styles for the popup menu appearing by default when the export icon is clicked. This menu is rendered in HTML.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menustyle/" target="_blank">Light gray menu background</a>
    */
  val menuStyle: js.UndefOr[js.Object] = js.undefined
}

object Navigation {
  /**
    * @param buttonOptions <p>A collection of options for buttons appearing in the exporting module.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the buttons are styled with the <code>.highcharts-contextbutton</code> and <code>.highcharts-button-symbol</code> class.</p>
    * @param menuItemHoverStyle CSS styles for the hover state of the individual items within the popup menu appearing by  default when the export icon is clicked. The menu items are rendered in HTML.
    * @param menuItemStyle CSS styles for the individual items within the popup menu appearing by  default when the export icon is clicked. The menu items are rendered in HTML.
    * @param menuStyle CSS styles for the popup menu appearing by default when the export icon is clicked. This menu is rendered in HTML.
    */
  def apply(buttonOptions: js.UndefOr[CleanJsObject[NavigationButtonOptions]] = js.undefined, menuItemHoverStyle: js.UndefOr[js.Object] = js.undefined, menuItemStyle: js.UndefOr[js.Object] = js.undefined, menuStyle: js.UndefOr[js.Object] = js.undefined): Navigation = {
    val buttonOptionsOuter: js.UndefOr[CleanJsObject[NavigationButtonOptions]] = buttonOptions
    val menuItemHoverStyleOuter: js.UndefOr[js.Object] = menuItemHoverStyle
    val menuItemStyleOuter: js.UndefOr[js.Object] = menuItemStyle
    val menuStyleOuter: js.UndefOr[js.Object] = menuStyle
    new Navigation {
      override val buttonOptions: js.UndefOr[CleanJsObject[NavigationButtonOptions]] = buttonOptionsOuter
      override val menuItemHoverStyle: js.UndefOr[js.Object] = menuItemHoverStyleOuter
      override val menuItemStyle: js.UndefOr[js.Object] = menuItemStyleOuter
      override val menuStyle: js.UndefOr[js.Object] = menuStyleOuter
    }
  }
}
