class Solution {
    public int firstSearch(int[] arr, int k) {
        int l = 0;
        int h = arr.length - 1;
        int result = -1; // Initialize to -1 in case k is not found

        // Change 1: Use <= to ensure the final single element is checked
        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] == k) {
                result = mid;     // Change 2: Record the index as a candidate...
                h = mid - 1;      // ...and continue checking the left side
            } 
            else if (arr[mid] < k) {
                l = mid + 1;
            } 
            else {
                h = mid - 1;
            }
        }
        return result; // Returns the recorded first occurrence or -1
    }
}

// class Solution {
//     public int firstSearch(int[] arr, int k) {
//         int l=0;
//         int h=arr.length-1;
//         while(l<h)
//         {
//             int mid=l+(h-l)/2;
//             if(arr[mid]==k)
//             {
//                 return mid;
//             }
//             else if(arr[mid]<k)
//             {
//                 l=mid+1;
//             }
//             else
//             {
//                 h=mid-1;
//             }
//         }
//         return -1;
//     }
// }