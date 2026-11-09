class Solution {
    public int thirdMax(int[] nums) {

        long fl = Long.MIN_VALUE;
        long sl = Long.MIN_VALUE;
        long tl = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == fl || nums[i] == sl || nums[i] == tl)
            {
                continue;
            }

            if(nums[i] > fl)
            {
                tl = sl;
                sl = fl;
                fl = nums[i];
            }
            else if(nums[i] > sl)
            {
                tl = sl;
                sl = nums[i];
            }
            else if(nums[i] > tl)
            {
                tl = nums[i];
            }
        }

        if(tl == Long.MIN_VALUE)
        {
            return (int)fl;
        }

        return (int)tl;
    }
}