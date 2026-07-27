
import java.util.HashMap;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Map stores: [Prefix Sum -> Earliest Index where it occurred]
        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // 1. If the sum itself equals k, we found a subarray from index 0 to i
            if (sum == k) {
                maxLen = i + 1;
            }

            // 2. Check if a prefix sum exists that can be removed to get target k
            long remainingSum = sum - k;
            if (map.containsKey(remainingSum)) {
                int length = i - map.get(remainingSum);
                maxLen = Math.max(maxLen, length);
            }

            // 3. Only store the prefix sum if it hasn't been seen before.
            // This ensures we keep the earliest index to maximize the subarray length!
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
// class Solution {
//     public int longestSubarray(int[] arr, int k) {
//         int maxLen = 0; 
        
//         for (int i = 0; i < arr.length; i++) {
//             int sum = 0;
//             for (int j = i; j < arr.length; j++) {
//                 sum += arr[j];
                
//                 if (sum == k) {
//                     int currentLength = j - i + 1;
//                     maxLen = Math.max(maxLen, currentLength);
//                 }
//             }
//         }
//         return maxLen;
//     }
// }
