fun main() {
    fizzBuzz(1..5)
}

/**
 * Prints list of numbers in the specified [range], each number is replaced with Fizz if dividable by 3, Buzz if 5, FizzBuzz if both
*/
fun fizzBuzz(range: IntRange) {
    val result: MutableList<String> = mutableListOf()
    range.forEach { num ->
        when {
            num % 15 == 0 -> result.add("FizzBuzz")
            num % 3 == 0 -> result.add("Fizz")
            num % 5 == 0 -> result.add("Buzz")
            else -> result.add(num.toString())
        }
    }
    print(result)
}