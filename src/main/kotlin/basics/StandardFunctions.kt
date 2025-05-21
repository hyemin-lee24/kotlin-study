package basics

fun main() {
    val name: String? = "kotlin"

    name?.let {
        println("Name is $it")
        println("Length: ${it.length}")
    }

    val result = name?.run {
        println("Running with: $this")
        this.uppercase()
    }
    println("Run result: $result")

    val strBuilder = StringBuilder()
    val message = with(strBuilder) {
        append("Hello, ")
        append("World!")
        toString()
    }
    println("With result: $message")

    val user = Test("anonymous").apply {
        println("Applying...")
        test = "kotlin test"
    }
    println("Apply result: $user")

    val numbers = mutableListOf(1, 2, 3).also {
        println("Original list: $it")
        it.add(4)
    }
    println("Also result: $numbers")
}
data class Test(var test: String)
