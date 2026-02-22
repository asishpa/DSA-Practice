/*
 * Time Complexity: O(N*LogN),
 * Space Complexity: O(1) ,
 */
package dsa.linkedlist;

public class SortLinkedLIstOptimalApproach {
	public static Node sortLinkedList(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node middle = findMiddle(head);
		Node right = middle.next;
		middle.next = null;
		Node left = head;
		left = sortLinkedList(left);
		right =  sortLinkedList(right);
		return returnMergedLinkedList(left, right);
	}
	public static Node returnMergedLinkedList(Node list1,Node list2) {
		Node dummyNode = new Node(-1,null);
		Node temp = dummyNode;
		while(list1!=null && list2!=null) {
			if(list1.data <= list2.data) {
				temp.next = list1;
				list1 = list1.next;
			}
			else {
				temp.next = list2;
				list2 = list2.next;
			}
			temp = temp.next;
		}
		if(list1!=null) {
			temp.next = list1;
		}
		else if(list2!=null){
			temp.next = list2;
		}
		return dummyNode.next;
	}
	public static Node findMiddle(Node head) {
		Node slow = head;
		Node fast = head.next;
		while(fast!=null&& fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public static void printLinkedlist(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(""+temp.data);
			System.out.print("->");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		Node head = new Node(1, null);
        head.next = new Node(2, null);
        head.next.next = new Node(5, null);
        head.next.next.next = new Node(4, null);
        head.next.next.next.next = new Node(3, null);
        head = sortLinkedList(head);
        printLinkedlist(head);

	}

}
