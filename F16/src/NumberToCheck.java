public class NumberToCheck {
public static void main(String[] args) {
	int i;
	int num;
	int maxnum=100;
	boolean isPrime=true;
	String primeNumberFound=" ";
	
	for(i=0;i<=100;i++) {
		isPrime=CheckPrime(i);
		if(isPrime) {
			primeNumberFound=primeNumberFound+i+" ";
		}
	}
	System.out.println("Prime number fro 1 to "+maxnum+" are");
	System.out.println(primeNumberFound);
}
	public static boolean CheckPrime(int numToCheck) {
		int remainder;
		for(int i=2;i<=numToCheck/2;i++) {
			remainder=numToCheck%i;
			if(remainder==0) {
				return false;
		}
		
	}
		return true;
}
}
