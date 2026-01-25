package dsa.array;

public class StockBuyAndSellBruteForce {
	public static int profit(int[] arr) {
		int n = arr.length;
		int maxProfit = 0;
		for(int i =0;i<n;i++ ) {//for buy day
			
			for(int j=i+1;j<n;j++){//for sale day 
				if(arr[j]>arr[i]) {
					
					maxProfit = Math.max(maxProfit, arr[j]-arr[i]);
					
				}
			}
			
			
		}
		return maxProfit;
	}
	public static void main(String args[]) {
		
		int[] prices = {7,1,5,3,6,4};
		int profit = profit(prices);
		System.out.println("Th emaximum profit is "+profit);
	}

}
