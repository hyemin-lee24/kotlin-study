package functional

fun String.isEmail() : Boolean {
    return this.contains("@") && this.contains(".")
}

fun Int.square(): Int = this * this

fun <T> List<T>.printCount() {
    println("List contains ${this.size} elements")
}

fun main() {
    val email_true = "user@example.com"
    val email_false = "test";

    println("[${email_true}] is valid ${email_true.isEmail()}")
    println("[${email_false} is not valid !${email_false.isEmail()}")

    val number = 7
    println("Square of $number: ${number.square()}")

    val names = listOf("A", "B", "C")
    names.printCount();
}