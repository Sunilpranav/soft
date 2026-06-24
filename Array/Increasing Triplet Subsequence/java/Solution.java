class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i=0,j=1,k=2;
        boolean op=false;
        while(k<nums.length && j<nums.length-1 && i<nums.length-2)
        {
            if(nums[i]<nums[j] && nums[j]<nums[k])
            {
                op=true;
                // System.out.println(i);
                // System.out.println(j);
                // System.out.println(k);
            }
            i++;
            j++;
            k++;
        }
        return op;
    }
}