class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        if(Arrays.binarySearch(arr,k)>=0)
        {
            return true;
        }
        return false;
    }
}