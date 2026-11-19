
import java.util.*;

class Solution {

    boolean selfdriving(int n)
    {
        int temp = n;

        while(temp > 0)
        {
            int x = temp % 10;

            if(x == 0 || n % x != 0)
            {
                return false;
            }

            temp = temp / 10;
        }

        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = left; i <= right; i++)
        {
            if(selfdriving(i))
            {
                list.add(i);
            }
        }

        return list;
    }
}
