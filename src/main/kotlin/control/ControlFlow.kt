package control

fun main() {
    ifExample()
    whenExample()
    forLoopExample()
    whileLoopExample()
    breakContinueExample()
}

fun ifExample() {
    val score = 85

    val grade = if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else {
        "C"
    }

    println("Score: $score, Grade: $grade")
}

fun whenExample() {
    val day = 3

    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4, 5 -> "Weekday"
        in 6..7 -> "Weekend"
        else -> "Invalid day"
    }

    println("Day $day is $dayName")

    var number = 100

    fun isEven(num: Int) = when (num % 2) {
        0 -> "even"
        else -> "odd"
    }
    println(isEven(number))
}

fun forLoopExample() {
    val list = listOf("Kotlin", "Java", "Scala")

    for (lang in list) {
        println(lang)
    }
    println()
    for (i in 1..5) {
        print("$i ")
    }
    println()
    for (i in 15..0 step 3) {
        println(i)
    }
    println()
    for (i in 0..3) {
        println(i)
    }
    println()
    for (i in 0 until 3) {
        println(i)
    }
    println()
}

fun whileLoopExample() {
    var i = 0
    while (i < 3) {
        println("while loop: $i")
        i++
    }

    do {
        println("do-while loop: $i")
        i--
    } while (i > 0)
}

fun breakContinueExample() {
    for (i in 1..5) {
        if (i == 3) continue  // 3은 건너뜀
        if (i == 4) break     // 4에서 반복 종료
        println("i: $i")
    }
}
