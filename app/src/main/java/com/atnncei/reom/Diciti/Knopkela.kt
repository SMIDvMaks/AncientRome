package com.atnncei.reom.Diciti

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.atnncei.reom.R
import com.atnncei.reom.Retinok.Salata
import com.atnncei.reom.ibg

class Knopkela : ComponentActivity() {
    override fun onCreate(sapikaa: Bundle?) {
        super.onCreate(sapikaa)
        window.addFlags(1024)
        setContent {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.mipmap.bg),
                contentDescription = Salata(ibg),
                contentScale = ContentScale.FillBounds
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = Salata("QW5jaWVudCBSb21l"), fontWeight = FontWeight.Bold,
                    fontSize = 43.sp, color = Color.Yellow
                )
                Button(
                    onClick = {
                        val keycik = Intent(this@Knopkela, GazKooa::class.java)
                        startActivity(keycik)
                    },
                    modifier = Modifier.width(260.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow)
                ) {
                    Text(
                        text = "Start", fontWeight = FontWeight.Bold,
                        fontSize = 26.sp

                    )
                }
                Button(
                    modifier = Modifier.width(260.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
                    onClick = {
                        startActivity(Intent(this@Knopkela, Okopelka::class.java))
                    }
                ) {
                    Text(
                        text = "Privacy Policy", fontWeight = FontWeight.Bold,
                        fontSize = 26.sp
                    )
                }
                Button(
                    modifier = Modifier.width(260.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
                    onClick = {
                        finishAffinity()
                    }
                ) {
                    Text(
                        text = "Close game", fontWeight = FontWeight.Bold,
                        fontSize = 26.sp
                    )
                }
            }
        }
    }
}

