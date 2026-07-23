class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max1=-1;
        int max2=-1;
        for(int i=0;i<arr.length;i++)
        {
            max1=Math.max(max1,arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=max1)
            {
                max2=Math.max(max2,arr[i]);
            }
        }
        return max2;
    }
}