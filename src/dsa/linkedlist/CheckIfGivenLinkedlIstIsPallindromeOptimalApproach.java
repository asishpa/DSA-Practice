/*
 * Time Complexity: O(N), we traverse the list twice, once to reverse half of it and once to compare, each taking O(N/2), which simplifies to O(N).
 * Space Complexity: O(1), no extra space is used apart from a few pointers; operations are done in-place.


 */
package dsa.linkedlist;

public class CheckIfGivenLinkedlIstIsPallindromeOptimalApproach {
	public static void printLinkedList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data);
			System.out.print("->");
			temp = temp.next;
		}
		System.out.println();
	}
	public static Node reverseLinkedList(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node newHead = reverseLinkedList(head.next);
		Node front = head.next;
		front.next = head;
		head.next = null;
		return newHead;
		
	}
	public static boolean isPallindrome(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast.next!=null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node reversedHead = reverseLinkedList(slow.next);
		Node first = head;
		Node second = reversedHead;
		while(second!=null) {
			if(first.data!=second.data) {
				reverseLinkedList(reversedHead);
				return false;
			}
			first = first.next;
			second = second.next;
		}
		reverseLinkedList(reversedHead);
		return true;
		
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


