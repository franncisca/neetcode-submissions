class Solution {
    public int trap(int[] height) {
        //Solution with 2 pointers
        int res = 0;
        int l = 0;
        int r = height.length - 1;
        int maxL = 0; 
        int maxR = 0;   

        while (l < r) {
            if (height[l] < height[r]) {
                maxL = Math.max(maxL, height[l]);
                int temp =  maxL - height[l];
                if(temp > 0) {
                    res += temp;
                }
                l++;
            } else {
                maxR = Math.max(maxR, height[r]);
                int temp = maxR - height[r];
                if(temp > 0) {
                    res += temp;
                }
                r--;
            }
        }
        
        return res;
    }
}
