class Solution {
    public int subtractProductAndSum(int n)
    {
        int product=1;
        int sum=0;
        int temp=n;

        while(temp>0)
        {
            int x=temp%10;
            sum=sum+x;
            product=product*x;

            temp=temp/10;
        }

        return product-sum;
    }
}