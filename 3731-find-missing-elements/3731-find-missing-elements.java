class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       int min = nums[0];
       int max = nums[0];
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i]<min)
        {
            min=nums[i];
        }
        if(max<nums[i])
        {
            max=nums[i];
        }
       }
       for(int k=min;k<=max;k++)
       {
        boolean found=false;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==k)
            {found=true;
            break;}
        }
        if(!found)
        list.add(k);
       }
        
        list.sort(null);
        return list; 
    }
}