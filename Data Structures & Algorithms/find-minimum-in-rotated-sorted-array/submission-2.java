class Solution {
    public int findMin(int[] nums) {
        //Solution with binary search O(log n)
        //Need to understand how to calculate mid!!
        int l = 0;
        int r = nums.length - 1;
        int res = nums[0];
        while (l <= r) {
            //if it's sorted
            if (nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }
            //calculate mid!! 
            int mid = l + (r - l) / 2;
            res = Math.min(res, nums[mid]);
            //right part
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
       
        }

        return res;
    }
}
