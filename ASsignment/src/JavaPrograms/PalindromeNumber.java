package JavaPrograms;

public class PalindromeNumber {
public static void main(String args[]) {
	int temp,sum=0,r;
	int n=676;
	temp=n;
while(n>0) {
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
}
if(sum==temp) {
	System.out.println("The number is palindrome!");
}
else {
	System.out.println("The number is not palindrome!"); 
}
}
}
