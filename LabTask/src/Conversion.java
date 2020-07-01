
import java.util.*;

public class Conversion {

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)){
	System.out.println("Enter temprature in farenheit: ");
	float Farenheit=sc.nextInt();
	double Celsius;
	Celsius= ((Farenheit - 32)*5)/9;
	System.out.println(Celsius);
}
}
}