package Inheritence;
class Animal{
	void eat() {
		System.out.println("Eating......");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking......."); 
	}
}
class babyDog extends Dog{
	void weep() {
		System.out.println("Weeping......"); 
	}
}
public class MultipleInheritance {
  public static void main(String...args) {
	  babyDog b=new babyDog();
	  b.eat();
	  b.bark();
	  b.weep();
  }
}
