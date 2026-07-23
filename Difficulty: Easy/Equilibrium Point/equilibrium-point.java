class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
            total+=arr[i];
        }
        int left=0;
        total-=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(left==total)
            {
                return i-1;
            }
            total-=arr[i];
            left+=arr[i-1];
        }
        return -1;
        // int k=1;
        // while(k<arr.length)
        // {
        //     int sum1=0,sum2=0;
        //     for(int i=0;i<arr.length;i++)
        //     {
        //         if(i<k) sum1+=arr[i];
        //         else if(i>k) sum2+=arr[i];
        //     }
        //     if(sum1==sum2)
        //     {
        //         return k;
        //     }
        //     else
        //     {
        //         k++;
        //     }
        // }
        // return -1;
        // int k=1;
        // while(k<arr.length)
        // {
        //     int sum1=0,sum2=0;
        //     for(int i=0;i<k;i++)
        //     {
        //         sum1+=arr[i];
        //     }
        //     for(int j=k+1;j<arr.length;j++)
        //     {
        //         sum2+=arr[j];
        //     }
        //     if(sum1==sum2)
        //     {
        //         return k;
        //     }
        //     else
        //     {
        //         k++;
        //     }
        // }
        // return -1;
    }
}
