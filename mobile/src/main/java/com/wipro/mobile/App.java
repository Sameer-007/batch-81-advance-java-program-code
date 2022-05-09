package com.wipro.mobile;

import java.io.IOException;
import java.util.List;

import com.wipro.dao.MobileServiceImpl;
import com.wipro.model.Mobile;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		MobileServiceImpl serviceImpl = new MobileServiceImpl();

		List<Mobile> mobileList = serviceImpl.readDataFromCsv("mobile.csv");
		for (Mobile mobile : mobileList) {
			System.out.println(mobile);
		}
		System.out.println("---- List of Mobile Details ---- ");
		List<Mobile> listMobileDetails = serviceImpl.listMobileDetails();
		for (Mobile mobile : listMobileDetails) {
			System.out.println(mobile);

		}
		System.out.println("---- List of Mobile Details Brand Name Sorted Order ---- ");
		List<Mobile> sortedOrder = serviceImpl.listMobileBySortedOrder();
		for (Mobile mobile : sortedOrder) {
			System.out.println(mobile);
		}

	}
}
