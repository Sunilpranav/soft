class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String temp="";
        for(int i=0;i<num.length;i++)
        {
            temp+=String.valueOf(num[i]);
        }
        String sum=String.valueOf(Integer.parseInt(temp)+k);
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<sum.length();i++)
        {
            l.add(Integer.valueOf(sum.charAt(i)+""));
        }
        return l;
    }
}