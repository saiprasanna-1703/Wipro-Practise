package com.wipro.iterators;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
	public static void main(String[] args){
		ArrayList<Integer> iter=new ArrayList<>();
		iter.add(1);
	    iter.add(2);
	    iter.add(3);
	    iter.add(4);
	    iter.add(5);
	    ListIterator<Integer> iter1=iter.listIterator();
	    System.out.println("-------forward direction---------");
	    while(iter1.hasNext()){
	    	System.out.println(iter1.next());
	    }
	    System.out.println("--------backward direction---------");
	    while(iter1.hasPrevious()){
	    	System.out.println(iter1.previous());
	    }
	  
	}
}
