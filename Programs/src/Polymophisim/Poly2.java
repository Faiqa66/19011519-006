package Polymophisim;
class Bank{
	float getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank{
	float getRateOfInterest() {
		return 8.4f;
	}
}
class ICICI extends Bank{
	float getRateOfInterest() {
		return 7.3f;
	}
}
class AXIS extends Bank{
	float getRateOfInterest() {
		return 9.7f;
	}
}
public class Poly2 {
public static void main() {
   Bank b;
   b=new SBI();
   b.getRateOfInterest();
   b=new ICICI();
   b.getRateOfInterest();
   b=new AXIS();
   b.getRateOfInterest();
}
}
