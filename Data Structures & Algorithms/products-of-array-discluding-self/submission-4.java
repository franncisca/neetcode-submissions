class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Review2
        //Conception of solution with prefix and suffix
        //For each index, we need the product of all elments before it and all elements after it
        //prefix[i] = products of all elemnts to the left of i
        //suffix[i] = profucts of all element to the right of i

        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] res = new int[n];

        prefix[0] = 1;
        suffix[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
            System.out.println("pre:" + prefix[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
            System.out.println("suf:" + suffix[i]);
        }

        for (int i = 0; i < n; i++) {
            res[i] = prefix[i] * suffix[i];
        }

        return res;
    }
}  
