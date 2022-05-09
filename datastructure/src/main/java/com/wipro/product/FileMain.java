package com.wipro.product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class FileMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ProductService service = new ProductServiceImpl();
		System.out.println("--- Product App Store----");
		do {
			System.out.println("Press \n1.Add Product\n2.List Product\n3.Search Product By Id\n4.List product by name");
			int choice = Integer.parseInt(reader.readLine());
			switch (choice) {
			case 1:
     			BufferedReader bufReader = new BufferedReader(new FileReader("product.csv"));
				String line = "";
				while ((line = bufReader.readLine()) != null) {
					Product product = new Product();
					System.out.println("--" + line);
					String[] split = line.split(",");
					product.setId(Integer.parseInt(split[0]));
					product.setName(split[1]);
					product.setPrice(Double.parseDouble(split[2]));
					product.setQuantity(Integer.parseInt(split[3]));
					boolean status = service.addProductDetail(product);
					if (status) {
						System.out.println("Product Added Succesfully");
					} else {
						System.out.println("Product Failed to Add");
					}

				}
				bufReader.close();
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
