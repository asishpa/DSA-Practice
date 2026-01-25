package dsa.array;

public class StockBuyAndSellOptimalApproach {
	public static int profit(int[] arr) {
		int n = arr.length;
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int i=0;i<n;i++) {
			minPrice = Math.min(minPrice, arr[i]);
			maxProfit = Math.max(maxProfit, arr[i]-minPrice);
		}
		return maxProfit;
	}
	public static void main(String args[]) {
		int[] prices = {7,1,5,3,6,4};
		int profit = profit(prices);
		System.out.println("The maximum profit is "+profit);
		
	}

}
