
import java.util.*;

public class CircleArea {

	public static void main(String[] args) {
	
	try (Scanner sc=new Scanner(System.in)){
	
	float area;
	
	System.out.println("Enter radius:");
	
	int radius=sc.nextInt();
	
	final float PI=3.14f;
	
	area=PI*radius*radius;
	
	System.out.println("Area="+area);
	}
}
}
