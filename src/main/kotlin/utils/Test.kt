package utils

fun main() {

}

fun <T> test(name: String, result: T, expectedResult: T) =
    println(if (result == expectedResult) "Success - $name" else "Failure - $name")