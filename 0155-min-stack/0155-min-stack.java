class Pair {
    int val, min;
    Pair(int val, int min) {
        this.val = val;
        this.min = min;
    }
}

class MinStack {
    Stack<Pair> s;

    public MinStack() {

        s=new Stack<>();


        
    }
    
    public void push(int val) {
        
        int min ;
     if(s.isEmpty()){

        min =val;

     }else{
        min =Math.min(s.peek().min,val);
     }

     s.push(new Pair(val,min));
        
    }
    
    public void pop() {

        s.pop();
        
    }
    
    public int top() {
        return s.peek().val;
        
    }
    
    public int getMin() {

        return s.peek().min;


        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */