package com.wipro.product;

import java.util.ArrayList;
import java.util.List;

// Business Logic in service class
public class ProductServiceImpl implements ProductService {

	static List<Product> productList = new ArrayList<Product>();

	public boolean addProductDetail(Product product) {
		boolean add = productList.add(product);
		return add;
	}

	public List<Product> getAllProductDetailList() {

		return productList;
	}

	public Product searchProductById(int id) {
		for (Product product : productList) {
			if (id == product.getId()) {
				return product;
			}
		}
		return null;
	}

	public List<Product> getProductDetailByName(String name) {
		List<Product> list = new ArrayList<Product>();
		for (Product product : productList) {
			if (name.equals(product.getName())) {
				list.add(product);
			}
		}

		return list;
	}

}
