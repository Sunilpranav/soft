class Solution {
    public int[][] imageSmoother(int[][] img) {
        int one=0,two=0,three=0;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                one+=img[i][j];
            }
        }
        double a=one/4;
        one=(int)Math.floor(a);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                two+=img[i][j];
            }
        }
        double b=two/6;
        two=(int)Math.floor(b);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                three+=img[i][j];
            }
        }
        double c=three/9;
        three=(int)Math.floor(c);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if((i==0 && j==0)||(i==0 && j==2) || (i==2 && j==0)||(i==2 && j==2))
                {
                
                    img[i][j]=one;
                }
                else if((i==0 && j==1)||(i==1 && j==0)||(i==1 && j==2)||(i==2 && j==1))
                {
                    img[i][j]=two;
                }
                else
                {
                    img[i][j]=three;
                }
            }
        }
        return img;
    }
}