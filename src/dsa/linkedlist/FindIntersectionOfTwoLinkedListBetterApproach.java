/*
 * Time Complexity: O(n + m), Iterating through list 1 first takes O(n), then iterating through list 2 takes O(m).
 * Space Complexity: O(n), Storing list 1 node addresses in an unordered_set.
 */
package dsa.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class FindIntersectionOfTwoLinkedListBetterApproach {
	public static Node intersectionPresent(Node head1,Node head2) {
		Set<Node> st = new HashSet<>();
		while(head1!=null) {
			st.add(head1);
			head1 = head1.next;
		}
		while(head2!=null) {
			if(st.contains(head2))
				return head2;
			head2 = head2.next;
		}
		return null;
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
