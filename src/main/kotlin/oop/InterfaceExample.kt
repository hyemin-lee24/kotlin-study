package oop

fun main() {
    val button = Button()
    button.click()
    button.doubleClick()

    val iconButton = IconButton("🔔")
    iconButton.click()
    iconButton.doubleClick()
}

interface Clickable {
    fun click()
    fun doubleClick() {
        println("Double clicked!")
    }
}

class Button : Clickable {
    override fun click() {
        println("Button clicked!")
    }
}

class IconButton(val icon: String) : Clickable {
    override fun click() {
        println("IconButton $icon clicked!")
    }

    override fun doubleClick() {
        println("Double click on $icon icon")
    }
}
