/*
 * Time Complexity: O(n), We traverse the entire linked list only once to rearrange the nodes. Each node is visited exactly once. No nested traversal or re-traversal occurs. Hence, linear time in terms of the number of nodes n.
 * Space Complexity: O(1), We do not use any extra data structures
 */
package dsa.linkedlist;

public class SegregateOddAndEvenNodesInLinkedLIst {
	
	public static Node separateEvenOdd(Node head) {
		Node evenHead = null;
		Node evenTail = null;
		Node oddHead = null;
		Node oddTail = null;
		Node current = head;
		while(current!=null) {
			if(current.data%2==0) {
				if(evenHead==null) {
					evenHead = current;
					evenTail = current;
				}
				else {
					evenTail.next = current;
					evenTail = current;
				}
			}
			else {
				if(oddHead==null) {
					oddHead = current;
					oddTail = current;
				}
				else {
					oddTail.next = current;
					oddTail = current;
				}
			}
			current = current.next;
		}
		if(evenHead == null)
			return oddHead;
		if(oddHead == null)
			return evenHead;
		evenTail.next = oddHead;
		
		oddTail.next = null;
		return evenHead;
	}

	public static void main(String[] args) {
		Node head = new Node(19);
        head.next = new Node(15);
        head.next.next = new Node(2);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(4);
        Node newHead = separateEvenOdd(head);
        while(newHead != null) {
        	System.out.print(""+newHead.data);
        	System.out.print("->");
        	newHead = newHead.next;
        }
	}

}
