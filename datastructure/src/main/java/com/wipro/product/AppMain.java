package com.wipro.product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AppMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ProductService service = new ProductServiceImpl();
		System.out.println("--- Product App Store----");
		do {
			System.out.println("Press \n1.Add Product\n2.List Product\n3.Search Product By Id\n4.List product by name");
			int choice = Integer.parseInt(reader.readLine());
			switch (choice) {
			case 1:
				Product product = new Product();
				System.out.println("Enter Product Id");
				product.setId(Integer.parseInt(reader.readLine()));
				System.out.println("Enter Product Name");
				product.setName(reader.readLine());
				System.out.println("Enter Product Price");
				product.setPrice(Double.parseDouble(reader.readLine()));
				System.out.println("Enter Quantity");
				product.setQuantity(Integer.parseInt(reader.readLine()));
				boolean status = service.addProductDetail(product);
				if (status) {
					System.out.println("Product Added Succesfully");
				} else {
					System.out.println("Product Failed to Add");
				}
				break;
			case 2:
				List<Product> list = service.getAllProductDetailList();
				if (list.isEmpty()) {
					System.out.println("List is Empty");
				} else {
					System.out.println("List of Products");
					for (Product prod : list) {
						System.out.println(prod.getId() + "--" + prod.getName());
					}
				}
				break;

			case 3:
				System.out.println("Enter the Product Id to Search");
				int key = Integer.parseInt(reader.readLine());

				Product prod = service.searchProductById(key);
				if (prod == null) {
					System.out.println("Product Id " + key + " is not found");

				} else {
					System.out.println(
							prod.getId() + "--" + prod.getName() + "--" + prod.getPrice() + "--" + prod.getQuantity());
				}
				break;

			case 4:
				System.out.println("Enter Product Name to search");
				String pname = reader.readLine();
				List<Product> byNameList = service.getProductDetailByName(pname);
				if (byNameList.isEmpty()) {
					System.out.println("List is empty");
				} else {
					for (Product prod1 : byNameList) {
						System.out.println(prod1.getId() + "--" + prod1.getName() + "--" + prod1.getPrice() + "--"
								+ prod1.getQuantity());
					}
				}
				break;
			default:
				System.out.println("Thank you");
				System.exit(0);
				break;
			}
		} while (true);

	}

}
