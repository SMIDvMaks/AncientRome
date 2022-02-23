package com.atnncei.reom.Chempik

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.webkit.ValueCallback
import android.webkit.WebChromeClient
import android.webkit.WebView
import java.lang.Exception

var gidro: ValueCallback<Array<Uri>>? = null

class Ziprov(val jinko: Context) : WebChromeClient() {
    override fun onShowFileChooser(
        weika: WebView?,
        feigha: ValueCallback<Array<Uri>>?,
        okyu: FileChooserParams?
    ): Boolean {
        if (gidro != null) {
            gidro!!.onReceiveValue(null)
            gidro = null
        }
        gidro = feigha
        try {
            val umik = Intent(Intent.ACTION_GET_CONTENT)
            umik.addCategory(Intent.CATEGORY_OPENABLE)
            umik.type = "*/*"
            (jinko as Activity).startActivityForResult(Intent.createChooser(umik, "Cherepaha"), 100)
        } catch (jik: Exception) {
            gidro = null
            return false
        }
        return true
    }
}


