package com.threadSynch;

public class BankOp2 extends Thread {
	private Account act;
	private double amount;
	public BankOp2(Account act,double amount)
	{
		this.act=act;
		this.amount=amount;
	//	this.start();
	}
	@Override
	public void run() {
	 
		try
		{
		System.out.println("Bank Operation Started By :"+Thread.currentThread().getName());
		//Thread.sleep(3000);
		act.deposite(amount);
		System.out.println("After Deposite Balance="+act.getBalance());
		
		//Thread.sleep(3000);
		System.out.println("Bank Operation ended By :"+Thread.currentThread().getName());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
