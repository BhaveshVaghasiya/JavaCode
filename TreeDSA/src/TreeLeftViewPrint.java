
import java.io.*;
import java.util.*;

class TreeLeftViewPrint {
  public static int maxlevel = 0;
  
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right= new Node(3);
    root.left.left= new Node(4);
    root.left.right= new Node(5);
    root.right.left= new Node(6);
    root.right.right= new Node(7);
    printLeftTree(root, 1);
  }
  
  public static void printLeftTree(Node tree, int level){
    if(tree == null){
      return;
    }
    if(level > maxlevel){
      System.out.println(tree.data);
      maxlevel=level;
      
    }
    printLeftTree(tree.left, level+1);
    printLeftTree(tree.right, level+1);
  }
}