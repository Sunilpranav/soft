class Solution {
    public int maxScore(String s) {
        int one=0;
       for(int i=0;i<s.length();i++)
       {
            if(s.charAt(i)=='1')
            {
                one++;
            }
       }
       int l=0;
       int r=one;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<s.length();i++)
       {
            if(s.charAt(i)=='0')
            {
               l++;
            }
            else
            {
                r--;
            }
            max=Math.max((r+l),max);
       }
       return max;
    }
}