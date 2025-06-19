package functional

fun main() {
    val numbers = listOf(1,2,3,4)

    val squared = numbers.map({x -> x * x})
    println("Squared : $squared")

    // trailing lambda
    val doubled = numbers.map {x->x*2}
    println("Doubled: $doubled")

    // it keyword
    val even = numbers.filter {it % 2 == 0}
    println("Event : $even")

    // Define lambda as a function
    val triple: (Int) -> Int = {n -> n*3}
    println("Triple: ${numbers.map(triple)}")

    val sum: (Int, Int) -> Int = {a,b -> a+b}
    println("Sum(3,4): ${sum(3,4)}")
}