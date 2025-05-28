package oop

object LazySingletonLogger {

    val expensiveResource by lazy {
        println("Expensive resource init...")
        "data"
    }

    private var logCount = 0

    fun log(message: String) {
        logCount++
        println("[LOG #$logCount]: $message, resource=$expensiveResource")
    }

    fun getLogCount(): Int = logCount
}

fun main() {
    println("start")

    println("Number of logs before startup (expensive Resource is not initialized): ${LazySingletonLogger.getLogCount()}")
    LazySingletonLogger.log("first")
    LazySingletonLogger.log("second")

    println("logs total cnt: ${LazySingletonLogger.getLogCount()}")
}
