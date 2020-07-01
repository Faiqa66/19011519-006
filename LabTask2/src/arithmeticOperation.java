import java.util.Scanner;
public class arithmeticOperation {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of a and b:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("a+b="+(a+b));
	System.out.println("a-b="+(a-b));
	System.out.println("a*b="+(a*b));
	System.out.println("a/b="+(a/b));
	System.out.println("a%b="+(a%b));
}
}
