class Solution {
    public int trap(int[] height) {
        //Two pointers T O(n) S O(1)
        if (height == null || height.length == 0) {
            return 0;
        }

        int n = height.length;
        int res = 0;
        int l = 0;
        int r = n - 1;
        int leftMax = height[0];
        int rightMax = height[n - 1];

        while(l < r) {
            if (leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            }
            else {
                r--;
                rightMax =  Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }

        return res;

    }
}
