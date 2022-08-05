package Trees;

// The Zig-Zag Level Order Traversal of the Binary Tree.
import java.util.*;

class ZigZagTraversalBT  {
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

    public void zigzagOrder(Node root){
        if(root==null) return;
        Stack<Node> st = new Stack<>();
        Stack<Node> temp = new Stack<>();
        st.push(root);
        boolean flag = true;       
        while(!st.isEmpty()) {
            Node curr = st.pop();
            System.out.print(curr.value+ " ");            
            if(flag){
                if(curr.right != null)
                    temp.push(curr.right);
                if(curr.left != null)
                    temp.push(curr.left);
            }
            else{
                if(curr.left != null)
                    temp.push(curr.left);
                if(curr.right != null)
                    temp.push(curr.right);
            }           
            if(st.isEmpty()) {  
                flag = !flag;
                Stack<Node> dummy = temp;
                temp = st;
                st= dummy;
            }            
        }        
    }
    
    void zigzagOrder2(Node root){
        //List<List<Integer>> ll = new ArrayList<List<Integer>>();
        if(root==null)  return ;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int count=1;
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node temp=q.poll();
                if(count%2==0)
                    l.add(temp.value);                
                else
                    l.add(0,temp.value);
                
                if(temp.left!=null)
                    q.add(temp.left);
                
                if(temp.right!=null)
                    q.add(temp.right);                
            }
            //ll.add(l);

            for(int i:l)
            System.out.print(i+" ");

            count++;
        }
        // System.out.println("\n"+ ll);

        // List<Integer> flatList = new ArrayList<>();
        // ll.forEach(flatList::addAll);
        // for(int i:flatList)
        //     System.out.print(i+" ");
            
    }

    public static void main(String args[]) 
    { 
        ZigZagTraversalBT tree = new ZigZagTraversalBT();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

       System.out.println("Zig-Zag Traversal");
       tree.zigzagOrder(tree.root);
       System.out.println();
       tree.zigzagOrder2(tree.root);         
                          
    }
}