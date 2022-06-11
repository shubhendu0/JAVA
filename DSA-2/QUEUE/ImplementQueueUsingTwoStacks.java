package Queue;
// Java program to implement Queue using two stacks with costly enQueue()
import java.util.*;

class ImplementQueueUsingTwoStacks{
static class Queue
{
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();

	static void enQueue(int x)
	{		
		while (!s1.isEmpty()){  // Move all elements from s1 to s2
			s2.push(s1.pop());
		}
		
		s1.push(x); // Push item into s1
		
		while (!s2.isEmpty()){
			s1.push(s2.pop());  // Push everything back to s1
		}
	}

	// Dequeue an item from the queue
	static int deQueue()
	{		
		if (s1.isEmpty()){  // if first stack is empty
			System.out.println("Q is Empty");
			//System.exit(0);
		}		
		int x = s1.peek();
		s1.pop();
		return x;   // Return top of s1
	}

    static void display(){
        System.out.println(s1);
    }

    static int size(){
        return s1.size();
    }

    static int printFront(){
        return s1.peek();
    }
}

// Driver code
public static void main(String[] args)
{
	Queue q = new Queue();
	q.enQueue(1);
	q.enQueue(2);
	q.enQueue(3);
    q.display();

    System.out.println("Size of Queue " +q.size());
    System.out.println("Front of Queue " +q.printFront());
	System.out.println("Element Removed "+q.deQueue());
	System.out.println("Element Removed "+q.deQueue());
	q.display();
    System.out.println("Size of Queue " +q.size());
}
}