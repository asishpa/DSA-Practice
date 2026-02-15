/*
 * Time Complexity: O(N*LogN), we traverse the entire linked list once and store and retrieve nodes from the hash map. Map operations have a worst time space complexiy of O(LogN).
 * Space Complexity: O(N) , additional amount of extra space is used to store nodes in a hash map.
 */
package dsa.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class DetectALoopInLinkedListBruteforceApproach {
	public static boolean detectLoop(Node head) {
		Map<Node, Integer> store = new HashMap<>();
		Node temp = head;
		while(temp!=null) {
			if(store.containsKey(temp)) {
				return true;
			}
			store.put(temp, 1);
			temp = temp.next;
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
