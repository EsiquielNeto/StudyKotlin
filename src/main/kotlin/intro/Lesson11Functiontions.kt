package intro
// Functions

fun main(args: Array<String>) {
    val num1 = 10
    val num2 = 20

    val totalSubtraction = subtraction(x = 20, y = 2)
    val totalMultiplication = multiplication(num1, num2)
    val totalDivision = division(x = 50, y = 2)

    println("\nFunctions arithmetics")
    addition(num1, num2)
    println("Subtraction $totalSubtraction")
    println("Multiplication $totalMultiplication")
    println("Division $totalDivision")


    println("\nFunction month")
    val month = showMonth(4)
    println("The month is: $month")
}

fun addition(x: Int, y: Int) {
    val total = 10 + 20
    println("Addition $total")
}

fun subtraction(x: Int, y: Int): Int = x - y

fun multiplication(x: Int, y: Int): Int = x * y

fun division(x: Int, y: Int): Int = x / y

fun showMonth(num: Int): String {
    return when(num) {
        1-> "January"
        2-> "February"
        3-> "March"
        4-> "April"
        5-> "May"
        6-> "June"
        7-> "July"
        8-> "August"
        9-> "September"
        10-> "October"
        11-> "November"
        12-> "December"
        else -> "Invalid month"
    }
}
