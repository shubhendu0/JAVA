package Linkedlist;
// Java program to reverse a linked list in groups of given size

class ReverseInGroups{
	Node head; 
	class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}

	Node reverseingroups(Node head, int k) 
    	{
		if(head == null) return null;		
		Node current = head;
		Node next = null;
		Node prev = null;
		int count = 0;
		while (count < k && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;     
			count++;
		}			// After 1st loop , 1 <- 2 <- 3	  ,   prev = 3 , current = 1 , next = 4 											
		if (next != null)
			head.next = reverseingroups(next, k);

		return prev;
	}

	public void add(int new_data)
	{
		Node newnode=new Node(new_data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
	}

	void printList()
	{
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		ReverseInGroups llist = new ReverseInGroups();
		llist.add(1);
		llist.add(2);
		llist.add(3);
		llist.add(4);
		llist.add(5);
		llist.add(6);		

		System.out.println("Given Linked List");
		llist.printList();

		llist.head = llist.reverseingroups(llist.head, 3);
		System.out.println("Linked List Reversed in Groups ");
		llist.printList();
	}
}
