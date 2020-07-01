package JavaPrograms;
import java.util.Scanner;
public class Factorial2 {
static long factor(long n) {
	if(n==0) {
		return 1;
	}
	else {
		return (n*factor(n-1));
	}
}
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
     long fact=1;
     System.out.println("Enter a number whose factorial you want to print:");
     long number=sc.nextLong();
    	 fact=factor(number);
    	 System.out.println("factorial of number:"+fact);
}
}
