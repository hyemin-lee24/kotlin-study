package basics

fun main() {
    val sum = operate(4, 2) { a, b -> a + b }
    val diff = operate(4, 2, ::subtract)

    println("Sum: $sum")
    println("Diff: $diff")

    val multiplier = getOperator("*")
    println("Multiply: ${multiplier(3, 5)}")
}

fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun getOperator(op: String): (Int, Int) -> Int {
    return when (op) {
        "+" -> { a, b -> a + b }
        "-" -> ::subtract
        "*" -> fun(a: Int, b: Int): Int { return a * b }
        else -> { _, _ -> 0 }
    }
}
