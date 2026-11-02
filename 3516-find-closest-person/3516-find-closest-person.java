class Solution {
    public int findClosest(int x, int y, int z) {
        int a=Math.abs(z-x);// give number of distance/step of Preson1
        int b=Math.abs(z-y);// give number of distance/step of Preson2

        if(b>a)
        // if number of steps of preson2 is more than preson 1
        return 1;
        else if (a>b)
        //if number of steps of preson1 is more than preson 2
        return 2;
        else
        // both have same steps
        return 0;
    }
}