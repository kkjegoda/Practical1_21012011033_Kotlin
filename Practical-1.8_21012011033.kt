
import java.util.Arrays

fun main() {
    // Array of integers


    val intArray = arrayOf(1, 2, 3, 4, 5)

// Array of strings
    val stringArray = arrayOf("apple", "banana", "orange")

// Array of doubles
    val doubleArray = doubleArrayOf(1.0, 2.5, 3.7)

// Multidimensional array
    val multiDimensionalArrays = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6))


    val multiDimensionalArray = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6))

// Using Arrays.deepToString()
    println(Arrays.deepToString(multiDimensionalArray)) // [[1, 2, 3], [4, 5, 6]]

// Using contentDeepToString() - alternative to Arrays.deepToString()
    println(multiDimensionalArray.contentDeepToString()) // [[1, 2, 3], [4, 5, 6]]
    val intarray = intArrayOf(1, 2, 3, 4, 5)

    val joinedString = intArray.joinToString(separator = ", ")
    println(joinedString) // Output: "1, 2, 3, 4, 5"


// Creating an array of size 10 with values from 0 to 9
    val array = Array(10) { it }

// Using a for loop with ranges
    for (i in 0..9) {
        array[i] = i
    }


// Sort using inbuilt function
        intArray.sort()
        println(intArray.joinToString()) // Output: "1, 2, 5, 5, 9"

// Sort without using inbuilt function (Bubble Sort)
        for (i in intArray.indices) {
            for (j in 0 until intArray.size - i - 1) {
                if (intArray[j] > intArray[j + 1]) {
                    val temp = intArray[j]
                    intArray[j] = intArray[j + 1]
                    intArray[j + 1] = temp
                }
            }
        }

        println(intArray.joinToString()) // Output: "1, 2, 5, 5, 9"

    }

