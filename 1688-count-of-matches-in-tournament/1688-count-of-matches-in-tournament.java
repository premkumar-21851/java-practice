
class Solution {
    public int numberOfMatches(int n){
        int count=0;
        while(n!=1)
        {
            if(n%2==0)
            {
               // number of matches & team advance are same
                count=count+(n/2);
                n=n/2;
            }
            else
            { 
                // number of team advance=number of matches+1
                count=count+((n-1)/2);
                n=((n-1)/2)+1;
            }
        }
        return count;
    }
}