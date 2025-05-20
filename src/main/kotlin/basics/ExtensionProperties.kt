package basics

fun main() {
    val name = "Kotlin"
    println("Last char of $name is: ${name.lastChar}")

    val num = 12345
    println("Is $num even? ${num.isEven}")

    val user = User("hyemin")
    println(user.displayName)
}

val String.lastChar: Char
    get() = this[this.length - 1]

val Int.isEven: Boolean
    get() = this % 2 == 0

val User.displayName: String
    get() = "User[$name]"
