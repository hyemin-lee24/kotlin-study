package functional

typealias Operation = (Int, Int) -> Int

fun calculate(a: Int, b: Int, op: Operation): Int {
    return op(a, b)
}

val add: Operation = {x, y -> x+y}
val multiply: Operation = { x, y -> x*y}

fun main() {
    val sum = calculate(1, 5, add)
    println("Sum : $sum")

    val product = calculate(5, 10, multiply)
    println("Multiply : $product")

    val subtract = calculate(20, 10) { a, b -> a- b}
    println("Subtract : $subtract")
}