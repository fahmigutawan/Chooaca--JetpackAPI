package com.chooaca.model

data class AutoGempaResponse(val Infogempa:InfoAutoGempa)

data class InfoAutoGempa(val gempa:GempaAutoGempa)

data class GempaAutoGempa(
    val Tanggal:String,
    val Jam:String,
    val DateTime:String,
    val Coordinates:String,
    val Lintang:String,
    val Bujur:String,
    val Magnitude:String,
    val Kedalaman:String,
    val Wilayah:String,
    val Potensi:String,
    val Dirasakan:String,
    val Shakemap:String
)