class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Solution of Arrays.stream()
        //Time:O(n) Space:O(n)
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}