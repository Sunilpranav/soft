class Solution {
    public int countKeyChanges(String s) {
        String a=s.toLowerCase();
        int count=0;
        for(int i=1;i<s.length();i++)
        {
            if(a.charAt(i-1)!=a.charAt(i))
            {
                System.out.println(s.charAt(i-1));
                count++;
            }
        }
        return count;
    }
}