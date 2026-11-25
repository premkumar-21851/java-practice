class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
       
        int[] array = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                array[i]=nums[i+1];
            }
            else
            {
                array[i]=nums[i-1];
            }
        }
        return array;
    }
}