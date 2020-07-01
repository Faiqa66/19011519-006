import java.util.Scanner;
public class Conversion {
	int num;
       Scanner sc=new Scanner(System.in);
       void getValue() {
    	   System.out.println("Convert from decimal to hexadecimal,octal decimal value!");
    	   System.out.print("Enter number:");
    	  num=sc.nextInt();	
       }
          void convert() {
    	   String hexa=Integer.toHexString(num);
    	   System.out.println("Decimal in Hexadecimal:"+hexa);
    	   String octal=Integer.toOctalString(num);
    	   System.out.println("Decimal in octal:"+octal);
    	   String binary=Integer.toBinaryString(num);
    	   System.out.println("Decimal in binary form:"+binary);
       }
 public static class Convert{
	 public static void main(String[] args) {
		 Conversion obj=new Conversion();
		 obj.getValue();
		 obj.convert();
	 }
 }
       
}

