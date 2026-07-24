class Solution {
    int search(int[] arr, int key) {
        // code here
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    //   // Arrays.sort(arr);
    //     if(Arrays.binarySearch(arr,key)>=0)
    //     {
    //         return Arrays.binarySearch(arr,key);
    //     }
    //     return -1;
    }
}