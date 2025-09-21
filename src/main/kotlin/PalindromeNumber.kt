package org.example

fun main() {

}

class PalindromeNumberSolution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        val str = x.toString()
        return str == str.reversed()
    }
}