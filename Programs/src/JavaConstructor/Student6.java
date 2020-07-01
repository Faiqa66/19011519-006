package JavaConstructor;

public class Student6 {
int id;
String name;
static String college="Superior";
Student6(int id,String name,String college){
	this.id=id;
	this.name=name;
}
Student6(){}
void dispaly() {
	System.out.println("Nmae:"+name+"  "+"Id:"+"  "+id+"  College:"+college);
}

public static void main(String...args) {
	Student6 s1=new Student6(123,"Faiqa Sabbir ","Punjab college");
    Student6 s2=new Student6();
    s2.id=s1.id;
    s2.name=s1.name;
    
    s1.dispaly();
    s2.dispaly();
}
}

