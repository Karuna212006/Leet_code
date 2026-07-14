// Last updated: 7/14/2026, 2:00:28 PM
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  
        int maxProfit = 0;                 
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;  
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); 
            }
        }
        return maxProfit;
    }
}
