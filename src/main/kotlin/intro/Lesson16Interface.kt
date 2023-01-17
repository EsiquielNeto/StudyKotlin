package intro

import java.lang.IllegalArgumentException

interface Human {

    fun move()
}

class Adult() : Human {
    override fun move() {
        println("Adult is walking")
    }
}

class Baby() : Human {
    override fun move() {
        println("Baby is crawling")
    }
}

fun humanMove(human: Human) {
    when(human) {
        is Adult -> {
            human.move()
        }
        is Baby -> {
            human.move()
        }
        else -> throw IllegalArgumentException("Oops, fell out!!")
    }
}

fun main(args: Array<String>) {
    val baby = Baby()
    val adult = Adult()

    humanMove(baby);
    humanMove(adult)
}