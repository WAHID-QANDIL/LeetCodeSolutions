package org.example

fun main() {

}

class RegularExpressionMatchingSolution {
    fun isMatch(input: String, pattern: String): Boolean {
        val matchTable = Array(input.length + 1) { BooleanArray(pattern.length + 1) }
        matchTable[0][0] = true

        for (patternIndex in 1..pattern.length) {
            if (pattern[patternIndex - 1] == '*') {
                matchTable[0][patternIndex] = matchTable[0][patternIndex - 2]
            }
        }

        for (inputIndex in 1..input.length) {
            for (patternIndex in 1..pattern.length) {
                if (pattern[patternIndex - 1] == '.' || pattern[patternIndex - 1] == input[inputIndex - 1]) {
                    matchTable[inputIndex][patternIndex] = matchTable[inputIndex - 1][patternIndex - 1]
                } else if (pattern[patternIndex - 1] == '*') {
                    matchTable[inputIndex][patternIndex] = matchTable[inputIndex][patternIndex - 2]
                    if (pattern[patternIndex - 2] == '.' || pattern[patternIndex - 2] == input[inputIndex - 1]) {
                        matchTable[inputIndex][patternIndex] = matchTable[inputIndex][patternIndex] || matchTable[inputIndex - 1][patternIndex]
                    }
                }
            }
        }
        return matchTable[input.length][pattern.length]
    }
}