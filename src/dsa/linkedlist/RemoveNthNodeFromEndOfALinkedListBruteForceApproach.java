/*
 * Time Complexity: O(L)+O(L-N), We are calculating the length of the linked list and then iterating up to the (L-N)th node of the linked list, where L is the total length of the list.
 * Space Complexity: O(1)
 */
package dsa.linkedlist;

public class RemoveNthNodeFromEndOfALinkedListBruteForceApproach {
	public static Node deleteNthNodeFromEnd(Node head,int n) {
		if(head.next == null || head == null) {
			return null;
		}
		Node temp = head;
		int cnt = 0;
		int length = countLengthOfLinkedList(head);
		while(cnt!=length-n) {
			temp= temp.next;
			cnt++;
		}
		temp.next = temp.next.next;
		return head;
	}
	public static int countLengthOfLinkedList(Node head) {
		Node temp = head;
		int counter =0;
		while(temp.next!=null) {
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
        Node head1 = deleteNthNodeFromEnd(head,2);
        printLinkedlist(head1);

	}

}
