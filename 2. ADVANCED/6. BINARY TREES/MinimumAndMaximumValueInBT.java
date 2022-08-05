package Trees;

import java.util.*; 

public class MinimumAndMaximumValueInBT { 
    
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

    int findMax(Node node)
    {
        if (node == null)
            return Integer.MIN_VALUE;
        int res = node.value;
        int lmax = findMax(node.left);
        int rmax = findMax(node.right);
        if (lmax > res)
            res = lmax;
        if (rmax > res)
            res = rmax;
        return res;
    }

    int findMin(Node node)
    {
        if (node == null)
            return Integer.MAX_VALUE;
        int res = node.value;
        int lmin = findMin(node.left);
        int rmin = findMin(node.right);
        if (lmin < res)
            res = lmin;
        if (rmin < res)
            res = rmin;
        return res;
    }

    public static void main(String args[]) 
    { 
        MinimumAndMaximumValueInBT tree = new MinimumAndMaximumValueInBT();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);

       System.out.println("Maximum value : "+ tree.findMax(tree.root));
       System.out.println("Minimum value : "+ tree.findMin(tree.root));         
                          
    }
}