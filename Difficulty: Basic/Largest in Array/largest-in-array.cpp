class Solution {
  public:
    int largest(vector<int> &arr) {
        // code here
        int Max=0;
        for(int i=0;i<arr.size();i++)
        {
            Max=max(Max,arr[i]);
        }
        return Max;
    }
};
