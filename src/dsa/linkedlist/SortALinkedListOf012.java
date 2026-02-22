package dsa.linkedlist;

public class SortALinkedListOf012 {
	public static Node sort(Node head) {
		Node zerodummy = new Node(-1);
		Node onedummy = new Node(-1);
		Node twodummy = new Node(-1);
		Node zerotail = zerodummy;
		Node onetail = onedummy;
		Node twotail = twodummy;
		Node temp = head;
		while(temp!=null) {
			if(temp.data == 0) {
				zerotail.next=temp;
				zerotail = zerotail.next;
			}
			else if(temp.data == 1) {
				onetail.next = temp;
				onetail = onetail.next;
			}
			else {
				twotail.next = temp;
				twotail = twotail.next;
			}
			temp = temp.next;
		}
		zerotail.next = (onedummy.next != null) ? onedummy.next : twodummy.next;
        onetail.next = twodummy.next;
        twotail.next = null;
        head = zerodummy.next;
        return head;
		
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
		Node ll = new Node(1);
		ll.next = new Node(0);
		ll.next.next = new Node(1);
		ll.next.next.next = new Node(2);
		ll.next.next.next = new Node(1);
		ll.next.next.next.next = new Node(1);
		ll.next.next.next.next.next = new Node(2);
		ll.next.next.next.next.next.next = new Node(1);
		ll.next.next.next.next.next.next.next = new Node(0);
		ll.next.next.next.next.next.next.next.next = new Node(2);
		printLinkedlist(sort(ll));
	}

}
