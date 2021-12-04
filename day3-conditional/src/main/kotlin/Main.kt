fun main() {
    println("What is the value of n?")
    val n = readLine()?.toInt() ?: throw IllegalArgumentException("N must have a value")

    if (n % 2 != 0) {
        println("Weird")
    } else {
        when(n) {
            in 2..5 -> println("Not Weird")
            in 6..20 -> println("Weird")
            else -> println("Not Weird")
        }
    }

}