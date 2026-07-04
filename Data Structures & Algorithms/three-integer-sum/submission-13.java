class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Review2
        //Solution with 2 pointers
        //-4 -1 -1 0 1 2 
        //-1 0 0 1
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int a = nums[i];
            if (a > 0) break;
            //Skip from the second number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = a + nums[l] + nums[r];
                if (sum < 0) {
                    l++;
                } 
                else if(sum > 0) {
                    r--;
                }
                else {
                    res.add(List.of(a, nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
