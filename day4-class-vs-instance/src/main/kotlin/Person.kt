class Person(initialAge: Int) {
    var age: Int
       private set

    init {
        age = if (initialAge < 0) {
            println("Age is not valid, setting age to 0.")
            0
        } else {
            initialAge

        }
    }

    fun yearPasses() {
        age++
    }

    fun amIOld() {
        when {
            age < 13 -> println("You are young.")
            age in 13 until 18 -> println("You are a teenager.")
            else -> println("You are old")
        }
    }
}