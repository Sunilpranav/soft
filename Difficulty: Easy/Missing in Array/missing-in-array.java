class Solution {
    int missingNum(int arr[]) {
        // Use long to prevent integer overflow during calculation
        long n = arr.length + 1; 
        
        // Expected sum can be very large
        long expectedSum = (n * (n + 1)) / 2; 
        
        // Actual sum must also be a long
        long actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        
        // Cast the final result back to int as required by the return type
        return (int)(expectedSum - actualSum);
    }
}
