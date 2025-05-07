package basics

fun main() {
    immutableCollections()
    mutableCollections()
}

fun immutableCollections() {
    val languages = listOf("Kotlin", "Java", "Scala")
    println("Immutable list: $languages")
    println("First: ${languages.first()}, Last: ${languages.last()}")
    println("Contains 'Java'? ${"Java" in languages}")
}

fun mutableCollections() {
    val list = mutableListOf("Apple", "Banana")
    list.add("Cherry")
    list.remove("Apple")
    println("Mutable list: $list")

    val map = mutableMapOf("a" to 1, "b" to 2)
    map["c"] = 3
    println("Mutable map: $map")

    val set = mutableSetOf("one", "two", "one")
    set.add("three")
    println("Mutable set: $set")
}
