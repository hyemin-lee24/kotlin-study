package oop

interface AuditLogger {
    fun log(message: String)
    fun auditTrail(): List<String>
}

class MemoryLogger : AuditLogger {
    private val logs = mutableListOf<String>()

    override fun log(message: String) {
        logs.add(message)
        println("[AUDIT LOG] $message")
    }

    override fun auditTrail(): List<String> = logs.toList()
}

class AuthService(private val logger: AuditLogger) : AuditLogger by logger {
    fun authenticate(user: String) {
        println("Authenticating $user...")
        log("User $user successfully authenticated.")
    }
}

fun main() {
    val memoryLogger = MemoryLogger()
    val authService = AuthService(memoryLogger)

    authService.authenticate("user1")
    authService.authenticate("user2")

    println("audit log:")
    authService.auditTrail().forEach(::println)
}
