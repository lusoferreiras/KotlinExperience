package me.dio.estruturaControleDeFluxo

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")

}
//Any pode receber qqr tipo, é semelhante a um object(java)
fun cases(obj: Any){
    when (obj){
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

class MyClass