class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            
            for(int j=1;j<=nums.length;j++)
            {
                int sum=0;
                for(int k=0;k<j;k++)
                {
                    sum+=nums[(i+k)%nums.length];
                }
                max=Math.max(sum,max);
            }
           
        }
        return max;
    }
}