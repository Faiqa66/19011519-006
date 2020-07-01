package com.uog.employee;
import java.util.Scanner;
public class getData {
	
	String EMP_ID;
	String EMP_NAME;
	int DA,HRA,BASIC_SALARY,NET_SALARY,GS,INCOMETAX;
	
	public String getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(String eMP_ID) {
		EMP_ID = eMP_ID;
	}
	public String getEMP_NAME() {
		return EMP_NAME;
	}
	public void setEMP_NAME(String eMP_NAME) {
		EMP_NAME = eMP_NAME;
	}
	public int getDA() {
		return DA;
	}
	public void setDA(int dA) {
		DA = dA;
	}
	public int getHRA() {
		return HRA;
	}
	public void setHRA(int hRA) {
		HRA = hRA;
	}
	public int getBASIC_SALARY() {
		return BASIC_SALARY;
	}
	public void setBASIC_SALARY(int bASIC_SALARY) {
		BASIC_SALARY = bASIC_SALARY;
	}
	public int getNET_SALARY() {
		return NET_SALARY;
	}
	public void setNET_SALARY(int nET_SALARY) {
		NET_SALARY = nET_SALARY;
	}
	public int getGS() {
		return GS;
	}
	public void setGS(int gS) {
		GS = gS;
	}
	public int getINCOMETAX() {
		return INCOMETAX;
	}
	public void setINCOMETAX(int iNCOMETAX) {
		INCOMETAX = iNCOMETAX;
	}
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	
	
	Scanner scan=new Scanner(System.in);
   
	public void getdata() {
    	 System.out.println("Enter your name:");
         EMP_NAME = scan.next();
         System.out.println("Enter your employee id:");
         EMP_ID=scan.next();
         System.out.println("Enter the basic salary of employee:");
         calculation();
	}
         
         void calculation() {
         BASIC_SALARY = scan.nextInt();
      	 HRA=(10/100)*BASIC_SALARY;
    	 DA=(73/100)*BASIC_SALARY;
    	 GS=HRA+DA+BASIC_SALARY;
    	 INCOMETAX=(30/100)*GS;
    	 NET_SALARY=BASIC_SALARY-INCOMETAX;
    	 
     }
}
