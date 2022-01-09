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
  * @note JavaScript name: <code>annotations</code>
  */
class Annotations extends com.highcharts.HighchartsGenericObject {

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
    * <p>A crooked line annotation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations-advanced/crooked-line/">Crooked line</a>
    * @since 6.0.0
    */
  var crookedLine: js.Any = js.undefined

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
    * <p>An elliott wave annotation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations-advanced/elliott-wave/">Elliott wave</a>
    * @since 6.0.0
    */
  var elliottWave: js.UndefOr[CleanJsObject[AnnotationsElliottWave]] = js.undefined

  /**
    * <p>Events available in annotations.</p>
    * @since 6.0.0
    */
  var events: js.Any = js.undefined

  /**
    * <p>A fibonacci annotation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations-advanced/fibonacci/">Fibonacci</a>
    * @since 6.0.0
    */
  var fibonacci: js.UndefOr[CleanJsObject[AnnotationsFibonacci]] = js.undefined

  /**
    * <p>The Fibonacci Time Zones annotation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations-advanced/fibonacci-time-zones/">Fibonacci Time Zones</a>
    * @since 9.3.0
    */
  var fibonacciTimeZones: js.UndefOr[CleanJsObject[AnnotationsFibonacciTimeZones]] = js.undefined

  /**
    * <p>Sets an ID for an annotation. Can be user later when
    * removing an annotation in <a href="/class-reference/Highcharts.Chart#removeAnnotation">Chart#removeAnnotation(id)</a> method.</p>
    * @since 6.0.0
    */
  var id: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>An infinity line annotation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations-advanced/infinity-line/">Infinity Line</a>
    * @since 6.0.0
    */
  var infinityLine: js.UndefOr[CleanJsObject[AnnotationsInfinityLine]] = js.undefined

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
    * <p>A measure annotation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations-advanced/measure/">Measure</a>
    * @since 6.0.0
    */
  var measure: js.UndefOr[CleanJsObject[AnnotationsMeasure]] = js.undefined

  /**
    * <p>A pitchfork annotation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations-advanced/pitchfork/">Pitchfork</a>
    * @since 6.0.0
    */
  var pitchfork: js.UndefOr[CleanJsObject[AnnotationsPitchfork]] = js.undefined

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
  var timeCycles: js.UndefOr[CleanJsObject[AnnotationsTimeCycles]] = js.undefined

  /**
    * <p>A tunnel annotation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations-advanced/tunnel/">Tunnel</a>
    * @since 6.0.0
    */
  var tunnel: js.UndefOr[CleanJsObject[AnnotationsTunnel]] = js.undefined

