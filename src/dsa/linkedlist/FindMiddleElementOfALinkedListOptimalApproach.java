/*
 * Time Complexity: O(N/2) The algorithm requires the 'fast' pointer to reach the end of the list which it does after approximately N/2 iterations (where N is the total number of nodes). Therefore, the maximum number of iterations needed to find the middle node is proportional to the number of nodes in the list, making the time complexity linear, or O(N/2) ~ O(N).
 * Space Complexity : O(1)
 */
package dsa.linkedlist;

public class FindMiddleElementOfALinkedListOptimalApproach {
	public static Node findMiddleElement(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!= null && fast.next!=null) {
			slow = slow.next;
			System.out.println("slow data:"+slow.data);
			System.out.println("fast data:"+fast.data);
			fast = fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		Node middleNode = findMiddleElement(head);
		System.out.println("The middle element :"+middleNode.data);

	}

}
