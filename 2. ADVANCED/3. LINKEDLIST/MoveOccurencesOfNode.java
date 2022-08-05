package Linkedlist;
// Java program to move all occurrences of a given key to end.

class MoveOccurencesOfNode {
	static class Node {
		int data;
		Node next;
        Node(int data){
            this.data=data;
        }
	}
	static Node newNode(int x) {
		Node temp = new Node(x);
		temp.next = null;
		return temp;
	}

	static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.printf("%d ", temp.data);
			temp = temp.next;
		}
		System.out.printf("\n");
	}

	static void moveToEnd(Node head, int key) {
		// Keeps track of locations where key is present.
		Node pKey = head;
		// Traverse list
		Node temp = head;
		while (temp != null) {
			// If current pointer is not same as pointer to a key location, then we must have found
			// a key in linked list. We swap data of pCrawl and pKey and move pKey to next position.
			if (temp != pKey && temp.data != key) {
				pKey.data = temp.data;
				temp.data = key;
				pKey = pKey.next;
			}
			// Find next position where key is present
			if (pKey.data != key)
				pKey = pKey.next;
			// Moving to next Node
			temp = temp.next;
		}
	}

	public static void main(String args[]) {
		Node head = newNode(10);
		head.next = newNode(20);
		head.next.next = newNode(10);
		head.next.next.next = newNode(30);
		printList(head);
		int key = 10;
		moveToEnd(head, key);
		printList(head);
	}
}