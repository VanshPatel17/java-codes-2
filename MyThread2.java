package com.app;

public class MyThread2  extends Thread{

	@Override
	public void run() {
		try {
		System.out.println("--MyThread2-Run Method started by :"+Thread.currentThread().getName());
		 
		for(int i=10;i>=1;i--)
		{
			System.out.println("MyThread2 Decremented:"+i);
		 
			Thread.sleep(1000);
		
		}
		System.out.println("--MyThread2-Run Method ended by :"+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	

}
