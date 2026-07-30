// class Solution {
//     public static int subArraySum(int[] arr, int k) {
//         // code here
//         int count=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             int sum=0;
//             for(int j=i;j<arr.length;j++)
//             {
//                 sum+=arr[j];
//                 //System.out.print(arr[i]);
//                 if(sum==k)
//                 {
//                     count++;
//                     break;
//                 }
//             }
//             //System.out.println();
//         }
//         return count;
//     }
// }
import java.util.HashMap;

class Solution {
    public static int subArraySum(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 occurs once before the array starts
        map.put(0, 1);

        int prefix = 0;
        int count = 0;

        for (int num : arr) {

            prefix += num;

            int need = prefix - k;

            if (map.containsKey(need)) {
                count += map.get(need);
            }

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}