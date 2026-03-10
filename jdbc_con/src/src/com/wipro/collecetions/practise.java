package com.wipro.collecetions;

import java.util.ArrayList;
import java.util.Collections;

public class practise {
	public static void main(String[] args){
		ArrayList<String> a=new ArrayList<>();
		a.add("rohan");
		a.add("anil");
		a.add("mahesh");
		a.add("suraj");
		a.add("ankit");
		ArrayList<String> b=new ArrayList<>();
		b.add("rohit");
		b.add("anil");
		b.add("rohan");
		b.add("kumar");
        b.removeAll(a);
        a.addAll(b);
        Collections.sort(a);
      
       System.out.println(a);
       
	}

}
