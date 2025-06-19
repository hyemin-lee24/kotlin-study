package oop

interface Printer {
    fun log(message: String)
}

interface Notifier {
    fun notifyUser(userId: String, message: String)
}

class ConsolePrinter : Printer {
    override fun log(message: String) {
        println("[LOG] $message")
    }
}

class NotificationService(
    private val appName: String,
    printer: Printer
) : Notifier, Printer by printer {

    override fun notifyUser(userId: String, message: String) {
        println("[$appName] alarm: '$message' to $userId")
        log("alarm to $userId: $message")
    }
}

fun main() {
    val printer = ConsolePrinter()
    val service = NotificationService("application", printer)

    service.notifyUser("user123", "test")
}
