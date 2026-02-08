package dsa.linkedlist;
class Solution3{
	public Node2 convertArr2DLL(int[] arr) {
		Node2 head = new Node2(arr[0]);
		Node2 prev = head;
		for(int i=1;i<=arr.length-1;i++) {
			Node2 temp = new Node2(arr[i],prev,null) ;
			prev.next = temp;
			prev = temp;
		}
		return head;
	}
	public void print(Node2 head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	public Node2 reverseDLL(Node2 head) {
		Node2 current = head;
		Node2 last = null;
		
		while(current!=null) {
			Node2 temp = current.next;
			current.next = current.back;
			current.back = temp;
			
			last = current;
			
			current = temp;
			
		}
		return last;
	}
}
public class ReverseLinkedListOptimalApproach {
	public static void main(String[] args) {
		Solution3 sol3 = new Solution3();
		int[] arr = {5,4,3,2,1};
		Node2 head = sol3.convertArr2DLL(arr);
		System.out.println("Before reversing");
		sol3.print(head);
		System.out.println("After reversing");
		Node2 newHead = sol3.reverseDLL(head);
		sol3.print(newHead);
	}

}
