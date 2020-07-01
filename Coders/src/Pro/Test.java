package Pro;

class A{
	int a=10;
	
	A(){
		System.out.println("Tusi great Ooooo");
	}
	A(int x){
		this();
		System.out.println(x);
	}
}

public class Test {
 @SuppressWarnings("unused")
public static void main(String args[]) {
	A a=new A(10);
	
}
}
