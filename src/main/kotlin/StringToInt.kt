package org.example

class StringToInt {
    fun myAtoi(s: String): Int {
        var i = 0
        while (i < s.length && s[i].isWhitespace()) {
            i++
        }
        if (i >= s.length) return 0

        val sign = when {
            s[i] == '+' -> { i++; 1 }
            s[i] == '-' -> { i++; -1 }
            else -> 1
        }

        var result = 0L
        while (i < s.length && s[i].isDigit()) {
            result = result * 10 + (s[i] - '0')
            if (result * sign > Int.MAX_VALUE) return Int.MAX_VALUE
            if (result * sign < Int.MIN_VALUE) return Int.MIN_VALUE
            i++
        }

        return (result * sign).toInt()
    }
}