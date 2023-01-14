package me.dio.introducao

class MutableStackFunctions<E>(vararg items: E){

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MultableStack(${elements.joinToString()})"
}

//Função genérica
fun <E> multableStackOf(vararg elements: E) = MutableStackFunctions(*elements)

fun main() {
    val stack = multableStackOf(0.62, "A", 2)
    println(stack)
}