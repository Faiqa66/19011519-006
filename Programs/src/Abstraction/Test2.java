package Abstraction;

public class Test2 {
public static void main(String args[]) {
	Account ac=new Account();
	ac.setAcc_no(045673);
	ac.setName("Jhon Steven");
	ac.setEmail("johnsteven567@gmail.com");
	ac.setAmount(1200000);
	
	System.out.println("Account number of employee : "+ac.getAcc_no());
	System.out.println("Employee Name : "+ac.getName());
	System.out.println("Employee email-id : "+ac.getEmail());
	System.out.println("Amount stored in the bank : "+ac.getAmount());
}
}
