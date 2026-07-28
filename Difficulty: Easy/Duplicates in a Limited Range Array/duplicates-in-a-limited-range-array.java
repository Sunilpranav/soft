
class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        // Count the frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Collect elements whose frequency is greater than 1
        for (int num : map.keySet()) {
            if (map.get(num) > 1) {
                ans.add(num);
            }
        }

        Collections.sort(ans);   // GFG expects sorted output

        return ans;
    }
}// class Solution {
//     public ArrayList<Integer> findDuplicates(int[] arr) {
//         // code here
//         ArrayList<Integer>l=new ArrayList<>();
//         for(int i=0;i<arr.length;i++)
//         {
//             int count=0;
//             for(int j=0;j<arr.length;j++)
//             {
//                 if(arr[i]==arr[j])
//                 {
//                     count++;
//                 }
//             }
//             if(count>1 && !l.contains(arr[i]))
//             {
//                 l.add(arr[i]);
//             }
//         }
//         return l;
//     }
// }