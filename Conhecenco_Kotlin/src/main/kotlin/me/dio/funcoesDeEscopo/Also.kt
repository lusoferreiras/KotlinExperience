package me.dio.funcoesDeEscopo

data class PersonAlso(var name: String, var age: Int, var about:String){
    constructor() : this("", 0, "")
}

fun writeCreateLog(p: PersonAlso){
    println("A new person ${p.name} was created. ")

}

fun main() {
    val jake = PersonAlso("Jake", 30, "Android developer")
        //Ação adicional
        .also {
            writeCreateLog(it)
        }
}