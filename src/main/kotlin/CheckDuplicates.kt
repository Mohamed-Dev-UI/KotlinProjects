import kotlin.math.absoluteValue

fun main() {
    print(listOf(1, 2, 4, 8, 2).hasDuplicates())
}

/**
 * @param ignoreCase used to define whether to ignore sign or not
 * @return true if there is at least one duplicate, false otherwise
 * */
fun List<Int>.hasDuplicates(ignoreCase: Boolean = false): Boolean {
    val seen = mutableListOf<Int>()
    forEach { currentNumber ->
        val number = if (ignoreCase) currentNumber.absoluteValue else currentNumber
        if (number in seen) return true
        seen += number
    }
    return false
}