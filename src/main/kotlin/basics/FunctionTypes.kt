package basics

fun main() {
    val sum: (Int, Int) -> Int = { a, b -> a + b }
    println("Sum: ${sum(3, 5)}")

    operateOnNumbers(4, 2, ::add)
    operateOnNumbers(4, 2, ::subtract)

    operateOnNumbers(4, 2) { a, b -> a * b }

    val divider = getOperation("/")
    println("Divide: ${divider(10, 2)}")
}

fun add(a: Int, b: Int): Int = a + b
fun subtract(a: Int, b: Int): Int = a - b

fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int) {
    println("Result: ${operation(a, b)}")
}

fun getOperation(op: String): (Int, Int) -> Int {
    return when (op) {
        "+" -> ::add
        "-" -> ::subtract
        "*" -> { a, b -> a * b }
        "/" -> { a, b -> if (b != 0) a / b else 0 }
        else -> { _, _ -> 0 }
    }
}
