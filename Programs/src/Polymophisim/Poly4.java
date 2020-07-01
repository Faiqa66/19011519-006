package Polymophisim;
class Animal{
	void eat() {
		System.out.println("eating.......");
	}
}
class dog extends Animal{
	void eat() {
		System.out.println("eat meat........");
	}
}
class cat extends Animal{
	void eat() {
		System.out.println("eat rats........");
	}
}
class loin extends Animal{
	void eat() {
		System.out.println("eat animals....");
	}
}
public class Poly4 {
public static void main(String...args) {
	Animal a;
	a=new dog();
	a.eat();
	a=new cat();
	a.eat();
	a=new loin();
	a.eat();
}
}
