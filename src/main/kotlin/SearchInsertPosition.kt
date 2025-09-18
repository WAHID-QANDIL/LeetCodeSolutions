package org.example

class SearchInsertPosition {
//    35/Search Insert Position

    fun searchInsert(nums: IntArray, target: Int): Int {

        var left = 0
        var right = nums.lastIndex

        while (left <= right)
        {
            val mid = left + (right-left)/2

            when{
                target == nums[mid] -> return mid
                target > nums[mid] -> left = mid+1
                target < nums[mid] -> right = mid-1
            }
        }

        return left
    }
}