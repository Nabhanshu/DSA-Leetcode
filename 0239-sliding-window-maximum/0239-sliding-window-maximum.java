class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        // self try
    //  int n=nums.length;
    //         int ans[]=new int[(n-k)+1];
    //         int temp=k;
    //         for(int i=0;i<=n-k;i++){
    //             int max=Integer.MIN_VALUE;
    //             for(int j=i;j<temp;j++){
    //                 max=Math.max(max,nums[j]);
    //                 System.out.println("enter for"+j+"times");
    //             }
    //                 temp++;
                    
    
    
    //             ans[i]=max;
    //         }
    //         return ans;
    // time complexity is n^2
   int n = a.length;
        int[] r = new int[n - k + 1];
        int ri = 0;
        // store index
        Deque < Integer > q = new ArrayDeque < > ();
        for (int i = 0; i < a.length; i++) {
            // remove numbers out of range k
            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }

            q.offer(i);
            if (i >= k - 1) {
                r[ri++] = a[q.peek()];
            }
        }
        return r;
            
        
    }
}