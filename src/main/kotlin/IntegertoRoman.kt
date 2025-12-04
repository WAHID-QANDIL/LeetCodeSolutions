package org.example

fun main() {

}

class IntegerToRomanSolution {
    fun intToRoman(num: Int): String {
        val values = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val symbols = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

        var number = num
        val romanNumeral = StringBuilder()

        for (i in values.indices) {
            while (number >= values[i]) {
                number -= values[i]
                romanNumeral.append(symbols[i])
            }
        }

        return romanNumeral.toString()
    }
}