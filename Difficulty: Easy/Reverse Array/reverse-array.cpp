class Solution {
  public:
    void reverseArray(vector<int> &arr) {
        // code here
        int l=0,r=arr.size()-1;
        while(l<r)
        {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
};