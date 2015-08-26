package com.testritegroup.learning;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Goods> shippinggoods = new ArrayList<Goods>();
		
	    Goods sofa = new Sofa();
	    shippinggoods.add(sofa);
	    Goods coversset = new Coversset();
	    shippinggoods.add(coversset);
        
	    int no = 1;
    	Tax tax = new Tax();
    	Discount discount = new Discount();
    	int summoney = 0;
	    for(Goods good:shippinggoods){
	    	System.out.println(no+" "+good.getSku());
	    	//取得未稅售價
            int price = tax.caltax(good.getTxprice());
            int totalmoney = price * good.getPieces(); //未稅
            int totaldiscount = discount.calDiscount(totalmoney, good.getDcount()); //未稅折扣
            int paymoney = totalmoney - totaldiscount; //未稅實付
            int taxpaymoney = good.getTxprice()*good.getPieces() - discount.calDiscount(good.getTxprice()*good.getPieces(), good.getDcount()); //含稅實付
            int totaltax = taxpaymoney - paymoney;
	    	System.out.println(good.getGoodsname()+" x"+good.getPieces()+" 單價:"+price+" 數量:"+good.getPieces());
	    	System.out.println("     折扣: "+ good.getDcount() + "折    -"+ totaldiscount);
	    	System.out.println("                  稅: "+ totaltax);
	    	System.out.println("                 運費: "+ good.getFreight());
	    	System.out.println("               小計: "+ (totalmoney+totaltax+good.getFreight()-totaldiscount));
	    	summoney += (totalmoney+totaltax+good.getFreight()-totaldiscount);
	    	no++;
	    }
	    System.out.println("                                ");
	    System.out.println("--------------------------------");
	    System.out.println("               合計: "+ summoney);
		
	}

}
