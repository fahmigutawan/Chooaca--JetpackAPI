package com.chooaca.chooaca_jetpackapi

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.chooaca.chooaca.Chooaca
import com.chooaca.chooaca.interfaces.RecentQuakeGetter
import com.chooaca.chooaca_jetpackapi.ui.theme.ChooacaJetpackAPITheme
import com.chooaca.model.GempaAutoGempa

class MainActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChooacaJetpackAPITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Chooaca.Quake().addRecentGetter(object : RecentQuakeGetter {
                        override fun onSuccessRetrieved(earthQuake: GempaAutoGempa) {
                            Log.e("HASIL", earthQuake.toString())
                        }

                        override fun onFailed() {
                            Log.e("HASIL", "GAGALLLLL")
                        }
                    })
                }
            }
        }
    }
}