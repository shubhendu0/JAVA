package Linkedlist;
// Java program to remove duplicates from unsorted single LL.
import java.io.*;
import java.util.*;

class RemoveDuplicatesFromUnsortedLL
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

    void removeDuplicates(){
        Node ptr1 = head, ptr2 = null;       
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1; 
            /* Compare the picked element with rest of the elements */
            while (ptr2.next != null) {             
                if (ptr1.data == ptr2.next.data)  /* If duplicate then delete it */                    
                    ptr2.next = ptr2.next.next;                
                else 
                    ptr2 = ptr2.next;               
            }
            ptr1 = ptr1.next;
        }
    }
	public static void main(String [] args)
	{
		RemoveDuplicatesFromUnsortedLL llist = new RemoveDuplicatesFromUnsortedLL();	
		llist.append(1); //first data
        llist.append(1); 
		llist.append(2);
		llist.append(3);
		llist.append(1); 	
        llist.append(4);	
		llist.printList();
		llist.removeDuplicates();
        llist.printList();		
	}
}