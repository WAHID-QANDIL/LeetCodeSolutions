package org.example

class LengthOfLastWord {
//    58. Length of Last Word
    fun lengthOfLastWord(s: String): Int {

        return trimEndString(s).substringAfterLast(' ').length

    }

    private fun trimEndString(s: String):String {
        var lastWordIndex = s.length-1

        while (s[lastWordIndex] == ' ')lastWordIndex--

        return s.substring(0,lastWordIndex+1)

    }
}