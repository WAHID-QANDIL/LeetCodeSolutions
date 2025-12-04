package org.example

import kotlin.math.max
import kotlin.math.min

fun main() {

}

class ContainerWithMostWaterSolution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxArea = 0
        while (left < right) {
            val minHeight = min(height[left], height[right])
            val currArea = (right - left) * minHeight
            maxArea = max(maxArea, currArea)
            while (left < right && height[left] <= minHeight) left++
            while (left < right && height[right] <= minHeight) right--
        }
        return maxArea
    }
}