package com.atnncei.reom.Diciti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.atnncei.reom.R
import com.atnncei.reom.Retinok.Salata

class Okopelka : AppCompatActivity() {
   lateinit var piplo:WebView
    override fun onCreate(signalk: Bundle?) {
        super.onCreate(signalk)
        setContentView(R.layout.activity_okopelka)
        window.addFlags(1024)
        piplo = findViewById(R.id.pipilo)
        piplo.loadUrl(Salata("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49NE5CTVloMTJ6NWZ4c3Mxbmx6TXJ5Nll3ajJPeVFSV2I="))
    }
}