fun main() {
    println("Define the array size: ")
    val n = readLine()?.toInt() ?: throw IllegalArgumentException("The size of the array can't be null")

    if (n !in 1..1000) throw IllegalArgumentException("N must be between 1 and 1000")

    val array = IntArray(n)

    for (i in 0 until n step 1) {
        println("New value: ")
        array[i] = readLine()?.toInt() ?: throw IllegalArgumentException("Value can't be null")
    }

    println("Array output")
    for (i in array.size -1 downTo 0 step 1) {
        println(array[i])
    }
}