class Solution {
    public int minElement(int[] nums) {
        
        int[] arry = new int[nums.length];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {   
            int sum=0;
                while(nums[i]>0)
                {
                    sum+=nums[i]%10;
                    nums[i]/=10;
                }
            arry[i]=sum;
            
            if(arry[i]<min)
            {
                min=arry[i];
            }
        }
        return min;
    }
}