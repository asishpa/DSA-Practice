package dsa.array;

import java.util.HashMap;
import java.util.Map;

public class NoOfSubArraysWithXOROptimalApproach {
	static int subarraysWithXorK(int arr[],int k) {
		int n = arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		
		int xr =0;
		map.put(xr, 1);
		int cont =0;
		for (int i = 0; i < n; i++) {
			xr = xr ^arr[i];
			
			int required = xr ^k;
			if (map.containsKey(required)) {
				cont+=map.get(required);
				
			}
			if (map.containsKey(xr)) {
				map.put(xr, map.get(xr)+1);
				
			}
			else {
				map.put(xr, 1);
			}
			
			
		}
		return cont;
	}

	public static void main(String[] args) {

		int arr[] = { 4, 2, 2, 6, 4 };
		int k = 6;
		int ans = subarraysWithXorK(arr, k);
		System.out.println("The number of subarrays with XOR k is: " + ans);

	}

}
