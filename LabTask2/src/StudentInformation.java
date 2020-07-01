import java.util.ArrayList;
class StudentInformation {
    	
 public static void main(String[] args) {
	 
	 ArrayList<Student> students=new ArrayList<Student>();
	 Student st = new Student();
	 for (int i=0;i<2;i++) {
		 st.getInformation();
		 students.add(st);
	 }	 

	 for (int i=0;i<students.size();i++) {
		 students.get(i).showInformation();
	 }	
 
 
 }
}
