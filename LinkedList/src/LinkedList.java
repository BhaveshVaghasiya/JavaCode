
public class LinkedList {
	Node head;
	public void insert(int data) {
		Node n = new Node();
		n.data = data;
		n.next = null;
		if(head == null) {
			head = n;
		}else {
			Node e = head;
			while(e.next != null) {
				e=e.next;
			}
			e.next = n;
		}
	}
	
	public Node getLinkedList() {
		return head;
	}
	public void show(Node root) {
		Node print=root;
		while(print.next != null) {
			System.out.print(print.data + " -> ");
			print = print.next;
		}
		System.out.print(print.data + " ");
	}
}
