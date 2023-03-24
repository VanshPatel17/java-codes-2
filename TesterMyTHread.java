package com.code;

public class TesterMyTHread {

	public static void main(String[] args) {
		try
		{
		System.out.println("-------main--------"+Thread.currentThread().getName());
		MyEvenThread mt1=new MyEvenThread();
	 
		Thread t1=new Thread(mt1, "EvenThread");
		t1.start();
		t1.join();
		//t1.yield();
		
	System.out.println("------main ends here-------");	
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
