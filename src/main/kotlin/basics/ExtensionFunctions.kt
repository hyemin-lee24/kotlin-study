package basics

fun main() {
    val name = "Kotlin"
    println(name.addPrefix("Hello, "))
    println(name.lastChar())

    val number = 1234
    println(number.isEven())

    val user = User("hyemin")
    println(user.printInfo())
}

fun String.addPrefix(prefix: String): String {
    return prefix + this
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

data class User(val name: String)

fun User.printInfo(): String {
    return "User name is $name"
}
