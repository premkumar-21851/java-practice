class Solution
{
    public int smallestEvenMultiple(int n)
    {
        int small=0;
        for(int i=1;;i++)
        {
            if(i%2==0 && i%n==0)
            {
                small= i;
                break;
            }
        }
        return small;
    }
}