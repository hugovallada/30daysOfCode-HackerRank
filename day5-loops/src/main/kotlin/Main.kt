fun main() {
    println("Digite o número a ser multiplicado.")
    val multiplo = readLine()?.toInt() ?: throw IllegalStateException("O número precisa ser passado.")

    for (i in 1..10) {
         println("$multiplo * $i = ${multiplo * i}")
    }
}