class Solution {
    public int maxProfit(int[] prices) {
        //Review1
        //Solution with 2 pointers saw the solution
        //Dynamic programming
        //profie = buy - sell
        int profit = 0;
        int l = 0;
        int r = 1;
        while (r < prices.length) {
            if (prices[r] > prices[l]) {
                int temp = prices[r] - prices[l];
                if (temp > profit) {
                    profit = temp;
                }     
                r++;
            }
            else {
                l = r;
                r++;
                System.out.println("l: " + l);
            }
        }
        
        return profit;
    }
}
