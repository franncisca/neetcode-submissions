class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Review2 hashset solution
        //time O(n)
        //space O(n) 
        //hashset no get method, only contains !!!
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if(seen.contains(num)) {
                return true;
            }
            else {
                seen.add(num);
            }
        }

        return false;
    }
}