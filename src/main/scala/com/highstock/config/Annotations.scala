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
  * @note JavaScript name: <code>annotations</code>
  */
@js.annotation.ScalaJSDefined
class Annotations extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Whether the annotation is visible.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/visible/">Set annotation visibility</a>
    * @since 6.0.0
    */
  val visible: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Options for annotation&#39;s labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.</p>
    * @since 6.0.0
    */
  val labelOptions: js.Any = js.undefined

  /**
    * <p>Options for annotation&#39;s shapes. Each shape inherits options
    * from the shapeOptions object. An option from the shapeOptions can be
    * overwritten by config for a specific shape.</p>
    * @since 6.0.0
    */
  val shapeOptions: js.UndefOr[CleanJsObject[AnnotationsShapeOptions]] = js.undefined

  /**
    * <p>The Z index of the annotation.</p>
    * @since 6.0.0
    */
  val zIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>An array of labels for the annotation. For options that apply to
    * multiple labels, they can be added to the
    * <a href="annotations.labelOptions.html">labelOptions</a>.</p>
    * @since 6.0.0
    */
  val labels: js.UndefOr[js.Array[CleanJsObject[AnnotationsLabels]]] = js.undefined

  /**
    * <p>An array of shapes for the annotation. For options that apply to
    * multiple shapes, then can be added to the
    * <a href="annotations.shapeOptions.html">shapeOptions</a>.</p>
    * @since 6.0.0
    */
  val shapes: js.UndefOr[js.Array[CleanJsObject[AnnotationsShapes]]] = js.undefined
}

object Annotations {
  /**
    * @param visible <p>Whether the annotation is visible.</p>
    * @param labelOptions <p>Options for annotation&#39;s labels. Each label inherits options. from the labelOptions object. An option from the labelOptions can be. overwritten by config for a specific label.</p>
    * @param shapeOptions <p>Options for annotation&#39;s shapes. Each shape inherits options. from the shapeOptions object. An option from the shapeOptions can be. overwritten by config for a specific shape.</p>
    * @param zIndex <p>The Z index of the annotation.</p>
    * @param labels <p>An array of labels for the annotation. For options that apply to. multiple labels, they can be added to the. <a href="annotations.labelOptions.html">labelOptions</a>.</p>
    * @param shapes <p>An array of shapes for the annotation. For options that apply to. multiple shapes, then can be added to the. <a href="annotations.shapeOptions.html">shapeOptions</a>.</p>
    */
  def apply(visible: js.UndefOr[Boolean] = js.undefined, labelOptions: js.UndefOr[js.Any] = js.undefined, shapeOptions: js.UndefOr[CleanJsObject[AnnotationsShapeOptions]] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, labels: js.UndefOr[js.Array[CleanJsObject[AnnotationsLabels]]] = js.undefined, shapes: js.UndefOr[js.Array[CleanJsObject[AnnotationsShapes]]] = js.undefined): Annotations = {
    val visibleOuter: js.UndefOr[Boolean] = visible
    val labelOptionsOuter: js.Any = labelOptions
    val shapeOptionsOuter: js.UndefOr[CleanJsObject[AnnotationsShapeOptions]] = shapeOptions
    val zIndexOuter: js.UndefOr[Double] = zIndex
    val labelsOuter: js.UndefOr[js.Array[CleanJsObject[AnnotationsLabels]]] = labels
    val shapesOuter: js.UndefOr[js.Array[CleanJsObject[AnnotationsShapes]]] = shapes
    com.highcharts.HighchartsGenericObject.toCleanObject(new Annotations {
      override val visible: js.UndefOr[Boolean] = visibleOuter
      override val labelOptions: js.Any = labelOptionsOuter
      override val shapeOptions: js.UndefOr[CleanJsObject[AnnotationsShapeOptions]] = shapeOptionsOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
      override val labels: js.UndefOr[js.Array[CleanJsObject[AnnotationsLabels]]] = labelsOuter
      override val shapes: js.UndefOr[js.Array[CleanJsObject[AnnotationsShapes]]] = shapesOuter
    })
  }
}
