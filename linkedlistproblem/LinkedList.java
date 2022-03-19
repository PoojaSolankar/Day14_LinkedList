package com.Bridgelabz.linkedlistproblem;

public class LinkedList {
	
	Node head;
	Node tail;
	
	public void add(int i) {
		Node newNode = new Node(i);
		if(head == null) {
		head = newNode;
		tail = newNode;
		}
		else
		{
			head.next = newNode;
			tail = newNode;
			
		}
		
	//public void show() {
			
		
	}
}
