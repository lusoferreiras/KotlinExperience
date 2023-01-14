package me.dio.colecoes

//Filter
val numbers = listOf(1, -2, 3, -4, 5, -6)

val positives = numbers.filter { x ->  x > 0 }

val negatives = numbers.filter { it < 0 }

//Map
val numbersMap = listOf(1, -2, 3, -4, 5, -6)

val doubled = numbersMap.map { x ->  x * 2 }

val tripled = numbersMap.map { it * 3 }

//Any
val numbersAny = listOf(1, -2, 3, -4, 5, -6)

val anyNegative = numbersAny.any { it < 0 }

val anyGT6 = numbersAny.any { it > 6 }

//flatMap

val fruitsBag = listOf("apple", "orange", "banana", "grapes")
val clothesBag = listOf("shirts", "pants", "jeans")
val cart = listOf(fruitsBag, clothesBag)
val mapBag = cart.map { it }
val flatMApBag = cart.flatMap { it }

fun main() {
    println("Filter")
    println("Numbers: $numbersMap")
    println("Positives Numbers: $positives")
    println("Negative Numbers: $negatives")
    println("===============================")

    println("Map")
    println("NumbersMap: $numbersMap")
    println("doubled NumbersMap: $doubled")
    println("tripled NumbersMap: $tripled")
    println("===============================")

    println("NumbersAny: $numbersAny")
    println("anyNegative: $anyNegative")
    println("AnyGT6: $anyGT6")
    println("===============================")

    println("Your bags are: $mapBag")
    println("The things you bought are: $flatMApBag")
}