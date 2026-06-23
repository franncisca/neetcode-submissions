class Solution {
    public int[] productExceptSelf(int[] nums) {
        //review 1 
        //Brute force

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int production = 1;

            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    production = production*1;
                }
                else{
                    production = production*nums[j];
                    
                }     
            }
            res[i] = production;
        }

        return res;
    }
}  
