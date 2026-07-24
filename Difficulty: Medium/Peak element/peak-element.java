class Solution {
    public int peakElement(int[] arr) {
        // code here
        //int max=Integer.MIN_VALUE;
        if(arr.length==1 || arr[0]>arr[1])
        {
            return 0;
        }
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1])
            {
                return i;
            }
        }
        if(arr[arr.length-2]<arr[arr.length-1])
        {
            return arr.length-1;
        }
        return -1;
    }
}