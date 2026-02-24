/*
 * Time Complexity: O(2 × max(length of list1, length of list2)), Uses the same concept of difference of lengths of two lists.
 * Space Complexity: O(1),
 */
package dsa.linkedlist;

public class FindIntersectionOfTwoLinkedListOptimalApproach2 {
	public static Node intersectionPresent(Node head1,Node head2) {
		Node temp1 = head1;
		Node temp2 = head2;
		while(temp1!=temp2) {
			temp1 = temp1==null ? head2: temp1.next;
			temp2 = temp2==null ? head1: temp2.next;
			
		}
		return temp1;
	}
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
