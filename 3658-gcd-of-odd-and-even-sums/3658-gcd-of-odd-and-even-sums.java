class Solution {
    public int gcdOfOddEvenSums(int n) {
        int gcd = 1;

        for(int i=1;i<=n*n && i<=(n*(n+1));i++)
        {
            if((n*n)%i==0 && (n*(n+1))%i==0)
            {
                gcd=i;
            }
        }
        return gcd;
    }
}