class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int left=0,right=0;
        int i=0;
        while(i<arr2.length)
        {
            while(right<arr1.length)
            {
                if(arr2[i]==arr1[right])
                {
                    int temp=arr1[left];
                    arr1[left]=arr1[right];
                    arr1[right]=temp;
                    left++;
                }
                right++;
            }
            i++;
            right=left;
        }
        for(int j=left;j<arr1.length-1;j++)
        {
            for(int k=j+1;k<arr1.length;k++)
            {
            if(arr1[j]>arr1[k])
            {
                int temp1=arr1[j];
                arr1[j]=arr1[k];
                arr1[k]=temp1;
            }
            }
        }
        return arr1;
    }
}