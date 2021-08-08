
public class ReverseLinkedListInGroup {
	static Node head;
	public static void main(String[] args) {
		 LinkedList list = new LinkedList();
		 list.insert(3);   
		 list.insert(5); 
		 list.insert(6); 
		 list.insert(8); 
		 list.insert(9); 
		 list.insert(10); 
		 list.insert(11); 
		 list.insert(12); 
		 
		 System.out.println("Initial Linked List");
		 Node n = list.getLinkedList();
		 list.show(n);
		 System.out.println(" Reverese Linked List");
		 list.show(reverse(n,3));
		
	}
	private static Node reverse(Node head, int i ) {
		Node current = head;
		Node next = null;
		Node pre = null;
		int count = 0;
		while(current!= null && count<i) {
			next = current.next;
			current.next = pre;
			pre = current;
			current = next;
			count++;
		}
		if(current != null) {
			head.next = reverse(current,3);
		}
		head = pre;
		return head;
	}
}
