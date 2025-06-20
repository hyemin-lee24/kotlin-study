package functional

inline fun <reified T> checkType(value: Any) {
    if (value is T) {
        println("Value is of type ${T::class.simpleName}")
    } else {
        println("Value is NOT of type ${T::class.simpleName}")
    }
}

fun main() {
    checkType<String>("Test Text")
    checkType<Int>("Not Int Type")
    checkType<List<*>>(listOf("1", "2"))
}