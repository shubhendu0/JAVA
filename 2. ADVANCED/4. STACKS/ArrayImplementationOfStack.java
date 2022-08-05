package Stack;

class ArrayImplementationOfStack {
    int size=5;
    int a[]=new int[size];
    int top=-1;
    public static void main(String[] args){
        ArrayImplementationOfStack ll=new ArrayImplementationOfStack();       
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);
        ll.display();
        ll.top();
        ll.pop();
        ll.display();
        ll.top();
    }
    
    void push(int x){
        top++;
        if(top<size){
            a[top]=x;
        }
        else{
            System.out.println("Stack overflow");
            top--;
        }
    }
   
    void pop(){    
       if(top>=0){
           top--;
           size--;
        }
        else{
            System.out.println("Stack underflow");
        }
    }

    void top(){
        if(top>=0){
            System.out.println(a[top]);
        }
        else
        System.out.println("Empty stack");
    }

    void display(){
        for(int i=0;i<size;i++)
            System.out.print(a[i]+" ");
        System.out.println();    
    }
}
