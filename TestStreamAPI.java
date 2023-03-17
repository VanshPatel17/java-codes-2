package com.taster;

import java.util.ArrayList;

public class TestStreamAPI {
public static void main(String[] args) {
	
	
	ArrayList<Integer> intlist=new ArrayList<Integer>();
	intlist.add(23);
	intlist.add(3);
	intlist.add(53);
	intlist.add(73);
	intlist.add(29);
	intlist.add(99);
	System.out.println(intlist);
	
	for(int i:intlist)
	{
		if(i>50)
			System.out.println(i);
	}
	System.out.println("--------------------");
	
	
	intlist.stream().filter(no->no>50).forEach(no->System.out.println(no));
	 
	
	
}

}
