class Solution {
    public int longestConsecutive(int[] nums) {
        //Review1
        //Solution with array sort()
        //Time O(n logn)
        //Speace O(1)
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int res = 1;
        int temp  = 1;
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] == nums[r - 1] + 1 ) {
                temp++;
            }
            else if (nums[r] == nums[r - 1]) {
                continue;
            }
            else {
                temp = 1;
            }
            res = Math.max(res, temp);
        }     

        return res;   
    }
}
