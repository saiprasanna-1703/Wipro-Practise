package com.wipro.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practise {
	public static void main(String[] args){
		Scanner a=new Scanner(System.in);
		try{
			System.out.println("enter the numbers");
			int num1=a.nextInt();
			int num2=a.nextInt();
			int num=num1/num2;
			System.out.println(num);
		}
		catch(ArithmeticException e){
			System.out.println("seccond number cannot be zero");
		}
		catch(InputMismatchException e1){
			System.out.println("input cannot be alphabets enter the numbers");
		}
	}

}
