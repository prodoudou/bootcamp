

public class leet128 {
  

  public static void main(String[] args) {
    int [] prices = new int []{ 7,1,5,3,6,4};
   System.out.println(maxProfit(prices));
  }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyDay = 0;
        int currProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[buyDay]) {// first time is  if( 7 < 0)
                buyDay = i;
                continue;
            }
            currProfit = prices[i] - prices[buyDay];
            maxProfit = Math.max(currProfit, maxProfit);
        }
        return maxProfit;
    }
}
