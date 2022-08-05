package Linkedlist;
import java.io.*;
import java.util.*;
// Java program to find middle of linked list
class MiddleNode
{
	Node head; 
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	void printMiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		int c=0;		
		while(fast_ptr != null && fast_ptr.next.next != null) { 	
			fast_ptr = fast_ptr.next.next; 
			slow_ptr = slow_ptr.next; //when fast_ptr reaches null then slow_ptr will be at middle
			c++;  
		}
		if(c%2==0){
			System.out.println("Middle element is " +slow_ptr.data);
		}
		else{
			System.out.println("1st middle element is " +slow_ptr.data);
			System.out.println("2nd middle element is " +slow_ptr.next.data);			
		}	
	}
	
	 void append(int new_data){
		Node new_node = new Node(new_data);
		if (head == null){
			head = new Node(new_data);
			return;
		}
		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = new_node;
		return;
	}

	public void printList(){
		Node curnode = head;
		while (curnode != null){
			System.out.print(curnode.data+" ");
			curnode = curnode.next;
		}
		System.out.println("");
	}
	public static void main(String [] args)
	{
		MiddleNode llist = new MiddleNode();	
		llist.append(1);  
		llist.append(2);
		llist.append(3);
		llist.append(4); 		
		llist.printList();
		llist.printMiddle();		
	}
}