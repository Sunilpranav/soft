class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            // if(Character.isDigit(operations[i]))
            // {
            //     s.push(Integer.valueOf(operations[i]));
            // }
            if(operations[i].equals("C"))
            {
                s.pop();
            }
            else if(operations[i].equals("D"))
            {
                s.push(2*s.peek());
                //System.out.println(s.peek());
            }
            else if(operations[i].equals("+"))
            {
                int a=s.pop();
                int b=s.pop();
                s.push(b);
                s.push(a);
                s.push(a+b);
            }
            else
            {
                s.push(Integer.valueOf(operations[i]));
                
            }
        }
        //System.out.println(s);
        int sum=0;
        int size=s.size();
        for(int i=0;i<size;i++)
        {
            sum+=s.pop();
        }
        return sum;
    }
}