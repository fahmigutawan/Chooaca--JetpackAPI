package com.chooaca.chooaca

import com.chooaca.api.RetrofitInstance
import com.chooaca.chooaca.interfaces.ListQuakeGetter
import com.chooaca.chooaca.interfaces.RecentQuakeGetter
import kotlinx.coroutines.*

class Chooaca {
    class Quake {
        fun addRecentGetter(listener: RecentQuakeGetter) {
            CoroutineScope(Dispatchers.Default).launch {
                val result = RetrofitInstance.chooacaApi.getAutoGempa()

                if (result.isSuccessful) {
                    listener.onSuccessRetrieved(result.body()!!.Infogempa.gempa)
                    CoroutineScope(Dispatchers.Default).cancel()
                } else {
                    listener.onFailed()
                    CoroutineScope(Dispatchers.Default).cancel()
                }
            }
        }

        fun addListOfQuakeGetter(listener: ListQuakeGetter) {
            CoroutineScope(Dispatchers.Default).launch {
                val result = RetrofitInstance.chooacaApi.getGempaList()

                if (result.isSuccessful) {
                    listener.onSuccessRetrieved(result.body()!!.Infogempa.gempa)
                    CoroutineScope(Dispatchers.Default).cancel()
                } else {
                    listener.onFailed()
                    CoroutineScope(Dispatchers.Default).cancel()
                }
            }
        }
    }
}