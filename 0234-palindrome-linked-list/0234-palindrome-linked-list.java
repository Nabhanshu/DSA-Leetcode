/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        
          if(head==null||head.next==null){
               return true;
           }
        // find mid
        ListNode slow= head;
           ListNode fast= head;
           ListNode mid=null;
           ListNode temp=head;

         
           while(fast!=null&&fast.next!=null){
               
               slow=slow.next;
               fast=fast.next.next;
           }
          mid =slow;
        //rev the right part
        ListNode next;
        ListNode prev=null;
        ListNode curr=mid;
        while(curr!=null){
             
             next=curr.next;
             curr.next=prev;
             prev=curr;
             curr=next;
        }

        ListNode rhead=prev;
        ListNode lhead=temp;
        // check the left part val nd right part val
        
        while(rhead!=null){
            if(rhead.val!=lhead.val){
                  return false;
            }

            rhead=rhead.next;
            lhead=lhead.next;
        }

        return true;
    }
}