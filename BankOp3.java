package com.threadSynch;

public class BankOp3 extends Thread {

	Account act;
	public BankOp3(Account act)
	{
		this.act=act;
	}
	public void run()
	{
		
		synchronized(act)
		{
			
		}
		
		
		
	}
	
	
}
