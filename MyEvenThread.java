package com.code;

public class MyEvenThread implements Runnable {

	@Override
	public void run() {

		try
		{
		System.out.println("Run method started by Thread " + Thread.currentThread().getName());
		for (int i = 1; i <= 20; i++) {

			if(i%2==0)
			{
				System.out.println(i);
			}
			 Thread.sleep(1000);
		}

		System.out.println("Run method ended by Thread " + Thread.currentThread().getName());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
