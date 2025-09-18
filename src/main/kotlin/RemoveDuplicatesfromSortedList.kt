package org.example

class RemoveDuplicatesFromSortedList {
//    83.Remove Duplicates from Sorted List

    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head?.next == null){
            return head
        }
        var currentNode = head

        while (currentNode?.next != null){
            if (currentNode.`val` == currentNode.next?.`val`){
                currentNode.next = currentNode.next!!.next
            }else  {
                currentNode = currentNode.next

            }

        }

        return head

    }
}