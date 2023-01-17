package intro
// Class

class Person(
    val name: String,
    val age: Int
)

fun main(args: Array<String>) {
    val person1 = Person("Joel", 35)
    val person2 = Person("Guina", 37)

    println("intro.Person 1 - ${person1.name} - age ${person1.age}")
    println("intro.Person 2 - ${person2.name} - age ${person2.age}")
}