package com.threadSynch;

public class BankOp1  extends Thread{

	private Account act;
	private double amount;
	public BankOp1(Account act,double amount)
	{
		this.act=act;
		this.amount=amount;
		//this.start();
	}
	@Override
	public void run() {
	 
		try
		{
		System.out.println("Bank Operation Started By :"+Thread.currentThread().getName());
	//	 Thread.sleep(5000);
		act.withdraw(amount);
		System.out.println("After withdraw Balance="+act.getBalance());
		
		// Thread.sleep(5000);
		System.out.println("Bank Operation ended By :"+Thread.currentThread().getName());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	

}
