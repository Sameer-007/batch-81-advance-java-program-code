package com.wipro.model;

import java.util.Comparator;

public class MobileStringComparator implements Comparator<Mobile> {

	public int compare(Mobile mobOne, Mobile mobTwo) {

		return mobOne.getBrandName().compareTo(mobTwo.getBrandName());
		// return mobTwo.getBrandName().compareTo(mobOne.getBrandName());
		//return (int)(mobTwo.getCost() - mobOne.getCost());
		//return (int)(mobOne.getCost() - moTwo.getCost());
	}

}
