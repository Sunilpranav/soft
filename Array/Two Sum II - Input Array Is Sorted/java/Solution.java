class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0,right=numbers.length-1;
        int ans[]=new int[2];
        int i=0;
        while(left<numbers.length)
        {
            right=numbers.length-1;
        while(left<right)
        {
            if((numbers[left]+numbers[right]==target))
            {
                ans[i]=left+1;
                i++;
                ans[i]=right+1;
            }
            right--;
        }
            left++;
        }
        return ans;

    }
}