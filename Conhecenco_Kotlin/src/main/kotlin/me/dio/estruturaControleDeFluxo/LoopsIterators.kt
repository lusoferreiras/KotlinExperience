package me.dio.estruturaControleDeFluxo

class Animal(val name: String)

class Zoo(val animals: List<Animal>){
    operator fun iterator(): Iterator<Animal>{
        return animals.iterator()
    }
}

fun main() {

    val animais = listOf(Animal("Zebra"), Animal("Lion"))
    val zoo = Zoo(animais)

    for (animal in zoo){
        println("Watch out, it´s a ${animal.name}")
    }
}