package com.wipro.exception;

 class ThrowDemo {
	void account(int age){
		if (age>18){
			System.out.println("you can vote");
		}
		else{
			throw new  ArithmeticException("you cannotvote");
		}
	}
}
 public class Exception1{
	public static void main(String[] args){
		ThrowDemo e=new ThrowDemo();
		e.account(19);
		
	}
}
