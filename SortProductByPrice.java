package com.code;

import java.util.Comparator;

public class SortProductByPrice implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
	 if(p1.getPrice()<p2.getPrice())
		 return -1;
	 else if(p1.getPrice()>p2.getPrice())
		 return 1;
	 else
		 return 0;
		
		
		 
	}

}
