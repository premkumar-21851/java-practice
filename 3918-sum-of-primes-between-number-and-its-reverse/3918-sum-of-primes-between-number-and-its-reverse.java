
class Solution{
    boolean prime(int num)
    {
        boolean isprime=true;
        if(num<=1)
        isprime=false;
        else
        {
            for(int i=2;i*i<=num;i++)
            {
                if(num%i==0)
                {
                    isprime=false;
                    break;
                }
            }
        }
        return isprime;
    }
    public int sumOfPrimesInRange(int n)
    {
        int rev=0;
        int temp=n;
        while(temp>0)
        {
            rev=rev*10+(temp%10);
            temp=temp/10;
        }
        int sum=0;
        int start=Math.min(n,rev);
        int end=Math.max(n,rev);

        for(int i=start;i<=end;i++)
        {
            if(prime(i))
            {
                sum+=i;
            }
        }
        return sum;
    }
}