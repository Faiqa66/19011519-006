package Polymophisim;
class shape{
	void draw() {
		System.out.println("drawing shape....");
	}
}
class Rectangle extends shape{
	void draw() {
		System.out.println("drawing rectangle......");
	}
}
class Circla extends shape{
	void draw(){
		System.out.println("drawing circle........");
	}
}
class Triangle extends shape{
	void draw() {
		System.out.println("drawind triangle......"); 
	}
}
public class Poly3 {
public static void main(String args[]) {
	shape s;
	s=new Rectangle();
	s.draw();
	s=new Circla();
	s.draw();
	s=new Triangle();
	s.draw();
}
}
