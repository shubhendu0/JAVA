package Stack;
// Java program to Implement a stack using singly linked list
import java.util.*;


class ImplementStackUsingLL {
	Node top;
	class Node {
		int data; 
		Node link; 
	}
		
    void push(int x)	{ 		
		Node temp = new Node();	
		temp.data = x;   		
		temp.link = top;  	
		top = temp;  
	}

	int peek(){
		if (top!=null) 
			return top.data;
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	void pop(){      		
		if (top == null) {  
			System.out.print("\nStack Underflow");
			return;
		}
		top = top.link; 
	}

	void display(){
		if (top == null) 	
			System.out.println("Stack Underflow");
		else 
            {
			Node temp = top;
			while (temp != null) {				
				System.out.print( temp.data+ " "); 				
				temp = temp.link; 
			}
            System.out.println();
		}       
	}
	public static void main(String[] args){
		ImplementStackUsingLL obj = new ImplementStackUsingLL();
		obj.push(11);
		obj.push(22);
		obj.push(33);
		obj.push(44);
		obj.display();
		System.out.println("Top element is "+obj.peek());
		obj.pop();
		obj.display();
		System.out.println("Top element is "+obj.peek());
	}
}
