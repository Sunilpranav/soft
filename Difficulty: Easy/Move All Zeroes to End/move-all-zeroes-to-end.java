class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        //int ans[]=new int[arr.length];
        int l=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[l]=arr[i];
                l++;
            }
        }
        for(int i=l;i<arr.length;i++)
        {
            arr[i]=0;
        }
        //System.out.println(Arrays.toString(ans));
    }
}