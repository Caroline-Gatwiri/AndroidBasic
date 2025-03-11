package com.example.practice

fun main(){
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    solarSystem.add("Pluto")
    println()
    println(solarSystem.size)
    println()
    println(solarSystem.contains("Pluto"))
}