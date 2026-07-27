class Solution {
    static int countDistinct(int arr[]) {
        // code here
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!l.contains(arr[i]))
            {
                l.add(arr[i]);
            }
        }
        return l.size();
    }
}