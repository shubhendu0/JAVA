package Linkedlist;
// Java program for reversing the linked list
import java.io.*;
import java.util.*;
class ReverseLL {
	static Node head;
	static class Node {
		String data;
		Node next;
		Node(String d){
			data = d;
			next = null;
		}
	}
	
	static void append(String new_data){
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

	static void printList(Node head){
		while (head != null) { 
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	static Node reverse(Node node){
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}			
	public static void main(String[] args){

		append("a");  
		append("b");
		append("c");
		append("d");  
			printList(head);
			System.out.println();
		head=reverse(head);
			printList(head);
	}
}
