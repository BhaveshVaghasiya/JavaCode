import java.io.*;
import java.util.*;

class TreeBorderNodePrint {
	public static int maxlevel = 0;

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		printLeftTree(root);
		printRightTree(root.right);
	}

	public static void printLeftTree(Node tree) {
		if (tree == null) {
			return;
		}
		printLeftTree(tree.left);
		System.out.println(tree.data);
	}

	public static void printRightTree(Node tree) {
		if (tree == null) {
			return;
		}
		System.out.println(tree.data);
		printRightTree(tree.right);
	}
}
