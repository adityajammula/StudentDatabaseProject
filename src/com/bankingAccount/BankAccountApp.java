package com.bankingAccount;

import java.util.LinkedList;
import java.util.List;

import javax.swing.text.Utilities;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<>();
		//String file = Downloads
		// TODO Auto-generated method stub
		/*
		Checking checkacc1 = new Checking("Aditya", "123456789", 1500);
		
		Saving saving = new Saving("Jammula", "12345678", 2500);
		
		checkacc1.showInfo();
		saving.showInfo();
		
		saving.compound();*/
		
		List<String[]> newAccountHolders = utilities.CSV.read("C:\\NewBankAccounts.csv");
		
		for(String[] accountholder : newAccountHolders){
			System.out.println("New Account");
			
			String name = accountholder[0];
			String sSN = accountholder[1];
			String accountType = accountholder[2];
			double initDeposit = Double.parseDouble(accountholder[3]);
			System.out.println(name + " " + sSN + " " + accountType +" " + initDeposit );
			if(accountType.equals("Savings")){
				System.out.println("OPEN SAVING ACCOUNT");
				accounts.add(new Saving(name, sSN, initDeposit));
			}
			else if(accountType.equals("Checking")){
				System.out.println("OPEN CHEKCING ACCOUNT");
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR in CREATING ACCOUNT");
			}
		}
		
		for (Account acc : accounts){
			System.out.println("\n*********************");
			acc.showInfo();
		}
		
		accounts.get((int)Math.random()* accounts.size()).deposit(10000);
		
	}

}
