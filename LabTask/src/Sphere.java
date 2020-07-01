
import java.util.*;

public class Sphere {

	public static void main(String[] args) {
	float area;
	float volume;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter value of radius:");
		int radius=sc.nextInt();
		final float PI=3.14f;
		area=4*PI*radius*radius;
		volume=4/3*PI*radius*radius*radius;
	}
	System.out.println("Area of sphere: "+area);
	System.out.println("Volume of sphere: "+volume);
	}
}
