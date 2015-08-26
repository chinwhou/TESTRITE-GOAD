package com.testritegroup.learning;

public class Discount {
	//取得未稅的價錢
	public int calDiscount(int price,double count){
		int discount = (int) Math.round(price * (1-count));
		return discount;
		
	}
}
