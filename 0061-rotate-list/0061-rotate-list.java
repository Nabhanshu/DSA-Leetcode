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
    public ListNode rotateRight(ListNode head, int k) {
        // optimal
        //base case
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        int length=1;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        temp.next=head;
         k=k%length;
        int kk=length-k;
        // kk denote the kth iteration to find the end after rotate
        while(kk!=0){
           temp= temp.next;
            kk--;
        }

     head=temp.next;
     temp.next=null;

     return head;
        
    }
}