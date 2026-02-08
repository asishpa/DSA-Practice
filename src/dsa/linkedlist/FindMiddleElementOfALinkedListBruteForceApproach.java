/*
 * Time Complexity: O(N+N/2) The code traverses the entire linked list once and half times and then only half in the second iteration, first to count the number of nodes then then again to get to the middle node. Therefore, the time complexity is linear, O(N + N/2) ~ O(N).
 * Space Complexity : O(1)
 */
package dsa.linkedlist;

public class FindMiddleElementOfALinkedListBruteForceApproach {
	public static Node findMiddleElement(Node head) {
		if(head == null || head.next == null ) {
			return head;
		}
		Node temp = head;
		int count = 0;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		System.out.println("count:"+count);
		int mid = count/2 +1;
		System.out.println("mdi at:"+mid);
		temp = head;
		System.out.println("head sia t"+temp.data);
		while(temp!=null) {
			mid = mid-1;
			if(mid == 0) {
				break;
			}
			
			temp = temp.next;
			
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
	//	head.next.next.next.next = new Node(5);
		Node middleNode = findMiddleElement(head);
		System.out.println("The middle element :"+middleNode.data);
	}

}
