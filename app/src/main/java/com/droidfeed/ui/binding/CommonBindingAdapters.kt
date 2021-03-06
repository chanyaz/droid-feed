package com.droidfeed.ui.binding

import android.databinding.BindingAdapter
import android.support.v4.widget.ContentLoadingProgressBar
import android.text.format.DateUtils
import android.view.View
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView
import com.droidfeed.util.extention.loadImage
import java.util.*

/**
 * Created by Dogan Gulcan on 9/30/17.
 */

@BindingAdapter("imageResource")
fun loadImage(imageView: ImageView, url: Any) {
    imageView.loadImage(url)
}

@BindingAdapter("avdImageResource")
fun avdImageResource(imageView: ImageView, avdImageResource: Int) {
    imageView.setImageResource(avdImageResource)
//    if (isClickedRecently) imageView.drawable?.let { (it as? AnimatedVectorDrawable)?.start() }
}

@BindingAdapter("visibilityToggle")
fun visibilityToggle(view: View, show: Boolean) {
    view.visibility = if (show) View.VISIBLE else View.GONE
}

@BindingAdapter("contentProgressBarVisibility")
fun contentProgressBarVisibility(view: ContentLoadingProgressBar, show: Boolean) {
    if (show) view.show() else view.hide()
}

@BindingAdapter("loadHtml")
fun loadHtml(webView: WebView, htmlContent: String) {
    if (htmlContent.isNotBlank()) {
        webView.loadData(htmlContent, "text/html", "UTF-8")
    }
}

@BindingAdapter("relativeDate")
fun setRelativeDate(view: TextView, timeStamp: Long) {
    view.text = DateUtils.getRelativeTimeSpanString(
            timeStamp,
            Calendar.getInstance(TimeZone.getDefault()).timeInMillis,
            android.text.format.DateUtils.SECOND_IN_MILLIS)
}