package dsa.array;

public class SortArrayO12 {

	public static void sort(int arr[]) {
		int n = arr.length;
		int low =0,mid=0;
		int high = n-1;
		while(mid<=high) {
			if(arr[mid] == 0) {
				 int temp = arr[low];
				 arr[low] = arr[mid];
				 arr[mid] = temp;
				 low++;
				 mid++;
			}
			else if(arr[mid]==1) {
				mid++;
				
			}
			else {
				int temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {0,1,2,0,1,2,0,0,1,2,0};
		sort(arr);
		System.out.print("The sorted array is :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		
		

	}

}
