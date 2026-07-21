import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int n = arr.length;

        if (n < 4)
            return ans;

        Arrays.sort(arr);

        for (int i = 0; i < n - 3; i++) {

            // Skip duplicate first elements
            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {

                // Skip duplicate second elements
                if (j > i + 1 && arr[j] == arr[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum == target) {

                        ArrayList<Integer> temp = new ArrayList<>();

                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[left]);
                        temp.add(arr[right]);

                        ans.add(temp);

                        left++;
                        right--;

                        // Skip duplicate third element
                        while (left < right && arr[left] == arr[left - 1])
                            left++;

                        // Skip duplicate fourth element
                        while (left < right && arr[right] == arr[right + 1])
                            right--;

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }
}
// import java.util.*;
// class Solution {
//     public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
//         // code here
//         // if(arr.length<4)
//         // {
//         //     return false;
//         // }
//         Arrays.sort(arr);
//         int i=0,l=1,r=arr.length-2,j=arr.length-1;
//         ArrayList<ArrayList<Integer>>li=new ArrayList<>();
//         while(i<j)
//         {
//             ArrayList<Integer>temp=new ArrayList<>();
//             temp.add(arr[i]);
//             temp.add(arr[j]);
//             while(l<r)
//             {
//                 temp.add(arr[l]);
//                 temp.add(arr[r]);
//                 if((arr[i]+arr[j]+arr[l]+arr[r])==target)
//                 {
//                     Collections.sort(temp);
//                     li.add(temp);
//                 }
//                 else if((arr[l]+arr[r])>target)
//                 {
//                     r--;
//                 }
//                 else
//                 {
//                     l++;
//                 }
//             }
//             if((arr[i]+arr[j])>target)
//             {
//                 j--;
//             }
//             else
//             {
//                 i++;
//             }
//         }
//         return li;
//     }
// }