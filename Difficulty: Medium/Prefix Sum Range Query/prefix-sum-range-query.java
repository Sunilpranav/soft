class Solution {
    public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {
        ArrayList<Integer> l = new ArrayList<>();
        int n = arr.length;
        int[] pref = new int[n + 1];
        
        // Build prefix sum array
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + arr[i];
        }
        
        // Process queries in O(1) time
        for (int i = 0; i < queries.length; i++) {
            int L = queries[i][0];
            int R = queries[i][1];
            int sum = pref[R + 1] - pref[L];
            l.add(sum);
        }
        
        return l;
    }
}

// class Solution {
//     public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {
//         // code here
//         ArrayList<Integer>l=new ArrayList<>();
//         for(int i=0;i<queries.length;i++)
//         {
//             int sum=0;
//             for(int j=queries[i][0];j<=queries[i][1];j++)
//             {
//                 sum+=arr[j];
//             }
//             l.add(sum);
//         }
//         return l;
//     }
// }