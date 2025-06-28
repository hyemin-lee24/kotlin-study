package functional

data class UserProfile(
    val name: String,
    val age: Int,
    val tags: List<String>
)

fun main() {
    val original = UserProfile("User1", 20, listOf("developer", "kotlin"))

    val updated = original.copy(age = 31)

    println("Original: $original")
    println("Updated: $updated")

    val newTagList = original.tags + "blogger"
    val withNewTags = original.copy(tags = newTagList)

    println("With new tag: $withNewTags")
}
