class Solution {
    public int largestRectangleArea(int[] heights) {

        int maxarea=Integer.MIN_VALUE;
        Stack<Integer> s=new Stack<>();
       // left smallest

       int larr[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){

            while(!s.isEmpty()&&heights[i]<=heights[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                larr[i]=-1;
                
            }else{
                larr[i]=s.peek();
            }

            s.push(i);
        }
        
        s=new Stack<>();
        //right small
        int rarr[]=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){

            while(!s.isEmpty()&&heights[i]<=heights[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                rarr[i]=heights.length;
                
            }else{
                rarr[i]=s.peek();
            }

            s.push(i);
        }

        for(int i=0;i<heights.length;i++){

            int height=heights[i];
            int width=rarr[i]-larr[i]-1;
            int area=height*width;

            if(maxarea<area){
                maxarea=area;
            }
        }
     return maxarea;
        
    }
}