package leetcode_test;

import leetcode.DeleteNodeInALinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeleteNodeInALinkedList_test {

    private DeleteNodeInALinkedList deleteNodeInALinkedList = new DeleteNodeInALinkedList();

    @Test
    public void GIVEN_LINKED_LIST_SAMPLE1() {

        DeleteNodeInALinkedList.ListNode node1 = deleteNodeInALinkedList.new ListNode(30);
        DeleteNodeInALinkedList.ListNode node2 = deleteNodeInALinkedList.new ListNode(10);
        DeleteNodeInALinkedList.ListNode node3 = deleteNodeInALinkedList.new ListNode(20);

        DeleteNodeInALinkedList.ListNode head = deleteNodeInALinkedList.new ListNode(50);

        node2.next = node3;
        node1.next = node2;
        head.next = node1;

        //Node which needs to be deleted.
        DeleteNodeInALinkedList.ListNode nodeToBeDeleted = node2;

        DeleteNodeInALinkedList.ListNode expectedNode1 = deleteNodeInALinkedList.new ListNode(30);
        DeleteNodeInALinkedList.ListNode expectedNode2 = deleteNodeInALinkedList.new ListNode(20);
        DeleteNodeInALinkedList.ListNode expectedHead = deleteNodeInALinkedList.new ListNode(50);

        expectedNode1.next = expectedNode2;
        expectedHead.next = expectedNode1;

        deleteNodeInALinkedList.deleteNode(nodeToBeDeleted);

        validate(expectedHead, head);

    }

    @Test
    public void GIVEN_LINKED_LIST_DELETE_HEAD_NODE() {

        DeleteNodeInALinkedList.ListNode node1 = deleteNodeInALinkedList.new ListNode(30);
        DeleteNodeInALinkedList.ListNode node2 = deleteNodeInALinkedList.new ListNode(10);
        DeleteNodeInALinkedList.ListNode node3 = deleteNodeInALinkedList.new ListNode(20);

        DeleteNodeInALinkedList.ListNode head = deleteNodeInALinkedList.new ListNode(30);

        node2.next = node3;
        node1.next = node2;
        head.next = node1;

        //Node which needs to be deleted.
        DeleteNodeInALinkedList.ListNode nodeToBeDeleted = head;

        DeleteNodeInALinkedList.ListNode expectedNode1 = deleteNodeInALinkedList.new ListNode(10);
        DeleteNodeInALinkedList.ListNode expectedNode2 = deleteNodeInALinkedList.new ListNode(20);
        DeleteNodeInALinkedList.ListNode expectedHead = deleteNodeInALinkedList.new ListNode(30);

        expectedNode1.next = expectedNode2;
        expectedHead.next = expectedNode1;

        deleteNodeInALinkedList.deleteNode(nodeToBeDeleted);

        validate(nodeToBeDeleted, head);

    }

    @Test
    public void GIVEN_LINKED_LIST_DELETE_LAST_NODE() {

        DeleteNodeInALinkedList.ListNode node1 = deleteNodeInALinkedList.new ListNode(30);

        DeleteNodeInALinkedList.ListNode head = deleteNodeInALinkedList.new ListNode(50);

        head.next = node1;

        //Node which needs to be deleted.
        DeleteNodeInALinkedList.ListNode nodeToBeDeleted = node1;

        try {
            deleteNodeInALinkedList.deleteNode(nodeToBeDeleted);
        } catch (Exception e) {
            Assertions.assertEquals(IllegalArgumentException.class, e.getClass());
        }

    }

    private void validate(DeleteNodeInALinkedList.ListNode node1, DeleteNodeInALinkedList.ListNode node2) {

        if (node1 == null && node2 == null) {
            return;
        }

        if (node1 == null || node2 == null) {
            Assertions.fail();
        }

        while (node1 != null && node2 != null) {
            Assertions.assertEquals(node1.val, node2.val);
            node1 = node1.next;
            node2 = node2.next;

        }

        Assertions.assertEquals(null, node2);
        Assertions.assertEquals(null, node1);
    }
}
