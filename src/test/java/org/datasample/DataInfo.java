package org.datasample;

import org.testng.annotations.DataProvider;

public class DataInfo {

	
	@DataProvider(name="flipkart")
	public Object[][] data() {
		

		Object[][] obj = { { "8056079536", "987654321" ,"HpLaptop","Iphone"} };

		return obj;

	}

}
