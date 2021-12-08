fun main() {
    println("How many people do you want to add? ")
    val n = readLine()?.toInt() ?: throw IllegalArgumentException("You must give a valid number")

    val phoneBook = mutableMapOf<String, Int>()
    for (i in 1..n) {
        println("Input the name: ")
        val name = readLine() ?: throw IllegalArgumentException("You must give a name")
        println("Input the number: ")
        val number = readLine()?.toInt() ?: throw IllegalArgumentException("You must give a valid number")

        phoneBook[name] = number
    }

    val namesToLookUp = mutableListOf<String>()
    do {
        println("What names do you want to look for?")
        val nameToLookUp = readLine()?: throw IllegalArgumentException("Can't be null")

        if (nameToLookUp.isNotBlank()) {
            namesToLookUp.add(nameToLookUp)
        }
    } while (nameToLookUp != "")

    for (name in namesToLookUp) {
        if (phoneBook.containsKey(name)) {
            println(phoneBook[name])
        } else {
            println("Not Found")
        }
    }
}