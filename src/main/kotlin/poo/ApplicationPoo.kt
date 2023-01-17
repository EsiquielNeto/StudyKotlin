package poo

import poo.model.Person
import java.time.LocalDate

class ApplicationPoo {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val person = Person("Poka", LocalDate.of(1995, 5, 21))
            println(person.stageOfLife())
        }
    }
}