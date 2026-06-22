import java.util.*;

class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int[] pair : adjacentPairs) {
            map.computeIfAbsent(pair[0], k -> new ArrayList<>()).add(pair[1]);
            map.computeIfAbsent(pair[1], k -> new ArrayList<>()).add(pair[0]);
        }

        int start = 0;

        for (int key : map.keySet()) {
            if (map.get(key).size() == 1) {
                start = key;
                break;
            }
        }

        int n = adjacentPairs.length + 1;
        int[] ans = new int[n];

        ans[0] = start;
        ans[1] = map.get(start).get(0);

        for (int i = 2; i < n; i++) {

            List<Integer> neighbors = map.get(ans[i - 1]);

            if (neighbors.get(0) == ans[i - 2]) {
                ans[i] = neighbors.get(1);
            } else {
                ans[i] = neighbors.get(0);
            }
        }

        return ans;
    }
}