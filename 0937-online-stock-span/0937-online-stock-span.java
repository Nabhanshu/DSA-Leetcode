class StockSpanner {

    Stack<node> s;
    public class node{
        int price;
        int span;

        public node(int price,int span){
            this.price=price;
            this.span=span;

        }
    }

    public StockSpanner() {
        s=new Stack<>();
        
    }
    
    public int next(int price) {
      int count =0;
      while(!s.isEmpty()&& s.peek().price<=price){
          count+=s.peek().span;
          s.pop();
      }

      count++;
      s.push(new node(price,count));
      return count;
      
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */