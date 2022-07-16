package Trees;
// Java Program to check whether the given BT is a BST or not.

public class CheckIfGivenBTisBST { 
    Node root;
    static class Node {    
    int data; 
        Node left, right;           
        Node(int data){ 
            this.data = data; 
            left = null; 
            right = null; 
        } 
    } 

     boolean isBST(Node node, int min, int max) 
    {
      if (node == null)
          return true;

      if (node.data < min || node.data > max)
          return false;

      boolean isLeft = isBST(node.left, min, node.data);
      if (!isLeft)
          return isLeft;

      boolean isRight = isBST(node.right, node.data, max);
      if (!isRight)
          return isRight;

      return true;
  }
     
    public static void main(String args[]) 
    { 
        CheckIfGivenBTisBST tree = new CheckIfGivenBTisBST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(6); 
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(7);      
        System.out.println(tree.isBST(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE));                  
    }
}
  
