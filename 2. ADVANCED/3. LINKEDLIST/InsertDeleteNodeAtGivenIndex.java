package Linkedlist;
import java.io.*;
import java.util.*;
public class InsertDeleteNodeAtGivenIndex {
    Node head;
	class Node {
		int data;
		Node next;
		Node(int d){
			this.data = d;
			next = null;
		}
	}
    void printList( ){
        Node temp=head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
        System.out.println();
	}
    void add(int x){
        Node newnode=new Node(x);
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
    Node InsertNth(  int data, int position ) {
        Node newNode = new Node(data);
        newNode.next = null;    
        if (head == null) {
            return newNode;
        }
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node prev = null;
        Node current = head;
        int i = 1;
        while (current !=null && i < position) {
            prev = current;
            current = current.next;
            i++;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        return head;
    }

    void deleteNthNode( int position ){		
		if (head == null)
            return;       
        Node temp = head;      
        if (position == 0) {	 	
            head = temp.next; 	
            return;
        }        
        for (int i = 1; temp != null && i < position- 1;i++)
            temp = temp.next;       
        if (temp == null || temp.next == null)  // If position is more than number of nodes
            return; 
        temp.next= temp.next.next;   // Unlink the node to be deleted from list
    }  
    
    public static void main(String[] args){
		InsertDeleteNodeAtGivenIndex list= new InsertDeleteNodeAtGivenIndex();
		list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
		    list.printList();
		list.head = list.InsertNth(100,3);
		    list.printList();
        list.deleteNthNode(3);
            list.printList();
	}
}
