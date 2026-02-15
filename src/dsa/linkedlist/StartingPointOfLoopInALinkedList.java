/*
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
package dsa.linkedlist;

public class StartingPointOfLoopInALinkedList {
	public static Node detectLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow==fast) {
				slow = head;
				while(slow!=fast) {
					slow = slow.next;
					fast = fast.next;
			}
				return slow;
			
		}

	}
		return null;
	}

	public static void main(String[] args) {
		Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);

        // Create cycle: last node connects to node with value 2
        head.next.next.next.next = head.next;

        Node result = detectLoop(head);

        if (result != null)
            System.out.println("Cycle starts at node with value: " + result.data);
        else
            System.out.println("No cycle found.");
    }
	
}
