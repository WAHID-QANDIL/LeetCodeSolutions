package org.example

class MaximumSubarray {
//    53.Maximum Subarray
fun maxSubArray(nums: IntArray): Int {
//        val prefix = IntArray(nums.size)
//
//        prefix[0] = nums[0]
//        for (i in 1..<nums.size) {
//            prefix[i] =  nums[i] + prefix[i - 1]
//        }
//
//        var largestSum = prefix[0]
//
//        for (i in prefix) {
//            if (i > largestSum) largestSum = i
//        }
//
//        return largestSum
    var currentSum = nums[0]
    var maxSum = nums[0]

    for (i in 1..<nums.size) {
        currentSum = maxOf(nums[i], currentSum + nums[i])
        maxSum = maxOf(maxSum, currentSum)
    }

    return maxSum

}

}