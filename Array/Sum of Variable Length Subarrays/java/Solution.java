class Solution {
    public int subarraySum(int[] nums) {
        int totalSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // 1. Find the starting point for this index
            int start = Math.max(0, i - nums[i]);
            
            // 2. Loop from start to i and add up the array elements
            for (int j = start; j <= i; j++) {
                totalSum += nums[j];
            }
        }
        
        return totalSum;
    }
}
