package com.dsa;

public class cycledetectionPlusBeginningOfCycle {


     class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }

     class Solution {
        public ListNode detectCycle(ListNode head) {
            int len = 0;
            ListNode fastptr = head;
            ListNode slowptr = head;
            while(fastptr!=null && fastptr.next!= null){
                fastptr = fastptr.next.next;
                slowptr = slowptr.next;
                if(fastptr == slowptr){
                    ListNode temp = slowptr;
                    do{
                        temp = temp.next;
                        len++;
                    }while(temp!=slowptr);
                    break;
                }
            }

            if (len == 0)
                return null;

            ListNode f = head;
            ListNode s = head;

            while(len > 0){
                s = s.next;
                len--;
            }

            while(f!=s){
                f = f.next;
                s = s.next;
            }

            return s;


        }
    }
}
