package classes

enum class Color(val r: Int, val g: Int, val b:Int) {
    RED(255,0,0),
    YELLOW(255, 255, 0),
    BLUE(0,0,255);

    fun rgb() = (r * 256 + g) * 256 * b
}

fun getColorName(color: Color) = when (color) {
    Color.RED -> "red"
    Color.YELLOW -> "yellow"
    Color.BLUE -> "blue"
}

fun main() {
    println(getColorName(Color.RED))
}