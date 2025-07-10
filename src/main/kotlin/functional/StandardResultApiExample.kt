package functional

import kotlin.Result

fun parseInt(input: String): Result<Int> {
    return runCatching {
        input.toInt()
    }
}

fun main() {
    val success = parseInt("123")
    val failure = parseInt("abc")

    println("Success: ${success.getOrElse { -1 }}")
    println("Failure: ${failure.getOrElse { -1 }}")

    val doubled = success.mapCatching { it * 2 }
    println("Doubled: ${doubled.getOrNull()}")

    val resultText = failure.fold(
        onSuccess = { "Parsed number: $it" },
        onFailure = { "Parsing failed: ${it.message}" }
    )
    println(resultText)
}
