package com.wipro.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.wipro.model.Mobile;
import com.wipro.model.MobileStringComparator;

public class MobileServiceImpl implements MobileService{
	
	List<Mobile> mobileList=new ArrayList<Mobile>();
	public List<Mobile> readDataFromCsv(String fileName) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String heading = reader.readLine();
		System.out.println(heading);
		String line = "";
		while ((line = reader.readLine()) != null) {
			String[] split = line.split(",");
			Mobile mobile = new Mobile();
			mobile.setModelName(split[0]);
			mobile.setBrandName(split[1]);
			mobile.setCost(Double.parseDouble(split[2]));
			mobile.setScreenSize(split[3]);
			mobile.setBatteryLife(split[4]);
			mobile.setStorageSpace(split[5]);
			mobile.setCameraPixels(Integer.parseInt(split[6]));
			mobileList.add(mobile);
		}
		reader.close();
		return mobileList;
	}
	public List<Mobile> listMobileDetails() {
		return mobileList;
	}
	public List<Mobile> listMobileBySortedOrder() {
		List<Mobile> list = mobileList;
		list.sort(new MobileStringComparator());
		return list;
	}
	public List<Mobile> getMobileDetailByBrandName(String brandName) {
		return null;
	}

}
