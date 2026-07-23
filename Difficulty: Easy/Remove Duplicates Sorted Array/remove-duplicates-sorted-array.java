class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer>l=new ArrayList<>();
        l.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]<arr[i])
            {
                l.add(arr[i]);
            }
        }
        return l;
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(!l.contains(arr[i]))
        //     {
        //         l.add(arr[i]);
        //     }
        // }
        // return l;
    }
}
