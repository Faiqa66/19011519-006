package JavaConstructor;

public class Student4 {
int id;
String name;
int age;

Student4(int age,String name){
	this.age=age;
	this.name=name;
}

Student4(int age,String name,int id){
	this.age=age;
	this.name=name;
	this.id=id;
}

void display() {
	System.out.println(age+" "+name+" "+id+" " );
}

public static void main(String...args) {
	Student4 std=new Student4(19,"John");
	Student4 std1=new Student4(20,"Steven",345);
	std.display();
	std1.display();
}
}
