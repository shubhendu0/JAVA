package Trees;
// Java program to print Left & Right view of binary tree using Queue
import java.util.*;

class LeftRightViewOfBinaryTree2 {

    static class Node {
        int data;
        Node left, right;   
        Node(int item){
            data = item;
            left = right = null;
        }
    }

	Node root;

	void printLeftView()  {  
		if (root == null)  
			return;   
		Queue<Node> q = new LinkedList<>();  
		q.add(root);  
		while (!q.isEmpty())   {   
			int size = q.size();  	// number of nodes at current level 
			for (int i=1; i<=size; i++)   {  
				Node temp = q.poll();  				
				if (i == 1)  // extreme-left at each level			  
					System.out.print(temp.data + " ");  		   
				if (temp.left != null)  		 
					q.add(temp.left);  		    
				if (temp.right != null)  
					q.add(temp.right);  		 
			}  
		}  
	} 

	void printRightView()  {  
		if (root == null)  
			return;   
		Queue<Node> q = new LinkedList<>();  
		q.add(root);  
		while (!q.isEmpty())   {   
			int size = q.size();  // number of nodes at current level  
			for (int i=1; i<=size; i++)   {  
				Node temp = q.poll();  
				if (i == size)   //  extreme-right at each level		  
					System.out.print(temp.data + " ");  		   
				if (temp.left != null)  		 
					q.add(temp.left);  		    
				if (temp.right != null)  
					q.add(temp.right);  		 
			}  
		}  
	} 

	public static void main(String args[])
	{		
		LeftRightViewOfBinaryTree2 tree = new LeftRightViewOfBinaryTree2();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
        tree.root.right.right.left = new Node(8);
		tree.printLeftView();
		System.out.println();
		tree.printRightView();
	}
}
