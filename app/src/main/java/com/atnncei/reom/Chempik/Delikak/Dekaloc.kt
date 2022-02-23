package com.atnncei.reom.Chempik.Delikak

import androidx.compose.runtime.Composable
import com.atnncei.reom.Retinok.boykolol
import com.atnncei.reom.Retinok.Salata
import com.atnncei.reom.Retinok.lichak
import com.atnncei.reom.Ubilqa.gaignak
import com.atnncei.reom.Ubilqa.repichokna
import com.atnncei.reom.Ubilqa.lyidocha
import com.atnncei.reom.glavaCl
import com.atnncei.reom.ibg
import com.onesignal.OneSignal
import kotlinx.coroutines.DelicateCoroutinesApi
import java.util.regex.Pattern

fun Dekaloc(lamba:String):String {
    val kipom = "::"
    val gerald = Pattern.compile(kipom).split(lamba)

    val bombeltone = try {
        gerald[1]
    } catch (e: Error) {
        ""
    }
    val djakN = try {
        gerald[0]
    } catch (e: Error) {
        ""
    }
    val meruiq = try {
        gerald[3]
    } catch (e: Error) {
        ""
    }
    val velokq = try {
        gerald[2]
    } catch (e: Error) {
        ""
    }

    val bountik = try {
        gerald[4]
    } catch (e: Error) {
        ""
    }
    val snikersaq = try {
        gerald[6]
    } catch (e: Error) {
        ""
    }
    val twixoaq = try {
        gerald[5]
    } catch (e: Error) {
        ""
    }
    OneSignal.sendTag(Salata("c3ViX2FwcA=="),bombeltone)
    val pogorodn =
        (djakN + Salata("P2J1bmRsZT0=") + Salata(ibg) + Salata("JmFkX2lkPQ==") +
                gaignak + Salata("JmFwcHNfaWQ9") + lyidocha +
                Salata("JmRldl9rZXk9") + Salata(repichokna) +
                Salata("JnN1YjY9") + bombeltone + Salata("JnN1Yjc9") +
                velokq + Salata("JnN1YjI9") + meruiq +
                Salata("JnN1YjM9") + bountik +
                Salata("JnN1YjQ9") + twixoaq +
                Salata("JnN1YjU9") + snikersaq)
    return pogorodn
}
@DelicateCoroutinesApi
@Composable
fun Fordyc(){
    val ryl = boykolol + Salata("P2J1bmRsZT0=") + Salata(ibg) +
            Salata("JmFkX2lkPQ==") + gaignak + Salata("JmFwcHNfaWQ9") +
            lyidocha + Salata("JmRldl9rZXk9")  + Salata(repichokna)
    val koleso = lichak + ryl
    glavaCl.Suprea(kumik = koleso)
}