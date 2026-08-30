class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            valueToIndex.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (valueToIndex.get(diff) != null && valueToIndex.get(diff) != i) {
                return new int[] {i, valueToIndex.get(diff)};
            } 

            
        }
        return new int[0];
    }
}
