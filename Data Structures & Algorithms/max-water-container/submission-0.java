class Solution {
    public int maxArea(int[] heights) {
        //Brute force
        int res = 0;
        for (int l = 0; l < heights.length - 1; l++) {
            for (int r = l + 1; r < heights.length; r++) {
                int area = (r - l) * Math.min(heights[l], heights[r]);
                res = Math.max(res, area);           
            }
        }
        return res;
    }
}
