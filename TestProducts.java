package com.taster;

import java.util.HashSet;
import java.util.Set;

import com.code.Product;

public class TestProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product("prd101", "Pen", 30);
		System.out.println("p1:" + p1.hashCode());
		Product p2 = new Product("prd101", "Pen", 30);
		System.out.println("p2:" + p2.hashCode());

		System.out.println(p1.getPrdId() + "   " + p1.getPrdId().hashCode());
		System.out.println(p1.getPrdId() + "   " + p1.getPrdId().hashCode());

		if (p1 == p2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

		String s1 = "seed";
		String s2 = "seed";

		System.out.println("s1:" + s1.hashCode());
		System.out.println("s2:" + s2.hashCode());

//		if(s1.equals(s2))
//		System.out.println("equal");
//		else
//			System.out.println("not equal");

		if (p1.equals(p2)) {
			System.out.println("p1==p2");
		} else
			System.out.println("p1!=p2");

		Set<Product> prds = new HashSet<Product>();
		System.out.println("isEmpty:" + prds.isEmpty());// true
		System.out.println(prds.add(p1));// true

		System.out.println(prds.add(p2));// true

		System.out.println(prds.contains(p2));
		System.out.println(prds.add(new Product("prd103", "Camera", 120)));
		System.out.println(prds.add(new Product("prd104", "Camera", 50)));

		System.out.println(prds.add(new Product("prd105", "cc", 440)));

		System.out.println(prds.add(new Product("prd106", "vv", 56)));

		System.out.println(prds.add(new Product("prd107", "Cagmera", 400)));

		System.out.println(prds.add(new Product("prd109", "Cahhmera", 890)));

		System.out.println(prds.add(new Product("prd188", "y", 50)));

		for(Product p:prds)
		{
			if(p.getPrice()>100)
			System.out.println(p);
		}
		
		
		
		
		
		
		
		
		
	}

}
