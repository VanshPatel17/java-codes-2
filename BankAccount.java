package com.threadITC;

public class BankAccount {

	private double balance;
	
	public BankAccount(double balance)
	{
		this.balance=balance;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
	
	public synchronized void withdraw(double amount) throws InterruptedException
	{
		System.out.println("withdraw operation :"+Thread.currentThread().getName());
		if(amount>balance)
		{
			super.wait();//wait til deposite 
			System.out.println("Wait till deposite perform:");
		}
		balance=balance-amount;
		
		System.out.println("After withdraw operation :"+balance);
			
		
	}
	public synchronized void deposite(double amount)
	{
		System.out.println("deposite operation :"+Thread.currentThread().getName());
		balance=balance+amount;
		
		super.notify();
		System.out.println("After deposite operation :"+balance);
			
		
	}
	
	
}
