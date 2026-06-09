fun main() {
    print("""
        fun main() {
            print(""${'"'}
            ""${'"'}.trimIndent().hasValidParentheses())
        }
    """.trimIndent().hasValidParentheses())
}

fun String.hasValidParentheses(): Boolean {
    val stack = mutableListOf<Char>()
    for (char in this) {
        if (char == '{') stack.add('{')
        else if (char == '}') {
            if (stack.isEmpty()) return false
            stack.removeAt(stack.lastIndex)
        }

        if (char == '(') stack.add('(')
        else if (char == ')') {
            if (stack.isEmpty()) return false
            stack.removeAt(stack.lastIndex)
        }

        if (char == '[') stack.add('[')
        else if (char == ']') {
            if (stack.isEmpty()) return false
            stack.removeAt(stack.lastIndex)
        }
    }

    return stack.isEmpty()
}