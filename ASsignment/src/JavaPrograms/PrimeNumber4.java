package JavaPrograms;
import java.util.Scanner;

public class PrimeNumber4 {
public static void main(String...args) {
	@SuppressWarnings({ "resource" })
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter statring number:");
	int start=sc.nextInt();
	System.out.println("Enter ending number:");
	int end=sc.nextInt();
	System.out.println("list of numbers between "+start+" and "+end+" numbers:");
	for(int i=start;i<end;i++) {
		if(isPrime(i)) {
			System.out.println(i);
		}
	}
}
public static boolean isPrime(int n) {
	if(n<=1) {
		System.out.println("Number is not prime!");
	}
	for(int i=2;i<Math.sqrt(n);i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
}
}
