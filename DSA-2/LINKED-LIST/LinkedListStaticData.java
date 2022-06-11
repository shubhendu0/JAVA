package Linkedlist;
import java.io.*;
import java.util.*;
// Node Class
class Node{
		String data;
		Node next;		
		// Constructor to create a new node
		Node(String d){
			this.data = d;
		}
	}
class LinkedListStaticData {	
    public static void main(String[] args){
		Node head=new Node("A");
		head.next=new Node("B");
		head.next.next=new Node("B");
		head.next.next.next=new Node("A");
			printlist(head);
		head=addatFirst(head,"First");
			printlist(head);
		addatLast(head,"Last.");
			printlist(head);
		delfromLast(head);
			printlist(head);
		head=delfromFirst(head);
			printlist(head);
    } 

	static void addatLast(Node head,String xx){
		Node temp=head;
		if(temp==null){
			head=new Node(xx);
		}
		else{
			while(temp.next!=null){				
				temp=temp.next;
			}
			temp.next=new Node(xx);
		}
	} 	

	static Node addatFirst(Node head,String xx){
		if(head==null){
			return new Node(xx);
		}
		else{
			Node temp=new Node(xx);
			temp.next=head;
			head=temp;
			return head;
		}
	} 

	static void delfromLast(Node head){		
		if(head==null){
			return ;
		}
		else{
			Node temp=head;
			while(temp.next.next!=null){			
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
	} 	

	static Node delfromFirst(Node head){
		if(head==null){
			return null ;
		}
			Node temp = head;
        	head = head.next; 
        	return head;		
	} 
		
	public static void printlist(Node head){
		while(head!=null){
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
}


