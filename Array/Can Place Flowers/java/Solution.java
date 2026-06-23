class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=0,r=1;
        int temp=n;
        while(r<flowerbed.length)
        {
            if(r==0 && l==0)
            {
                flowerbed[r]=1;
                temp--;
            }
            l++;
            r++;
        }
        if(temp<=0)
        {
            return true;
        }
        return false;
    }
}