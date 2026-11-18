class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        int temp=n;

        while(temp>0)
        {
            sum+=(temp%10);
            temp=temp/10;
        }

        return sum;
    }
}