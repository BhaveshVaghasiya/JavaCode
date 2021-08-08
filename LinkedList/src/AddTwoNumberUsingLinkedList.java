
public class AddTwoNumberUsingLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		 list.insert(3);   
		 list.insert(5); 
		 list.insert(6); 
		 list.insert(8); 
		 LinkedList list1 = new LinkedList();
		 list1.insert(4);   
		 list1.insert(5); 
		 list1.insert(6); 
		 list1.insert(8); 
		 
		list.show(addtwoLinkedList(list.getLinkedList(), list1.getLinkedList()));
	}

	private static Node addtwoLinkedList(Node ls1, Node ls2) {
		Node result = new Node(-1);
		Node current = result;
		int carry = 0;
		while(ls1 != null || ls2 !=null) {
			int sum = 0;
			if(ls1 ==null) {
				sum = ls2.data + carry;
				ls2 = ls2.next;
			} else if (ls2 ==null) {
				sum = ls1.data + carry;
				 ls1= ls1.next;
			} else {
				sum = ls1.data + ls2.data + carry;
				ls1 = ls1.next;
				ls2 = ls2.next;
			}
			carry = sum/10;
			sum = sum%10;
			current.next = new Node(sum);
			current= current.next;
		}
		if(carry == 1) current.next = new Node(1);
		return result.next;
	}
}
