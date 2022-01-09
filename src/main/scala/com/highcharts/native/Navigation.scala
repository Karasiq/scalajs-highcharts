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
  * @note JavaScript name: <code>navigation</code>
  */
class Navigation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Additional options to be merged into all annotations.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/stocktools/navigation-annotation-options">Set red color of all line annotations</a>
    */
  var annotationsOptions: js.Any = js.undefined

  /**
    * <p>Bindings definitions for custom HTML buttons. Each binding implements
    * simple event-driven interface:</p>
    * <ul>
    * <li><p><code>className</code>: classname used to bind event to</p>
    * </li>
    * <li><p><code>init</code>: initial event, fired on button click</p>
    * </li>
    * <li><p><code>start</code>: fired on first click on a chart</p>
    * </li>
    * <li><p><code>steps</code>: array of sequential events fired one after another on each
    * of users clicks</p>
    * </li>
    * <li><p><code>end</code>: last event to be called after last step event</p>
    * </li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/stocktools/stocktools-thresholds">Custom bindings</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/bindings/">Simple binding</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/bindings-custom-annotation/">Custom annotation binding</a>
    * @since 7.0.0
    */
  var bindings: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>A CSS class name where all bindings will be attached to. Multiple
    * charts on the same page should have separate class names to prevent
    * duplicating events.</p>
    * <p>Default value of versions &lt; 7.0.4 <code>highcharts-bindings-wrapper</code></p>
    * @since 7.0.0
    */
  var bindingsClassName: js.UndefOr[String] = js.undefined

  var buttonOptions: js.Any = js.undefined

  /**
    * <p>Events to communicate between Stock Tools and custom GUI.</p>
    * @since 7.0.0
    */
  var events: js.Any = js.undefined

  /**
    * <p>Path where Highcharts will look for icons. Change this to use icons
    * from a different server.</p>
    * @since 7.1.3
    */
  var iconsURL: js.UndefOr[String] = js.undefined
}

object Navigation {
  /**
    * @param annotationsOptions <p>Additional options to be merged into all annotations.</p>
    * @param bindings <p>Bindings definitions for custom HTML buttons. Each binding implements. simple event-driven interface:</p>. <ul>. <li><p><code>className</code>: classname used to bind event to</p>. </li>. <li><p><code>init</code>: initial event, fired on button click</p>. </li>. <li><p><code>start</code>: fired on first click on a chart</p>. </li>. <li><p><code>steps</code>: array of sequential events fired one after another on each. of users clicks</p>. </li>. <li><p><code>end</code>: last event to be called after last step event</p>. </li>. </ul>
    * @param bindingsClassName <p>A CSS class name where all bindings will be attached to. Multiple. charts on the same page should have separate class names to prevent. duplicating events.</p>. <p>Default value of versions &lt; 7.0.4 <code>highcharts-bindings-wrapper</code></p>
    * @param events <p>Events to communicate between Stock Tools and custom GUI.</p>
    * @param iconsURL <p>Path where Highcharts will look for icons. Change this to use icons. from a different server.</p>
    */
  def apply(annotationsOptions: js.UndefOr[js.Any] = js.undefined, bindings: js.UndefOr[js.Object] = js.undefined, bindingsClassName: js.UndefOr[String] = js.undefined, buttonOptions: js.UndefOr[js.Any] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, iconsURL: js.UndefOr[String] = js.undefined): Navigation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Navigation {
      this.annotationsOptions = annotationsOptions
      this.bindings = bindings
      this.bindingsClassName = bindingsClassName
      this.buttonOptions = buttonOptions
      this.events = events
      this.iconsURL = iconsURL
    })
  }
}
