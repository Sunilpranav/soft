import java.util.*;

class Solution {

    public ArrayList<Boolean> processQueries(int[] arr, int[][] queries) {

        int n = arr.length;

        int[] bad = new int[n];

        // Mark valleys (Decrease -> Increase)
        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] > arr[i] && arr[i] < arr[i + 1]) {
                bad[i] = 1;
            }
        }

        // Prefix sum
        int[] prefix = new int[n];
        prefix[0] = bad[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + bad[i];
        }

        ArrayList<Boolean> ans = new ArrayList<>();

        for (int[] q : queries) {

            int l = q[0];
            int r = q[1];

            if (r - l < 2) {
                ans.add(true);
                continue;
            }

            int cnt = prefix[r - 1] - prefix[l];

            ans.add(cnt == 0);
        }

        return ans;
    }
}
// import java.util.*;

// class Solution {
//     public ArrayList<Boolean> processQueries(int[] arr, int[][] queries) {

//         ArrayList<Boolean> ans = new ArrayList<>();

//         for (int[] q : queries) {

//             int l = q[0];
//             int r = q[1];

//             boolean decreasing = false;
//             boolean ok = true;

//             for (int i = l + 1; i <= r; i++) {

//                 if (arr[i] > arr[i - 1]) {

//                     if (decreasing) {
//                         ok = false;
//                         break;
//                     }

//                 } else if (arr[i] < arr[i - 1]) {

//                     decreasing = true;
//                 }
//             }

//             ans.add(ok);
//         }

//         return ans;
//     }
// }