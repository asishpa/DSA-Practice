/*
 * Time Complexity: O(1), 
 * Space Complexity: O(1)
 */
package dsa.linkedlist;

class Node{
	int data;
	Node next;
	Node(int data,Node next){
		this.data = data;
		this.next = next;
	}
	Node(int data){
		this.data = data;
	}
}
class Solution{
	public Node insertAtHead(Node head,int data) {
		Node newNode = new Node(data,head);
		return newNode;
		
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
public class InsertAtTheHeadOfALinkedList {

	public static void main(String[] args) {
		Solution sol = new Solution();
		Node head = new Node(2);
		head.next = new Node(3);
		System.out.print("Original List: ");
		sol.printList(head);
		head = sol.insertAtHead(head,1);
        System.out.print("After Insertion at Head: ");
		sol.printList(head);
	}

}
