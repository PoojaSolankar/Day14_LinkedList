package com.Bridgelabz.linkedlistproblem;

public class LinkedList {
	
	Node head;
	Node tail;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
		head = newNode;
		tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}
	}	
	
	public void append( int data) {
		
		Node newNode = new Node(data);
		if(head == null) {
		head = newNode;
		tail = newNode;
		}
		else {
		    tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void insertAtMiddle(int data, int position) {
		Node temp;
		int i;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
				newNode.data = data; 
		        newNode.next = null;
		        temp = head;

		        for(i=2; i<=position-1; i++)
		        {
		            temp = temp.next;

		            if(temp == null)
		                break;
		        }

		        if(temp != null) {
		            newNode.next = temp.next; 
		            temp.next = newNode;
		            System.out.println("DATA INSERTED SUCCESSFULLY\n");
		        }
		        else {
		            System.out.println("UNABLE TO INSERT DATA AT THE GIVEN POSITION\n");
		        }
			}
		}
	
	public void pop() {
			Node temp;

		    if(head == null)
		    {
		        System.out.println("List is already empty.");
		    }
		    else
		    {
		    	temp = head;
		        head = head.next;

		        System.out.println("\nData deleted " +temp.data);
		        System.out.println("SUCCESSFULLY DELETED FIRST NODE FROM LIST\n");
		    }
	}
	
	public void show() {
		Node temp = head;
		while (temp != null) {
		System.out.print(temp.data + " -->");
		temp = temp.next;
		}
	}
}
