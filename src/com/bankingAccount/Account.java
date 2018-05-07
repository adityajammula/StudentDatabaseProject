package com.bankingAccount;

public abstract class Account implements IBaseRate{
	private String name;
	private String sSN;
	private double balance;
	protected String accountNumber;
	protected double rate;	
	static int index = 10000;
	// List common properties 
	
	public Account(String name, String sSN, double initDeposit){
		this.name =name;
		this.sSN = sSN;
		balance = initDeposit;		
		//set account Number
		index++;
		this.accountNumber = setAccountNumber();
		//System.out.println("Account NUmber : "+ this.accountNumber);
		
		setRate();
	}
	
	private String setAccountNumber(){
		String lastTwoofSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int)(Math.random()*Math.pow(10, 3));
		return lastTwoofSSN + uniqueID +randomNumber;
	}
	
	public abstract void setRate();
	
	public void deposit( double amount){
		balance = balance +amount;
		System.out.println("Depositing $" +amount);
		printBalance();
	}
	
	public void winthdraw(double amount){
		balance = balance - amount;
		System.out.println("Windrawing $ " +amount);
		printBalance();
	}
	
	public void transfer(String toWhere	, double amount){
		balance = balance -amount;
		
		System.out.println("Transfering $" +amount + "to" + toWhere);
		printBalance();
		}
	
	public void compound(){
		double accruedIntrest = balance * (rate*100);
		balance = balance + accruedIntrest;
		System.out.println("Accrued Interest: $ " +accruedIntrest);
		printBalance();
	}
	
	public void printBalance(){
		System.out.println("your balance is now $ " +balance);
	}
	
	public void showInfo(){
		System.out.println("Name: " +name + "\nAccount Number: " +accountNumber+
				"\nBalance: " +balance +"\nRate: "+ rate +"");
	}

}
