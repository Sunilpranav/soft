class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int a[]=new int[2];
        int max1=-1;
        int max2=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=x)
            {
                max1=Math.max(max1,arr[i]);
            }
            if(arr[i]>=x)
            {
                if(max2==-1 || max2>arr[i]) max2=arr[i];
            }
        }
        a[0]=max1;
        a[1]=max2;
        return a;
        // int max1=Integer.MIN_VALUE;
        // int max=-1;
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]<x)
        //     {
        //         max1=Math.max(max1,arr[i]);
        //     }
        //     if(arr[i]>x && max==-1) max=Math.max(max,arr[i]);
        // }
        // a[0]=max1;
        // a[1]=max;
        // return a;
    }
}
