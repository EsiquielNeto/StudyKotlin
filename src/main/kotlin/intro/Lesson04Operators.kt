package intro
// Arithmetic Operators

fun main(args: Array<String>) {
    var num1 = 10
    var num2 = 20
    val inc = ++num1
    val dec = --num2

    val totalAddition = num1 + num2
    val totalSubtraction = num2 - num1
    val totalMultiplication = num1 * num2
    val totalDivision = num2 / num1
    val totalRest = num1 % num2

    println("Addition $totalAddition")
    println("Subtraction $totalSubtraction")
    println("Multiplication $totalMultiplication")
    println("Division $totalDivision")
    println("Rest $totalRest")
    println("increment $inc")
    println("decrement $dec")
}