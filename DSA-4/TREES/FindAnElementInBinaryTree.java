package Trees;

public class FindAnElementInBinaryTree {

    static class Node {  
        int data;  
        Node left;  
        Node right;    
        Node(int data) {   
          this.data = data;  
          this.left = null;  
          this.right = null;  
        }  
    }   
    Node root;  
    static boolean b = false;  
   
    public void searchNode(Node root, int value)
    {   
        if(root == null) {  
          System.out.println("Tree is empty"); 
          return; 
        }  
        else
        {             
            if(root.data == value) {     //If value is found in the given binary tree then, set the flag to true  
                b = true;  
                return;  
            }               
            if(b == false && root.left != null) {   //Search in left subtree 
                searchNode(root.left, value);  
            }               
            if(b == false && root.right != null) {  //Search in right subtree 
                searchNode(root.right, value);  
            }  
        }  
    }  
  
    public static void main(String[] args) {  
  
        FindAnElementInBinaryTree bt = new FindAnElementInBinaryTree();  
        bt.root = new Node(1);  
        bt.root.left = new Node(2);  
        bt.root.right = new Node(3);  
        bt.root.left.left = new Node(4);  
        bt.root.right.left = new Node(5);  
        bt.root.right.right = new Node(6);  
   
        bt.searchNode(bt.root, 11);  
  
        if(b)  
            System.out.println("Element is present ");  
        else  
            System.out.println("Element is not present ");  
        
    }  
}
