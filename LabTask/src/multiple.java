import java.util.Scanner;
public class multiple {
public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)){
		int firstNumber;
		int secondNumber;
		System.out.println("Enter first number:");
		firstNumber=sc.nextInt();
		System.out.println("Enter second number:");
		secondNumber=sc.nextInt();
		if(number(firstNumber,secondNumber)) {
			System.out.println(firstNumber+"  is the multiple of  "+secondNumber);
		}
		else
		{
		System.out.println(firstNumber+"  is not the multiple of   "+secondNumber);	
		}
	}
}

private static boolean number(int num1, int num2) {
	if((num1%num2)==0)
		return true;
	else
	return false;
}
}
