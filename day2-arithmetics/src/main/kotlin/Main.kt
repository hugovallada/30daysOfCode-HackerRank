fun main() {

    println("Define the values: ")

    val mealCost = readLine()!!.toDouble()
    val tipPercentage = readLine()!!.toInt()
    val taxPercent = readLine()!!.toInt()

    val tipCost = mealCost/100 * tipPercentage
    val taxCost = taxPercent.toDouble()/100 * tipPercentage

    val finalPrice = (mealCost + tipCost + taxCost).toInt()

    println(finalPrice)

}