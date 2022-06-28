package Trees;
// Basic Operations On Binary Tree
import java.util.*; 

class OperationsOnBinaryTree{ 
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

    void insert(int value){
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

    void traverseLevelOrder(Node node){
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
            }
            else{
                System.out.print(curr.value+" ");
                if(curr.left!=null)
                    q.add(curr.left);            
                if(curr.right!=null)
                    q.add(curr.right);            
            }
        }
    }
     
    int CountOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftnodes=CountOfNodes(root.left);
        int rightnodes=CountOfNodes(root.right);
        return leftnodes + rightnodes + 1;
    }

    int sum=0;
    int CountLeafNodes(Node root) 
    {
        if(root==null)
            return sum;
        if(root.left!=null || root.right!=null)
        {
            sum=CountLeafNodes(root.left);
            sum=CountLeafNodes(root.right);
        }
        else
            sum++;        
        return sum;
    }

    int SumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=SumOfNodes(root.left);
        int rightsum=SumOfNodes(root.right);
        return leftsum + rightsum + root.value;
    }

    int HeightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=HeightOfTree(root.left);
        int rightHeight=HeightOfTree(root.right);
        int height=Math.max(leftHeight,rightHeight) +1;
        return height;
    }

    int DiameterOfTree(Node root){
        if(root==null){
            return 0;
        }
        int d1=DiameterOfTree(root.left);
        int d2=DiameterOfTree(root.right);
        int d3=HeightOfTree(root.left) + HeightOfTree(root.right) + 1;
        return Math.max(d3,(Math.max(d1,d2)));
    }
    public static void main(String args[]) 
    { 
        OperationsOnBinaryTree tree = new OperationsOnBinaryTree();
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

       
       System.out.println("\nLevelOrder Traversal");  
       tree.traverseLevelOrder(tree.root);          
       System.out.println("Total No. of Nodes : " + tree.CountOfNodes(tree.root));
       System.out.println("Total No. of Leaf-Nodes : " + tree.CountLeafNodes(tree.root));
       System.out.println("Total Sum of Nodes : " + tree.SumOfNodes(tree.root));                   
       System.out.println("Height Of Tree : " + tree.HeightOfTree(tree.root));
       System.out.println("Diameter Of Tree : " + tree.DiameterOfTree(tree.root));
    }
}
 
