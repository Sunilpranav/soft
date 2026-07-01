class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;

        for(int x : nums)
            total += x;

        int maxNormal = kadaneMax(nums);
        if (maxNormal < 0)return maxNormal;
        int minSub = kadaneMin(nums);

        int maxCircular = total - minSub;

        return Math.max(maxNormal,maxCircular);
    }
    static int kadaneMax(int arr[]) {

        int current = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            current = Math.max(arr[i], current + arr[i]);

            max = Math.max(max, current);
        }

        return max;
    }

    static int kadaneMin(int arr[]) {

        int current = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            current = Math.min(arr[i], current + arr[i]);

            min = Math.min(min, current);
        }

        return min;
    }
}