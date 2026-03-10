package com.wipro.client;

import java.util.HashMap;
import java.util.Map;

import com.wipro.product.Product;
import com.wipro.productexception.InsufficientBalanceException;
import com.wipro.productservice.ProductService;

public class ClientApp {
	public static void main(String[] args) {
		Map<Integer, Product> accounts =new HashMap<>();
		ProductService bankService=new ProductService();
		Product acc1=new Product(121,"sai",50000);
		Product acc2=new Product(122,"ram",75000);
		bankService.addAccount(accounts, acc1);
		bankService.addAccount(accounts, acc2);
		bankService.deposit(accounts,122,60000);
		try {
			bankService.withdraw(accounts,102,4000);
			}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("All Accounts");
		bankService.displayAccounts(accounts);
		
		
		
		
		
	}

}
