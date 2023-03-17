package com.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestSetInterface {

	public static void main(String[] args) {
		
	 
	    Set<Integer> set=new HashSet<Integer>();
		System.out.println("IsEmpty:"+set.isEmpty());
		//HashSet<Integer> set=new HashSet<Integer>();
		System.out.println(set.add(10));//true
		System.out.println(set.add(20));//true
		System.out.println(set.add(30));//true
		System.out.println(set.add(40));//true
		System.out.println(set.add(10));//false
		System.out.println("IsEmpty:"+set.isEmpty());
		System.out.println(set);
		for(int i:set)
		{
			System.out.print (i+"  ");
		}
		System.out.println();
		System.out.println("---functional programming---");
		set.forEach(i->System.out.print (i+"  "));
		
		System.out.println();
		System.out.println("contains(120):"+set.contains(120));
		
		System.out.println("remove(120):"+set.remove(120));
		//System.out.println("Enter Number To Remove:");
		//Scanner sc=new Scanner(System.in);
		//int no=sc.nextInt();
		
//		for(int i:set)//fwd only,read only
//		{
//			if(set.contains(no))
//			{
//				set.remove(no);
//			}
//		}
		
		
		Iterator<Integer> itr=set.iterator();
		
		while(itr.hasNext())
		{
			 System.out.print(itr.next()+"  ");
			 
		}
		
		System.out.println();
		
		 
		//sort set
		TreeSet<Integer> tset= new TreeSet<Integer>( set);
		
		System.out.println("TreeSet:"+tset.isEmpty());
		tset.add(90);
		tset.add(10);
		tset.add(30);
		tset.add(490);
		tset.add(390);
		tset.add(9);
		System.out.println(tset);
		
		
		
	}

}
