package com.app;

public class MyThread  extends Thread {
 
//
	public void run()
	{
		System.out.println("------run started-------"+Thread.currentThread().getName());
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("------run over-------"+Thread.currentThread().getName());
	}
	
	
}
