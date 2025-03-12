package me.maktoba.LeetCode;

public class MergeTwoSortedLists {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // Dummy head for the merged list
            ListNode mergeHead = new ListNode();
            ListNode outList = mergeHead;

            // Traverse both lists
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    outList.next = list1;
                    list1 = list1.next;
                }
                else {
                    outList.next = list2;
                    list2 = list2.next;
                }
                outList = outList.next;
            }

            if (list1 != null) {
                outList.next = list1;
            }
            else if (list2 != null) {
                outList.next = list2;
            }

            return mergeHead.next;
        }
    }


}
