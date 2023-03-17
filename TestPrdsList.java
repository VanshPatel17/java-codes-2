package com.code;

import java.util.ArrayList;
import java.util.List;

import com.util.ProductUtil;

public class TestPrdsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Product> shop = (ArrayList<Product>) ProductUtil.populatePrds();

		shop.forEach(p -> System.out.println(p));

		// display prds where price >100
		System.out.println("price >=100");
		shop.stream().filter(p -> p.getPrice() >= 100).forEach(p -> System.out.println(p));

		System.out.println("price >=100 also category=oils");

		shop.stream().filter(p -> p.getPrice() >= 100 && p.getCategory().equals(Category.oils))
				.forEach(p -> System.out.println(p));

		System.out.println("sum of all prds price");

		double sum = shop.stream().mapToDouble(p -> p.getPrice()).sum();
		System.out.println(sum);
		
		System.out.println("---sorted prds by prdid----");
		
		
		
		shop.stream().sorted().forEach(p->System.out.println(p));
		
		
		System.out.println("---sorted prds by price----");
		
		shop
		.stream()
		.sorted(new SortProductByPrice())
		.forEach(p->System.out.println(p));
		
		
		System.out.println("---sorted prds by pname----");
		
		
		shop
		.stream()
		.sorted((p1,p2)->p1.getPname().compareTo(p2.getPname()))
		.forEach(p->System.out.println(p));
		
		System.out.println("--------------------------"); 
		
		
		shop.stream().forEachOrdered(p->System.out.println(p));;
		
		
		
		
		
		
		
		

	}

}
