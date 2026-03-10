package com.wipro.collecetions;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args){
		Stack<String> names=new Stack<>();
		names.add("google");
		names.add("chrome");
		names.add("you tube");
		names.add("instagram");
		System.out.println(names.peek());
		System.out.println("remove element: "+ names.pop());
		System.out.println(names.push("firefox"));
		System.out.println(names.peek());
	    System.out.println(names.lastElement());
	    System.out.println("elements are: "+ names);
		
	}

}
