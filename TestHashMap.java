 
package com.tester;

import java.util.HashMap;
import java.util.Scanner;

import com.code.Category;
import com.code.Product;
import com.util.ProductUtil;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1 show all prds  2: add new prds 3: get prd by id");

		int ch;
		Scanner sc = new Scanner(System.in);

		// get all prds from prdUil class

		HashMap<String, Product> shop = ProductUtil.getAllProducts();
		// shop.isEmpty=

		do {
			System.out.println("Enter Choice=");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("---all prds----");
				for (Product p : shop.values()) {
					System.out.println(p);
				}
				break;
			case 2:
				System.out.println("enter prdid name price category");
				String prdId = sc.next();
				String name = sc.next();
				double price = sc.nextDouble();
				Category cate = Category.valueOf(sc.next().toLowerCase());
				Product newPrd = new Product(prdId, name, price, cate);
				shop.putIfAbsent(prdId, newPrd);
				break;
			case 3:
				System.out.println("Enter PrdId:");
				prdId = sc.next();

				Product exstPrd = shop.get(prdId);
				if(exstPrd!=null)
				{
					System.out.println(exstPrd);
				}
				else
				{
					System.out.println("Prd Not Available");
				}
				
				break;
				
			case 4:System.out.println("enter PrdId to Remove");
			prdId=sc.next();
			
			Product prdToRemove=   shop.remove(prdId);
			if(prdToRemove!=null)
				System.out.println("Removed:"+prdToRemove);
			else
				System.out.println("prd not exist.....");
			
			
		
			break;
			
			case 5://display all prds price >100
				
				for(Product p:shop.values())
				{
					if(p.getPrice()>=100  && p.getCategory().equals(Category.oils))
						System.out.println(p);
				}
			
				

			}

		} while (ch != 10);

	}

}
