package dsa.array;

import java.util.HashMap;
import java.util.Map;

public class FindTheNumberAppearsOnceUsingMapFunction {
	public static int findTheNumber(int arr[]) {
		int n = arr.length;
		Map<Integer, Integer> freq = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int value = freq.getOrDefault(arr[i], 0);
			freq.put(arr[i], value+1);
		}
		for(Map.Entry<Integer , Integer> it: freq.entrySet()) {
			if(it.getValue() ==1) {
				return it.getKey();
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1,1,2,3,3,4,4};
		int result = findTheNumber(arr);
		System.out.println("The no. that appears once is "+result);

	}

}
