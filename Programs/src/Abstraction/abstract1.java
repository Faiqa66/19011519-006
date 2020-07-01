package Abstraction;
abstract class Bike{
	abstract void run();
}
class Honda extends Bike{
	void run() {
		System.out.println("Running at the speed limit 60km......");
	}
}
public class abstract1 {
public static void main(String[] args) {
	Bike b=new Honda();
	b.run();
}
}
