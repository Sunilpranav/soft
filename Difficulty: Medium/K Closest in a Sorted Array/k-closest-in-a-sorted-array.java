class Solution {
    int[] printKClosest(int[] arr, int k, int x) {

        int n = arr.length;
        int[] ans = new int[k];

        // Find the insertion position of x
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }

        // Two pointers
        int left = high;
        int right = low;

        // If x exists, skip it
        if (right < n && arr[right] == x) {
            right++;
        }

        int i = 0;

        while (i < k) {

            if (left < 0) {
                ans[i++] = arr[right++];
            }
            else if (right >= n) {
                ans[i++] = arr[left--];
            }
            else {

                int leftDiff = Math.abs(arr[left] - x);
                int rightDiff = Math.abs(arr[right] - x);

                if (leftDiff < rightDiff) {
                    ans[i++] = arr[left--];
                }
                else if (leftDiff > rightDiff) {
                    ans[i++] = arr[right++];
                }
                else {
                    // Equal distance -> choose larger element
                    if (arr[left] > arr[right]) {
                        ans[i++] = arr[left--];
                    } else {
                        ans[i++] = arr[right++];
                    }
                }
            }
        }

        return ans;
    }
}