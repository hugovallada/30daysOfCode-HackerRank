fun main() {
    println("What number you wanna multiply?")
    val number = readLine()?.toInt() ?: throw IllegalArgumentException("Number can't be null")

    println(factorial(number))
}

fun factorial(value: Int): Int {
    return if (value == 1) value else value * factorial(value - 1)
}