package com.bankingAccount;

public class Saving extends Account{
	
	private int safetyDepositBoxID;
	private int safetyDepositKey;
	

	public Saving(String name, String sSN, double initDeposit){
		super(name,  sSN, initDeposit);	
		accountNumber = "2" + accountNumber;
		System.out.println("Account NUmber : "+ this.accountNumber);
		setSafetyDepositBox();
	}
	
	private void setSafetyDepositBox(){
		safetyDepositBoxID = (int)(Math.random()*Math.pow(10, 3));
		safetyDepositKey = (int) (Math.random()*Math.pow(10, 4));
		System.out.println(safetyDepositBoxID);
	}
	
	public void showInfo(){
		System.out.println("Account Type: Saving " );
		super.showInfo();
		System.out.println("Your Saving Account Features " + 
						"\n Safety Deposit Box ID: " + safetyDepositBoxID
						+ "\nSafety Deposit Box Key "+safetyDepositKey);
	}

	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	
}
