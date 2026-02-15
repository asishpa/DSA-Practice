/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
package dsa.linkedlist;

public class DetectALoopInLinkedListOptimalApproach {
	public static boolean detectLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && slow!=null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow==fast) {
				return true;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;
        boolean status = detectLoop(head);
        if(status)
        	System.out.println("Linked list has a loop");
        else
        	System.out.println("Linked list has no loop");

	}

}
