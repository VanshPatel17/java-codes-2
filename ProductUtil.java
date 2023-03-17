package com.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.code.Category;
import com.code.Product;

public class ProductUtil {

	public static HashMap<String, Product> getAllProducts()
	{
		
		HashMap<String, Product> prds=new HashMap<String, Product>();
		//isEmpty=true
		
		System.out.println(prds.put("prd101", new Product("prd101", "xyz", 100, Category.other)));
		System.out.println(prds.put("prd102", new Product("prd102", "rice", 150, Category.grains)));
		System.out.println(prds.put("prd103", new Product("prd103", "sunflower oil", 100, Category.oils)));
		System.out.println(prds.put("prd104", new Product("prd104", "xyz", 60, Category.other)));
		System.out.println(prds.put("prd105", new Product("prd105", "rice", 130, Category.grains)));
		System.out.println(prds.put("prd106", new Product("prd106", "xyz", 50, Category.other)));
		System.out.println(prds.put("prd107", new Product("prd107", "oil", 100, Category.oils)));
		
		//isEmpty=false
		return prds;
		
		
		
		
	}
	public static List<Product> populatePrds()
	{
		
		List<Product > prds=new ArrayList<Product>();
		System.out.println(prds.add(  new Product("prd101", "xyz", 100, Category.other)));
		System.out.println(prds.add( new Product("ard102", "rice", 150, Category.grains)));
		System.out.println(prds.add( new Product("prd103", "sunflower oil", 100, Category.oils)));
		System.out.println(prds.add( new Product("xrd104", "xyz", 60, Category.other)));
		System.out.println(prds.add( new Product("prd105", "rice", 130, Category.grains)));
		System.out.println(prds.add( new Product("zrd106", "xyz", 50, Category.other)));
		System.out.println(prds.add( new Product("trd107", "oil", 100, Category.oils)));
	
		
		return prds;
		
		
	}
	
	
	
}
