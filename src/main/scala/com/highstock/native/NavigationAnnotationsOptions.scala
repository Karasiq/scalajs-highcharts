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
  * @note JavaScript name: <code>navigation-annotationsOptions</code>
  */
class NavigationAnnotationsOptions extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the initial animation when a series is
    * displayed for the <code>annotation</code>. The animation can also be set
    * as a configuration object. Please note that this option only
    * applies to the initial animation.
    * For other animations, see <a href="#chart.animation">chart.animation</a>
    * and the animation parameter under the API methods.
    * The following properties are supported:</p>
    * <ul>
    * <li><code>defer</code>: The animation delay time in milliseconds.</li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/defer/">Animation defer settings</a>
    * @since 8.2.0
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Options for annotation&#39;s control points. Each control point
    * inherits options from controlPointOptions object.
    * Options from the controlPointOptions can be overwritten
    * by options in a specific control point.</p>
    * @since 6.0.0
    */
  var controlPointOptions: js.Any = js.undefined

  /**
    * <p>Whether to hide the part of the annotation
    * that is outside the plot area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-crop-overflow/">Crop line annotation</a>
    * @since 9.3.0
    */
  var crop: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Allow an annotation to be draggable by a user. Possible
    * values are <code>&#39;x&#39;</code>, <code>&#39;xy&#39;</code>, <code>&#39;y&#39;</code> and <code>&#39;&#39;</code> (disabled).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/draggable/">Annotations draggable: 'xy'</a>
    * @since 6.0.0
    */
  var draggable: js.Any = js.undefined

  /**
    * <p>Events available in annotations.</p>
    * @since 6.0.0
    */
  var events: js.Any = js.undefined

  /**
    * <p>The Fibonacci Time Zones annotation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations-advanced/fibonacci-time-zones/">Fibonacci Time Zones</a>
    * @since 9.3.0
    */
  var fibonacciTimeZones: js.UndefOr[CleanJsObject[NavigationAnnotationsOptionsFibonacciTimeZones]] = js.undefined

  /**
    * <p>Sets an ID for an annotation. Can be user later when
    * removing an annotation in <a href="/class-reference/Highcharts.Chart#removeAnnotation">Chart#removeAnnotation(id)</a> method.</p>
    * @since 6.0.0
    */
  var id: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>Options for annotation&#39;s labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions
    * can be overwritten by config for a specific label.</p>
    * @since 6.0.0
    */
  var labelOptions: js.Any = js.undefined

  /**
    * <p>An array of labels for the annotation. For options that apply
    * to multiple labels, they can be added to the
    * <a href="annotations.labelOptions.html">labelOptions</a>.</p>
    * @since 6.0.0
    */
  var labels: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>Options for annotation&#39;s shapes. Each shape inherits options
    * from the shapeOptions object. An option from the shapeOptions
    * can be overwritten by config for a specific shape.</p>
    * @since 6.0.0
    */
  var shapeOptions: js.Any = js.undefined

  /**
    * <p>An array of shapes for the annotation. For options that apply
    * to multiple shapes, then can be added to the
    * <a href="annotations.shapeOptions.html">shapeOptions</a>.</p>
    * @since 6.0.0
    */
  var shapes: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>The TimeCycles Annotation</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations-advanced/time-cycles/">Time Cycles annotation</a>
    * @since 6.0.0
    */
  var timeCycles: js.UndefOr[CleanJsObject[NavigationAnnotationsOptionsTimeCycles]] = js.undefined

  /**
    * <p>Whether the annotation is visible.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/visible/">Set annotation visibility</a>
    * @since 6.0.0
    */
  var visible: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The Z index of the annotation.</p>
    * @since 6.0.0
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object NavigationAnnotationsOptions {
  /**
    * @param animation <p>Enable or disable the initial animation when a series is. displayed for the <code>annotation</code>. The animation can also be set. as a configuration object. Please note that this option only. applies to the initial animation.. For other animations, see <a href="#chart.animation">chart.animation</a>. and the animation parameter under the API methods.. The following properties are supported:</p>. <ul>. <li><code>defer</code>: The animation delay time in milliseconds.</li>. </ul>
    * @param controlPointOptions <p>Options for annotation&#39;s control points. Each control point. inherits options from controlPointOptions object.. Options from the controlPointOptions can be overwritten. by options in a specific control point.</p>
    * @param crop <p>Whether to hide the part of the annotation. that is outside the plot area.</p>
    * @param draggable <p>Allow an annotation to be draggable by a user. Possible. values are <code>&#39;x&#39;</code>, <code>&#39;xy&#39;</code>, <code>&#39;y&#39;</code> and <code>&#39;&#39;</code> (disabled).</p>
    * @param events <p>Events available in annotations.</p>
    * @param fibonacciTimeZones <p>The Fibonacci Time Zones annotation.</p>
    * @param id <p>Sets an ID for an annotation. Can be user later when. removing an annotation in <a href="/class-reference/Highcharts.Chart#removeAnnotation">Chart#removeAnnotation(id)</a> method.</p>
    * @param labelOptions <p>Options for annotation&#39;s labels. Each label inherits options. from the labelOptions object. An option from the labelOptions. can be overwritten by config for a specific label.</p>
    * @param labels <p>An array of labels for the annotation. For options that apply. to multiple labels, they can be added to the. <a href="annotations.labelOptions.html">labelOptions</a>.</p>
    * @param shapeOptions <p>Options for annotation&#39;s shapes. Each shape inherits options. from the shapeOptions object. An option from the shapeOptions. can be overwritten by config for a specific shape.</p>
    * @param shapes <p>An array of shapes for the annotation. For options that apply. to multiple shapes, then can be added to the. <a href="annotations.shapeOptions.html">shapeOptions</a>.</p>
    * @param timeCycles <p>The TimeCycles Annotation</p>
    * @param visible <p>Whether the annotation is visible.</p>
    * @param zIndex <p>The Z index of the annotation.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined, controlPointOptions: js.UndefOr[js.Any] = js.undefined, crop: js.UndefOr[Boolean] = js.undefined, draggable: js.UndefOr[js.Any] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, fibonacciTimeZones: js.UndefOr[CleanJsObject[NavigationAnnotationsOptionsFibonacciTimeZones]] = js.undefined, id: js.UndefOr[Double | String] = js.undefined, labelOptions: js.UndefOr[js.Any] = js.undefined, labels: js.UndefOr[js.Array[js.Any]] = js.undefined, shapeOptions: js.UndefOr[js.Any] = js.undefined, shapes: js.UndefOr[js.Array[js.Any]] = js.undefined, timeCycles: js.UndefOr[CleanJsObject[NavigationAnnotationsOptionsTimeCycles]] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): NavigationAnnotationsOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigationAnnotationsOptions {
      this.animation = animation
      this.controlPointOptions = controlPointOptions
      this.crop = crop
      this.draggable = draggable
      this.events = events
      this.fibonacciTimeZones = fibonacciTimeZones
      this.id = id
      this.labelOptions = labelOptions
      this.labels = labels
      this.shapeOptions = shapeOptions
      this.shapes = shapes
      this.timeCycles = timeCycles
      this.visible = visible
      this.zIndex = zIndex
    })
  }
}
