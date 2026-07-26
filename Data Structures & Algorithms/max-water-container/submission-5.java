class Solution {
    public int maxArea(int[] heights) {
        //review1 2 pointers
        //T O(n) O(1)
        int l = 0;
        int r = heights.length - 1;
        int result = 0;
        while (l < r) {
            int area = (r - l) * Math.min(heights[l], heights[r]);
            System.out.println("surface: " + area);
            result = Math.max(result, area);
            if (heights[l] < heights[r]) {
                l ++;
            } else{
                r--;
            }
        }

        return result;
    }
}
