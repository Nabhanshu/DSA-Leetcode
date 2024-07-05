/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    // public ListNode intersect(ListNode hs,ListNode hl,int d){
    //     while(d!=0){
    //         d--;
    //         hl=hl.next;
    //     }
    //     while(hs!=hl){
    //         hs=hs.next;
    //         hl=hl.next;
    //     }
    //     return hs;
    // }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // ListNode temp=headA;
        // ListNode temp2=headB;
        // while(temp!=null){
        // while(temp2!=null){
        // temp2=headB;
        // if(temp==temp2){
        // return temp2;
        // }
        // temp2=temp2.next;
        // }
        // temp=temp.next;
        // }
        // return null;

        // HashSet<ListNode> map=new HashSet();
        // ListNode temp=headA;
        // ListNode temp2=headB;
        // while(temp!=null){
        // map.add(temp);
        // temp=temp.next;
        // }
        // while(temp2!=null){
        // if(map.contains(temp2)){
        // return temp2;
        // }
        // temp2=temp2.next;
        // }

        // DIFFERCE NODE

        // int n1 = 0;
        // ListNode temp = headA;
        // while (temp != null) {
        //     n1++;
        //     temp=temp.next;

        // }

        // int n2=0;
        //         ListNode temp2= headB;
        // while (temp2 != null) {
        //     n2++;
        //     temp2=temp2.next;

        // }
        
        // if(n1<n2){
        //     int d=n2-n1;
        //     return intersect(headA,headB,d);
        // }else{
        //     return intersect(headB,headA,n1-n2);
        // }

        if(headA==null|| headB==null){
            return null;
        }
         ListNode temp=headA;
        ListNode temp2=headB;
        while(temp!=temp2){

         temp=temp.next;
         temp2=temp2.next;
         
         if(temp==temp2){
             return temp;
         }

         if(temp==null){
             temp=headB;

         }
                 if(temp2==null){
             temp2=headA;

         }

        }
        return temp;

    }
}