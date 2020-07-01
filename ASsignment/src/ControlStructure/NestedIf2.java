package ControlStructure;

public class NestedIf2 {
public static void main(String[] args) {
 int age=20;
 int weight=70;
   if(age>=20) {
	   if(weight>=70) {
		   System.out.println("You are eligible of donating blood,sir");
	   }
	   else {
		   System.out.println("You are eligible of donating blood,sir!");
	   }
   }
	else {
		System.out.println("Age must be greater than 20!");
	   }
   }
	   
	}
