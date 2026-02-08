package dsa.linkedlist;

import java.util.Stack;

class Node2{
	int data;
	Node2 back;
	Node2 next;
	Node2(int data){
		this.data = data;
	}
	Node2(int data,Node2 prev,Node2 next){
		this.data = data;
		this.back = prev;
		this.next = next;
	}
	
}
class Solution2{
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
		if(head == null || head.next == null) {
			return head;
		}
		Stack<Integer> nos = new Stack<>();
		Node2 temp = head;
		while(temp!=null) {
			nos.push(temp.data);
			temp = temp.next;
			
		}
		temp = head;
		while(temp != null) {
			temp.data = nos.pop();
			temp = temp.next;
		}
		return head;
	}
}
public class ReverseLinkedListBruteForceApproach {
	

	public static void main(String[] args) {
		Solution2 sol2 = new Solution2();
		int[] arr = {5,4,3,2,1};
		Node2 head = sol2.convertArr2DLL(arr);
		System.out.println("Before reversing");
		sol2.print(head);
		System.out.println("After reversing");
		Node2 newHead = sol2.reverseDLL(head);
		sol2.print(newHead);
	}

}
