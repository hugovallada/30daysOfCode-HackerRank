fun main() {
    println("Digite a String: ")
    val key = readLine() ?: throw IllegalArgumentException("A palavra não pode ser nula.")

    var odd = ""
    var even = ""
    for ((index, word) in key.withIndex()) {
        if (index == 0 || index % 2 == 0) {
            even += word
        } else {
            odd += word
        }
    }

    println("EVEN: $even")
    println("ODD: $odd")
}