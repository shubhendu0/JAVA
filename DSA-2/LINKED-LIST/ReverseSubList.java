package Linkedlist;
// Java Program to reverse the nodes from index A to index B.

class ReverseSubList 
{
    static class ListNode
    {
        int x;
        ListNode next;
        ListNode(int x){
            this.x =x;
        }
    }
    static ListNode head;
    public static void main(String[] args)
    {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);
        add(7);
        display(head);
        head=reverseBetween(head,2,5);
        display(head);

    }
    static void display(ListNode head)
    {
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.x +" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static void add(int data)
    {
        ListNode newnode=new ListNode(data);
        if(head==null){
            head=newnode;
            return;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    static ListNode reverseBetween(ListNode head, int left, int right) 
    {
        if(left>=right || head.next==null ){
            return head;
        }
        
        ListNode prev = null;
        ListNode temp = head;
        
        for (int i=1; temp!=null && i<left; i++)
        {
            prev = temp;
            temp = temp.next;
        }                           //  prev: null -> 1     temp: 1 -> 2
        
        ListNode start = temp;      //  current   ...    start : 2
        ListNode end = null;        //  previous of current 
        
        for(int i=0; i<=right-left && temp!=null; i++)
        {
            ListNode next=temp.next;
            temp.next=end;
            end=temp;
            temp=next;
        }                   //  4 -> 3 -> 2
        
        if(start!=null)     //  if there is/are nodes after right index 
        {
            start.next=temp;     //  2 -> 5
            if(prev!=null)        
                prev.next=end;      //  1 -> 4 , if there is/are nodes before left index 
            else
                head=end;     //  head=4 , if there is no node before left index 
        }
        
        return head;        // 1 -> 4 -> 3 -> 2 -> 5
    }
}

