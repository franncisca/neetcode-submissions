class Solution {
    public int search(int[] nums, int target) {
        //solution find pivot(min index) then search in two sorted part
        int res = -1;
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] > nums[r]) {
                l = m + 1;
            }
            else {
                r = m;
            }
        }

        int pivot = l;

        //search in left sorted part
        int result = binarySearch(nums, 0, pivot - 1, target);
        if (result != -1) {
            return result;
        }
        //search in right sorted part
        return binarySearch(nums, pivot, nums.length - 1, target);
    }

    public int binarySearch(int[] nums, int l, int r, int target) {
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            }
            else if (nums[m] < target) {
                l = m + 1;
            }
            else {
                r = m -1;
            }
        }

        return -1;
    } 
}
