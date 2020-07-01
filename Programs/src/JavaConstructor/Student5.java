package JavaConstructor;

public class Student5 {

int id;
String name;
	
Student5(int id,String name){
	this.id=id;
	this.name=name;
}
Student5(Student5 s){
	id=s.id;
	name=s.name;
}
void display() {
	System.out.println(name+" , "+id);
}
public static void main(String...args) {
   Student5 s1=new Student5(111,"Steven");
   Student5 s2=new Student5(s1);
   s1.display();
   s2.display();
}

}
