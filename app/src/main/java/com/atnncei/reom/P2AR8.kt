package com.atnncei.reom

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.Settings
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.atnncei.reom.Chempik.*
import com.atnncei.reom.Diciti.Knopkela
import com.atnncei.reom.Retinok.Knm
import com.atnncei.reom.Retinok.Salata
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

var Kopo: SharedPreferences? = null
var mbv: String? = null
val ibg = "Y29tLmF0bm5jZWkucmVvbQ=="
var reMbo = Knm()

@OptIn(DelicateCoroutinesApi::class)
var glavaCl = P2AR8()

@DelicateCoroutinesApi
var kimbere: Int? = 0

@DelicateCoroutinesApi
class P2AR8 : ComponentActivity() {
    override fun onActivityResult(mintra: Int, mutry: Int, laylol: Intent?) {
        super.onActivityResult(mintra, mutry, laylol)
        if (mintra == 100) {
            if (gidro == null) {
                return
            }
            gidro!!.onReceiveValue(
                WebChromeClient.FileChooserParams.parseResult(mutry, laylol)
            )
            gidro = null
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Composable
    fun Suprea(kumik: String) {
        var dzik: WebView? = null
        AndroidView(factory = { lokomoko ->
            WebView(lokomoko).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                this.webViewClient = Likol(context)
                this.webChromeClient = Ziprov(context)
                settings.apply {
                    setAppCacheEnabled(true)
                    allowFileAccessFromFileURLs = true
                    saveFormData = true
                    mixedContentMode = 0
                    savePassword = true
                    allowContentAccess = true
                    setRenderPriority(WebSettings.RenderPriority.HIGH)
                    setEnableSmoothTransition(true)
                    loadsImagesAutomatically = true
                    allowUniversalAccessFromFileURLs = true
                    databaseEnabled = true
                    loadWithOverviewMode = true
                    useWideViewPort = true
                    javaScriptCanOpenWindowsAutomatically = true
                    domStorageEnabled = true
                    allowFileAccess = true
                    javaScriptEnabled = true
                }
                dzik = this
                loadUrl(kumik)
            }
        })
        BackHandler {
            if (dzik!!.isFocused && dzik!!.canGoBack()) {
                dzik?.goBack()
            } else {
            }
        }
    }


    override fun onCreate(kuplo: Bundle?) {
        super.onCreate(kuplo)
        setContent {
            Image(
                modifier = androidx.compose.ui.Modifier.fillMaxSize(),
                painter = painterResource(id = R.mipmap.bg),
                contentDescription = Salata(ibg),
                contentScale = ContentScale.FillBounds
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = androidx.compose.ui.Modifier.fillMaxSize()
            ) {
                CircularProgressIndicator(
                    color = Color.LightGray,
                    strokeWidth = 10.dp
                )
            }
        }
        Kopo = getSharedPreferences(Salata(ibg), Context.MODE_PRIVATE)
        mbv = Kopo?.getString("Leybar", null)

        GlobalScope.launch {
            reMbo.Lelo()
            reMbo.hinder(this@P2AR8)
        }

        kimbere = Settings.Secure.getInt(
            this.contentResolver, Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0
        )
        if (kimbere == 0) {
            if (mbv != null) {
                setContent {
                    Suprea(kumik = mbv.toString())
                }
            } else {
                Handler(Looper.getMainLooper()).postDelayed({
                    setContent {
                        Porsino(gansa = this)
                    }
                }, 6000)
            }
        } else {
            val nitror = Intent(this, Knopkela::class.java)
            startActivity(nitror)
            finish()
        }
    }

}

