package com.chooaca.chooaca.interfaces

import com.chooaca.model.GempaAutoGempa
import kotlinx.coroutines.CoroutineScope

interface RecentQuakeGetter {
    fun onSuccessRetrieved(earthQuake: GempaAutoGempa)
    fun onFailed()
}