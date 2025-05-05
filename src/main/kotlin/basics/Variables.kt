package basics

import java.lang.NullPointerException
import java.util.*

fun main() {
    variable();

    typeInference();

    nullHandling();

    lateinit();
}

fun variable() {
    //var 은 가변
    var a: Int = 12345
    a = 56789
    println(a)

    //val 불변
    val b : Int = 12345
    println(b)
}

fun typeInference() {
    val stringValue: String = "string value"
    val stringInference = "string value"

    println(stringValue)
    println(stringInference)
    println(stringValue == stringInference)
}

fun nullHandling() {
    val a:String? = null
    println(a)

    // Null Safe operator
    val str1:String = "test"
    val str2:String? = null
    println(str1.uppercase(Locale.getDefault()))
    println(str2?.uppercase(Locale.getDefault()))
    println(if (str2 != null) str2.uppercase(Locale.getDefault()) else null)


    // Elvis
    println(str2?.uppercase(Locale.getDefault()) ?: "초기화 필요")

    // null 값 아님을 보증
    val val1 :String? ="test value"
    val nullVal :String? = null
    val val2 :String = val1!!

    println(val2)

    try {
        val error :String = nullVal!!
        println(error)
    } catch (e : NullPointerException) {
        println("NPE : $e")
    }
}

fun lateinit() {
    var a:String
    lateinit var str :String

    try {
        println(str)
    } catch (e : UninitializedPropertyAccessException) {
        println("Error : $e")
    }
    str = "test"
    println(str)

    val b:String by lazy {
        println("initialize")
        var test = "test"
        test.uppercase()
    }
    println(b)
}
