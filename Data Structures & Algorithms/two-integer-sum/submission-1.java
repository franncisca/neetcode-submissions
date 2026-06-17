class Solution {
    public int[] twoSum(int[] nums, int target) {
        //The map will store the previous indece
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i ++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                //The indece of diff is the indece stored before
                return new int[]{prevMap.get(diff), i};
            }

            prevMap.put(num, i);
        }

        return new int[0];
    }
}
