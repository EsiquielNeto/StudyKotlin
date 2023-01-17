package intro
    // Exppression WHEN

fun main(args: Array<String>) {
    val number = 1

    val letter = when (number) {
        1 -> "A"
        2 -> "B"
        3 -> "C"
        4 -> "D"
        5 -> "E"
        else -> "it's not a letter, but a number"
    }

    println(letter)

    when {
        number > 0 -> println("Is greater than 0")
        number < 0 -> println("Is less than 0")
        else -> println("Number is 0")
    }

    val fruit = "Banana"
    when(fruit) {
        "Banana", "Morango", "Orange" -> println("It's a fruit! ")
        else -> println("it's not a fruit")
    }

}