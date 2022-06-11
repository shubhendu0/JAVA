package Trees;
import java.util.*; 

public class BinaryTreeDynamicData { 
    Node root;
    class Node {    
        int value; 
        Node left, right;           
        Node(int value){ 
            this.value = value; 
            left = null; 
            right = null; 
        } 
    } 

    public void insert(int value){
        Node newnode=new Node(value);
        if(root==null)  {
          root=newnode;
          return;
        }
        Queue<Node> q=new LinkedList<>();
        Node temp=root;
        q.add(temp);
        while(!q.isEmpty()){
            temp=q.poll();
            if(temp.left!=null)
                q.add(temp.left);            
            else{
                temp.left=newnode;
                break;
            }
            if(temp.right!=null)
                q.add(temp.right);            
            else{
                temp.right=newnode;
                break;
            }                                               
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
        if(node==null)  {return;}
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
        BinaryTreeDynamicData tree = new BinaryTreeDynamicData();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);

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
  
// public void insert(Node node, int value) {
    //     if (value < node.value) { 
    //       if (node.left != null) { 
    //         insert(node.left, value); 
    //       } 
    //       else { 
    //         System.out.println("Inserted " + value + " to left of " + node.value); 
    //         node.left = new Node(value);
    //       } 
    //     } 
    //     else if (value > node.value) {
    //       if (node.right != null) {
    //         insert(node.right, value);
    //       } 
    //       else {
    //         System.out.println("Inserted " + value + " to right of "+ node.value);
    //         node.right = new Node(value);
    //       }
    //     }
    //   }
