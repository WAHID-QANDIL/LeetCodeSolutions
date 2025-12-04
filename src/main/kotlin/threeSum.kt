package org.example

import java.util.Arrays

fun main() {

}

class ThreeSumSolution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.isEmpty()) {
            return listOf()
        }
        Arrays.sort(nums)

        val res: ArrayList<List<Int>> = ArrayList()

        for (i in nums.indices) {
            if (nums[i] > 0) break
            if (i == 0 || nums[i-1] != nums[i]) {
                updatePointers(nums, i, res)
            }
        }
        return res
    }

    fun updatePointers(nums: IntArray, i: Int, res: ArrayList<List<Int>>) {
        var lo = i+1
        var hi = nums.size -1
        while(lo < hi) {
            val sum = nums[i] + nums[lo] + nums[hi]
            if (sum < 0) {
                ++lo
            } else if (sum > 0) {
                --hi
            } else {
                res.add(listOf(nums[i], nums[lo++], nums[hi--]))
                while(lo < hi && nums[lo] == nums[lo - 1]) ++lo
            }
        }
    }
}