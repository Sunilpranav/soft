class Solution {
    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        StringBuilder sb=new StringBuilder(s);
        int ans[]=new int[queryCharacters.length()];
        for(int i=0;i<queryIndices.length;i++)
        {
            sb.setCharAt(queryIndices[i],queryCharacters.charAt(i));
            HashSet<Integer>h=new HashSet<>();
            int count=1;
            int max=1;
            for(int j=1;j<sb.length();j++)
            {
                if(sb.charAt(j-1)==sb.charAt(j))
                {
                    count++;
                }
                else
                {
                    count=1;
                }
                max=Math.max(max,count);
            }
            ans[i]=max;
        }
       return ans;
    }
}