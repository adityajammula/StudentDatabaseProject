package com.bankingAccount;

public class Checking extends Account {

	// List properties related to checking Account

	private int debitCardNumber;
	private int debitCardPin;

	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		System.out.println("New Cheking Account:");
		System.out.println("The name of the Account" + name);
		accountNumber = "1" + accountNumber;
		System.out.println("Account NUmber : " + this.accountNumber);
		setDebitCard();
	}

	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}

	// List any methods specific to Checking Account

	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type: CHecking " + "\n Debit Card Number " + debitCardNumber + "\n Debit Card PIn "
				+ debitCardPin);
	}

	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
}
