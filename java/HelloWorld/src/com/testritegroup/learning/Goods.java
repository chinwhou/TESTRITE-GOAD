package com.testritegroup.learning;

public class Goods {

	private String goodsname;
	private String sku;
	private int txprice;    //含稅價格
	private int freight;  //運費
	private int pieces;   //數量
	private double dcount; //設定折數

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public int getFreight() {
		return freight;
	}

	public void setFreight(int freight) {
		this.freight = freight;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	public int getTxprice() {
		return txprice;
	}

	public void setTxprice(int txprice) {
		this.txprice = txprice;
	}

	public double getDcount() {
		return dcount;
	}

	public void setDcount(double dcount) {
		this.dcount = dcount;
	}

}
