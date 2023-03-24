package com.threadSynch;

public class Account {
	
	private int actid;
	private String name;
	private double balance;
	public Account(int actid, String name, double balance) {
		super();
		this.actid = actid;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [actid=" + actid + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public double getBalance() {
		return balance;
	}
	public void withdraw(double amount)
	{
		System.out.println("---withdraw ----");
		this.balance=this.balance-amount;
//		System.out.println("after Withdraw Balance="+balance);
	}
	public void deposite(double amount)
	{
		System.out.println("---deposite ----");
		this.balance=this.balance+amount;
		//System.out.println("after deposite Balance="+balance);
	}


}
