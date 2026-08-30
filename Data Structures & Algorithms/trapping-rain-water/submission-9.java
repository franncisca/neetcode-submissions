class Solution {
    public int trap(int[] height) {
        //review3 solution with slid window/two pointers

        int res = 0;
        int l = 0;
        int r = height.length - 1;
        int maxL = height[l];
        int maxR = height[r];

        while (l < r) {
            if (height[l] < height[r]) {
                l++;
                maxL = Math.max(maxL, height[l]);
                res += maxL - height[l];;
            } 
            else {
                r--;
                maxR = Math.max(maxR, height[r]);
                res += maxR - height[r];
            }
        }
        
        return res;
    }
}
