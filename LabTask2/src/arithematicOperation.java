import java.util.Scanner;
class arithematicOperation{
public static void main(String[] args) {
 arthmetic ar=new arthmetic();
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter following numbers:\n1 for addition:\t2 f0r subtraction:\t3 for multiplication:\t4 for division:");
	int op = sc.nextInt();
	
	
 switch(op) {
	case 1:
	ar.add(2, 3);
	System.out.println(ar.z);
		break;
	case 2:
	ar.subtract(2, 3);
	System.out.println(ar.x);
		break;
	case 3:
	ar.multiply(2, 3);
	System.out.println(ar.y);
		break;
	case 4:
	ar.division(3,2);
	System.out.println(ar.r);
		break;
	default:
		System.out.println("Invalid input!");
		
	}
	}
}
