package oop

fun main() {
    val animal = Animal()
    val dog = Dog()

    animal.sound()
    dog.sound()

    val cat = Cat("Meow")
    cat.sound()
}

open class Animal {
    open fun sound() {
        println("animal sound")
    }
}

class Dog : Animal() {
    override fun sound() {
        println("Bark")
    }
}

class Cat(private val soundText: String) : Animal() {
    override fun sound() {
        println(soundText)
    }
}
