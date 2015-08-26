package com.testritegroup.learning;

public class Tax {
	//取得未稅的價錢
	public int caltax(int totaltxprice){
		double tax = 1.05;
		int totalprice = (int) Math.round(totaltxprice / tax);
		return totalprice;
		
	}

}
