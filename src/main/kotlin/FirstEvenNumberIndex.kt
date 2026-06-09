fun main() {
    print(findFirstEvenNumberIndex(1, 0, 4, 8))
}

/**
 * @return First even number index if found, else returns -1
 * */
fun findFirstEvenNumberIndex(vararg numbers: Int): Int {
    numbers.forEachIndexed { index, number ->
        if (number > 0 && number % 2 == 0) {
            return index
        }
    }
    return -1
}