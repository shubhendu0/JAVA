package Trees;
// Java program to print Left & Right view of binary tree using Backtracking

class LeftRightViewOfBinaryTree {

    static class Node {
        int data;
        Node left, right;   
        Node(int item){
            data = item;
            left = right = null;
        }
    }

	Node root;

	static int max_level1 = 0;
	void printLeftView(Node node, int level)
	{
		if (node == null)
			return;
		if (max_level1 < level) {
			System.out.print(node.data+" ");
			max_level1 = level;
		}
		printLeftView(node.left, level + 1);
		printLeftView(node.right, level + 1);
	}

	static int max_level2 = 0;
	void printRightView(Node node, int level)
	{
		if (node == null)
			return;
		if (max_level2 < level) {
			System.out.print(node.data+" ");
			max_level2 = level;
		}
		printRightView(node.right, level + 1);
		printRightView(node.left, level + 1);
	}

		public static void main(String args[])
	{		
		LeftRightViewOfBinaryTree tree = new LeftRightViewOfBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
        tree.root.right.right.left = new Node(8);
		tree.printLeftView(tree.root,1);
		System.out.println();
		tree.printRightView(tree.root,1);

	}
}
