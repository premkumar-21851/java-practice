class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int j=0;
        int k=1;
        if(n%2==0)
        {
            for(int i=1;i<=(n/2);i++)
            {
                result[j]=i;
                result[j+1]=-i;
                j=j+2;
            }
        }
        else
        {
            result[0]=0;
            for(int i=1;i<=(n/2);i++)
            {
                result[k]=i;
                result[k+1]=-i;
                k+=2;
            }
        }

        return result;
    }
}