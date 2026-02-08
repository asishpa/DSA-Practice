/*
 * Time Complexity: O(N), we traverse the entire linked list once to delete the tail of the list.
 * Space Complexity: O(1) , constant amount of extra space is used.
 */
package dsa.linkedlist;
class Solution1{
	public Node deleteLastNode(Node head) {
		if(head == null || head.next==null) {
			return null;
		}
		Node temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;//second last node
		}
		temp.next = null;
		return head;
		
		
	}
	public void printList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
}
public class DeleteLastNodeOfLinkedList {

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		Node head = new Node(2);
		head.next = new Node(3);
		System.out.print("Original List: ");
		sol.printList(head);
		head = sol.deleteLastNode(head);
        System.out.print("After deleting the last node: ");
		sol.printList(head);
	}

}
