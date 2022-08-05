package Trees;
// WAP to print the path from root to a given node in a binary tree.

import java.util.*;

class PathFromRootToGivenNodeInBT {
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

    static boolean hasPath(Node root, ArrayList<Integer> arr, int x)
    {
        if (root==null)
            return false;
        arr.add(root.value);    
        if (root.value == x)    
            return true;
        if (hasPath(root.left, arr, x) || hasPath(root.right, arr, x))
            return true;
        arr.remove(arr.size()-1);
        return false;
    }

    void printPath(Node root,int x)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        if (hasPath(root, arr, x))
        {
            for (int i=0; i<arr.size()-1; i++)    
                System.out.print(arr.get(i) + " -> ");
            System.out.print(arr.get(arr.size() - 1));   
        }
        else
            System.out.print("No Path");
    }
         
    public static void main(String args[]) 
    { 
        PathFromRootToGivenNodeInBT tree = new PathFromRootToGivenNodeInBT();
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
            2     3
          /  \   / \
        4    5  6   7     */
        tree.printPath(tree.root,7);                                    
    }
}