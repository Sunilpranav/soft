class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int pro=1;
            for(int j=i;j<nums.length;j++)
            {
                pro*=nums[j];
                max=Math.max(pro,max);
            }
        }
        return max;
        // int pro=1;
        // for(int i=0;i<nums.length;i++)
        // {
        //     pro*=nums[i];
        //     if(pro>max)
        //     {
        //         max=pro;
        //     }
        //     if(pro==0 )
        //     {
        //         pro=-1;
        //     }
        // }
        // return max;
    }
}