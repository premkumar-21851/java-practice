class Solution {
    public boolean validDigit(int n, int x) {

        int temp1 = n;

        while (temp1 >= 10) {
            temp1 = temp1 / 10;
        }

        if (temp1 == x) {
            return false;
        }

        int temp2 = n;

        while (temp2 > 0) {
            int a = temp2 % 10;

            if (a == x) {
                return true;
            }

            temp2 = temp2 / 10;
        }

        return false;
    }
}
