class Solution {
    public int findMin(int[] nums) {
        //review1 
        //Solution with O(log n)
        int res = nums[0];
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
            }

            int mid = l + (r - l) / 2;
            res = Math.min(res, nums[mid]);

            if (nums[l] <= nums[mid]) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return res;

    }
}
