/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.api

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>Element</code>
  */
@js.native
trait Element extends js.Object {

  /**
    * Add the element to the renderer canvas.
    * @param parent The element can be added to a <code>g</code> (group) element.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-g/" target="_blank">Elements added to a group</a>
    * @since 2.0
    */
  def add(parent: js.Object = ???): CleanJsObject[Element] = js.native

  /**
    * Apply numeric attributes to the SVG/VML element by animation. See <a href="#Element.attr()">Element.attr()</a> for more information on setting attributes.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/element-on/" target="_blank">Setting some attributes by animation</a>
    * @since 2.0
    */
  def animate(attributes: js.Object = ???, animation: js.Object = ???): CleanJsObject[Element] = js.native

  /**
    * Apply some CSS properties to the element
    * @param hash The object literal of CSS properties to apply. Properties should be hyphenated, not camelCased.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-text-on-chart/" target="_blank">Styled text</a>
    * @since 2.0
    */
  def css(hash: js.Object = ???): CleanJsObject[Element] = js.native

  /**
    * Apply an event handler to the element
    * @param eventType The event type to attach, for example 'click', 'mouseover', 'touch'.
    * @param handler The event handler function.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/element-on/" target="_blank">A clickable rectangle</a>.
    * @since 2.0
    */
  def on(eventType: String = ???, handler: js.Function = ???): CleanJsObject[Element] = js.native

  /**
    * Bring the element to the front. Alternatively, a zIndex attribute can be given.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/element-tofront/" target="_blank">Click an element to bring it to front</a>.
    * @since 2.0
    */
  val toFront: CleanJsObject[Element] = js.native

  /**
    * <p>Apply attributes to the SVG/VML elements. These attributes for the most parts correspond to SVG, but some are specific to Highcharts, like <code>zIndex</code> and <code>rotation</code>.</p>
    * 
    * <p>In order to set the rotation center for <code>rotation</code>, set x and y to 0 and use <code>translateX</code> and <code>translateY</code> attributes to position the element instead.</p>
    * 
    * <p>Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>, <code>stroke-width</code>.</p>
    * @param hash A set of attributes to apply.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-rect/" target="_blank">Setting some attributes</a>
    * @since 2.0
    */
  def attr(hash: js.Object = ???): CleanJsObject[Element] = js.native

  /**
    * Destroy the element and free up memory
    * @since 2.0
    */
  val destroy: js.Any = js.native

  /**
    * Get the bounding box of the element
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-on-chart/" target="_blank">Draw a rectangle based on a text's bounding box</a>.
    * @since 2.0
    */
  val getBBox: js.Object = js.native
}
