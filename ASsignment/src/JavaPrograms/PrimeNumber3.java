package JavaPrograms;
import java.util.Scanner;
public class PrimeNumber3 {
		public static void main(String...args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	if(isPrime(n)) {
		System.out.println(n+" is a prime number!");
	}
	else {
		System.out.println(n+" is not a prime number!");
}
}
public static boolean isPrime(int n1) {
	if(n1<=1) {
		return false;
}
	else {
		for(int i=2;i<Math.sqrt(n1);i++) {
			if(n1%i==0) {
			 return false;
			}
	}
		return true;
		}
			
}
}