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
  * @note JavaScript name: <code>accessibility-announceNewData</code>
  */
class AccessibilityAnnounceNewData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Optional formatter callback for the announcement. Receives
    * up to three arguments. The first argument is always an array
    * of all series that received updates. If an announcement is
    * already queued, the series that received updates for that
    * announcement are also included in this array. The second
    * argument is provided if <code>chart.addSeries</code> was called, and
    * there is a new series. In that case, this argument is a
    * reference to the new series. The third argument, similarly,
    * is provided if <code>series.addPoint</code> was called, and there is a
    * new point. In that case, this argument is a reference to the
    * new point.</p>
    * <p>The function should return a string with the text to announce
    * to the user. Return empty string to not announce anything.
    * Return <code>false</code> to use the default announcement format.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/custom-dynamic">High priority live alerts</a>
    * @since 7.1.0
    */
  var announcementFormatter: js.Any = js.undefined

  /**
    * <p>Enable announcing new data to screen reader users</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/accessible-dynamic">Dynamic data accessible</a>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Choose whether or not the announcements should interrupt the
    * screen reader. If not enabled, the user will be notified once
    * idle. It is recommended not to enable this setting unless
    * there is a specific reason to do so.</p>
    * @since 7.1.0
    */
  var interruptUser: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Minimum interval between announcements in milliseconds. If
    * new data arrives before this amount of time has passed, it is
    * queued for announcement. If another new data event happens
    * while an announcement is queued, the queued announcement is
    * dropped, and the latest announcement is queued instead. Set
    * to 0 to allow all announcements, but be warned that frequent
    * announcements are disturbing to users.</p>
    * @since 7.1.0
    */
  var minAnnounceInterval: js.UndefOr[Double] = js.undefined
}

object AccessibilityAnnounceNewData {
  /**
    * @param announcementFormatter <p>Optional formatter callback for the announcement. Receives. up to three arguments. The first argument is always an array. of all series that received updates. If an announcement is. already queued, the series that received updates for that. announcement are also included in this array. The second. argument is provided if <code>chart.addSeries</code> was called, and. there is a new series. In that case, this argument is a. reference to the new series. The third argument, similarly,. is provided if <code>series.addPoint</code> was called, and there is a. new point. In that case, this argument is a reference to the. new point.</p>. <p>The function should return a string with the text to announce. to the user. Return empty string to not announce anything.. Return <code>false</code> to use the default announcement format.</p>
    * @param enabled <p>Enable announcing new data to screen reader users</p>
    * @param interruptUser <p>Choose whether or not the announcements should interrupt the. screen reader. If not enabled, the user will be notified once. idle. It is recommended not to enable this setting unless. there is a specific reason to do so.</p>
    * @param minAnnounceInterval <p>Minimum interval between announcements in milliseconds. If. new data arrives before this amount of time has passed, it is. queued for announcement. If another new data event happens. while an announcement is queued, the queued announcement is. dropped, and the latest announcement is queued instead. Set. to 0 to allow all announcements, but be warned that frequent. announcements are disturbing to users.</p>
    */
  def apply(announcementFormatter: js.UndefOr[js.Any] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, interruptUser: js.UndefOr[Boolean] = js.undefined, minAnnounceInterval: js.UndefOr[Double] = js.undefined): AccessibilityAnnounceNewData = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AccessibilityAnnounceNewData {
      this.announcementFormatter = announcementFormatter
      this.enabled = enabled
      this.interruptUser = interruptUser
      this.minAnnounceInterval = minAnnounceInterval
    })
  }
}
