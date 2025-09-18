package org.example

class ReverseInteger {
    fun reverse(x: Int): Int {
        var num = x
        var reversed = 0
        val sign = if (num < 0) -1 else 1
        num = kotlin.math.abs(num)

        while (num != 0) {
            val digit = num % 10
            if (reversed > (Int.MAX_VALUE - digit) / 10) {
                return 0 // Overflow
            }
            reversed = reversed * 10 + digit
            num /= 10
        }
        return reversed * sign
    }
}