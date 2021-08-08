
public class ReverseLinkedList {
	static Node head;
	public static void main(String[] args) {
		 LinkedList list = new LinkedList();
		 list.insert(3);   
		 list.insert(5); 
		 list.insert(6); 
		 list.insert(8); 
		 System.out.println("Initial Linked List");
		 Node n = list.getLinkedList();
		 list.show(n);
		 System.out.println(" Reverese Linked List");
		 list.show(reverseLinkedList(n));
		
	}
	private static Node reverseLinkedList(Node head) {
		Node current = head;
		Node next = null;
		Node pre = null;
		while(current!= null) {
			next = current.next;
			current.next = pre;
			pre = current;
			current = next;
		}
		head = pre;
		return head;
	}

}
