
public class MaximumPathSum {
	public static int max = Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *			1
		 * 		 2     3
		 *     4   5 6   7
		 * 
		 * */
		
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(-10);
		root.left.left = new Node(-5);
		root.left.right = new Node(1);
		root.right.left = new Node(50);
		root.right.right = new Node(20);
		sumPath(root);
		System.out.println(max);
	}

	private static int sumPath(Node root) {
		if(root ==null) return 0;
		int lside = sumPath(root.left);
		int rside = sumPath(root.right);
		max = Math.max(max, lside + rside + root.data );
		return Math.max(lside, rside) +root.data;
		
	}

}
