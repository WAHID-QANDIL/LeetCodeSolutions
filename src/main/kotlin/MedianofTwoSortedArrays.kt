package org.example


fun main() {

}

class MedianOfTwoSortedArraysSolution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val combinedArray = nums1 + nums2
        combinedArray.sort()
        val n = combinedArray.size
        return if (n % 2 == 1) {
            combinedArray[n / 2].toDouble()
        } else {
            (combinedArray[n / 2 - 1] + combinedArray[n / 2]) / 2.0
        }
    }
}