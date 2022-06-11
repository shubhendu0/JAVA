package Trees;
import java.util.*; 

public class BinaryTreeStaticData { 
    Node root;
    static class Node {    
    int value; 
        Node left, right;           
        Node(int value){ 
            this.value = value; 
            left = null; 
            right = null; 
        } 
    } 

      public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(node.value +" ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
      }

      public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.value +" ");
            traverseInOrder(node.right);
        }
      }

      public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.value +" ");
        }
      }

      public void traverseLevelOrder(Node node){
        if(node==null){return;}
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        q.add(null);
        while(!q.isEmpty()){
          Node curr=q.remove();
          if(curr==null){
            System.out.println();
            if(q.isEmpty())
              break;            
            else
              q.add(null);            
          }else{
            System.out.print(curr.value+" ");
            if(curr.left!=null)
              q.add(curr.left);            
            if(curr.right!=null)
              q.add(curr.right);            
          }
        }
      }
     
    public static void main(String args[]) 
    { 
        BinaryTreeStaticData tree = new BinaryTreeStaticData();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        /* 
                1 
             /   \
           2      3
         /  \   /  \
       4     5 6    7     */

       System.out.println("PreOrder Traversal");
       tree.traversePreOrder(tree.root);
       System.out.println("\nInOrder Traversal");
       tree.traverseInOrder(tree.root);  
       System.out.println("\nPostOrder Traversal");  
       tree.traversePostOrder(tree.root);
       System.out.println("\nLevelOrder Traversal");  
       tree.traverseLevelOrder(tree.root);          
                          
    }
}
  
