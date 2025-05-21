package basics

fun main() {
    val lambda = { x: Int, y: Int -> x + y }
    val anonymous = fun(x: Int, y: Int): Int {
        return x + y
    }

    println("Lambda: ${lambda(3, 4)}")
    println("Anonymous: ${anonymous(3, 4)}")

    listOf(1, 2, 3).forEach {
        if (it == 2) return@forEach
        println("Lambda item: $it")
    }

    listOf(1, 2, 3).forEach(fun(item) {
        if (item == 2) return
        println("Anonymous item: $item")
    })
}
