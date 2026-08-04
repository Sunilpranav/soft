class Solution {
    public List<String> buildArray(int[] target, int n) {

        int i=1;
        int l=0;
        //int k=0;
        ArrayList<String>list=new ArrayList<>();
        //Stack<String>s=new Stack<>();

        //list.add("Push");
        while(l<target.length && i<=n)
        {
            // if(list.isEmpty())
            // {
            //     list.add("Push");
            //    // k++;
            // }
           list.add("Push");

            if (i == target[l]) {
                l++;

                if (l == target.length)
                    break;
            } 
            else 
            {
                list.add("Pop");
                //k++;
                //l++;
            }
            i++;
        }
        return list;
    }
}