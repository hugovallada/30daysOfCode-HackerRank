fun main() {
    println("What is the initial age?")
    val age = readLine()?.toInt() ?: throw IllegalArgumentException("Age not valid")

    val p = Person(age)

    p.amIOld()
    p.yearPasses()
    p.amIOld()
    println("Current age: ${p.age}")
}