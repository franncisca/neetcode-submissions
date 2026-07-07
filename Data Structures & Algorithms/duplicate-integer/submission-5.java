class Solution {
    public boolean hasDuplicate(int[] nums) {
        //review2 solution with stream
        //Time O(n)
        //Space O (n)
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}