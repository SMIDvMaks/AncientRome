package com.atnncei.reom.Diciti


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.Toast
import com.atnncei.reom.R
import com.atnncei.reom.Retinok.Salata
import kotlinx.android.synthetic.main.activity_okop_start.*

class OkopStart : AppCompatActivity() {
    var tineq = "Y29tLmF0bm5jZWkucmVvbQ=="
    var scopceh = 0
    var olopaq = R.drawable.ic_slot_1
    var yeeer = R.drawable.ic_slot_5
    lateinit var olop: ImageView
    lateinit var olopay: ImageView
    lateinit var olopay1: ImageView
    lateinit var olopay2: ImageView
    lateinit var olopay3: ImageView
    lateinit var olopay4: ImageView
    lateinit var olopay5: ImageView
    lateinit var olopay6: ImageView
    lateinit var Pyps: Array<Int>
    var handla = Handler()
    override fun onCreate(kjok: Bundle?) {
        super.onCreate(kjok)
        setContentView(R.layout.activity_okop_start)
        window.addFlags(1024)
        var linod = 15
        Pyps = arrayOf(
            R.id.ici1, R.id.ici2,
            R.id.ici3, R.id.ici4,
            R.id.ici5, R.id.ici6, R.id.ici7
        )
        olopay = findViewById(R.id.ici1)
        olopay1 = findViewById(R.id.ici2)
        olopay2 = findViewById(R.id.ici3)
        olopay3 = findViewById(R.id.ici4)
        olopay4 = findViewById(R.id.ici5)
        olopay5 = findViewById(R.id.ici6)
        olopay6 = findViewById(R.id.ici7)
        olop = findViewById(R.id.okop_start)
        olop.setOnClickListener {
            if(linod == 0){
                recreate()
            }
            linod--
            txt_btn.text = "$linod"
            starOk()
            if (scopceh >=2200){
               resikImg.visibility = ImageView.VISIBLE
                Handler(Looper.getMainLooper()).postDelayed({
                    resikImg.visibility = ImageView.INVISIBLE
                    recreate()
                },2000)
            }
        }
    }

