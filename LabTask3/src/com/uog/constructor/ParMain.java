package com.uog.constructor;
import java.util.Scanner;
public class ParMain {
	public static void main(String[] args) {
	Paramiterized pr=new Paramiterized(12,13,14,15);
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an operator:");
	int op=sc.nextInt();
	
	switch(op) {
	case 1:
	System.out.println(pr.add());
	break;
	case 2:
	System.out.println(pr.subtract());
	break;
	case 3:
	System.out.println(pr.multiply());
	break;
	case 4:
		System.out.println(pr.division());
		break;
	default:
		System.out.println("wrong input!");
	}
}
}

