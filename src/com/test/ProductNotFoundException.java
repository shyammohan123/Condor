package com.test;

public class ProductNotFoundException extends Exception {
	
	public String getMessage(){
		String msg="Product Not Found";
		return msg;
	}

}
