package JavaPrograms;
import java.util.Scanner;
public class ArmstoneNumber {
@SuppressWarnings({"resource" })
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to verify either it is armstone or note:");
	int number=sc.nextInt();
	int temp,r,sum=0;
	temp=number;
	while(number>0) {
		r=number%10;
		number=number/10;
		sum=sum+(r*r*r);
	}
	if(sum==temp) {
		System.out.println("The number is Armstone!");
	}
	else {
		System.out.println("No!Try again.");
	}
}
}
