import java.util.Scanner;
import java.util.ArrayList;
class EInformation {
	ArrayList<EInformation> myList=new ArrayList<EInformation>();
String name;
int age; 
public void getInfor() {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name:");
	name=sc.next();
	System.out.println("Enter age:");
	age=sc.nextInt();
}
public void showInfor() {
	System.out.println("Employees Information......");
	System.out.println("---------------------------");
	System.out.println("Name is:"+name);
	System.out.println("Age is:"+age);
	System.out.println("----------------------------");
}
}
	
