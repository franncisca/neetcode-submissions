class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Review 1 , need to review the solution
        //map.containsKey(num) the time is O(1) not O(n), because the keys are stored in a hash list
        //Solution with hashMap two pass
        //Time O(n), because i'ts the index of a hashmap
        //Space O(n)

        int[] res = new int[2];

        //val - index
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indices.containsKey(diff) && !indices.get(diff).equals(i)) {
                res[0] = i;
                res[1] = indices.get(diff);
                return res;
            }
        }

        return new int[0];
        
    }
}
