class Solution {
    public String sortString(String s) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder ans = new StringBuilder();
        int remaining = s.length();

        while (remaining > 0) {

            // Smallest to Largest (a -> z)
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    ans.append((char) (i + 'a'));
                    freq[i]--;
                    remaining--;
                }
            }

            // Largest to Smallest (z -> a)
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    ans.append((char) (i + 'a'));
                    freq[i]--;
                    remaining--;
                }
            }
        }

        return ans.toString();
    }
}
// class Solution {
//     public String sortString(String s) {
//         int arr[]=new int[26];
//         //int count=0;
//         for(int i=0;i<s.length();i++)
//         {
//             arr[s.charAt(i)-'a']++;
//         }
//         System.out.println(Arrays.toString(arr));
//         String ans="";
//         // for(int j=0;j<s.length();j++)
//         // {
//         StringBuilder del=new StringBuilder(s);
//         while(del.toString().length()!=0)
//         {
//             //System.out.println(ans);
//             for(int i=1;i<s.length();i++)
//             {
//                 if(arr[s.charAt(i-1)-'a']!=0 && s.charAt(i-1)<s.charAt(i))
//                 {
//                     ans=ans+s.charAt(i-1);
//                     arr[s.charAt(i-1)-'a']--;
//                      if(del.toString().indexOf(s.charAt(i-1))!=-1)
//                      {
//                     del.deleteCharAt(s.charAt(i-1)); 
//                     if(del.toString().indexOf(s.charAt(i-1))!=-1)
//                     {
//                         del.deleteCharAt(s.charAt(i-1));
//                     }
//                     }
//                     //System.out.println(ans);
//                 }
//             }
//             StringBuilder sb=new StringBuilder(ans);
//             sb.reverse();
//             ans+=sb.toString();
//         }
//         //System.out.println(ans);
//         return ans;
//     }
// }