package leetcode;

/**
 * Problem Statement:
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * https://leetcode.com/explore/featured/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3348/
 */

public class DeleteNodeInALinkedList {

    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {

        if(node ==null || node.next ==null){
            throw new IllegalArgumentException();
        }

        node.val = node.next.val;
        node.next = node.next.next;

    }

}
