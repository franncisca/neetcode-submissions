class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //T O(n²) S O(1)/O(n) depends on the sorting
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            //All remaing numbers are positive
            if (nums[i] > 0) break;
            //Skip duplicate values for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = nums.length -1;
            while (l < r) {
                int curSum = nums[i] + nums[l] + nums[r];

                if (curSum < 0) {
                    l ++;
                } else if (curSum > 0) {
                    r --;
                } else {
                    res.add(List.of(nums[i], nums[l], nums[r]));
                    //res.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    //Move both pointers inward.
                    l++;
                    r--;

                    //Skip duplicates at the left pointer.
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    
                }
            }
        }

        return res;
    }
}
