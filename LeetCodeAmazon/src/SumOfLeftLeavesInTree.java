import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left;
	Node right;
	public Node(int d){
		this.data = d;
		this.left = this.right = null;
	}
}
public class SumOfLeftLeavesInTree {

	public static void main(String[] args) {
		Node tree = new Node(1);
		 tree.left = new Node(2);
		 tree.left.right = new Node(3);
		 tree.left.left = new Node(4);
		 tree.left.right.left = new Node(5);
		 tree.left.right.right = new Node(6);
		 tree.left.left.right = new Node(7);
		 tree.right = new Node(8);
		 tree.right.left = new Node(9);
		 tree.right.right = new Node(10);
		//System.out.println(leftLeavesSum(tree, "M"));
		//System.out.println(leftLeavesSum(tree));
		System.out.println(leftLeavesSumUsingQ(tree));
	}

	private static int leftLeavesSumUsingQ(Node tree) {
		int sum = 0;
		Queue<Node> nodeQ = new LinkedList<>();
		nodeQ.add(tree);
		while (!nodeQ.isEmpty()) {
			Node root = nodeQ.poll();
			if (root.left != null) {
				if (isLeaf(root.left)) {
					sum += root.left.data;
				} else {
					nodeQ.add(root.left);
				}
			} if (root.right != null) {
				nodeQ.add(root.right);
			}
		}
		return sum;
	}

	private static int leftLeavesSum(Node tree) {
		if(tree == null) return 0;
		int sum = 0;
		if(tree.left != null) {
			if(isLeaf(tree.left)) sum += tree.left.data;
			sum += leftLeavesSum(tree.left);
		}
		sum += leftLeavesSum(tree.right);
		return sum;
	}

	private static boolean isLeaf(Node n) {
		return n.left == null && n.right == null;
	}

	private static int leftLeavesSum(Node tree, String direction) {
		if(tree == null)
			return 0;
		int result = 0;
		if(direction.equalsIgnoreCase("L")) {
			 result = tree.data;
		}
		int l = leftLeavesSum(tree.left, "L");
		int r = leftLeavesSum(tree.right, "M");
		
		return result+ l + r;
	}

}
