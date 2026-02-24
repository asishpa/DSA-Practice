/*
 * Time Complexity: O(2 × max(length of list1, length of list2)) + O(abs(length of list1 − length of list2)) + O(min(length of list1, length of list2)), Finding the length of both lists takes O(max) time since it's done simultaneously, then moving one pointer by the difference in lengths, and finally searching for the intersection.
 * Space Complexity: O(1), No extra space is used.


 */
package dsa.linkedlist;

public class FindIntersectionOfTwoLinkedListOptimalApproach1 {
	public static Node intersectionPresent(Node head1,Node head2) {
		int length1 = lengthOfLl(head1);
		int length2 = lengthOfLl(head2);
		int diff = length1-length2;
		if(diff>0) {
			while(diff--!=0)
				head1= head1.next;
		}
		else
			while(diff++!=0)
				head2 = head2.next;
		while(head1!=null) {
			if(head1==head2)
				return head1;
			head1=head1.next;
			head2=head2.next;
		}
		return null;
	}
	
	public static int lengthOfLl(Node head) {
		int cnt=0;
		Node temp = head;
		while(temp.next!=null) {
			cnt++;
			temp= temp.next;
		}
		return cnt;
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
