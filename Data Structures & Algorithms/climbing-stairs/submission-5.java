class Solution {
    public int climbStairs(int n) {
        //Review 2 
        int stepOne = 1;
        int stepTwo = 1;

        if (n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            int temp = stepOne;
            stepOne = stepTwo;
            stepTwo = temp + stepTwo;
        }

        return stepTwo;
    }
}
