package com.wipro.pms;

import java.io.IOException;
import java.io.PrintWriter;

import com.wipro.dao.*;
import com.wipro.pogo.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ProductServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		IProductDao dao= new ProductDaoImp();
		int pid=Integer.parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
		double price=Double.parseDouble(request.getParameter("price"));
		Product p=new Product();
	    p.setPid(pid);
	    p.setPname(pname);
	    p.setPrice(price);
	    int count=dao.addProduct(p);
	    out.print(count+ " record added to product db");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		
		
	}

}
