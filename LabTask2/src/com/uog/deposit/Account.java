package com.uog.deposit;
import java.util.Scanner;
public class Account {
	Scanner sc=new Scanner(System.in);
	String NAME_OF_DEPOSITOR;
	int ACCOUNT_NUMBER;
	String TYPE_OF_ACCOUNT;
	double BALANCE_AMOUNT;
	
	void GET_INFORMATION(String name,int ano,String tyac,double BAmount) {
		   this.NAME_OF_DEPOSITOR=name;
		   this.ACCOUNT_NUMBER=ano;
		   this.TYPE_OF_ACCOUNT=tyac;
		   this.BALANCE_AMOUNT=BAmount;
	}
	double DEPOSIT_AMOUNT() {
		System.out.println("Enter an amount you want to add:");
		float amt=sc.nextFloat();
		BALANCE_AMOUNT+=amt;
		return BALANCE_AMOUNT;
	}
	double WITHDRAW() {
		System.out.println("Enter the amount you want to withdraw:");
		float wdraw=sc.nextFloat();
		BALANCE_AMOUNT-=wdraw;
		return BALANCE_AMOUNT;
	}
	void DISPLAY() {
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("Your name:"+NAME_OF_DEPOSITOR);
		System.out.println("Your account number:"+ACCOUNT_NUMBER);
		System.out.println("Account type:"+TYPE_OF_ACCOUNT);
		System.out.println("Deposit Amount:"+DEPOSIT_AMOUNT());
		System.out.println("Withdraw Amount:"+WITHDRAW());
		System.out.println("=========================");
		System.out.println("=========================");
	}
}
