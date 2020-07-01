package com.uog.constructor;

public class DefaultCostructor {
       private String name;
        private int age;
 DefaultCostructor(){
	 name="Faiqa";
	 age=19;
 }
 public static void main(String[] args) {
	 DefaultCostructor myObj=new DefaultCostructor();
	 System.out.println("Student name:"+myObj.name);
	 System.out.println("Student age:"+myObj.age);
 }
}
