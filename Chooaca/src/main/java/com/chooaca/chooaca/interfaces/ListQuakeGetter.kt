package com.chooaca.chooaca.interfaces

import com.chooaca.model.GempaGempaList

interface ListQuakeGetter {
    fun onSuccessRetrieved(listOfEarthQuake:List<GempaGempaList>)
    fun onFailed()
}