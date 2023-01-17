package intro
// loops of repition

fun main(args: Array<String>) {
    val list = mutableListOf(0, 1, 2, 3)
    val names = listOf("Zike", "Poka", "Dunha")

    println("while")
    while (list.size <= 7) {
        var num = list[list.lastIndex]
        list.add(++num)
        println(list)
    }

    println("\nfor")
    for (index in 0..4) {
        println(list[index])
    }

    println("\nfor 2")
    for (index in names.indices) {
        println(names[index])
    }

    println("\nfor 3")
    for ((index, name) in names.withIndex()) {
        println("$index: $name")
    }

    println("\nforEach")
    names.forEach {
        println(it)
    }

    println("\nforEach 2")
    names.forEach { name ->
        println(name)
    }

    println("\nforEachIndexed")
    names.forEachIndexed() { i, name ->
        println("$i: $name")
    }
}