package com.Bridgelabz.linkedlistproblem;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println(" Welcome to LinkedList Program");
		
	    LinkedList linkedlist = new LinkedList();
	    
	    linkedlist.append(56);
		linkedlist.append(70);
	   
		linkedlist.show();
		System.out.println();
		
		linkedlist.insertAtMiddle(30, 2);
		linkedlist.show();
		System.out.println();
		
		//linkedlist.pop();
		linkedlist.popLast();
		linkedlist.show();
		System.out.println();
		
		System.out.println(linkedlist.search(30));
	}
}
