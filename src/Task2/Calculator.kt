fun addition(a: Double, b: Double): Double = a + b
fun subtraction(a: Double, b: Double): Double = a - b
fun multiplication(a: Double, b: Double): Double = a * b
fun division(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw ArithmeticException("Division by zero!")
    }
    return a / b
}

fun getOperation(symbol: String): (Double, Double) -> Double = when (symbol) {
    "+" -> ::addition
    "-" -> ::subtraction
    "*" -> ::multiplication
    "/" -> ::division
    else -> throw UnsupportedOperationException("Unsupported operation: $symbol")
}

fun main() {
    val operations = listOf("+", "-", "*", "/")
    val leftOperand = 10.0
    val rightOperand = 5.0

    for (operation in operations) {
        try {
            val result = calculator(getOperation(operation), leftOperand, rightOperand)
            println("Result of $leftOperand $operation $rightOperand = $result")
        } catch (e: UnsupportedOperationException) {
            println(e.message)
        } catch (e: ArithmeticException) {
            println(e.message)
        }
    }
}

fun calculator(operation: (Double, Double) -> Double, leftOperand: Double, rightOperand: Double): Double {
    return operation(leftOperand, rightOperand)
}
