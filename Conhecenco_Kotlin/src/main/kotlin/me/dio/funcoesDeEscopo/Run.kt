package me.dio.funcoesDeEscopo

fun main() {
    fun getNullableLength(ns: String?){
        println("for \"$ns\":")
        ns?.run {
            println("\tis empty? "+isEmpty())
            println("\tlength = $length")
            length
        } ?: 0
    }

    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}