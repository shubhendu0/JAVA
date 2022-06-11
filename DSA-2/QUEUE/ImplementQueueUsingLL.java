package Queue;
// Java program for linked-list implementation of queue

class ImplementQueueUsingLL {
	class QNode {
		int key;
		QNode next;
		QNode(int key){
			this.key = key;
			this.next = null;
		}
	}
    QNode front, rear; //front stores the front node and rear stores the last node of LL
	
	void enqueue(int key){		
		QNode temp = new QNode(key); 		
		if (rear == null) { // If queue is empty, then new node is front and rear both
			front = rear = temp;
			return;
		}		
		rear.next = temp; // Add the new node at the end of queue and change rear
		rear = temp;
	}

	void dequeue() {		
		if (front == null)
			return;		
		front = front.next;		
		if (front == null) // If front becomes NULL, then change rear also as NULL
			rear = null;
	}

	void display(){
		QNode temp=front;
		while(temp!=null){
			System.out.print(temp.key+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args){
		ImplementQueueUsingLL q = new ImplementQueueUsingLL();
		q.enqueue(10);
		q.enqueue(20);       
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.display();
		System.out.println("Queue Front : " + q.front.key);
		System.out.println("Queue Rear : " + q.rear.key);
		q.dequeue();
		q.display();
		System.out.println("Queue Front : " + q.front.key);
		System.out.println("Queue Rear : " + q.rear.key);
	}
}