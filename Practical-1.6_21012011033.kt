fun performArithmeticOperations(a: Int, b: Int,c:Int) {
    val addition = a + b
    val subtraction = a - b
    val multiplication = a * b
    val division = a / b
    val modulus = a % b

    println("Addition of 111,2222,-222 is $addition")
    println("Subtraction of 111,2222,-222 is $subtraction")
    println("Multiplication of 111,2222,-222  is $multiplication")
    println("Division of 111,2222,-222 is $division")
    println("Modulus of 111,2222,-222 is $modulus")
}

fun main() {
    val num1 = 111
    val num2 = 2222
    val num3=-222
    performArithmeticOperations(num1, num2, num3)
}
