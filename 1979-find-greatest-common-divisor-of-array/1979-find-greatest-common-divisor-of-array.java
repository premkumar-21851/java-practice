class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int large=nums[nums.length-1];
        int small=nums[0];
        
        while(small!=0)
        {
            int temp=small;
            small=large%small;
            large=temp;
        }
        return large;
    }
}