  /**
    * <p>A vertical line annotation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations-advanced/vertical-line/">Vertical line</a>
    * @since 6.0.0
    */
  var verticalLine: js.UndefOr[CleanJsObject[AnnotationsVerticalLine]] = js.undefined

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

object Annotations {
  /**
    * @param animation <p>Enable or disable the initial animation when a series is. displayed for the <code>annotation</code>. The animation can also be set. as a configuration object. Please note that this option only. applies to the initial animation.. For other animations, see <a href="#chart.animation">chart.animation</a>. and the animation parameter under the API methods.. The following properties are supported:</p>. <ul>. <li><code>defer</code>: The animation delay time in milliseconds.</li>. </ul>
    * @param controlPointOptions <p>Options for annotation&#39;s control points. Each control point. inherits options from controlPointOptions object.. Options from the controlPointOptions can be overwritten. by options in a specific control point.</p>
    * @param crookedLine <p>A crooked line annotation.</p>
    * @param crop <p>Whether to hide the part of the annotation. that is outside the plot area.</p>
    * @param draggable <p>Allow an annotation to be draggable by a user. Possible. values are <code>&#39;x&#39;</code>, <code>&#39;xy&#39;</code>, <code>&#39;y&#39;</code> and <code>&#39;&#39;</code> (disabled).</p>
    * @param elliottWave <p>An elliott wave annotation.</p>
    * @param events <p>Events available in annotations.</p>
    * @param fibonacci <p>A fibonacci annotation.</p>
    * @param fibonacciTimeZones <p>The Fibonacci Time Zones annotation.</p>
    * @param id <p>Sets an ID for an annotation. Can be user later when. removing an annotation in <a href="/class-reference/Highcharts.Chart#removeAnnotation">Chart#removeAnnotation(id)</a> method.</p>
    * @param infinityLine <p>An infinity line annotation.</p>
    * @param labelOptions <p>Options for annotation&#39;s labels. Each label inherits options. from the labelOptions object. An option from the labelOptions. can be overwritten by config for a specific label.</p>
    * @param labels <p>An array of labels for the annotation. For options that apply. to multiple labels, they can be added to the. <a href="annotations.labelOptions.html">labelOptions</a>.</p>
    * @param measure <p>A measure annotation.</p>
    * @param pitchfork <p>A pitchfork annotation.</p>
    * @param shapeOptions <p>Options for annotation&#39;s shapes. Each shape inherits options. from the shapeOptions object. An option from the shapeOptions. can be overwritten by config for a specific shape.</p>
    * @param shapes <p>An array of shapes for the annotation. For options that apply. to multiple shapes, then can be added to the. <a href="annotations.shapeOptions.html">shapeOptions</a>.</p>
    * @param timeCycles <p>The TimeCycles Annotation</p>
    * @param tunnel <p>A tunnel annotation.</p>
    * @param verticalLine <p>A vertical line annotation.</p>
    * @param visible <p>Whether the annotation is visible.</p>
    * @param zIndex <p>The Z index of the annotation.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined, controlPointOptions: js.UndefOr[js.Any] = js.undefined, crookedLine: js.UndefOr[js.Any] = js.undefined, crop: js.UndefOr[Boolean] = js.undefined, draggable: js.UndefOr[js.Any] = js.undefined, elliottWave: js.UndefOr[CleanJsObject[AnnotationsElliottWave]] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, fibonacci: js.UndefOr[CleanJsObject[AnnotationsFibonacci]] = js.undefined, fibonacciTimeZones: js.UndefOr[CleanJsObject[AnnotationsFibonacciTimeZones]] = js.undefined, id: js.UndefOr[Double | String] = js.undefined, infinityLine: js.UndefOr[CleanJsObject[AnnotationsInfinityLine]] = js.undefined, labelOptions: js.UndefOr[js.Any] = js.undefined, labels: js.UndefOr[js.Array[js.Any]] = js.undefined, measure: js.UndefOr[CleanJsObject[AnnotationsMeasure]] = js.undefined, pitchfork: js.UndefOr[CleanJsObject[AnnotationsPitchfork]] = js.undefined, shapeOptions: js.UndefOr[js.Any] = js.undefined, shapes: js.UndefOr[js.Array[js.Any]] = js.undefined, timeCycles: js.UndefOr[CleanJsObject[AnnotationsTimeCycles]] = js.undefined, tunnel: js.UndefOr[CleanJsObject[AnnotationsTunnel]] = js.undefined, verticalLine: js.UndefOr[CleanJsObject[AnnotationsVerticalLine]] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): Annotations = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Annotations {
      this.animation = animation
      this.controlPointOptions = controlPointOptions
      this.crookedLine = crookedLine
      this.crop = crop
      this.draggable = draggable
      this.elliottWave = elliottWave
      this.events = events
      this.fibonacci = fibonacci
      this.fibonacciTimeZones = fibonacciTimeZones
      this.id = id
      this.infinityLine = infinityLine
      this.labelOptions = labelOptions
      this.labels = labels
      this.measure = measure
      this.pitchfork = pitchfork
      this.shapeOptions = shapeOptions
      this.shapes = shapes
      this.timeCycles = timeCycles
      this.tunnel = tunnel
      this.verticalLine = verticalLine
      this.visible = visible
      this.zIndex = zIndex
    })
  }
}
