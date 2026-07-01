class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int pro=1;
        for(int i=0;i<nums.length;i++)
        {
            pro*=nums[i];
            if(pro>max)
            {
                max=pro;
            }
            // if(pro<0 && )
            // {
            //     pro=-1;
            // }
        }
        return max;
    }
}