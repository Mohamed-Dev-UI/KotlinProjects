fun main() {
    println("listen".isAnagramTo("silent"))
}

fun String.isAnagramTo(that: String): Boolean = toCharArray().sorted() == that.toCharArray().sorted()