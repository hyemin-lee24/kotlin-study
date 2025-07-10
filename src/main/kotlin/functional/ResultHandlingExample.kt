package functional

sealed class Result<out T> {
    data class Success<out T>(val data: T): Result<T>()
    data class Failure(val exception: Throwable): Result<Nothing>()
}

fun fetchUser(id: Int): Result<String> {
    return if (id == 1) {
        Result.Success("User#1: admin1")
    } else {
        Result.Failure(IllegalArgumentException("User not found"))
    }
}

fun main() {
    val result = fetchUser(1)

    when (result) {
        is Result.Success -> println("Fetched: ${result.data}")
        is Result.Failure -> println("Error: ${result.exception.message}")
    }

    val errorResult = fetchUser(999)
    when (errorResult) {
        is Result.Success -> println("Fetched: ${errorResult.data}")
        is Result.Failure -> println("Error: ${errorResult.exception.message}")
    }
}