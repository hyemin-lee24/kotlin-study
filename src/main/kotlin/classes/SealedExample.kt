package classes

// Sealed class는 제한된 타입 계층을 정의할 때 사용
sealed class Result

data class Success(val data: String) : Result()
data class Error(val exception: Exception) : Result()
object Loading : Result()

fun handleResult(result: Result) {
    when (result) {
        is Success -> println("Success: ${result.data}")
        is Error -> println("Error: ${result.exception.message}")
        Loading -> println("Loading...")
    }
}

fun main() {
    val results = listOf(
        Success("Data loaded"),
        Error(Exception("Network error")),
        Loading
    )

    for (res in results) {
        handleResult(res)
    }
}