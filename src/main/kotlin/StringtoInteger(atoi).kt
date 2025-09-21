package org.example

fun main() {

}

class StringToIntegerAtoiSolution {
    fun myAtoi(s: String): Int {
        var index = 0
        val n = s.length
        while (index < n && s[index] == ' ') {
            index++
        }
        var startingSign = 1
        if (index < n) {
            if (s[index] == '-') {
                startingSign = -1
                index++
            } else if (s[index] == '+') {
                index++
            }
        }
        var result = 0
        while (index < n && s[index].isDigit()) {
            val digit = s[index] - '0'
            if (result > (Int.MAX_VALUE - digit) / 10) {
                return if (startingSign == 1) Int.MAX_VALUE else Int.MIN_VALUE
            }
            result = result * 10 + digit
            index++
        }
        return result * startingSign

    }
}