package Abstraction;

public class Std {
private String CollegeName="Superior Group of Colleges,M.B.Din";

public String getCollegeName() {
	return CollegeName;
}

public void setCollegeName(String collegeName) {
	CollegeName = collegeName;
}

public static void main(String...args) {
	Std s=new Std();
	s.setCollegeName("Superior Group of Colleges,M.B.Din");
}
}
