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
	
	public void insertAfterThirty(int data, int position) {
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
	public void popLast() {
		Node temp = head;
		
		while(temp.next.next!=null){
			  temp = temp.next;
			}
			temp.next = null;
	       // System.out.println("\nData deleted " +temp.data);
	        System.out.println("SUCCESSFULLY DELETED LAST NODE FROM LIST\n");
	    }

	boolean searchDelete(int key)
	{
		boolean isFound = false;
    	if(head == null) {
			System.out.println("List is Empty!!");
		}
    	
    	if(head.data == key) {
    		head = head.next;
    		return true;
    	}
    	
		Node currentNode = head;
		Node previousNode = null;
		while(currentNode !=null) {
			if(currentNode.data == key) {
				isFound = true;
				break;
			}
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		if(currentNode == null) {
			return isFound;
		}
		currentNode = previousNode.next;
		previousNode.next = currentNode.next;
		currentNode.next = null;
		System.out.println("Data Is Deleted Sucessfully...");
		return isFound;
		
	   }
	
	public void show() {
		Node temp = head;
		while (temp != null) {
		System.out.print(temp.data + " -->");
		temp = temp.next;
		}
	}
	
	boolean search(int key)
	{
	    Node curNode = head;
	    while (curNode != null)
	    {
	    	if(curNode.data == key) 
	    		return true;
	        	curNode = curNode.next;
	    }
	    		return false;
	    }
	
}
	


