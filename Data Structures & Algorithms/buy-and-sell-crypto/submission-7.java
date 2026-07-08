class Solution {
    public int maxProfit(int[] prices) {
        //review2
        //Solution with 2 pointers
        //Time O(n) Speace O(n)
        //l is buy date
        //r is sell date
        int l = 0;
        int profit = 0;
        for (int r = 1; r < prices.length; r++) {
            int temp = prices[r] - prices[l];
            if (temp > 0) {
                if (temp > profit) {
                    profit = temp;
                }
            }
            else {
                l = r;
            }
        }

        return profit;
    }
}
