package com.bibitdev.kotlin_basic

// Lateinit merupakan keyword yang ditambahkan sebelum variabel untuk membuat proses inisialisasi bisa ditunda. Berikut ini contohnya.
lateinit var name: String

// Lazy Selain menggunakan keyword lateinit, kita juga bisa menggunakan lazy property untuk membuat property yang bukan null dan menunda inisialisasi. Berikut ini contoh kodenya.
val girlFriend: String by lazy {
    "Syifalita"
}

fun main() {
    println("---------Class---------")
    var cat = Animal()
    println("Nama kucing: ${cat.name}, Berat: ${cat.weight}, Umur: ${cat.age}, mamalia: ${cat.isMammal}")
    cat.eat()
    cat.sleep()

    println("---------Setter & Getter---------")
    val dicodingCat = AnimalDicoding()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")

    println("---------latenit & lazy---------")
    name = "Bibit" // Menginisialisasi variabel lateinit
    println("My name is $name")
    println("girlFriend is called")
    "Syifalita" // Nilai akan diinisialisasi hanya ketika diakses pertama kali
    println("GirlFriend name lenght: ${girlFriend.length}")
}
// make class
class Animal() {
    var name : String = "Mochi"
    var weight : Double = 0.0
    var age : Int = 0
    var isMammal : Boolean = true

    fun eat() {
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}
// Setter & Getter
class AnimalDicoding{
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}