
public class FindKthSmallestValue {
	
	public static void main(String[] args) {
		Node root = null;
		FindKthSmallestValue fksv = new FindKthSmallestValue();
		root = fksv.insert(root, 6);
		root = fksv.insert(root, 5);
		root = fksv.insert(root, 4);
		root = fksv.insert(root, 3);
		root = fksv.insert(root, 2);
		root = fksv.insert(root, 1);
		root = fksv.insert(root, 7);
		root = fksv.insert(root, 8);
		root = fksv.insert(root, 9);
		root = fksv.insert(root, 10);
		//fksv.show(root);
		kThSmallestNode(root, 5);
	}
	static int counter = 0;
	private static void kThSmallestNode(Node root, int i) {
		if (root == null)
            return;
		kThSmallestNode(root.left,i);
		counter++;
		if(i == counter) {
			System.out.println(root.data);
			return;
		}
		kThSmallestNode(root.right,i);
	}
	private void show(Node root) {
		if(root == null) {
			return;
		}
		show(root.left);
		System.out.print(root.data + " ");
		show(root.right);
	}
	Node node;
	public Node insert(Node root, int i) {
		if(root == null) {
			node = new Node(i);
			return node;
		}
		if(root.data < i) {
			root.right = insert(root.right,i);
		}else if(root.data > i) {
			root.left = insert(root.left,i);
		}
		return root;
	}
}
