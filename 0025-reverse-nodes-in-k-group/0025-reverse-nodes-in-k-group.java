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
    public ListNode kthnode(ListNode temp,int k){
        k=k-1;
        while(temp!=null&& k>0){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public void  reverse(ListNode head){
        ListNode next;
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return ;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevnode=null;
        while(temp!=null){
            ListNode knode=kthnode(temp,k);
                if(knode==null){

                    if(prevnode!=null){
                        prevnode.next=temp;
                    }
                    break;
                    

                }
                ListNode newnode=knode.next;
                knode.next=null;
                reverse(temp);
                if(temp==head){
                    head=knode;
                }else{
                    prevnode.next=knode;
                }

                prevnode=temp;
                temp=newnode;
            
        }

        return head;
    }
}