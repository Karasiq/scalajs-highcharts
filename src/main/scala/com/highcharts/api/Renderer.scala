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
  * @note JavaScript name: <code>Renderer</code>
  */
@js.native
trait Renderer extends js.Object {

  /**
    * Draw an arc on the renderer canvas.
    * @param centerX The x position of the arc's center in the SVG element.
    * @param centerY The y position of the arc's center in the SVG element.
    * @param outerRadius The outer radius of the arc.
    * @param innerRadius The inner radius of the arc.
    * @param start The starting angle of the arc in radians, where 0 is to the right and -Math.PI/2 is up.
    * @param end The ending angle of the arc in radians, where 0 is to the right and -Math.PI/2 is up.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-arc/" target="_blank">Drawing an arc</a>
    * @since 2.0
    */
  def arc(centerX: Double = ???, centerY: Double = ???, outerRadius: Double = ???, innerRadius: Double = ???, start: Double = ???, end: Double = ???): CleanJsObject[Element] = js.native

  /**
    * Draw circle on the renderer canvas.
    * @param centerX The x position of the circle's center in the SVG element.
    * @param centerY The y position of the circle's center in the SVG element.
    * @param radius The radius of the circle.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-circle/" target="_blank">Drawing a circle</a>
    * @since 2.0
    */
  def circle(centerX: Double = ???, centerY: Double = ???, radius: Double = ???): CleanJsObject[Element] = js.native

  /**
    * Add an SVG/VML group.
    * @param name The name of the group. This will be used in the class name, which will be <code>"highcharts-"+ name</code>. Other Element objects are added to the group by using the group as the first parameter in .add() for the wrappers.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-g/" target="_blank">Show and hide grouped objects</a>
    * @since 2.0
    */
  def g(name: String = ???): CleanJsObject[Element] = js.native

  /**
    * Add an image from an external resource.
    * @param source The URL of the image.
    * @param x The x position of the image's upper left corner.
    * @param y The y position of the image's upper left corner.
    * @param width The width of the image.
    * @param height The height of the image.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-image-on-chart/" target="_blank">Add an image in a chart</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-image/" target="_blank">add an image independent from chart</a>
    * @since 2.0
    */
  def image(source: String = ???, x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???): CleanJsObject[Element] = js.native

  /**
    * Add a path based on <a href="http://www.w3.org/TR/SVG/paths.html">SVG's path commands</a>. In SVG capable browsers all path commands are supported, but in VML only a subset is supported: absolute moveTo (M), absolute lineTo (L), absolute curveTo (C) and close (Z).
    * @param path An SVG path split up in array form.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-path-on-chart/" target="_blank">Draw a path in a chart</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-path/" target="_blank">draw a path independent from a chart</a>
    * @since 2.0
    */
  def path(path: js.Array[js.Any] = ???): CleanJsObject[Element] = js.native

  /**
    * Add a rectangle.
    * @param x The x position of the rectangle's upper left corner.
    * @param y The y position of the rectangle's upper left corner.
    * @param width The width of the rectangle.
    * @param height The height of the rectangle.
    * @param cornerRadius The corner radius of all the rectangle's corners.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-rect-on-chart/" target="_blank">Draw a rectangle in a chart</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-rect/" target="_blank">draw a rectangle independent from a chart</a>
    * @since 2.0
    */
  def rect(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???, cornerRadius: Double = ???): CleanJsObject[Element] = js.native

  /**
    * Draw text. The text can contain a subset of HTML, like spans and anchors and some basic text styling of these. For more advanced features like border and background, use <a href="#Renderer.label">label</a> instead.
    * @param str The text or HTML to draw
    * @param x The x position of the text's lower left corner.
    * @param y The y position of the text's lower left corner.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-text-on-chart/" target="_blank">Annotate the chart freely</a>; <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-on-chart/" target="_blank">annotate with a border and in response to the data</a>; <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-text/" target="_blank">formatted text</a>.
    * @since 2.0
    */
  def text(str: String = ???, x: Double = ???, y: Double = ???): CleanJsObject[Element] = js.native

  /**
    * Draw a label, which is an extended <code>text</code> element with support for border and background. Highcharts creates a <code>g</code> element with a <code>text</code> and a <code>path</code> or <code>rect</code> inside, to make it behave somewhat like a HTML <code>div</code>. Border and background are set through <code>stroke</code>, <code>stroke-width</code> and <code>fill</code> attributes using the <a href="#Element.attr">attr</a> method. This must be done before calling <a href="#Element.add">add</a>.
    * @param str 
The text or HTML to draw
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-label-on-chart/" target="_blank">A label on the chart</a>
    */
  def label(str: String = ???, x: Double = ???, y: Double = ???, shape: String = ???, anchorX: Double = ???, anchorY: Double = ???, useHTML: Boolean = ???, baseline: Boolean = ???, className: String = ???): CleanJsObject[Element] = js.native
}
