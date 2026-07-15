class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        //Review1
        //brute fore solution
        Arrays.sort(nums);
        //2 3 4 4 5 10 20 
        //-1 -1 0 1 3 4 5 6 7 8 9 
        int res = 1;
        int temp  = 1;
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] > nums[r - 1] + 1) {
                temp = 1;
            }
            if (nums[r] == nums[r - 1]) {
                continue;
            }
            if (r < nums.length && nums[r] == nums[r - 1] + 1 ) {
                temp++;
                //r++;
                System.out.println("temp: " + temp);
            }
            
            res = Math.max(res, temp);
            System.out.println("temp: " + temp);
            System.out.println("res: " + res);
        }     

        return res;   
    }
}
