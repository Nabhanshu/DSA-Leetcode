/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
     public void storeinmiddle(Node head){
        Node temp=head;
        while(temp!=null){

            Node copynode=new Node(temp.val);
            copynode.next=temp.next;
            temp.next=copynode;

            temp=temp.next.next;

        }
     }

public void randomdone(Node head){
    Node temp=head;
    while(temp!=null){

    
    Node copynode=temp.next;
    if(temp.random!=null){
      copynode.random=temp.random.next;
    }else{
        copynode.random=null;
    }

    temp=temp.next.next;
    }
}
public Node nextdone(Node head){
    Node dummy=new  Node(-1);
    Node res=dummy;
    Node temp=head;
    while(temp!=null){
        res.next=temp.next;

        temp.next=temp.next.next;

        res=res.next;
        temp=temp.next;
    }
    return dummy.next;

}
    public Node copyRandomList(Node head) {
        storeinmiddle( head);
        randomdone( head);
       return  nextdone( head);
       
     
        
    }
}