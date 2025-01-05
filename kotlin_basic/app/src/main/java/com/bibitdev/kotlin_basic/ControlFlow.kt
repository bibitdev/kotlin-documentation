package com.bibitdev.kotlin_basic


fun main() {

    // Expression & Statement
    println("---------Expression & Statement---------")
    val openOffice = 7
    val now = 8
    val office: String
    office = if (now > openOffice) "Office already open" else "Office close"
    println(office)

    // when Expression
    println("---------when Expression---------")
    val value = 7
    when (value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

    // while do While
    println("---------while do While---------")
    var counter = 1
    while (counter <= 7) {
        println("Hello, while!")
        counter++
    }
    var counter2 = 1
    do {
        println("hello, do while!")
        counter2++
    } while (counter2 < 5)

    // Range
    println("--------- Range ---------")
    val rangeInt = 1..10
    println(rangeInt.step)
    println(rangeInt.toList())
    val downInt = 10.downTo(1)
    println(downInt.toList())

    // For Loop
    println("--------- For Loop ---------")
    val ranges = 1.rangeTo(10) step 3
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }

    println("--------- enum ---------")
    // Enum Class
    val color = Color.RED
    println(color)

    // Break & Continue
    println("--------- Break & Continue ---------")
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }
}

enum class Color {
    RED, GREEN, BLUE
}