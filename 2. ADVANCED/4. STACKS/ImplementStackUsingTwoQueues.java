package Stack;
/* Java Program to implement a stack using two queue */

import java.util.*;
class ImplementStackUsingTwoQueues  {

	static class Stack {
		// Two inbuilt queues
		static Queue<Integer> q1 = new LinkedList<Integer>();
		static Queue<Integer> q2 = new LinkedList<Integer>();		
		static int curr_size; // To maintain current number of elements

		void push(int x){
			curr_size++;					
			while (!q1.isEmpty()) {	// Push all the remaining elements in q1 to q2.
				q2.add(q1.poll());
			}	
			q1.add(x);		
			while (!q2.isEmpty()) {	// Push all the remaining elements in q1 to q2.
				q1.add(q2.poll());
			}
		}

		static int pop(){		
			if (q1.isEmpty()) // if no elements are there in q1
				return -1;
			curr_size--;
			return q1.remove();			
		}

		static int top(){
			if (q1.isEmpty())
				return -1;
			return q1.peek();
		}

		static int size(){
			return curr_size;
		}

		void display(){
            System.out.println(q1);             
        }

		void display2(){
            if (q1.isEmpty())
				return;
            while(q1.size()>0){
                System.out.print(q1.peek()+" "); 
                q1.remove();  
            }
        }
	}

	public static void main(String[] args)
	{
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
        s.push(4);
       
		// System.out.println(s);
		s.display();
        System.out.println("current size : " + s.size());
		System.out.println("Peek element :"+ s.top());
		System.out.println("Removed element :" + s.pop());
		System.out.println("Peek element :"+ s.top());
		System.out.println("current size : " + s.size());
		s.display();
	
	}
}