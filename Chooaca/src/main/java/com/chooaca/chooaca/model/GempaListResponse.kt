package com.chooaca.model


data class GempaListResponse(val Infogempa:InfoGempaList)

data class InfoGempaList(val gempa:List<GempaGempaList>)

data class GempaGempaList(
    val Tanggal:String,
    val Jam:String,
    val DateTime:String,
    val Coordinates:String,
    val Lintang:String,
    val Bujur:String,
    val Magnitude:String,
    val Kedalaman:String,
    val Wilayah:String,
    val Dirasakan:String
)

data class GempaListResponseData(val result:String)
