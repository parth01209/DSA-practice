package com.dsa;

public class cycleDetection {

    class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode fastptr = head;
            ListNode slowptr = head;
            while(fastptr!=null && fastptr.next!= null){
                fastptr = fastptr.next.next;
                slowptr = slowptr.next;
                if(fastptr == slowptr)
                    return true;
            }

            return false;


        }

    }
}
