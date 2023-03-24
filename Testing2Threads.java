package com.tester;

import com.app.MyThread;
import com.app.MyThread2;

public class Testing2Threads {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("----Main Thread Started-----"+Thread.currentThread().getName());
		
		//create child Thread t1 for Increment
		MyThread t1=new MyThread();
		t1.setPriority(1);;
		t1.setName("IncrementThread");
		
		System.out.println("IsAlive T1:"+t1.isAlive());
		//create child Thread t2 for Decrement
	
		
		MyThread2 t2=new MyThread2();
		t2.setPriority(10);
		t2.setName("DecrementThread");
		
		t1.start();
		t2.start();
		
		
		t1.join();//main thread will wait  wait t1 to die
		t2.join();//main thread will wait  wait t2 to die
		
		
		
		System.out.println("----Main Thread Ended-----"+Thread.currentThread().getName());
	System.out.println("IsAlive T1:"+t1.isAlive());
	//t1.start();error
	}

}
