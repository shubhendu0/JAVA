package Queue;

class Queue {        
    static int front, rear, capacity;   
    static int queue[];   
     
    Queue(int size) {   
        front = rear = 0;   
        capacity = size;   
        queue = new int[capacity];   
    }   
          
    void queueEnqueue(int item)  {  
        if (capacity == rear) {   
            System.out.printf("\nQueue is full\n");   
            return;   
        }            
        else {      // insert element at the rear 
            queue[rear] = item;   
            rear++;   
        }   
        return;   
    }   
     
    
    void queueDequeue()  {    
        if (front == rear) {   
            System.out.printf("\nQueue is empty\n");   
            return;   
        }          
        else {    // shift elements to the right by one place uptil rear  
            for (int i = 0; i < rear - 1; i++) {   
                queue[i] = queue[i + 1];   
            }        
            if (rear < capacity)   
                queue[rear] = 0;   // set queue[rear] to 0              
            rear--;     
        }   
        return;   
    }   
     
    
    void queueDisplay()   {       
        if (front == rear) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }       
        // traverse front to rear and print elements   
        for (int i = front; i < rear; i++) {   
            System.out.printf("%d ", queue[i]);   
        }   
        return;   
    }   
     
     
    void queueFront()  {   // print front of queue  
        if (front == rear) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }   
        System.out.printf("\nFront Element of the queue: %d", queue[front]);   
        return;   
    }   
}   
   
class ImplementQueueUsingArray {  
    public static void main(String[] args) {     
        Queue q = new Queue(4);   
        q.queueEnqueue(10);   
        q.queueEnqueue(30);   
        q.queueEnqueue(50);   
        q.queueEnqueue(70);   
        System.out.println("Queue after Enqueue Operation:");  
        q.queueDisplay();   
        q.queueFront();                   
        q.queueEnqueue(90);      
        q.queueDisplay(); 
        q.queueDequeue();           
        System.out.printf("\nQueue after dequeue operation :");    
        q.queueDisplay();    
        q.queueFront();   
    }   
}  