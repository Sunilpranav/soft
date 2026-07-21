class Solution {
    boolean twoSum(int arr[], int target) {
        // code 
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        while(l<r)
        {
            if((arr[l]+arr[r])==target)
            {
                return true;
            }
            else if((arr[l]+arr[r])>target)
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        return false;
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr.length;j++)
        //     {
        //         if((arr[i]+arr[j])==target && i!=j)
        //         {
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}