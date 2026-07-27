// class Solution {
//     public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
//         // code here
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        // Deque will store indices of array elements
        Deque<Integer> deque = new LinkedList<>();
        
        for (int i = 0; i < arr.length; i++) {
            // 1. Remove elements that are out of the current sliding window range
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }
            
            // 2. Remove all elements smaller than the current element from the back
            // because they are no longer useful as maximum candidates
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            
            // 3. Add the current element's index to the back of the queue
            deque.addLast(i);
            
            // 4. The first element in the deque is always the maximum of the current window.
            // Start adding to results once we have processed the first 'k' elements.
            if (i >= k - 1) {
                result.add(arr[deque.peekFirst()]);
            }
        }
        
        return result;
    }
}

    //     ArrayList<Integer>l=new ArrayList<>();
        
    //   for(int i=0;i<=arr.length-k;i++)
    //   {
    //       int max=Integer.MIN_VALUE;
    //       for(int j=i,s=0;j<arr.length && s<k;j++,s++)
    //       {
    //           // System.out.print(arr[j]);
    //           max=Math.max(max,arr[j]);
    //       }
    //       l.add(max);
    //       //System.out.println();
    //   }
    //   return l;
    // }//}