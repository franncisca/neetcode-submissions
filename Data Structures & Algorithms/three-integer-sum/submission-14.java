class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Review 3
        //Solution with 2 pointers
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int temp = nums[i] + nums[l] + nums[r];
                if (temp < 0) {
                    l++;
                } 
                else if (temp > 0) {
                    r--;
                }
                else {
                    res.add(List.of(nums[i], nums[l], nums[r])); 
                    l++;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }               }
            }
        }

        return res;
    }
}
