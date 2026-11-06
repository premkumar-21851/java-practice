class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=x;
        int sum=0;

        while(temp>0)
        {
            int temp1=temp%10;
            sum+=temp1;
            temp=temp/10;
        }

        if(x%sum==0)
        {
            return sum;
        }
        else
        {
            return -1;
        }
    }
}