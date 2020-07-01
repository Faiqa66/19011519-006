package ManagementSystem;

import java.util.*;
public class Franchise {

	Scanner scan=new Scanner(System.in);
	
	int n=scan.nextInt();
	
	String NAME;
	
	String ADDRESS;
	
	public String HOTEL[]=new String[n];
	
	
	 public void add() {
		int i;
		
		System.out.println("Enter Franchise name:");
		NAME=scan.nextLine();
		
		System.out.println("Enter Address of Frachaise:");
		ADDRESS=scan.nextLine();
		
		for(i=0;i<5;i++) {
		System.out.println("Enter Hotel names:");
		HOTEL[i]=scan.nextLine();
		}
		}
	 
	 public void Display() {
		 System.out.println("Frachise Name:"+NAME);
		 
		 System.out.println("Address:"+ADDRESS);
		 
		 for(String i:HOTEL) {
		 System.out.println(i);
	 }
	}
}
	

