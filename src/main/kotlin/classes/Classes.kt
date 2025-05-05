package classes

class Person(val name: String, var age: Int) {
    fun introduce() {
        println("name: $name, age: $age")
    }
}

class Developer {
    var language: String = "Java"

    constructor(language: String) {
        this.language = language
    }

    fun println() {
        println("Coding in $language")
    }
}

class Test(data:String) {
    var data :String

    init {
        this.data = data
        println("Test Data : $data")
    }
}

// 데이터 클래스
data class User(val id: Int, val username: String)

// Singleton: object 키워드
object AppConfig {
    val appName = "KotlinApp"
    fun printConfig() = println("App name is $appName")
}

class Utils {
    companion object {
        fun add(a: Int, b: Int): Int = a + b
    }
}

fun main() {
    val person = Person("Dummy", 30)
    person.introduce()

    val dev = Developer("Kotlin")
    dev.println()

    val user = User(1, "hyemin")
    println(user)

    AppConfig.printConfig()

    val sum = Utils.add(10, 20)
    println("Sum: $sum")

    val test = Test("Kotlin")
}
