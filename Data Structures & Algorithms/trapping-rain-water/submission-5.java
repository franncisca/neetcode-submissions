class Solution {
    public int trap(int[] height) {
        //review2 solution with 2 pointers
        int maxL = 0;
        int maxR = 0;
        int l = 0;
        int r = height.length - 1;
        int result = 0;

        while (l < r) {
            maxL = Math.max(maxL, height[l]);
            maxR = Math.max(maxR, height[r]);
            int minH = Math.min(maxL, maxR);
            int temp = 0;
            if (height[l] <= height[r]) {
                temp = minH - height[l];
                l++;
            }
            else {
                temp = minH - height[r];
                r--;
            }
            if (temp > 0) {
                result += temp;
            }
        }

        return result;
    }
}
