package intro

enum class LetterEnum {
    A, B, C, D;
}

enum class Color(val red: Int, val green: Int, val blue: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    fun rgb() = ((red * 256 + green) * 256 + blue)
}

fun main(args: Array<String>) {
    val rgb = Color.RED.rgb()
    println(rgb)
}