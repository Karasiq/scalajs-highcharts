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
  * @note JavaScript name: <code>stockTools-gui</code>
  */
class StockToolsGui extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A collection of strings pointing to config options for the
    * toolbar items. Each name refers to a unique key from the
    * definitions object.</p>
    * @since 7.0.0
    */
  var buttons: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>A CSS class name to apply to the stocktools&#39; div,
    * allowing unique CSS styling for each chart.</p>
    * @since 7.0.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>An options object of the buttons definitions. Each name refers to
    * unique key from buttons array.</p>
    * @since 7.0.0
    */
  var definitions: js.Any = js.undefined

  /**
    * <p>Enable or disable the stockTools gui.</p>
    * @since 7.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Path where Highcharts will look for icons. Change this to use
    * icons from a different server.</p>
    * <p>Since 7.1.3 use <a href="#navigation.iconsURL">iconsURL</a> for popup and
    * stock tools.</p>
    * @since 7.0.0
    */
  var iconsURL: js.Any = js.undefined

  /**
    * <p>A CSS class name to apply to the container of buttons,
    * allowing unique CSS styling for each chart.</p>
    * @since 7.0.0
    */
  var toolbarClassName: js.UndefOr[String] = js.undefined
}

object StockToolsGui {
  /**
    * @param buttons <p>A collection of strings pointing to config options for the. toolbar items. Each name refers to a unique key from the. definitions object.</p>
    * @param className <p>A CSS class name to apply to the stocktools&#39; div,. allowing unique CSS styling for each chart.</p>
    * @param definitions <p>An options object of the buttons definitions. Each name refers to. unique key from buttons array.</p>
    * @param enabled <p>Enable or disable the stockTools gui.</p>
    * @param iconsURL <p>Path where Highcharts will look for icons. Change this to use. icons from a different server.</p>. <p>Since 7.1.3 use <a href="#navigation.iconsURL">iconsURL</a> for popup and. stock tools.</p>
    * @param toolbarClassName <p>A CSS class name to apply to the container of buttons,. allowing unique CSS styling for each chart.</p>
    */
  def apply(buttons: js.UndefOr[js.Array[String]] = js.undefined, className: js.UndefOr[String] = js.undefined, definitions: js.UndefOr[js.Any] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, iconsURL: js.UndefOr[js.Any] = js.undefined, toolbarClassName: js.UndefOr[String] = js.undefined): StockToolsGui = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new StockToolsGui {
      this.buttons = buttons
      this.className = className
      this.definitions = definitions
      this.enabled = enabled
      this.iconsURL = iconsURL
      this.toolbarClassName = toolbarClassName
    })
  }
}
