package functional

data class Person(val name : String, val city: String)

fun main() {
    val people = listOf(
        Person("user1", "Seoul"),
        Person("user2", "Seoul"),
        Person("user3", "Seoul"),
        Person("user4", "Busan")
    )

    val groupedByCity = people.groupBy { it.city }
    println("Grouped by city: $groupedByCity")

    val peopleByName = people.associateBy  { it.name }
    println("Grouped by name: $peopleByName")

    val names = listOf("user5", "user6", "user7")
    val ages = listOf(5, 3, 7)
    val paired = names.zip(ages)
    println("Zipped: $paired")

    val nums = (1..10).toList()
    val chunked = nums.chunked(3)
    println("Chunked (size 3): $chunked")
}