class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>10)
        {
            sum=0;
            int n=num;
            while(n>0)
            {
                int x =n%10;
                sum+=x;
                n/=10;
            }
            num=sum;
        }
        return num;
    }
}