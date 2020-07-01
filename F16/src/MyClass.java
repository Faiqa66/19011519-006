import java.util.Scanner;
public class MyClass {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner op=new Scanner(System.in);
		System.out.println("Enter value for n1:");
		int n1=op.nextInt();
		System.out.println("Enter value for n2:");
		int n2=op.nextInt();
		int gcd=1;
		for(int i=1;i<=n1&&i<=n2;++i) {
			if(n1%i==0 && n2%i==0)
				gcd=i;
		}
		System.out.printf("GCD of %d and %d is %d",n1,n2,gcd);
}
}
