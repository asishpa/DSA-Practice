/*
 * Time Complexity: O(N + N/2)
 * Space Complexity: O(1) 
 */
package dsa.linkedlist;

public class RemoveTheMiddleNodeLinkedListBruteForceApproach {
	
	public static Node deleteMiddleNode(Node head) {
		if(head==null || head.next == null) {
			return null;
		}
		Node temp = head;
		int length = countLengthOfLinkedList(head);
		for(int i=0;i<(length/2)-1;i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		return head;
	}
	public static int countLengthOfLinkedList(Node head) {
		Node temp = head;
		int counter =0;
		while(temp!=null) {
			counter++;
			temp = temp.next;
		}
		return counter;
	}
	public static void printLinkedlist(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(""+temp.data);
			System.out.print("->");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        Node temp = deleteMiddleNode(head);
        printLinkedlist(temp);

	}

}
