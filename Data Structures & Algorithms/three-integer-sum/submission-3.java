class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //review1 solution with hashmap
        //Need to sorted, doesn't 100% understand the solution
        //but got results with duplicats 
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int target = - nums[i];
            Map<Integer, Integer> indices = new HashMap<>();
            for ( int j = i + 1; j < nums.length; j++) {
                int diff = target - nums[j];
                  
                if (indices.containsKey(diff)) {
                    res.add(List.of(nums[i], diff, nums[j]));

                    // Skip duplicate j
                    while (j + 1 < nums.length && nums[j] == nums[j + 1]) {
                        j++;
                    }  
                } 

                indices.put(nums[j], j);
            }

        }

        return res;
    }
}
