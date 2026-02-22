/*
 * Time Complexity: O(N),
 * Space Complexity: O(N),
 */
package dsa.linkedlist;

import java.util.Stack;

public class CheckIfGivenLinkedlIstIsPallindromeBruteForceApproach {
	public static boolean isPallindrome(Node head) {
		Stack<Integer> nodes = new Stack<>();
		Node temp = head;
		while(temp!=null) {
			nodes.push(temp.data);
			temp = temp.next;
		}
		temp = head;
		while(temp!=null) {
			int top = nodes.pop();
			if(top!=temp.data) {
				return false;
			}
			
			temp = temp.next;
		}
		return true;
	}
	public static void printLinkedList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data);
			System.out.print("->");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Check if the linked list is a pallindrome
        if (isPallindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
	}

}
