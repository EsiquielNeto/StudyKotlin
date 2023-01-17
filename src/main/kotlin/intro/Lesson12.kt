package intro
// Null Safety

fun main(args: Array<String>) {
    val name = getName()

    name?.let {
        println("Helooo $it")
    }
}

fun getName(): String? = "Poka"
