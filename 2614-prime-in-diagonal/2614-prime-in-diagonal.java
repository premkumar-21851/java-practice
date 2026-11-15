class Solution {
    boolean prime(int n)
    {
        if(n<=1)
        return false;
        else
        {
            for(int i=2;i<=n/i;i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
        }

        return true;
    }
    public int diagonalPrime(int[][] nums) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            l1.add(nums[i][i]);
            l1.add(nums[i][nums.length-1-i]);
        }
        

        for(int i=0;i<l1.size();i++)
        {
            if(prime(l1.get(i)))
            {
                l2.add(l1.get(i));
            }
        }

        if(l2.isEmpty())
        return 0;

        return Collections.max(l2);
    }
}