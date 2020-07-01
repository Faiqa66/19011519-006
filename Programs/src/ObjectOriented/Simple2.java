package ObjectOriented;

public class Simple2 {
	int rollNo;
	String name;
  void insertRecord(int r,String n) {
	  rollNo=r;
	  name=n;
  }
  void displayInformation() {
	  System.out.println(rollNo+" "+name);
  }
  
 public static void main(String...args) {
	 Simple2 obj=new Simple2();
	 
	 Simple2 obj1=new Simple2();
	 
	 obj.insertRecord(111,"John");
	 
	 obj1.insertRecord(222,"Steven");
	 
	 obj.displayInformation();
	 
	 obj1.displayInformation();
 }
}
