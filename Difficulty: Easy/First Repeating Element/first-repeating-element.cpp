class Solution {
  public:
    int firstRepeated(vector<int> &arr) {
        // code here
        map<int,int>a;
        for(int i:arr)
        {
            a[i]++;
        }
        for(int j=0;j<arr.size();j++)
        {
            if(a[arr[j]]>1)
            {
                return j+1;
            }
        }
        return -1;
        // for(int i=0;i<arr.size();i++)
        // {
        //     for(int j=0;j<arr.size();j++)
        //     {
        //         if(arr[i]==arr[j] && i!=j)
        //         {
        //             return i+1;
        //         }
        //     }
        // }
        // return -1;
    }
};