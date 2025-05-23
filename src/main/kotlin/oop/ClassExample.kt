package oop

fun main() {
    val person = Person()
    person.name = "userName"
    person.age = 30
    person.introduce()

    val user = User("hyemin", 28)
    user.printInfo()
}

class Person {
    var name: String = "Unknown"
    var age: Int = 0

    fun introduce() {
        println("Hi, my name is $name and I am $age years old.")
    }
}

class User(val name: String, var age: Int) {
    fun printInfo() {
        println("User(name=$name, age=$age)")
    }
}
