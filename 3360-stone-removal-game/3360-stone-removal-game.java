class Solution {
    public boolean canAliceWin(int n) {
        int remove=10;
        boolean ans=true;

        while(n>=remove)
        {
            n=n-remove;
            remove=remove-1;

            ans=!ans;
        }

        return !ans;
    }
}