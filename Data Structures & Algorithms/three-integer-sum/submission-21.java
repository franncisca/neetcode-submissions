class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Review 3
        //Solution with 2 pointers
        
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        //System.out.println("nums[0]: " + nums[0]);

        if (nums[0] > 0) {
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int temp = nums[i] + nums[l] + nums[r];
                //System.out.println("n: " + nums[i]);
                //System.out.println("l: " + nums[l]);
                //System.out.println("r: " + nums[r]);
                //System.out.println("temp: " + temp);
                if (temp < 0) {
                    l++;
                } 
                else if (temp > 0) {
                    r--;
                }
                else {
                    List<Integer> numList = new ArrayList();
                    numList.add(nums[i]);
                    numList.add(nums[l]);
                    numList.add(nums[r]);
                    res.add(numList);

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
