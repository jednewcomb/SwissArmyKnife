package me.maktoba.LeetCode;

public class MergeNodesBetweenZeros {

    //The definition of the nodes of the singly linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeNodes(ListNode head) {

        //Iterator for our head node (skip the first 0)
        ListNode curr = head.next;

        //Head and dummyhead for answer
        ListNode ansHead = new ListNode(0);
        ListNode ansCurr = ansHead;

        //sum variable to add node values for new node
        int sum = 0;

        while (curr != null) {

            if (curr.val != 0) {
                sum += curr.val;
            } else {
                ansCurr.next = new ListNode(sum);
                ansCurr = ansCurr.next;
                sum = 0;
            }
            curr = curr.next;
        }

        return ansHead.next;
    }
}