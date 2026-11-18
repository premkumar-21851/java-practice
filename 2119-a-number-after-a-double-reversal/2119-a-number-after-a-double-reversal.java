
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0)
        return true;
        else
        {
            int rev1=0;
            int rev2=0;
            int temp1=num;
            while(temp1>0)
            {
                rev1=rev1*10+(temp1%10);
                temp1=temp1/10;
            }
            int temp2=rev1;
            while(temp2>0)
            {
                rev2=rev2*10+(temp2%10);
                temp2=temp2/10;
            }

            return rev2==num;
        }
    }
}