class Solution {
    public int climbStairs(int n) {
        //review1 solution DP
        if (n <= 1) {
            return 1;
        }
        int stepOne = 1;
        int stepTwo = 1;

        for(int i = 1; i < n; i++) {
            int temp = stepOne;
            stepOne = stepTwo;
            stepTwo = temp + stepTwo;
        }

        return stepTwo;
        
    }
}
