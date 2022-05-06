package com.wipro.product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {
   
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		// List of Object (Product) 
		List<Product> productList=new ArrayList<Product>();
		for (int i = 0; i < 2; i++) {
			Product product=new Product();
			System.out.println("Enter Product Id");
			product.setId(Integer.parseInt(reader.readLine()));
			System.out.println("Enter Product Name");
			product.setName(reader.readLine());
			System.out.println("Enter Product Price");
			product.setPrice(Double.parseDouble(reader.readLine()));
			System.out.println("Enter Quantity");
			product.setQuantity(Integer.parseInt(reader.readLine()));
    		productList.add(product);
			
		}
        System.out.println("Product Details");
        for( Product product : productList) {
        	System.out.println(product.getId() +"--"+product.getName()+"--"+product.getPrice());
        }
		
	}
}
