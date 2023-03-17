package com.taster;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSetInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> intSet = new HashSet<Integer>();
		System.out.println("isEmpty:" + intSet.isEmpty());
		System.out.println(intSet.add(10));// t

		System.out.println(intSet.add(30));// t

		System.out.println(intSet.add(70));// t

		System.out.println(intSet.add(20));// t

		System.out.println(intSet.add(9));// t
		System.out.println(intSet.add(10));// f

		for (int i : intSet) {
			System.out.print(i + "  ");
		}

		System.out.println();

		//
		System.out.println("contains(10):" + intSet.contains(10));// false

		System.out.println("remove(9):"+intSet.remove(9));
		
	 	//sort intSet
		System.out.println("-----------------------------");
		SortedSet<Integer> treeset=new TreeSet<Integer>(intSet);
		System.out.println("treeSet isEmpty:"+treeset.isEmpty());
		
		for (int i : treeset) {
			System.out.print(i + "  ");
		}

		System.out.println("-----------------------------");
	 
		
	}

}
