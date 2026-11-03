class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       for(int i=0;i<heights.length;i++)
       {
        for(int j=i+1;j<heights.length;j++)
        {
            if(heights[i]>heights[j])
            {
                int temp=heights[i];
                heights[i]=heights[j];
                heights[j]=temp;
                String name=names[i];
                names[i]=names[j];
                names[j]=name;
            }
        }
       }
       int j=0;
       String[] ans = new String[names.length];
       for(int i=names.length-1;i>=0;i--)
       {
        ans[j++]=names[i];
       }
       return ans;
    }
}