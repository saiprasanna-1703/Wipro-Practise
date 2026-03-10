package com.wipro.productservice;

import java.util.Collection;
import java.util.Map;

import com.wipro.product.Product;
import com.wipro.productexception.InsufficientBalanceException;

public class ProductService {
	
		public void addAccount(Map<Integer, Product> accounts,Product newproduct) {
			accounts.put(newproduct.getAccountnum(),newproduct);
			System.out.println("Acoount createds successfully");
			
		}
		public void displayAccounts(Map<Integer,Product> accounts) {
			accounts.values()
			.forEach(System.out::println);
			
			
		}
		public void deposit(Map<Integer,Product> accounts,int accNo,int ammount) {
			if(!accounts.containsKey(accNo)) {
				System.out.println("account not found");
				return;
			}
			Product account=accounts.get(accNo);
			account.setMoney(account.getMoney()+ammount);
			System.out.println("Deposit successful");
			System.out.println("Name: "+ account.getName()+"Amount: "+ ammount);
			
			
		}
		public void withdraw(Map<Integer,Product> accounts,int accNo,int amount) throws InsufficientBalanceException {
			if(!accounts.containsKey(accNo)) {
				System.out.println("account not found");
				return;
			}
	
			if(amount<=0) {
				System.out.println("Invalid withdrawl amount");
				return;
			}
			Product account=accounts.get(accNo);
			if(amount>account.getMoney()) {
				throw new InsufficientBalanceException("Withdrawl failed:");
			}
			System.out.println("Withdrawl succesfull");
			
		}
		
	

}
