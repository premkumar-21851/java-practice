import java.util.*;

class Solution {

    public int gcd(int a, int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public long gcdSum(int[] nums) {

        int[] prefixGCD = new int[nums.length];
        int max = nums[0];

        // Calculate prefix GCD
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
            }

            prefixGCD[i] = gcd(nums[i], max);
        }
        Arrays.sort(prefixGCD);

        long sum = 0;

        for(int i = 0; i < prefixGCD.length / 2; i++)
        {
            sum += gcd(prefixGCD[i],
                       prefixGCD[prefixGCD.length - 1 - i]);
        }

        return sum;
    }
}