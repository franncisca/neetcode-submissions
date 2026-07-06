class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Review 1
        //Solution with 2 pointers
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int temp = numbers[l] + numbers[r];
            if (temp < target) {
                l++;
            }
            else if (temp > target) {
                r--;
            }
            else {
                return new int[] {l + 1, r + 1};
            }
        }
        return new int[0];
    }
}
