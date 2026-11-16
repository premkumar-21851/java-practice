class Solution {
    public int totalMoney(int n) {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int week=i/7;
            int day=i%7;

            int depo=week+day+1;

            sum=sum+depo;
        }

        return sum;
    }
}