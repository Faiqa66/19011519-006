import java.util.Scanner;
public class Convert{
	int num;
	Scanner sc=new Scanner(System.in);
	void getValue() {
	System.out.println("Conversion of decimal into hexa,octa and binary is followin:");
	System.out.println("Enter decimal:");
	num=sc.nextInt();
}
	void convert() {
		String hexa=Integer.toHexString(num);
		System.out.println("Decimal to hexadecimal:"+hexa);
		String octal=Integer.toOctalString(num);
		System.out.println("Decimal to octal:"+octal);
		String binary=Integer.toBinaryString(num);
		System.out.println("Decimal to binary:"+binary);
	}
public static class Conversion{
	public static void main(String[] args) {
	Convert obj=new Convert();
	obj.getValue();
	obj.convert();
	}
}
}