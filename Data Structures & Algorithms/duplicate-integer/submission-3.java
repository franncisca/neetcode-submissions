class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet();
        for (Integer num : nums) {
            if (temp.contains(num)) {
                return true;
            }
            temp.add(num);
        }
        return false;
    }
}