package Abstraction;
abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Have enqual sides.....");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Round in shape....");
	}
}
public class Abstarct2 {
public static void main() {
	Shape s=new Circle();
	s.draw();
}
}
