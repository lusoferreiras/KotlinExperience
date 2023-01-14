package me.dio.introducao

fun main() {
    fun printAll(vararg messages: String){
        for (m in messages) println(m)
    }
    printAll("Ola", "Hello", "Hallo", "Salud", "Hola", "Chinês")

    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "Chinês",
        prefix = "Greeting: "
    )

    fun log(vararg entries: String){
        printAll(*entries)
    }
    log("Ola", "Hello", "Hallo", "Salud", "Hola", "Chinês")
}