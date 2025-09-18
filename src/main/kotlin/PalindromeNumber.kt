package org.example

class PalindromeNumber {
//    fun isPalindrome(x: Int): Boolean {
//        if (x < 0) return false
//        var div = 1
//        while (x / div >= 10) {
//            div *= 10
//        }
//        var left = x
//        while (left != 0) {
//            val leading = left / div
//            val trailing = left % 10
//            if (leading != trailing) return false
//            left = (left % div) / 10
//            div /= 100
//        }
//        return true
//    }

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
    }


}