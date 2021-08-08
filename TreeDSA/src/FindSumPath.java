
public class FindSumPath {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(4);
		root.right = new Node(8);
		root.left.left = new Node(11);
		root.right.left = new Node(13);
		root.right.right = new Node(4);
		root.left.left.left = new Node(7);
		root.left.left.right = new Node(2);
		root.right.right.right = new Node(1);
		if(sumPreOrder(root,22)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static boolean sumPreOrder(Node root, int sum) {
		if(root ==null) return false;
		else if(root.left == null && root.right ==null && sum - root.data == 0)
			return true;
		else 
			return sumPreOrder(root.left, sum - root.data) || sumPreOrder(root.right, sum - root.data);
	}

}
