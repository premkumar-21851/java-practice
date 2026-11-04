class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       int[][] ans = new int[image.length][image[0].length];
       int[][] ans2 = new int[image.length][image[0].length];
       
       for(int i=0;i<image.length;i++)
       {
        for(int j=0;j<image[0].length;j++)
        {
            ans2[i][j]=image[i][image[0].length-1-j];
        }
       }
        for(int i=0;i<image.length;i++)
       {
        for(int j=0;j<image[0].length;j++)
        {
            if(ans2[i][j]==0)
            {
                ans[i][j]=1;
            }
            else
            {
                ans[i][j]=0;
            }
        }
       }

       return ans;
    }
}