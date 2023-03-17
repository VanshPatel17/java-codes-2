package com.code;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TestAccountSet {

	public static void main(String[] args) {

		HashSet<Account> accounts = new HashSet<Account>();
		Account a1 = new Account(101, "Abc", 12000);
		System.out.println(accounts.add(a1));// true

		Account a2 = new Account(101, "xPqr", 22000);
		System.out.println(accounts.add(a2));// true

		Account a3 = new Account(1121, "cPqr", 22000);
		System.out.println(accounts.add(a3));// true

		Account a4 = new Account(1521, "gPqr", 22000);
		System.out.println(accounts.add(a4));// true

		Account a5 = new Account(121, "jPqr", 22000);
		System.out.println(accounts.add(a5));// true

		System.out.println(accounts.add(a1));// false
		System.out.println(accounts.add(new Account(109, "ePqr", 22000)));// false

		for (Account act : accounts) {
			System.out.println(act);
		}
		System.out.println("-------------------------");
		TreeSet<Account> tset = new TreeSet<Account>(accounts);

		for (Account act : tset) {
			System.out.println(act);
		}
		System.out.println("-------------------------");
		
		NavigableSet<Account> nset = tset.descendingSet();
		
		for (Account act : nset) {
			System.out.println(act);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
