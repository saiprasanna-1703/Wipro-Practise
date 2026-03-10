package com.wipro.collecetions;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args){
		Vector<String> vec=new Vector<>();
		System.out.println("size of vector before adding "+ vec.size());
		vec.add("ram");
		vec.add("sita");
		vec.add("radha");
		vec.add("krishna");
		System.out.println("size of vector after adding "+vec.size());
		System.out.println("elements are : "+ vec);
		System.out.println("first element: "+ vec.firstElement());
		System.out.println("last element: " +vec.lastElement());
		
	}

}
