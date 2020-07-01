import java.util.*;
public class Comparison {

public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		System.out.println("Enter num3:");
		int num3=sc.nextInt();
		System.out.println("Enter num4:");
		int num4=sc.nextInt();
		System.out.println("Enter num5:");
		int num5=sc.nextInt();
		int min,max;
		min=num1;
		if(min>num2)
			min=num2;
		if(min>num3)
			min=num3;
		if(min>num4)
			min=num4;
		if(min>num5)
			min=num5;
		System.out.println("Minimum:"+min);
		max=num1;
		if(max<num2)
			max=num2;
		if(max<num3)
			max=num3;
		if(max<num4)
		 max=num4;
		if(max<num5)
			max=num5;
		System.out.println("Maximum:"+max);
	}
}
}
