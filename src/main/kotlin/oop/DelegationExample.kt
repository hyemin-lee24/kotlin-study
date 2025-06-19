package oop

interface Logger {
    fun log(message: String)
}

class ConsoleLogger : Logger {
    override fun log(message: String) {
        println("[ConsoleLogger] $message")
    }
}

class Service(private val name: String, logger: Logger) : Logger by logger {
    fun execute() {
        log("Service '$name' execute...")
    }
}

fun main() {
    val logger = ConsoleLogger()
    val service = Service("OrderService", logger)
    service.execute()
}
