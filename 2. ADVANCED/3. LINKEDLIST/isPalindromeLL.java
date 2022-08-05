package Linkedlist;
// Java program to check if linked list is palindrome using Stack.
import java.util.*;

class isPalindromeLL{
    static Node head;
    static class Node {
		int data;
		Node next;
        Node(int data){
            this.data=data;
        }
	}
	public static void main(String args[]){
		add(1);
        add(2);
        add(1);
        add(1);		
		boolean condition = isPalindrome();
		System.out.println("isPalidrome : " + condition);
	}

    static void add(int xx){
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

	static boolean isPalindrome(){
		Node slow = head;
		boolean ispalin = true;

		Stack<Integer> stack = new Stack<Integer>();

		while (slow != null){
			stack.push(slow.data);
			slow = slow.next;
		}

		while (head != null){
			int i = stack.pop();
			if (head.data == i){
				ispalin = true;
			}
			else{
				ispalin = false;
				break;
			}
			head = head.next;
		}
		return ispalin;
	}
}
