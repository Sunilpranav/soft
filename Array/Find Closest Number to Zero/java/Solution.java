class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int n=0,ans=0;
        for(int i=0;i<nums.length;i++)
        {
            //int n=nums[i];
            if(Math.abs(nums[i]-0)<=min)
            {
                min=Math.abs(nums[i]-0);
                // if(n==nums[i])
                // {
                //     ans=Math.max(n,nums[i]);
                // }
                n=nums[i];
            }
        }
        return n;
    }
}