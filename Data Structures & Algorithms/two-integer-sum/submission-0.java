class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diffMap = new HashMap<>();

        for (int i = 0; i < nums.length; i ++) {
            int num = nums[i];
            int diff = target - num;

            if (diffMap.containsKey(diff)) {
                return new int[]{diffMap.get(diff), i};
            }

            diffMap.put(num, i);
        }

        return new int[0];
    }
}
