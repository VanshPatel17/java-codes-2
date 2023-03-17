package com.code;

public class Account implements Comparable<Account>{
	
	private Integer actno;
	private String custname;
	private double balance;
	public Account(int actno, String custname, double balance) {
		super();
		this.actno = actno;
		this.custname = custname;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [actno=" + actno + ", custname=" + custname + ", balance=" + balance + "]";
	}
	public int getActno() {
		return actno;
	}
	public void setActno(int actno) {
		this.actno = actno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public boolean equals(Object obj) {
//downcasting
		System.out.println("----equals----");
		Account act=(Account)obj;
		return this.actno==act.actno;

	}
	@Override
	public int hashCode() {
		System.out.println("---hashcode---");
		return this.actno.hashCode();
	}
	@Override
	public int compareTo(Account o) {
		
//		if(this.actno<o.actno)
//			return -1;
//		else if(this.actno>o.actno)
//			return 1;
//		else
//			return 0;
		return this.actno.compareTo(o.actno);
		//return this.custname.compareTo(o.custname);
		
	}

	
	
	
	
}