    fun starOk() {
        var ryper1: Int = 0
        var ryper2: Int = 0
        var ryper3: Int = 0
        var ryper4: Int = 0
        var ryper5: Int = 0
        var ryper6: Int = 0
        var ryper7: Int = 0
        var polovica = 0
        handla.post(object : Runnable {
            @SuppressLint("SetTextI18n")
            override fun run() {
                polovica++
                if (polovica != 40) {
                    handla.postDelayed(this::run, 20)
                    val rapcik1 = (1..6).random()
                    ryper1 = resources.getIdentifier(
                        "ic_slot_$rapcik1",
                        "drawable", Salata(tineq)
                    )
                    olopay.setImageResource(ryper1)
                    val rapcik2 = (1..6).random()
                    ryper2 = resources.getIdentifier(
                        "ic_slot_$rapcik2",
                        "drawable", Salata(tineq)
                    )
                    olopay1.setImageResource(ryper2)
                    val rapcik3 = (1..6).random()
                    ryper3 = resources.getIdentifier(
                        "ic_slot_$rapcik3",
                        "drawable", Salata(tineq)
                    )
                    olopay2.setImageResource(ryper3)
                    val rapcik4 = (1..6).random()
                    ryper4 = resources.getIdentifier(
                        "ic_slot_$rapcik4",
                        "drawable", Salata(tineq)
                    )
                    olopay3.setImageResource(ryper4)
                    val rapcik5 = (1..6).random()
                    ryper5 = resources.getIdentifier(
                        "ic_slot_$rapcik5",
                        "drawable", Salata(tineq)
                    )
                    olopay4.setImageResource(ryper5)
                    val rapcik6 = (1..6).random()
                    ryper6 = resources.getIdentifier(
                        "ic_slot_$rapcik6",
                        "drawable", Salata(tineq)
                    )
                    olopay5.setImageResource(ryper6)
                    val rapcik7 = (1..6).random()
                    ryper7 = resources.getIdentifier(
                        "ic_slot_$rapcik7",
                        "drawable", Salata(tineq)
                    )
                    olopay6.setImageResource(ryper7)


                } else if (ryper1 == ryper2 && ryper2 == ryper3 && ryper3 == ryper4 &&
                    ryper4 == ryper5 && ryper5 == ryper6 && ryper6 == ryper7 && ryper7 == ryper1
                ) {
                    Toast.makeText(this@OkopStart, "You win", Toast.LENGTH_SHORT).show()
                    scopceh += 999
                    score_click.text = "Points: $scopceh"
                } else {
                    if (ryper1 != ryper2 && ryper1 != ryper3 && ryper1 != ryper4 &&
                        ryper1 != ryper5 && ryper1 != ryper6 && ryper1 != ryper7 &&
                        ryper1 != ryper2 && ryper2 != ryper3 && ryper2 != ryper4 &&
                        ryper2 != ryper5 && ryper2 != ryper6 && ryper2 != ryper7 &&
                        ryper3 != ryper1 && ryper3 != ryper2 && ryper3 != ryper4 &&
                        ryper3 != ryper5 && ryper3 != ryper6 && ryper3 != ryper7 &&
                        ryper4 != ryper1 && ryper4 != ryper2 && ryper4 != ryper3 &&
                        ryper4 != ryper5 && ryper4 != ryper6 && ryper4 != ryper7 &&
                        ryper5 != ryper1 && ryper5 != ryper2 && ryper5 != ryper3 &&
                        ryper5 != ryper4 && ryper5 != ryper6 && ryper5 != ryper7 &&
                        ryper6 != ryper1 && ryper6 != ryper2 && ryper6 != ryper3 &&
                        ryper6 != ryper4 && ryper6 != ryper5 && ryper6 != ryper7 &&
                        ryper7 != ryper1 && ryper7 != ryper2 && ryper7 != ryper3 &&
                        ryper7 != ryper4 && ryper7 != ryper5 && ryper7 != ryper6
                    ) {
                        Toast.makeText(this@OkopStart, "You lost this game", Toast.LENGTH_SHORT)
                            .show()
                        scopceh -= 1499
                        score_click.text = "Points: $scopceh"
                    } else if (ryper1 != ryper2 && ryper2 != ryper3 && ryper3 != ryper4 &&
                        ryper4 == ryper5 && ryper5 == ryper6 && ryper6 == ryper7 && ryper7 == ryper1
                    ) {
                        Toast.makeText(this@OkopStart, "Super, Your lucky", Toast.LENGTH_SHORT)
                            .show()
                        scopceh += 199
                        score_click.text = "Points: $scopceh"
                    } else {
                        if (ryper1 == olopaq || ryper2 == olopaq || ryper3 == olopaq || ryper4 == olopaq ||
                            ryper5 == olopaq || ryper6 == olopaq || ryper7 == olopaq ) {
                            Toast.makeText(this@OkopStart, "Your lucky, you win tigr", Toast.LENGTH_SHORT)
                                .show()
                            scopceh += 199
                            score_click.text = "Points: $scopceh"
                        } else if (ryper1 == yeeer || ryper2 == yeeer || ryper3 == yeeer || ryper4 == yeeer ||
                            ryper5 == yeeer || ryper6 == yeeer || ryper7 == yeeer) {
                            Toast.makeText(this@OkopStart, "Your lucky, you win orel", Toast.LENGTH_SHORT)
                                .show()
                            scopceh += 199
                            score_click.text = "Points: $scopceh"
                        } else {
                            if (ryper1 == ryper2 && ryper2 == ryper3 && ryper3 == ryper4 &&
                                ryper4 == ryper5 && ryper5 != ryper6 && ryper6 != ryper7 && ryper7 != ryper1
                            ) {
                                Toast.makeText(
                                    this@OkopStart,
                                    "WOWOW Your lucky",
                                    Toast.LENGTH_SHORT
                                )
                                    .show()
                                scopceh += 199
                                score_click.text = "Points: $scopceh"
                            } else if (ryper1 == ryper2 && ryper2 == ryper3 && ryper3 != ryper4 &&
                                ryper4 != ryper5 && ryper5 == ryper6 && ryper6 == ryper7 && ryper7 != ryper1
                            ) {
                                Toast.makeText(
                                    this@OkopStart,
                                    "WOWOW Your lucky",
                                    Toast.LENGTH_SHORT
                                )
                                    .show()
                                scopceh += 149
                                score_click.text = "Points: $scopceh"
                            } else {
                                if (ryper1 == ryper2 && ryper2 == ryper3 && ryper3 == ryper4 &&
                                    ryper4 == ryper5 && ryper5 == ryper6 && ryper6 != ryper7 && ryper7 != ryper1
                                ) {
                                    Toast.makeText(
                                        this@OkopStart,
                                        "WOWOW Your lucky",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                    scopceh += 149
                                    score_click.text = "Points: $scopceh"
                                } else if (ryper1 != ryper2 && ryper2 != ryper3 && ryper3 == ryper4 &&
                                    ryper4 == ryper5 && ryper5 == ryper6 && ryper6 == ryper7 && ryper7 == ryper1
                                ) {
                                    Toast.makeText(
                                        this@OkopStart,
                                        "WOWOW Your lucky",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                    scopceh += 149
                                    score_click.text = "Points: $scopceh"
                                } else {
                                    if (ryper1 == ryper2 && ryper2 == ryper3 && ryper3 == ryper4 &&
                                        ryper4 != ryper5 && ryper5 != ryper6 && ryper6 == ryper7 && ryper7 == ryper1
                                    ) {
                                        Toast.makeText(
                                            this@OkopStart,
                                            "WOWOW Your lucky",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                        scopceh += 149
                                        score_click.text = "Points: $scopceh"
                                    } else if (ryper1 == ryper2 && ryper2 != ryper3 && ryper3 != ryper4 &&
                                        ryper4 == ryper5 && ryper5 == ryper6 && ryper6 == ryper7 && ryper7 == ryper1
                                    ) {
                                        Toast.makeText(
                                            this@OkopStart,
                                            "Your lucky",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                        scopceh += 149
                                        score_click.text = "Points: $scopceh"
                                    } else {
                                        if (ryper1 == ryper2 && ryper2 != ryper3 && ryper3 == ryper4 &&
                                            ryper4 == ryper5 && ryper5 != ryper6 && ryper6 == ryper7 && ryper7 == ryper1
                                        ) {
                                            Toast.makeText(
                                                this@OkopStart,
                                                "WOW Your lucky",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                            scopceh += 199
                                            score_click.text = "Points: $scopceh"
                                        } else if (ryper1 == ryper2 && ryper2 != ryper3 && ryper3 == ryper4 &&
                                            ryper4 == ryper5 && ryper5 != ryper6 && ryper6 != ryper7 && ryper7 == ryper1
                                        ) {
                                            Toast.makeText(
                                                this@OkopStart,
                                                "WOW Your lucky",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                            scopceh += 199
                                            score_click.text = "Points: $scopceh"
                                        } else {
                                            Toast.makeText(
                                                this@OkopStart,
                                                "Try again(",
                                                Toast.LENGTH_SHORT
                                            )
                                                .show()
                                            scopceh -= 499
                                            score_click.text = "Points: $scopceh"

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        })
    }



}