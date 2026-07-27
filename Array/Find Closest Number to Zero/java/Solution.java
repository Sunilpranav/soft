class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            //int n=nums[i];
            if(nums[i]<0)
            {
                nums[i]=nums[i]*-1;
            }
            min=Math.min(min,Math.abs(0-nums[i]));
        }
        return min;
    }
}