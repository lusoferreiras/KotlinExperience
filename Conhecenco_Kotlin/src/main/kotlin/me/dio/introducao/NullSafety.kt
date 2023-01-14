package me.dio.introducao

fun main() {

    var neverNull: String = "This can't be null" //1
   // neverNull = null                           //2

    var nullable: String? = "You can keep a null here"  //3
    nullable = null                                     //4

    var inferredNonNull = "The compiler assumes non-null"
   // inferredNonNull = null

    fun strLength(str: String?):Int {
        return str?.length ?: 0
    }

    println(strLength(neverNull))
    println(strLength(nullable))

    fun describeString(maybeString: String?): String{
        if (maybeString != null && maybeString.length > 0){
            return "String of length ${maybeString.length}"
        } else{
           return "Empty null string"
        }
    }

    println(describeString(null))
    println(describeString(""))
    println(describeString("dio.me"))
}