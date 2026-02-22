/*
 * Time Complexity: O(N/2)
 * Space Complexity: O(1)
 */
package dsa.linkedlist;

public class RemoveTheMiddleNodeLinkedListOptimalApproach {
	public static Node deleteMiddleNode(Node head) {
		if(head==null || head.next==null)
			return null;
		Node slow = head;
		Node fast = head.next.next;
		while(fast!=null&&fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		slow.next = slow.next.next;
		return head;
		
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
