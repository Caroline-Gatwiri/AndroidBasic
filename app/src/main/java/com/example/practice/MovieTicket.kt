package com.example.practice

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    val ticketPrice: Int
     if (age in 0..12){
        ticketPrice = 15
    }else if(age in 13..60){
         ticketPrice = if (isMonday){
             25
         }else {
             30
         }
    }else if(age in 61..100){
        ticketPrice = 20
    }else{
        println("-1 Invalid User")
    }

    return age

}