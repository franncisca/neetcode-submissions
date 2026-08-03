class Solution {
    public int climbStairs(int n) {
        //Solution dynamic programming
        //1 1 2 3 5 
        int one = 1;
        int two = 1;

        if (n <= 1) {
            return 1;
        }

        for (int i = 1; i < n; i++) {
            int temp = one;
            one = two;
            two = one + temp;
        }

        return two;
    }
}
