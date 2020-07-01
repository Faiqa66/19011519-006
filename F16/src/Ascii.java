import java.util.*;

class Ascii{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value:");
		int n=sc.nextInt();
		for(int d=1;d<=5;d++) {
		switch(d%2) {
		case 0:
			System.out.println("Even number");
			break;
		case 1:
			System.out.println("Odd number");
			break;
		}
	}
}
}