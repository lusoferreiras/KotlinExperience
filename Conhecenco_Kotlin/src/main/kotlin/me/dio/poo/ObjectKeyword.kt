package me.dio.poo

import kotlin.random.Random

class LuckDispatcher{
    fun getNumber(){
        var objRandom = Random
        println(objRandom.nextInt(90))
    }
}



//Object Expression
fun rentPrice(standartDays: Int, festivityDays: Int, specialDays: Int): Unit{
    val dayRates = object{
        var standard: Int = 30 * standartDays
        var festivity: Int =  50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special
    print("Total price: $$total")
}


//Object Declaration

object DoAuth{
    fun takeParams(username: String, password: String){
        println("input Auth parameters = $username:$password")
    }
}

//Companion Objects
class BigBen{
    companion object Bonger{
        fun getBongs(nTimes: Int){
            for (i in 1.. nTimes){
                print("Bong ")
            }
        }
    }
}

fun main() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()
    println("===========================")

    rentPrice(10, 2, 1)
    println()
    println("===========================")

    DoAuth.takeParams("foo","qwerty")
    println("===========================")

    BigBen.getBongs(12)
}