package Linkedlist;
// Java program to remove duplicates form a sorted single LL.
import java.io.*;
import java.util.*;

class RemoveDuplicatesFromSortedLL
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
	 void append(int new_data){
		Node new_node = new Node(new_data);
		if (head == null){
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = new_node;
		return;
	}
	public void printList(){
		Node curnode = head;
		while (curnode != null){
			System.out.print(curnode.data+"->");
			curnode = curnode.next;
		}
		System.out.println("null");
	}
    void removeDuplicates()
    {
        Node curr = head;
        while (curr != null) {
             Node temp = curr;
            /*Compare current node with the next node and keep on deleting
             them until it matches the current node data */
            while(temp!=null && temp.data==curr.data) {
                temp = temp.next;
            }
            /*Set current node next to the next different element denoted by temp*/
            curr.next = temp;
            curr = curr.next;
        }
    }
	public static void main(String [] args)
	{
		RemoveDuplicatesFromSortedLL llist = new RemoveDuplicatesFromSortedLL();	
		llist.append(1); 
        llist.append(1); 
		llist.append(2);
		llist.append(3);
		llist.append(4); 	
        llist.append(4);	
		llist.printList();
		llist.removeDuplicates();
        llist.printList();		
	}
}