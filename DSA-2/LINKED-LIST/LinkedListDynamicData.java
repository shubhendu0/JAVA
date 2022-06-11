package Linkedlist;

import java.io.*;
import java.util.*;
class Node
	{
		String data;
		Node next;		
		Node(String d)
		{
			this.data = d;
		}
	}

class LinkedListDynamicData  {	
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null;
        Node temp=null;
        for(int i=0;i<n;i++){
            String x=sc.next();
            if(head==null){
                head=new Node(x);
                temp=head;
            }else{
                temp.next=new Node(x);
                temp=temp.next;
            }           
        }
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
			Node prev=null;
			while(temp.next!=null){	
				prev=temp;			
				temp=temp.next;
			}
			prev.next=null;
		}
	} 	

	static Node delfromFirst(Node head){
		if(head==null){
			return null ;
		}
        	head = head.next; 
        	return head;		
	} 
    		
	public static void printlist(Node head){
		while(head==null){
			return;
		}
		while(head!=null){
			System.out.print(head.data+" ");
			head=head.next;
		}
        System.out.println();
	}
}