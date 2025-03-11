package com.example.practice

fun main(){
    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus",
        "Neptune")
    println(solarSystem[2])
    println(solarSystem.get(1))
    println(solarSystem.indexOf("Mercury"))
solarSystem.add("Pluto")
    println(solarSystem.contains("Pluto"))
    solarSystem.add(3, "Theia")
    println()
    solarSystem[3] = "Future Moon"
    println()
    println("Future Moon" in solarSystem)


    for(planet in solarSystem){
        println(planet)
    }
solarSystem.removeAt(9)
    println()
    println(solarSystem.contains("Pluto"))
    solarSystem.remove("Future Moon")

    println("Future Moon" in solarSystem)

}