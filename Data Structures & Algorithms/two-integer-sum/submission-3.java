class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Review 1 solution with one pass
        //Smaller indice is the one add in the map first

        Map<Integer, Integer> prevList = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (prevList.containsKey(diff)) {
                return new int[] {prevList.get(diff), i};
            } 
            //nums[i] is the diff
            prevList.put(nums[i], i);

        }

        return new int[0];

    }
}
