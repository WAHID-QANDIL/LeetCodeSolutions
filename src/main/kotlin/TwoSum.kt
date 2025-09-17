package org.example

fun main() {
    println("Hello, World!")
}

class TwoSumSolution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numToIndex = mutableMapOf<Int, Int>()
        for ((index, num) in nums.withIndex()) {
            val complement = target - num
            if (numToIndex.containsKey(complement)) {
                return intArrayOf(numToIndex[complement]!!, index)
            }
            numToIndex[num] = index
        }
        return intArrayOf()
    }
}