
public class DivideLinkedListThreePart {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		 list.insert(3);   
		 list.insert(5); 
		 list.insert(6); 
		 list.insert(8); 
		 list.insert(9); 
		 list.insert(10); 
		 list.insert(11); 
		 
		 System.out.println("Initial Linked List");
		 Node n = list.getLinkedList();
		 list.show(n);
		 //divideInTwo(n);
		 divideInThree(n);
	}

	private static void divideInThree(Node head) {
		LinkedList list = new LinkedList();
		Node n = head;
		Node n1 = head.next;
		Node n2 = head.next.next;
		while(n2.next != null && n2.next.next != null) {
			n = n.next;	
			n1 = n1.next.next;
			if(n2.next.next.next == null) {
				break;
			}
			n2 = n2.next.next.next;
		}
		n2 = n1.next;
		n1.next = null;
		n1 = n.next;
		n.next = null;
		System.out.println("n");
		 list.show(head);
		 System.out.println("n1");
		 list.show(n1);
		 System.out.println("n2");
		 list.show(n2);

	}

	private static void divideInTwo(Node head) {
		LinkedList list = new LinkedList();
		Node n = head;
		Node n1 = head.next;
		while(n1.next != null ) {
			n = n.next;
			Node temp = n1.next;
			if(temp.next== null) {
				break;
			}
			n1 = n1.next.next;
		}
		n1 = n.next;
		n.next = null;
		System.out.println("n");
		 list.show(head);
		 System.out.println("n1");
		 list.show(n1);
	}

}
