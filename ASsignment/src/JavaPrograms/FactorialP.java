package JavaPrograms;
import java.util.Scanner;
public class FactorialP {
@SuppressWarnings("resource")
public static void main(String...args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number whose factorial you want to find:");
	int number=sc.nextInt();
	int f=1,i;
	for(i=1;i<=number;i++) {
		f=f*i;
	}
	System.out.println("Fatorial of "+number+"! is "+f);
}
}
