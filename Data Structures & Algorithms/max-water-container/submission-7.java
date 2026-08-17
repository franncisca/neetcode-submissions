class Solution {
    public int maxArea(int[] heights) {
        //Review2 solution with 2 pointers
        if (heights.length == 0) {
            return 0;
        }
        int l = 0;
        int r = heights.length - 1;
        int lMax = heights[l];
        int rMax = heights[r];
        int result = 0;

        while (l < r) {
            int len = r - l ;
            int temp = len;
            if (heights[l] < heights[r]) {
                temp = heights[l] * len;
                l++;
            }
            else {
                temp = heights[r] * len;
                r--;
            }

            result = Math.max(result, temp);
        }

        return result;
    }
}
