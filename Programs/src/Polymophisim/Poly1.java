package Polymophisim;
class Bike{
   void run(){
	   System.out.println("running.......");
   }
}
class seplendid extends Bike {
	void run() {
		System.out.println("Bike running safely with 60km......");
	}
}
public class Poly1 {
public static void main(String...args) {
	Bike b=new seplendid();
	b.run();
}
}
