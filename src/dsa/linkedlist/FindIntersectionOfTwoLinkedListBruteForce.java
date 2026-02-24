/*
 * Time Complexity: O(m × n), For each node in list 2, the entire list 1 is iterated, resulting in nested iterations.
 * Space Complexity: O(1)
 */
package dsa.linkedlist;

public class FindIntersectionOfTwoLinkedListBruteForce {
	public static void insertNode(Node head,int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	public static void printLinkedlist(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(""+temp.data);
			System.out.print("->");
			temp = temp.next;
		}
	}
	public static Node intersectionPresent(Node head1,Node head2) {
		while(head2!=null) {
			Node temp = head1;
			while(temp!=null) {
				if(temp==head2)
					return head2;
				temp = temp.next;
				
			}
			head2 = head2.next;
		}
		return null;
	}

	public static void main(String[] args) {
		Node head = new Node(1);
        insertNode(head, 3);
        insertNode(head, 1);
        insertNode(head, 2);
        insertNode(head, 4);
        Node head1 = head;
        head = head.next.next.next;
        Node headSec = new Node(3);
        Node head2 = headSec;
        headSec.next = head;
        System.out.println("1st ll:");
        printLinkedlist(head1);
        System.out.println();
        System.out.println("2nd ll:");
        printLinkedlist(head2);
        System.out.println();
        Node intersection =  intersectionPresent(head1, head2);
        if(intersection==null)
        	System.out.println("No intersection present");
        else
        	System.out.println("Intersection present at node:"+intersection.data);
        
	}

}
