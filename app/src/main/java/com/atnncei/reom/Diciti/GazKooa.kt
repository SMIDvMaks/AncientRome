package com.atnncei.reom.Diciti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.atnncei.reom.R

class GazKooa : AppCompatActivity() {
    lateinit var kika:Button
    override fun onCreate(terar: Bundle?) {
        super.onCreate(terar)
        setContentView(R.layout.activity_gaz_kooa)
        window.addFlags(1024)
        kika = findViewById(R.id.start_lucky)
        kika.setOnClickListener {
            startActivity(Intent(this,OkopStart::class.java))
        }
    }
}