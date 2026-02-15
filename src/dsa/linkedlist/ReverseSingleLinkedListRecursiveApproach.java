/*
 * Time Complexity: O(n),Each node is visited exactly once during the recursive call, and we do constant-time work for each node (like flipping pointers).
 * Space Complexity: O(n),The recursion stack goes up to n levels deep (one for each node), which uses extra space on the call stack.
 */
package dsa.linkedlist;

public class ReverseSingleLinkedListRecursiveApproach {
	public static Node reverseLinkedList(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node newNode = reverseLinkedList(head.next);
		
		//now start reversing
		Node front = head.next;
		front.next = head;
		head.next = null;
		return newNode;
	}
	public static void printLinkedList(Node head) {
		while(head!=null) {
			System.out.print(head.data);
			System.out.print("->");
			head = head.next;
		}
		
	}
	

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		Node reversed = reverseLinkedList(head);
		printLinkedList(reversed);
	}

}
