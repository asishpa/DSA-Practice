/*
 * Time Complexity: O(N),
 * Space Complexity: O(1),
 */
package dsa.linkedlist;

public class RemoveNthNodeFromEndOfLinkedLIstOptimalApproach {

	public static Node deleteNthNodeFromEnd(Node head,int N){
		Node dummy = new Node(0,head);
		Node slow = dummy;
		Node fast = dummy;
		for(int i=0;i<=N;i++) {
			fast = fast.next;
		}
		while(fast!=null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return dummy.next;
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
