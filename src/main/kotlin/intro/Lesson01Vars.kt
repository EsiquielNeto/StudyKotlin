package intro
// Variables

fun main(args: Array<String>) {
    //Mutable
    var name = "Zike"
    name = "Poka"

    //Immutable
    val age = 25
    val a: Int = 1  // immediate assignment
    val b = 2       // `Int` type is inferred
    val c: Int      // Type required when no initializer is provided
    c = 3           // deferred assignment

    println("Hellooo!")
    println(name)
}
