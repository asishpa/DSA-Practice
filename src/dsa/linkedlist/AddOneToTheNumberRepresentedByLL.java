/*
 * Time complexity: Time Complexity: O(n),
 * Space Complexity: O(1)
 */
package dsa.linkedlist;

public class AddOneToTheNumberRepresentedByLL {
	
	public static Node reverseLinkedList(Node head) {
		Node temp = head;
		Node reverse = null;
		while(temp!=null) {
			Node nextNode = temp.next;
			temp.next = reverse;
			reverse = temp;
			temp = nextNode;
		}
		return reverse;
	}
	public static Node addOne(Node head) {
		head = reverseLinkedList(head);
		int carry = 1;
		Node current = head;
		while(current!=null && carry>0) {
			int sum = current.data + carry;
			current.data = sum %10;
			carry = sum / 10;
			if(current.next==null && carry>0) {
				current.next = new Node(carry);
				carry=0;
			}
			current = current.next;
		}
		head = reverseLinkedList(head);
		return head;
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
        System.out.println("The previous linekd list:");
        printLinkedlist(head);
        System.out.println();
        addOne(head);
        System.out.println("The linked list after adding one is:");
        printLinkedlist(head);

	}

}
