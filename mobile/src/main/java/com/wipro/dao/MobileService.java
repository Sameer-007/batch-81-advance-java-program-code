package com.wipro.dao;


import java.io.IOException;
import java.util.List;

import com.wipro.model.Mobile;

public interface MobileService {

	List<Mobile> readDataFromCsv(String fileName) throws IOException;

	List<Mobile> listMobileDetails();

	List<Mobile> listMobileBySortedOrder();

	List<Mobile> getMobileDetailByBrandName(String brandName);

}
