package JavaPrograms;
import java.util.Scanner;
public class Palindrome2 {
@SuppressWarnings("resource")
public static void main(String...args) {
	String original,reverse="";
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a string or number:");
	original=in.nextLine();
	int length=original.length();
	for(int i=length-1;i>=0;i--) {
		reverse=reverse+original.charAt(i);
	}
	if(original.equals(reverse)) {
		System.out.println("The number/String is palindrome!");
	}
	else {
		System.out.println("Not the palindrome number!");
	}
}
}
