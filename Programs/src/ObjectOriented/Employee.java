package ObjectOriented;

public class Employee {
	 int id;
	   int salary;
	   String name;
	   
	void insert(int i,int s,String n) {
		 id=i;
		 salary=s;
		 name=n;
	   }
	   
	 void displayInformation() {
	  System.out.println(id+" "+name+" "+salary);
	   }
	   
public static void main(String...args) {
		 Employee e=new Employee();
		 Employee e1=new Employee();
		 Employee e2=new Employee();
		 
		 e.insert(101, 450000, "John");
         e1.insert(102, 250000, "Steven");
         e2.insert(103, 550000, "Michel");
         
         e.displayInformation();
         e1.displayInformation();
         e2.displayInformation();
}

}
