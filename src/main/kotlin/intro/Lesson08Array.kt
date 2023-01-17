package intro
// Arrays

fun main(args: Array<String>) {
    var array = arrayOf("a", "b", 10, 20, 2.5f, 1.02, true)
    var list = listOf("a", "b", "c")
    var setList = setOf(0, 1, 2, 3)
    var emptyList = emptyList<String>()

    val mutableList = mutableListOf(0, 1, 2, 3)
    mutableList.add(4)

    var map = mapOf("k1" to "v1", "k2" to "v2", "k3" to "v3")
    val numMap = mutableMapOf("one" to 1, "two" to 2)
    numMap.put("three", 3)
}