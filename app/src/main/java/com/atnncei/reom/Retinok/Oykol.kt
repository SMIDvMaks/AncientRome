package com.atnncei.reom.Retinok

import android.app.Activity
import android.content.Context
import android.util.Base64
import com.atnncei.reom.Chempik.Delikak.Dekaloc
import com.facebook.FacebookSdk
import com.facebook.applinks.AppLinkData
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import java.util.regex.Pattern

var lixok:String? = null
var lichak:String? = null
var boykolol:String? = null
var xupoiyha:String? = null
val upne = "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9TTUlEdk1ha3MvNGM2OTBkODAxNzA4OTk1ZWJlN2NhMWU5MTNiMjFjYmQvcmF3L0FuY2llbnQlMjUyMFJvbWUv"
interface Oykol {
    @GET("https://gist.githubusercontent.com/SMIDvMaks/4c690d801708995ebe7ca1e913b21cbd/raw/Ancient%2520Rome/")
    suspend fun KiL(): Response<String>
}
class Knm{
    val bocha = Retrofit.Builder()
        .baseUrl(Salata(upne))
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    suspend fun Lelo(){
        val likn = "\\|"
        val brendon:Oykol = bocha.create(Oykol::class.java)
        val brecha = brendon.KiL().body()
        val bebka = Pattern.compile(likn).split(brecha)
        xupoiyha = bebka[2]
        lichak = bebka[0]
        boykolol = bebka[1]

    }

    fun hinder(gybra:Context){
        FacebookSdk.setApplicationId(xupoiyha!!)
        FacebookSdk.setAdvertiserIDCollectionEnabled(true)
        FacebookSdk.sdkInitialize(gybra)
        FacebookSdk.setAutoLogAppEventsEnabled(true)
        FacebookSdk.setAutoInitEnabled(true)
        FacebookSdk.fullyInitialize()
        AppLinkData.fetchDeferredAppLinkData(gybra){ njj ->
            var umik = njj
            if (umik == null) umik = AppLinkData.createFromActivity(gybra as Activity)
            if (umik != null){
                val jmok = umik.targetUri
                val filipka = jmok?.query.toString()
                lixok = Dekaloc(filipka)

            }
        }
    }
}

fun Salata(sapcik:String):String{
    val potato = String(Base64.decode(sapcik,Base64.DEFAULT))
    return potato
}