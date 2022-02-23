package com.atnncei.reom.Ubilqa

import android.app.Application
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.atnncei.reom.Chempik.Delikak.Dekaloc
import com.atnncei.reom.Chempik.tinege
import com.atnncei.reom.Chempik.xynka
import com.atnncei.reom.Retinok.Salata
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.onesignal.OneSignal
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

var lyidocha: String? = null
var gaignak: String? = null
var repichokna = "SzJOV045ZkR6aEY4UmdiYTZnYk1nZA=="

@DelicateCoroutinesApi
class Allsq : Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(Salata("N2U5OWFlNTYtMWJlOS00OWYwLWEyYWYtN2M1ODFlZDBkY2Jh"))
        GlobalScope.launch {
            val oyukq: AdvertisingIdClient.Info =
                AdvertisingIdClient.getAdvertisingIdInfo(this@Allsq)
            gaignak = oyukq.id
        }
        val okno = object : AppsFlyerConversionListener {
            var hiqa = "YWZfc3RhdHVz"
            override fun onConversionDataSuccess(perchaha: MutableMap<String, Any>) {
                for (kjhq in perchaha.keys)
                  xynka =
                        Objects.requireNonNull(perchaha[Salata(hiqa)]).toString()
                if (xynka == Salata("Tm9uLW9yZ2FuaWM=")) {
                    val keitik = Objects.requireNonNull(perchaha[Salata("Y2FtcGFpZ24=")]).toString()
                   tinege = Dekaloc(keitik)
                }
            }

            override fun onConversionDataFail(p054: String?) {}
            override fun onAppOpenAttribution(p0123: MutableMap<String, String>?) {}
            override fun onAttributionFailure(p04656: String?) {}
        }
        lyidocha = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        AppsFlyerLib.getInstance().run {
            init(Salata(repichokna), okno, this@Allsq)
            start(this@Allsq)
        }
    }
}