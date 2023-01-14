package me.dio.introducao

class Costumer

    class Contact(val id: Int, var email: String)

    fun main(){
        val costumer = Costumer()

        val contact = Contact(1, "mary@gmail.com")

        println(contact.id)
        println(contact.email)
        contact.email = "jane@gmail.com"
        println(contact.email)
    }