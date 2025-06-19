package functional

fun main() {
    val numbers = listOf(1,2,3,4,5)

    //map
    val doubled = numbers.map { it * 2 }
    println("Doubled: $doubled")

    //filter
    val even = numbers.filter {it %2 == 0}
    println("Even : $even")

    //reduce
    val sum = numbers.reduce {acc, i -> acc +i}
    println("Sum : $sum")

    // forEach : 요소 순회 출력
    numbers.forEach { println("Item: $it")}

    //flatMap
    val nested = listOf(listOf(1,2), listOf(3), listOf(4,5))
    val flattened = nested.flatMap { it.map { n -> n * 10}}
    println("Flattened & scaled : $flattened")
}