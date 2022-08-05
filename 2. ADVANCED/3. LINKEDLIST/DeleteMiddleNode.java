package Linkedlist;
//Java Program to delete middle node from a single LL.
import java.io.*;
import java.util.*;

class Node{
		String data;
		Node next;		
		Node(String d){
			this.data = d;
		}
	}

public class DeleteMiddleNode{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Node head=null,temp=null;
        for(int i=0;i<n;i++){
            String x=s.next();
            if(head==null){
                head=new Node(x);
                temp=head;
            }
            else{
                temp.next=new Node(x);
                temp=temp.next;
            }
        }
        head=deleteMiddleNode(head);
		printlist(head);    
    }
 
    public static Node deleteMiddleNode(Node head) {
        if (head == null || head.next == null)
            return head;
        
        int cnt=0;  // Find the count of nodes
        Node count=head;
        while(count!=null){
            cnt++;
            count=count.next;
        } 

        Node temp=head;
        int i=1;       
        cnt=cnt/2;
        while(i!=cnt){      // Find the middle node
            temp=temp.next;
            i++;
        }        
        temp.next = temp.next.next;     // Delete the middle node
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