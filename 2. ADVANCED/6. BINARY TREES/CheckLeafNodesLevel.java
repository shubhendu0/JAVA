
package Trees;
import java.util.*; 

public class CheckLeafNodesLevel{ 
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
    
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.value +" ");
            traverseInOrder(node.right);
        }
    }

    static int level=0;
    static boolean checkLeavesLevel(Node root,int currentLevel){
        if(root == null)    
            return true;   
        else{  
            Node temp=root;      
            if(temp.left == null && temp.right == null) {  
                //If first leaf is encountered, set level to current level  
                if(level == 0) {  
                    level = currentLevel ;  
                    return true;  
                }  
                //Checks whether the other leaves are at same level of that of first leaf  
                else   
                    return (level == currentLevel) ;  
            }                  
            //Checks for leaf node in left and right subtree recursively.  
            return  (checkLeavesLevel(temp.left, currentLevel + 1) && checkLeavesLevel(temp.right, currentLevel + 1)) ;  
        }  
    }
     
    public static void main(String args[]) 
    { 
        CheckLeafNodesLevel tree = new CheckLeafNodesLevel();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        //tree.insert(8);

        /* 
                1 
             /   \
           2      3
         /  \   /  \
       4     5 6    7     */

       System.out.println("InOrder Traversal");
       tree.traverseInOrder(tree.root);  
       
       System.out.println("\n"+ checkLeavesLevel(tree.root,1));          
                          
    }
}
