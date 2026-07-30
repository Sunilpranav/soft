class Solution {
    public boolean canAliceWin(int[] nums) {
        int one=0,two=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
            {
                //System.out.println(nums[i]);
                one+=nums[i];
            }
            else 
            {
                two+=nums[i];
            }
        }
        //System.out.println(one);
        //System.out.println(two);
        if(one==two)
        {
            return false;
        }
        return true;
    }
}