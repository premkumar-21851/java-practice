class Solution {
    public double minimumAverage(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        double[] ans = new double[nums.length/2];
        int j=0;
        for(int value:nums)
        {
            list.add(value);
        }
        for(int i=list.size()-1;i>=0;i=i-2)
        {
            int min = Collections.min(list);
            int max = Collections.max(list);
            ans[j]=(double)(min+max)/2;
            j++;

            list.remove(Integer.valueOf(min));
            list.remove(Integer.valueOf(max));
        }
        double m = ans[0];
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]<m)
            m=ans[i];
        }

        return m;
    }
}