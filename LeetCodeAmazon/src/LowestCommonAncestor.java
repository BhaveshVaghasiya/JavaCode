
public class LowestCommonAncestor {

	public static int lca; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		1
	2        5
  3    4   6    8
          7
*/
		Node root = new Node(1);
		root.left= new Node(2);
		root.left.left= new Node(3);
		root.left.right= new Node(4);
		root.right= new Node(5);
		root.right.left= new Node(6);
		root.right.left.left= new Node(7);
		root.right.right= new Node(8);
		LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
		lowestCommonAncestor.findLowestCommonAncestor(root, 4, 8);
		System.out.println(lca);
	}

	private boolean findLowestCommonAncestor(Node root, int i, int j) {
		if(root ==null) return false;
		boolean left = findLowestCommonAncestor(root.left , i ,j);
		boolean right = findLowestCommonAncestor(root.right, i, j);
		boolean current = root.data == i || root.data ==j;
		if(left && right || left && current || right && current) {
			lca = root.data;
		}
		return left || right || current;
	}

}
