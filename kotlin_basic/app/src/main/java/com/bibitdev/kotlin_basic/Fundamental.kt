package com.bibitdev.kotlin_basic

fun main() {
    println("Hello, world!")

    // String
    val firstWord = "Dicoding "
    val lastWord = "Academy"
    print(firstWord + lastWord)

    // Array
    val array = arrayOf(1, 2, 3, 4, 5)
    val mixArray = arrayOf(1, 2, 3, 4, 5, "Dicoding", true)
    println(array.joinToString())
    println(mixArray.joinToString())

    // Nullable
    val exNull: String? = "Dicoding"
    if (exNull != null)
    println(exNull.length)


    // Safe Calls & Elvis Operator
    val text: String? = null
    println(text)
    val exText = text ?: "default"
    println(exText)
    val textLength = text?.length ?: 7
    println(textLength)

    // Function
    fun setUser(name: String, age: Int, univ: String): String {
        return "Your name is $name, and you $age years old, from $univ"
    }

    println(setUser("Bibit", 21, "Universitas Amikom Purwokerto"))

}