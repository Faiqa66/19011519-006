package Instance;

public class Object {
public static void main(String...args) {
	EmployeeInformation empl1=new EmployeeInformation("Faiqa","Shabbir" ,100000.000);
	EmployeeInformation empl2=new EmployeeInformation("Irtaza", "Shabbir",200000.000);
	double raiseSalary=(empl1.Monthlysalary*0.1)+empl1.Monthlysalary;
	double raiseSalary2=(empl2.Monthlysalary*0.1)+empl2.Monthlysalary;
	System.out.println(empl1.Monthlysalary);
	System.out.println("1st employee monthly salary:"+raiseSalary);
	System.out.println("2nd employee monthly salary:"+raiseSalary2);
}
}