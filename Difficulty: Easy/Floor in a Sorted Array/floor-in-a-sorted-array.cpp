class Solution {
  public:
    int findFloor(vector<int>& arr, int x) {
        // code here
        int count=-1;
       for(int i=0;i<arr.size();i++)
       {
           if(x>=arr[i])
           {
               count=i;
               
           }
       }
       return count;
       
    }
};
