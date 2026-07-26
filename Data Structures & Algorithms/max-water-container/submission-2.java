class Solution {
    public int maxArea(int[] heights) {
        //review1 
        int l = 0;
        int r = heights.length - 1;
        int result = 0;
        while (l < r) {
            int surface = (r - l) * Math.min(heights[l], heights[r]);
            System.out.println("surface: " + surface);
            result = Math.max(result, surface);
            if (heights[l] < heights[r]) {
                l ++;
            } else{
                r--;
            }
        }

        return result;

    }
}
