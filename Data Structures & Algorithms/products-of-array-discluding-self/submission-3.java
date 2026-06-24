class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Review1
        //Solution with prefix and suffix
        //Figure out by myself but don't really understand the conception
        //Time: O(n)
        //Space: O(n)
        //1 1 2 8
        //48 24 6 1

        int[] res = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        prefix[0] = 1;

        suffix[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }

        for (int j = nums.length - 2; j >= 0; j--) {
            suffix[j] = nums[j + 1 ] * suffix[j + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println("pre: " + prefix[i]);
            System.out.println("suf: " + suffix[i]);

            res[i] = prefix[i] * suffix[i];
        }

        return res;
    }
}  
