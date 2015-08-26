package com.testritegroup.learning;

public class ECException extends Exception {
	private String category;
	private String message;
	private String erorCode;
	public ECException(String errorCode,String category,String message){
		super(message);
		this.erorCode=errorCode;
		this.category=category;
		this.message=message;
	}
	public String getECExceptionMessage(){
		return "("+ erorCode +")"+" Category"+category+" Message"+message;
	}
}
