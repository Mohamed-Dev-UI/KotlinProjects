fun main() {
    print("AbBa".isPalindrome(true))
}

fun String.isPalindrome(ignoreCase: Boolean = false): Boolean {
    var leftPointer = 0
    var rightPointer = length

    while (leftPointer < rightPointer) {
        var leftChar = get(leftPointer++)
        var rightChar = get(--rightPointer)

        leftChar = if (ignoreCase) leftChar.lowercaseChar() else leftChar
        rightChar = if (ignoreCase) rightChar.lowercaseChar() else rightChar

        if (leftChar != rightChar) return false
    }

    return true
}

/*
fun String.isPalindrome(ignoreCase: Boolean = false): Boolean {
    val sentence = if (ignoreCase) lowercase() else this
    val reversedSentence = if (ignoreCase) reversed().lowercase() else reversed()
    return sentence == reversedSentence
}
*/
