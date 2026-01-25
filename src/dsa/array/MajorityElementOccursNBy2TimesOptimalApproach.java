package dsa.array;

public class MajorityElementOccursNBy2TimesOptimalApproach {
	public static int findElement(int[] arr) {
        int n = arr.length;
        int cnt =0;
        int v =0;
        for(int i=0;i<n;i++) {
        	if(cnt ==0) {
        		v=arr[i];
        		cnt=1;
        	}		
        	else if (v==arr[i]) {
        		cnt++;
			}
        	else {
				cnt--;
			}
        }
        int cnt1=0;
        for(int i=0;i<n;i++){
        	if(arr[i]==v) {
        		cnt1++;  
        	}
        }
        if(cnt1>(n/2))
        	return v;
        else
        	return -1;
    }
	public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        int element = findElement(arr);
        System.out.println("The element is " + element);
    }

}
