class Solution {
    public void sort012(int[] arr) {

        int zero = 0;
        int one = 0;
        int two = 0;

        for(int x : arr){
            if(x == 0)
                zero++;
            else if(x == 1)
                one++;
            else
                two++;
        }

        int index = 0;

        while(zero-- > 0)
            arr[index++] = 0;

        while(one-- > 0)
            arr[index++] = 1;

        while(two-- > 0)
            arr[index++] = 2;
    }
}