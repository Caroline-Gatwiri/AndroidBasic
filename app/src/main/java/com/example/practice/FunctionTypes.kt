package com.example.practice

fun main() {
//    val coins: (Int) ->String ={
//        "$it quarters"
//    }
//    val cupCake: (Int) ->String ={
//        "Have a cupcake"
//    }

    val trickFunction = trickOrTreat(false) { "$it quarters" }
    val treatFunction = trickOrTreat(true, null)


    trickFunction()

    repeat(4){
        treatFunction()
    }
}
fun trickOrTreat(isTrick: Boolean, extraTreat:((Int) -> String)?): () -> Unit {
    return if (isTrick){
        trick
    }else{
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        treat
    }
}
val trick = {
    println("No treats")
}

val treat: () -> Unit = {
    println("Have a treat")
}