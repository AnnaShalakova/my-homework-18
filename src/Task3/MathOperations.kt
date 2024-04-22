package Task3

fun processList(inputList: List<Double?>): Double {
    val filteredList = inputList
        .filterNotNull()
        .map {
            if (it.toInt() % 2 != 0) it / 2
            else it * it
        }
        .filter { it <= 25.0 }
        .sortedDescending()
        .take(10)

    val sum = filteredList.sum()
    filteredList.forEach { println("%.2f".format(it)) }

    return sum
}

fun main() {
    val inputListOne = listOf(13.31, 3.98, 12.0, 2.99, 9.0)
    val resultOne = processList(inputListOne)
    println("Sum is: %.2f".format(resultOne))

    val inputListTwo = listOf(133.21, null, 233.98, null, 26.99, 5.0, 7.0, 9.0)
    val resultTwo = processList(inputListTwo)
    println("Sum is: %.2f".format(resultTwo))
}

