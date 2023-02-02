package intro
// Properties

class Square(private val height: Int, private val width: Int) {
    //default
//    var isSquare: Boolean = false
//        private set
//        get() {
//            return height == width
//        }

//    fun isSquare(): Boolean {
//        return height == width
//    }

    // is Beautiful
    val isSquare
        get() = height == width
}

fun main(args: Array<String>) {
    val isSquare = Square(4, 4)

    println("It's square ${Square(4, 6).isSquare}")
    println("It's square ${isSquare.isSquare}")
}