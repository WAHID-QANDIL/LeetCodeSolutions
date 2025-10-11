package org.example

class RotateList {

    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        if (head == null) return head
        if (head.next == null || k == 0) return head
        var length = 1

        var tail = head
        while (tail?.next != null) {
            tail = tail.next
            length++
        }

        val rotations = k % length

        if (rotations == 0) return head

        var newTail = head

        for (i in 0..<length - rotations - 1){
            newTail = newTail?.next
        }

        val newHead = newTail?.next
        newTail?.next = null
        tail?.next = head

        return newHead
    }
}
