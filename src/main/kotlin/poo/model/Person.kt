package poo.model

import java.time.LocalDate

class Person(
    private val name: String,
    birth: LocalDate
) {
    private var age: Int = 0
    private val currentDate: LocalDate = LocalDate.now()

    init {
        age = currentDate.year - birth.year
    }

    fun stageOfLife(): String {
        val text = when {
            age in 0..5 -> "Is baby!"
            age in 6..14 -> "Is children!"
            age in 15..17 -> "TEEEEN!"
            age in 18..45 -> "Is adult!"
            age in 46..100 -> "Is elderly"
            else -> "I don't have idea that is this"
        }

        return "Hello, my name is $name and I'am years old $age and I' am $text"
    }

}