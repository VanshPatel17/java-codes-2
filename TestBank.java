package com.threadSynch;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final Account custAct=new Account(101, "Ramesh", 5000);
		
		BankOp1 thread1=new BankOp1(custAct, 1000);
		thread1.setName("Withdraw Thread");
		 thread1.start();
		thread1.setPriority(10);
		//start anoyther operation on same Account
		BankOp2 thread2=new BankOp2(custAct, 2000);
		thread2.setName("Deposite Thread");
		 thread2.start();
		//thread2.setPriority(10);
		
		
		
		System.out.println("---Bank operation done-----");
		
		
	}

}
