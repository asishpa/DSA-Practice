/*
 * Time Complexity: O(N), we traverse the entire linked list atleast once to find the length of the loop.
 * Space Complexity: O(N) , we use a map to store the timers for the nodes in the linked list.
 */
package dsa.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLoopBruteForce {
	public static int lengthOfLoop(Node head) {
		int timer =0;
		Map<Node, Integer> visitedNodes = new HashMap<>();
		Node temp = head;
		while(temp!=null) {
			if(visitedNodes.containsKey(temp)) {
				int loopLength = timer - visitedNodes.get(temp);
				return loopLength;
			}
			visitedNodes.put(temp, timer);
			timer++;
			
		}
		return 0;
	}

	public static void main(String[] args) {
		// Creating a sample linked list with a loop
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Linking the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Creating a loop from fifth to second
        fifth.next = second;

        // Creating a Solution object
        Solution obj = new Solution();

        // Getting the loop length
        int loopLength = lengthOfLoop(head);

        // Printing the result
        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }


}
