class Solution {
  public:
    void mergeArrays(vector<int>& a, vector<int>& b) {
        // code here
        vector<int>arr;
        for(int i=0;i<a.size();i++)
        {
            arr.push_back(a[i]);
        }
        for(int i=0;i<b.size();i++)
        {
            arr.push_back(b[i]);
        }
        sort(arr.begin(),arr.end());
        int r=0;
        for(int i=0;i<a.size();i++)
        {
            a[i]=arr[r];
            r++;
        }
        for(int i=0;i<b.size();i++)
        {
            b[i]=arr[r];
            r++;
        }
    }
};