class Solution {
    public int longestConsecutive(int[] nums) {
        //Review1
        //Solution with hash set

        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        Set<Integer> startSet = new HashSet<>();


        for (int num : nums) {
            numSet.add(num);
        }

        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                startSet.add(num);
            }
        }

        int res = 1;
        for (int num : startSet) {
            int tempLen = 1;
            int count = 0;
            while (count < nums.length) {
                if (numSet.contains(num + 1)) {
                tempLen++;
                num++;
                }

                count++;
            } 
            res = Math.max(res, tempLen);
        }
        
        return res;
    }
}
