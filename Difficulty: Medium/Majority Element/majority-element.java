class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
            //max=Math.max(max,h.get(arr[i]));
            if(h.get(arr[i])>arr.length/2)
            {
                return arr[i];
            }
        }
        return -1;
        
    }
}