package intro

fun main(args: Array<String>) {
    println(isLetter('A'))
    println(isNotDigit('8'))
}

fun isLetter(letter: Char) = letter in 'a'..'z' || letter in 'A'..'Z'

fun isNotDigit(letter: Char) = letter !in '0'..'9'