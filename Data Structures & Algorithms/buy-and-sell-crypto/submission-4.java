class Solution {
    public int maxProfit(int[] prices) {
        //Review1
        //profie = buy - sell
        //10 2 5 1 3 8
  
        //7 1 5 3 6 4
       
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
