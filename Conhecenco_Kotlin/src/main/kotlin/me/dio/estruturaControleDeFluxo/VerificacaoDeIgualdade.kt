package me.dio.estruturaControleDeFluxo

fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakepeare", "Hamingway")

    println(authors == writers)
    println(authors === writers)

}

