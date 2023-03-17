package com.code;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {


		Stack<String> stack=new Stack<String>();
		stack.push("Ram1");
		stack.push("Ram2");
		stack.push("Ram3");
		stack.push("Ram4");
		stack.push("Ram5");
		
		for(String s:stack)
		{
			System.out.print(s+"   ");
		}
		System.out.println("\n Top Element:"+stack.pop());//remove element from stack
		for(String s:stack)
		{
			System.out.println(s);
		}
		
		System.out.println("----->"+stack.peek());//Looks at the object at the top of this stack without removing itfrom the stack.
		for(String s:stack)
		{
			System.out.println(s);
		}
		System.out.println(stack.contains("Ram1"));
		
	
	
	}

}
