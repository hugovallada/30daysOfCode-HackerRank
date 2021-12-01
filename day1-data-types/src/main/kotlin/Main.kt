import java.util.*

fun main() {
    val i = 4
    val d = 3.2
    val s = "Hello"

    // Java Way
    println("Input the values (Java Way) : ")
    with(Scanner(System.`in`)) {
        val intValue = nextInt()
        val doubleValue = nextDouble()
        val stringValue = next()

        println(i + intValue)
        println(String.format("%.1f",d + doubleValue))
        println(s + stringValue)
    }

    Thread.sleep(1000)

    // KotlinWay
    println("Input the values (Kotlin Way) : ")
    val intValue = readLine()?.toInt() ?: throw IllegalStateException("Null value")
    val doubleValue = readLine()?.toDouble() ?: throw IllegalStateException("Null value")
    val stringValue = readLine() ?: throw IllegalStateException("Null value")

    println(i + intValue)
    println(String.format("%.1f",d + doubleValue))
    println(s + stringValue)
}