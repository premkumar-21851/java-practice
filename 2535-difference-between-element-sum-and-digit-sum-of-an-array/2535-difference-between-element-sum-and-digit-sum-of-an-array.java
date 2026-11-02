class Solution {
    public int differenceOfSum(int[] nums) {
    int sumelem=0;
    int sumdigits=0;
    for(int i=0;i<nums.length;i++)
    {
        sumelem+=nums[i];
        while(nums[i]>0)
        {
            sumdigits+=nums[i]%10;
            nums[i]/=10;
        }
    }
    return Math.abs(sumelem-sumdigits);
    }
}