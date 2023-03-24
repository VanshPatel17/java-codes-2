package com.tester;

import com.app.MyThread;

public class TesterMyThread {

	public static void main(String[] args) {
		
		System.out.println("---Main Thread----"+Thread.currentThread().getName());
		MyThread t1=new  MyThread();//Thread created
		 t1.setName("Thread1");
	 t1.start();// is ready to run
	
	 System.out.println("Thread1 IsAlive:"+t1.isAlive());
		
		System.out.println("----main Thread ends here----"+Thread.currentThread().getName());
	}

}
