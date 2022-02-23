package com.atnncei.reom.Chempik

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import com.atnncei.reom.Chempik.Delikak.Fordyc
import com.atnncei.reom.Diciti.Knopkela
import com.atnncei.reom.Kopo
import com.atnncei.reom.P2AR8
import com.atnncei.reom.Retinok.boykolol
import com.atnncei.reom.Retinok.Salata
import com.atnncei.reom.Retinok.lichak
import com.atnncei.reom.Retinok.lixok
import com.atnncei.reom.glavaCl
import kotlinx.coroutines.DelicateCoroutinesApi

@DelicateCoroutinesApi
class Likol(val abaka: Context) : WebViewClient() {

    override fun onPageStarted(vyeo: WebView?, buchoo: String?, ziproro: Bitmap?) {
        super.onPageStarted(vyeo, buchoo, ziproro)
        if (buchoo!!.contains(Salata("Z2FwcHM9NDA0"))) {
            val uiq = Intent(abaka, Knopkela::class.java)
            abaka.startActivity(uiq)
            (abaka as Activity).finish()

        }
    }

    override fun onPageFinished(mikla: WebView?, povoe: String?) {
        super.onPageFinished(mikla, povoe)
        val kulo: SharedPreferences.Editor? = Kopo?.edit()
        kulo?.putString("Leybar", povoe)?.apply()
    }
}

var xynka: String? = null
var tinege: String? = null

@DelicateCoroutinesApi
@Composable
fun Porsino(gansa: P2AR8) {
    val ipa = "Tk8="
    if (xynka.equals(Salata("Tm9uLW9yZ2FuaWM="))) {
        val mercic = lichak + tinege
        glavaCl.Suprea(kumik = mercic)
    } else if (lixok != null) {
        val ronik = lichak + lixok
        glavaCl.Suprea(kumik = ronik)
    } else {
        if (boykolol == Salata(ipa)) {
            val gybka = Intent(gansa, Knopkela::class.java)
            gansa.startActivity(gybka)
            gansa.finish()
        } else {
            Fordyc()
        }
    }
}