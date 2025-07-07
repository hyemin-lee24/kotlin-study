package functional

inline fun measureExecutionTime(taskName: String, block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis()
    println("[$taskName] 실행 시간: ${end - start}ms")
}

fun heavyComputation() {
    Thread.sleep(300)
    println("Computation done.")
}

fun main() {
    measureExecutionTime("Heavy Task") {
        heavyComputation()
    }

    measureExecutionTime("Quick Task") {
        println("Instant job done.")
    }
}
