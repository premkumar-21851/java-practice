class Solution {
    public int countSymmetricIntegers(int low, int high) {

        int count = 0;

        for(int i = low; i <= high; i++)
        {
            int length = 0;
            int temp = i;

            while(temp > 0)
            {
                length++;
                temp = temp / 10;
            }
            if(length % 2 != 0)
                continue;

            temp = i;

            int left = 0;
            int right = 0;

            int range = (int)Math.pow(10, length / 2);
            while(temp >= range)
            {
                right += temp % 10;
                temp /= 10;
            }
            while(temp > 0)
            {
                left += temp % 10;
                temp /= 10;
            }

            if(left == right)
            {
                count++;
            }
        }

        return count;
    }
}
