import java.util.Arrays;

class Solution {
    public boolean hasTripletSum(int arr[], int target) {

        int n = arr.length;

        if (n < 3)
            return false;

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target)
                    return true;

                else if (sum < target)
                    left++;

                else
                    right--;
            }
        }

        return false;
    }
}
// class Solution {
//     public boolean hasTripletSum(int arr[], int target) {
//         // code Here
//         if(arr.length<3)
//         {
//             return false;
//         }
//         Arrays.sort(arr);
//         int l=0,k=1,r=arr.length-1;
//         while(l<r && k<r)
//         {
//             if((arr[l]+arr[r]+arr[k])==target)
//             {
//                 return true;
//             }
//             else if((arr[l]+arr[r]+arr[k])<target)
//             {
//                 if((arr[l]+arr[k])>target)
//                 {
//                     l--;
//                 }
//                 else
//                 {
//                     k++;
//                 }
//             }
//             else
//             {
//                 r--;
//             }
//         }
//         return false;
//     }
// }
