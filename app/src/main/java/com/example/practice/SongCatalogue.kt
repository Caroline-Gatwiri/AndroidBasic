package com.example.practice

import android.text.format.DateFormat

fun main() {
 var songDescription = SongCatalogue("Gracie", "Carol Twish", 2023,2000 )
    songDescription.songDescription()
    println(songDescription.isPopular)
}

class SongCatalogue(
    private var title: String,
    private var artist: String,
    private var yearPublished: Int,
    private var playCount: Int) {
    val isPopular: Boolean
        get() {
            playCount >= 1000
            return true
        }

//        get() = playCount >= 1000


    fun songDescription(){
     println("$title, performed by $artist, was released in $yearPublished")
 }
}