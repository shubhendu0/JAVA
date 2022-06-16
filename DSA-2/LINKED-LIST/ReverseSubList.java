package Linkedlist;

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
        
        ListNode start = temp;      //  current in loop  ...    start : 2
        ListNode end = null;        //  previous of current in loop
        
        for(int i=0; i<=right-left && temp!=null; i++)
        {
            ListNode next=temp.next;
            temp.next=end;
            end=temp;
            temp=next;
        }                   //  start: 2 -> 4  end: null -> 2     //   2 <- 3 <- 4
        
        if(start!=null)     //  if there are more than 2 nodes 
        {
            start.next=temp;    //  2 -> 5
            if(prev!=null)
                prev.next=end;      //  1 -> 4
            else
                head=end;     //  head=2 if next value is null i.e only two nodes
        }
        
        return head;        // 1 -> 4 -> 3 -> 2 -> 5
    }
}
