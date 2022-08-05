package Trees;
// Java program to print boundary traversal of binary tree
import java.util.*;

public class BoundaryTraversalOfBinaryTree {
    
    class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
	Node root;

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

	void printLeaves(Node node)
	{
		if (node == null)
			return;
		printLeaves(node.left);
		if (node.left == null && node.right == null)
			System.out.print(node.data + " ");
		printLeaves(node.right);
	}

	void printBoundaryLeft(Node node)
	{
		if (node == null)
			return;
		if (node.left != null) {
			System.out.print(node.data + " ");
			printBoundaryLeft(node.left);
		}
		else if (node.right != null) {
			System.out.print(node.data + " ");
			printBoundaryLeft(node.right);
		}
	}

	void printBoundaryRight(Node node)
	{
		if (node == null)
			return;
		if (node.right != null) {
			printBoundaryRight(node.right);
			System.out.print(node.data + " ");
		}
		else if (node.left != null) {
			printBoundaryRight(node.left);
			System.out.print(node.data + " ");
		}
	}

	void printBoundary(Node node)
	{
		if (node == null)
			return;
		System.out.print(node.data + " ");
		printBoundaryLeft(node.left);
		printLeaves(node.left);
		printLeaves(node.right);
		printBoundaryRight(node.right);
	}

	public static void main(String args[])
	{
		BoundaryTraversalOfBinaryTree tree = new BoundaryTraversalOfBinaryTree();
		tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);
		tree.printBoundary(tree.root);
	}
}


