import java.util.Scanner;
public class allInformation {
public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your branch name:");
		String branch=sc.nextLine();
		System.out.println("Enter your year of joining:");
		int year=sc.nextInt();
		System.out.println("Your name is:  "+name);
		System.out.println("You work in the branch:  "+branch);
		System.out.println("Your year of joinig:  "+year);
	}
	
	
	
}
}
