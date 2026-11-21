
class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            ArrayList<Integer> digits = new ArrayList<>();

            while (temp > 0) {
                digits.add(temp % 10);
                temp = temp / 10;
            }

            for (int j = digits.size() - 1; j >= 0; j--) {
                list.add(digits.get(j));
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
