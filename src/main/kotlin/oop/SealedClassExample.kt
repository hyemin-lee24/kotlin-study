package oop

fun main() {
    val responses = listOf(
        Loading,
        Success("User data loaded"),
        Error("Network timeout")
    )

    for (response in responses) {
        handleResponse(response)
    }
}

sealed class ApiResponse

object Loading : ApiResponse()

data class Success(val data: String) : ApiResponse()

data class Error(val message: String) : ApiResponse()

fun handleResponse(response: ApiResponse) {
    when (response) {
        is Loading -> println("Loading...")
        is Success -> println("Success: ${response.data}")
        is Error -> println("Error: ${response.message}")
    }
}
