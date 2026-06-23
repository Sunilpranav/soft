class Solution {
    public String reverseVowels(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if("AEIOUaeiou".indexOf(s.charAt(i))!=-1)
            {
                st.push(s.charAt(i));
            }
        }
        String name="";
        for(int i=0;i<s.length();i++)
        {
            if("AEIOUaeiou".indexOf(s.charAt(i))!=-1)
            {
                name+=st.pop();
            }
            else
            {
                name+=s.charAt(i);
            }
        }
        return name;
    }
}