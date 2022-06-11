package Linkedlist;
// Java program to delete a given node in LL.

class DeleteSpecificNodes{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}

	void deleteNode(Node node, Node n){		
		if (node == n){
			if (node.next == null){
				System.out.println("There is only one node. The list can't be made empty ");
				return;
			}
			node.data = node.next.data; 	
			n = node.next; 			
			node.next = node.next.next; 		
			return;
		}
		Node prev = node;
		while (prev.next != null && prev.next != n){
			prev = prev.next;
		}
		if (prev.next == null) {
			System.out.println("Given node is not present in Linked List");
			return;
		}		
		prev.next = prev.next.next;
		return;
	}

	void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		DeleteSpecificNodes list = new DeleteSpecificNodes();
		list.head = new Node(12);
		list.head.next = new Node(15);
		list.head.next.next = new Node(10);
		list.head.next.next.next = new Node(11);

		System.out.println("Given Linked List :");
		list.printList(list.head);		
	
		System.out.println("Deleting node :" + list.head.next.data);
		list.deleteNode(list.head, list.head.next);

		System.out.println("Modified Linked list :");
		list.printList(list.head);

		System.out.println("Deleting first Node");
		list.deleteNode(list.head, list.head);
		System.out.println("Modified Linked List");
		list.printList(list.head);

	}
}

// this code has been contributed by Mayank Jaiswal
