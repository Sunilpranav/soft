class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int temp[]=Arrays.copyOf(arr,arr.length);
        Arrays.sort(temp);
        HashMap<Integer,Integer>h=new HashMap<>();
        int l=1;
        for(int i=0;i<temp.length;i++)
        {
            if(!h.containsKey(temp[i]))
            {
                h.put(temp[i], l);
                l++;
            }
        }
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            ans[i]=h.get(arr[i]);
        }
        return ans;
    }
}