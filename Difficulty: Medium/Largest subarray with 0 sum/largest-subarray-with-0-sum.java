class Solution {
    int maxLength(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == 0) {
                max = i + 1;
            }

            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return max;
    }
}
// class Solution {
//     int maxLength(int arr[]) {
//         // code here
//         int max=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             int count=0,sum=0;
//             for(int j=i;j<arr.length;j++)
//             {
//                 sum+=arr[j];
//                 count++;
//                 if(sum==0)
//                 {
//                     max=Math.max(max,count);
//                 }
//             }
//         }
//         return max;
//     }
// }