package me.dio.poo

open class Tiger(val origin: String){
    fun sayHello(){
        println("A Tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger: Tiger("Siberia")

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}