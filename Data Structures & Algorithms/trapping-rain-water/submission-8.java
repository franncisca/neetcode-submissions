class Solution {
    public int trap(int[] height) {
        //review3 solution with slid window/two pointers

        int res = 0;
        int l = 0;
        int r = height.length - 1;
        int maxL = 0;
        int maxR = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                maxL = Math.max(maxL, height[l]);
                int temp = maxL - height[l];
                res += temp;
                l++;

            } 
            else {
                maxR = Math.max(maxR, height[r]);
                int temp = maxR - height[r];
                res += temp;
                r--;

            }
        }
        
        return res;
    }
}
