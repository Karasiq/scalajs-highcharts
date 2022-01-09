/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>exporting-buttons-contextButton</code>
  */
class ExportingButtonsContextButton extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>This option is deprecated, use
    * <a href="#exporting.buttons.contextButton.titleKey">titleKey</a> instead.</p>
    */
  var _titleKey: js.UndefOr[String] = js.undefined

  /**
    * <p>The class name of the context button.</p>
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>The class name of the menu appearing from the button.</p>
    */
  var menuClassName: js.UndefOr[String] = js.undefined

  /**
    * <p>A collection of strings pointing to config options for the menu
    * items. The config options are defined in the
    * <code>menuItemDefinitions</code> option.</p>
    * <p>By default, there is the &quot;View in full screen&quot; and &quot;Print&quot; menu
    * items, plus one menu item for each of the available export types.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/menuitemdefinitions/">Menu item definitions</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/menuitemdefinitions/">Menu item definitions</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/menuitemdefinitions/">Menu item definitions</a>
    * @since 2.0.0
    */
  var menuItems: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>A click handler callback to use on the button directly instead of
    * the popup menu.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-onclick/">Skip the menu and export the chart directly</a>
    * @since 2.0.0
    */
  var onclick: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>The symbol for the button. Points to a definition function in
    * the <code>Highcharts.Renderer.symbols</code> collection. The default
    * <code>menu</code> function is part of the exporting module. Possible
    * values are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot;,
    * &quot;triangle-down&quot;, &quot;menu&quot;, &quot;menuball&quot; or custom shape.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-symbol/">Use a circle for symbol</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-symbol-custom/">Custom shape as symbol</a>
    * @since 2.0.0
    */
  var symbol: js.UndefOr[String] = js.undefined

  /**
    * <p>See <a href="#navigation.buttonOptions.symbolFill">navigation.buttonOptions.symbolFill</a>.</p>
    * @since 2.0.0
    */
  var symbolFill: js.UndefOr[String] = js.undefined

  /**
    * <p>The key to a <a href="#lang">lang</a> option setting that is used for the
    * button&#39;s title tooltip. When the key is <code>contextButtonTitle</code>, it
    * refers to <a href="#lang.contextButtonTitle">lang.contextButtonTitle</a>
    * that defaults to &quot;Chart context menu&quot;.</p>
    * @since 6.1.4
    */
  var titleKey: js.UndefOr[String] = js.undefined

  /**
    * <p>The horizontal position of the button relative to the <code>align</code>
    * option.</p>
    * @since 2.0.0
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to enable buttons.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-enabled/">Exporting module loaded but buttons disabled</a>
    * @since 2.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A text string to add to the individual button.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text/">Full text button</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text-symbol/">Combined symbol and text</a>
    * @since 3.0.0
    */
  var text: js.UndefOr[String] = js.undefined

  var theme: js.Any = js.undefined

  /**
    * <p>The vertical offset of the button&#39;s position relative to its
    * <code>verticalAlign</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/">Buttons at lower right</a>
    * @since 2.0.0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ExportingButtonsContextButton {
  /**
    * @param _titleKey <p>This option is deprecated, use. <a href="#exporting.buttons.contextButton.titleKey">titleKey</a> instead.</p>
    * @param className <p>The class name of the context button.</p>
    * @param menuClassName <p>The class name of the menu appearing from the button.</p>
    * @param menuItems <p>A collection of strings pointing to config options for the menu. items. The config options are defined in the. <code>menuItemDefinitions</code> option.</p>. <p>By default, there is the &quot;View in full screen&quot; and &quot;Print&quot; menu. items, plus one menu item for each of the available export types.</p>
    * @param onclick <p>A click handler callback to use on the button directly instead of. the popup menu.</p>
    * @param symbol <p>The symbol for the button. Points to a definition function in. the <code>Highcharts.Renderer.symbols</code> collection. The default. <code>menu</code> function is part of the exporting module. Possible. values are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot;,. &quot;triangle-down&quot;, &quot;menu&quot;, &quot;menuball&quot; or custom shape.</p>
    * @param symbolFill <p>See <a href="#navigation.buttonOptions.symbolFill">navigation.buttonOptions.symbolFill</a>.</p>
    * @param titleKey <p>The key to a <a href="#lang">lang</a> option setting that is used for the. button&#39;s title tooltip. When the key is <code>contextButtonTitle</code>, it. refers to <a href="#lang.contextButtonTitle">lang.contextButtonTitle</a>. that defaults to &quot;Chart context menu&quot;.</p>
    * @param x <p>The horizontal position of the button relative to the <code>align</code>. option.</p>
    * @param enabled <p>Whether to enable buttons.</p>
    * @param text <p>A text string to add to the individual button.</p>
    * @param y <p>The vertical offset of the button&#39;s position relative to its. <code>verticalAlign</code>.</p>
    */
  def apply(_titleKey: js.UndefOr[String] = js.undefined, className: js.UndefOr[String] = js.undefined, menuClassName: js.UndefOr[String] = js.undefined, menuItems: js.UndefOr[js.Array[String]] = js.undefined, onclick: js.UndefOr[js.Function] = js.undefined, symbol: js.UndefOr[String] = js.undefined, symbolFill: js.UndefOr[String] = js.undefined, titleKey: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, text: js.UndefOr[String] = js.undefined, theme: js.UndefOr[js.Any] = js.undefined, y: js.UndefOr[Double] = js.undefined): ExportingButtonsContextButton = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ExportingButtonsContextButton {
      this._titleKey = _titleKey
      this.className = className
      this.menuClassName = menuClassName
      this.menuItems = menuItems
      this.onclick = onclick
      this.symbol = symbol
      this.symbolFill = symbolFill
      this.titleKey = titleKey
      this.x = x
      this.enabled = enabled
      this.text = text
      this.theme = theme
      this.y = y
    })
  }
}
