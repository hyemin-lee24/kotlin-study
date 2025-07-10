package dsl

class Alarm {
    var time: String = ""
    var repeat: Boolean = false
    private val actions = mutableListOf<String>()

    fun action(block: () -> String) {
        actions.add(block())
    }

    fun show() {
        println("Alarm at $time, repeat = $repeat")
        println("→ Actions:")
        actions.forEach { println("- $it") }
    }
}

fun alarm(block: Alarm.() -> Unit): Alarm {
    val a = Alarm()
    a.block()
    return a
}

fun main() {
    val wakeUpAlarm = alarm {
        time = "06:00"
        repeat = true

        action { "Play morning music" }
        action { "Turn on lights" }
    }

    wakeUpAlarm.show()
}
