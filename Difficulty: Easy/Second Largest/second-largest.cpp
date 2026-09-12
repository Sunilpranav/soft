class Solution {
  public:
    int getSecondLargest(vector<int> &arr) {
        // code here
        int max=arr[0],max2 = INT_MIN;;
        for(int i=1;i<arr.size();i++)
        {
           if(arr[i]>max)
           {
               max2=max;
               max=arr[i];
           }
           else if(arr[i]>max2 && max!=arr[i])
           {
               max2=arr[i];
           }
        }
        if(max2==INT_MIN)
        {
            return -1;
        }
        return max2;
    }
};