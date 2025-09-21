package org.example

fun main() {

}

class ReverseIntegerSolution {
    fun reverse(x: Int): Int {
        var stringed = x.toString()
        if (stringed[0] == '-') {
            stringed = stringed.substring(1)
            stringed = stringed.reversed()
            stringed = "-$stringed"
        } else {
            stringed = stringed.reversed()
        }
        return try {
            val reversed = stringed.toInt()
            reversed
        } catch (e: NumberFormatException) {
            0
        }
    }
}
