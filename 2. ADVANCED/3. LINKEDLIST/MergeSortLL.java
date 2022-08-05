package Linkedlist;
// Java program to sort linkedList using Merge Sort

import java.util.*;
public class MergeSortLL {   
	node head = null;
	static class node {
		int val;
		node next;
		node(int val){
			this.val = val;
		}
	}

	node sortedMerge(node a, node b){
		node result = null;	
		if (a == null)
			return b;
		if (b == null)
			return a;
		if (a.val < b.val){
			result = a;
			result.next = sortedMerge(a.next, b);
		}
		else{
			result = b;
			result.next = sortedMerge(a, b.next);
		}	
		return result;
	}

	node mergeSort(node h){
		if (h == null || h.next == null)
			return h;
		node middle = getMiddle(h);
		node nextofmiddle = middle.next;
		middle.next = null;
		node left = mergeSort(h);
		node right = mergeSort(nextofmiddle);
		node sortedlist = sortedMerge(left, right);	
		return sortedlist;
	}

	node getMiddle(node head){
		if (head == null)
			return head;
		node slow = head, fast = head;
		while (fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}	
		return slow;
	}

	void add(int x){
        node newnode=new node(x);
        if(head==null){
            head=newnode;
            return;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
	void printList(node head){
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	public static void main(String[] args) {
		MergeSortLL li = new MergeSortLL();		
		li.add(1);
        li.add(5);
        li.add(7);
        li.add(2);		
		System.out.print("\nOriginal List: \n");
		li.printList(li.head);	

		li.head = li.mergeSort(li.head);	
		System.out.print("\nSorted List: \n");
		li.printList(li.head);
	}
}
