fun displayMonthName(month: Int) {
    val monthName = when (month) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid month"
    }
    print("Enter a Number: ")
    val month = readLine()!!
    print("$monthName \n\n")

    print("Enter a Number: \n\n")

    print("Plese Enter proper Number ")



}

fun main() {
    displayMonthName(4)
}
