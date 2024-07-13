class Solution {
    public int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        int n=arr.length;
        return arr[n-k];

        // PriorityQueue<Integer>pq= new PriorityQueue<>((a,b)->b-a);
        
        // int n = arr.length  ;

        // for (int i = 0; i < arr.length; i++) {
        //     pq.add(arr[i])  ;
        // }

        // int f = k - 1 ;

        // while (f > 0) {
        //     pq.remove()  ;
        //     f-- ;
        // }
        // return pq.peek();
        
    }
}