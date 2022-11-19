package com.test;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

	public static void main(String[] args) throws Exception {
		
		
		
		String str="I phone";
		
		List<String> li=new ArrayList<>();
		
		li.add("Samsung");
		li.add("Vivo");
		li.add("Oppo");
		li.add("Honor");
		
		if (li.contains(str)) {
			System.out.println("Product Found");
			
		} else {
			
			throw new ProductNotFoundException();

		}

		
		
		li.add("Samsung");
		li.add("Vivo");
		li.add("Oppo");
		li.add("Honor");
		
		if (li.contains(str)) {
			System.out.println("Product Found");
			
		} else {
			
			throw new ProductNotFoundException();

		}
		
		
		
		

	}

}
