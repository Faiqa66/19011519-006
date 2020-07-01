package ObjectOriented;

public class TestClass2 {
public static void main(String...args) {
	BankAccount BA=new BankAccount();
	
	BA.inser(832435, "Steven", 100000);
	BA.display();
	BA.checkBalance();
	BA.deposite(400000);
	BA.checkBalance();
	BA.withdraw(14000);
	BA.checkBalance();
}
}
