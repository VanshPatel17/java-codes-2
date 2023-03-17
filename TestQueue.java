package com.taster;

import java.util.LinkedList;

public class TestQueue {
public static void main(String[] args) {
	
	
	LinkedList<Integer> queue=new  LinkedList<Integer>();
	
	queue.add(1);
	queue.add(2);
	queue.add(3);
	queue.add(4);
	queue.add(5);
	queue.add(6);
	
	queue.forEach(a->System.out.print(a+"  "));
	System.out.println("\n----------");
	System.out.println(queue.peek());
	System.out.println(queue.remove());
	System.out.println("------");
	queue.forEach(a->System.out.print(a+"  "));
	System.out.println(queue.remove());//2

	System.out.println(queue.remove());//3

	queue.forEach(a->System.out.print(a+"  "));

	
	
	
	
	
	
	
	
	
}
}
