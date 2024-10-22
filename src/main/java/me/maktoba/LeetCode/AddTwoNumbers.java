package me.maktoba.LeetCode;
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_head = new ListNode(0);
        ListNode l3 = dummy_head;

        int carry = 0;
        while (l1 != null || l2 != null) {

            //if the nodes aren't null, they're equal to that nodes value.
            //otherwise they are 0
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;

            //add the digits of the nodes
            int currSum = l1_val + l2_val + carry;

            //if the digits of currSum are greater than 10,
            //we will have to "carry" a 1 (basic arithmetic)
            carry = currSum / 10;

            //if carry is >10, this extracts the rightermost digit
            //otherwise, its just the original digit (currSum)
            int last_digit = currSum % 10;

            //make the new node and add it to the list
            ListNode new_node = new ListNode(last_digit);
            l3.next = new_node;

            //move the iterators and the new list forward
            //if possible
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            l3 = l3.next;
        }

        //if we have a carry of 1, we need to make it a new node
        //to add to the list
        if (carry > 0) {
            ListNode new_node = new ListNode(carry);
            l3.next = new_node;
            l3 = l3.next;
        }

        return dummy_head.next;
    }

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

    public static void main(String[] args) {

    }
}
