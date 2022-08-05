package Trees;
// Java program to print Top view of binary tree

import java.util.*;
class TopViewOfBinaryTree {

    static class Node {
        int data;
        Node left, right;   
        Node(int item){
            data = item;
            left = right = null;
        }
    }
	Node root;
    class Pair {
        int verticalLevel;
        Node currentNode;
        Pair(int verticalLevel, Node currentNode) {
            this.verticalLevel = verticalLevel;
            this.currentNode = currentNode;
        }
    }

	void printTopView(Node node)
	{
        List<Integer> output = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        queue.add(new Pair(0, root));
        while(!queue.isEmpty()) {
            Pair p = queue.poll();
            int verticalLevel = p.verticalLevel;
            Node currentNode = p.currentNode;
            if(!map.containsKey(verticalLevel)) 
                map.put(verticalLevel, currentNode.data);
            
            if(currentNode.left != null) 
                queue.add(new Pair(verticalLevel - 1, currentNode.left));
            
            if(currentNode.right != null) 
                queue.add(new Pair(verticalLevel + 1, currentNode.right));
            
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            output.add(entry.getValue());
        }

        System.out.println(output);
        for(int i:output)
            System.out.print(i+" ");
	}

	public static void main(String args[])
	{		
		TopViewOfBinaryTree tree = new TopViewOfBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
		tree.root.right.left.right.right = new Node(9);
		tree.root.right.left.right.right.right = new Node(10);

		tree.printTopView(tree.root);
	}
}
