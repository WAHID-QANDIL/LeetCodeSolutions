package org.example


fun main() {

}

class LongestSubstringWithoutRepeatingCharacterSolution {
    fun lengthOfLongestSubstring(s: String): Int {
        val last = HashMap<Char, Int>()
        var left = 0
        var best = 0
        for (right in s.indices) {
            val ch = s[right]
            val prev = last[ch]
            if (prev != null && prev >= left) left = prev + 1
            last[ch] = right
            best = maxOf(best, right - left + 1)
        }
        return best
    }
}