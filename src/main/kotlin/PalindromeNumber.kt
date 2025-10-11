package org.example

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if (x >= 0) {
            var temp = x
            var rev = 0
            while (temp > 0) {
                rev = rev * 10 + temp % 10
                temp /= 10
            }
            return x == rev
        }
        return false
    }}
