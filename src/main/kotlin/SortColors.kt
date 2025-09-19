package org.example

class SortColors {
    class Solution {
        fun sortColors(nums: IntArray): Unit {
            mergeSort(nums)
        }


        private fun mergeSort(array: IntArray) {
            val arr = IntArray(array.size)
            mergeSort(array, arr, 0, array.size - 1)
        }
        private fun mergeSort(originalArray: IntArray, helperArray: IntArray, low: Int, high: Int) {

            if (low < high) {
                val mid = low + (high - low) / 2

                mergeSort(originalArray, helperArray, low, mid)
                mergeSort(originalArray, helperArray, mid + 1, high)
                merge(originalArray, helperArray, low, mid, high)

            }


        }

        private fun merge(originalArray: IntArray, helperArray: IntArray, low: Int, mid: Int, high: Int) {
            for (i in low..high) {
                helperArray[i] = originalArray[i]
            }
            var helperLeft = low
            var helperRight = mid + 1
            var current = low

            while (helperLeft <= mid && helperRight <= high) {
                if (helperArray[helperLeft] <= helperArray[helperRight]) {
                    originalArray[current] = helperArray[helperLeft]
                    helperLeft++
                }
                else {
                    originalArray[current] = helperArray[helperRight]
                    helperRight++
                }
                current++
            }

            val remaining = mid - helperLeft
            for (i in 0..remaining) {
                originalArray[current + i] = helperArray[helperLeft + i]
            }

        }

    }
}