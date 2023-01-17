package intro

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

fun main(args: Array<String>) {
    val age = readAge()
    println(age)
}

fun readAge(): Int? {
    val reader = FileReader(File("src/files/age.txt"))
    val buffer = BufferedReader(reader)

    try {
        val number = buffer.readLine()
        return Integer.parseInt(number)

    } catch (e: NumberFormatException) {
        return null
    } finally {
        buffer.close()
    }

}