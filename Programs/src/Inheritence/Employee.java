package Inheritence;

class Employ{
float salary=40000;
}
class Programmer extends Employ{
	int bonus=10000;
}
public class Employee {
	public static void main(String[] args) {
		Programmer pr=new Programmer();
		System.out.println("Programmer salary is:"+pr.salary);
		System.out.println("Bonus on salary is:"+pr.bonus);
	}
}
