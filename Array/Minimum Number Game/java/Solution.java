class Solution {
    public int[] numberGame(int[] nums) {
        int arr[]=new int[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                arr[i+1]=nums[i];
            }
            else
            {
                arr[i-1]=nums[i];
            }
        }
        return arr;
    }
}