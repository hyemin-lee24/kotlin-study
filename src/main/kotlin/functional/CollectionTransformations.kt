package functional

data class Product(val name: String, val price: Int)

fun main() {
    val products = listOf(
        Product("Laptop", 1500),
        Product("Mouse", 50),
        Product("Keyboard", 70),
        Product("Monitor", 300),
        Product("USB", 20),
        Product("Laptop", 1600)
    )

    val firstTwo = products.take(2)
    println("First 2 products: $firstTwo")

    val dropped = products.drop(2)
    println("Dropped first 2: $dropped")

    val distinctByName = products.distinctBy { it.name }
    println("Distinct by name: $distinctByName")

    val nested = listOf(
        listOf("A", "B"),
        listOf("C"),
        listOf("D", "E")
    )
    val flat = nested.flatten()
    println("Flattened list: $flat")

    val numbers = (1..10).toList()
    val windows = numbers.windowed(size = 3, step = 2)
    println("Windowed: $windows")
}
