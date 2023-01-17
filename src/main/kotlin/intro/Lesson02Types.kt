package intro
// Types Variables

fun main(args: Array<String>) {
    /**
     * String
     * Boolean
     * Int
     * Long
     * Float
     * Number
     * Collections, Array, List,
     * Map<S, O>
     *
     * var nameVariable: Type = value || var nameVariable = value
     * val nameVariable: Type = value || val nameVariable = value
     * */

    var text = "Poka"
    var boo = true
    var numInt = 1111111111111111111
    var numLong = 1111111111111111111
    var numFloat = 1.001f
    var numDouble = 1.001
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
