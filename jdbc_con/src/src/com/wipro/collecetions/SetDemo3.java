package com.wipro.collecetions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {
	public static void main(String[] args){
		HashSet<Integer> num=new HashSet<>();
		num.add(1);
		num.add(3);
		num.add(5);
		num.add(2);
		System.out.println("Hash set prints it in own order: "+ num);
		LinkedHashSet<Integer> num1=new LinkedHashSet<>();
		num1.add(1);
		num1.add(3);
		num1.add(5);
		num1.add(2);
		System.out.println("LinkedHash set prints it in insertion order: "+ num1);
		TreeSet<Integer> num2=new TreeSet<>();
		num2.add(1);
		num2.add(3);
		num2.add(5);
		num2.add(2);
		System.out.println("tree set prints it in ascending order: "+ num2);
		
	}

}
