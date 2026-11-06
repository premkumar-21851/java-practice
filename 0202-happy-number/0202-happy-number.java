class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {

            set.add(n);

            int temp = n;
            int sum = 0;

            while (temp > 0) {
                int temp1 = temp % 10;
                sum += temp1 * temp1;
                temp = temp / 10;
            }

            n = sum;
        }

        return n == 1;
    }
}
