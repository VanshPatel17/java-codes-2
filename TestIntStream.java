package com.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TestIntStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		IntStream stram=(IntStream) Arrays.asList(2,3,55,23,11,34,66,88,33,44,26);
//		System.out.println(stram);
//		

		List<Integer> list = Arrays.asList(2, 3, 55, 23, 11, 34, 66, 88, 33, 44, 26);
		;

//		for(int a:list)
//		{
		// if(a%2==0)
//			System.out.println(a);
//		}

		list.forEach(a -> System.out.print(a + " "));

		System.out.println("\n Even Numbers From List");

		list.stream()// convert source into stream
				.filter(p -> p % 2 == 0)// filtering collection
				.forEach(p -> System.out.print(p + " "));// terminate operation

		System.out.println("\n sorted Even Numbers From List");

		list.stream().filter(n -> n % 2 == 0).sorted().forEach(p -> System.out.print(p + " "));

		int a = list.stream().filter(n -> n % 2 == 0).mapToInt(c -> c).sum();

		System.out.println("\nSum Od Even Numbers=" + a);

		System.out.println(list.stream().mapToInt(n -> n).max());

	}

}
