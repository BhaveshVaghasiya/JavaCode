class Node {
  Node next;
  int data;
}

class Linked {
  public Node mergeSort(Node node) {
    if(node == null || node.next == null) {
      return node;
    }
    
    Node middle = middleNode(node);
    Node secondHalf = middle.next;
    middle.next = null;
    
    return merge(mergeSort(node), mergeSort(secondHalf));
  }
  
  public Node middleNode(Node node) {
    if(node == null) {
      return null;
    }
    
    Node a = node;
    Node b = node.next;
    
    while(b != null && b.next != null) {
      a = a.next;
      b = b.next.next;
    }
    
    return a;
  }
  
  public Node merge(Node a, Node b) {
    Node temp = new Node();
    Node finalList = temp;
    
    while(a != null && b != null) {
      if(a.data < b.data) {
        temp.next = a;
        a = a.next;
      } else {
        temp.next = b;
        b = b.next;
      }
      temp = temp.next;
    }
    temp.next = (a == null) ? b : a;
    return finalList.next;
  }
  
  public Node getNewNode(int key) {
    Node a = new Node();
    a.next = null;
    a.data = key;
    return a;
  }
  
  public Node insert(int key, Node node) {

    if (node == null)
      return getNewNode(key);
    else
      node.next = insert(key, node.next);

    return node;
  }

  public void printList(Node node) {
    if (node == null) {
      return;
    }

    System.out.print(node.data + " ");
    printList(node.next);
  }
}

public class Result {

  public static void main(String[] args) {

    Node root = null;
    Linked a = new Linked();

    root = a.insert(12, root);
    root = a.insert(99, root);
    root = a.insert(37, root);
    root = a.insert(8, root);
    root = a.insert(18, root);
    
    a.printList(root);
    System.out.println();
    
    Node sorted = a.mergeSort(root);
    a.printList(sorted);
  }
}