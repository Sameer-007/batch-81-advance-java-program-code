package com.wipro.product;

import java.util.List;

public interface ProductService {

	boolean addProductDetail(Product product);

	List<Product> getAllProductDetailList();
	
	Product searchProductById(int id);
	
	List<Product> getProductDetailByName(String name);

	// search
	// update
	// delete

}
