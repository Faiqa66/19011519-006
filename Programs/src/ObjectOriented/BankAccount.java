package ObjectOriented;

public class BankAccount {
   int acc_no;
   String acc_name;
   float amount;
   
   void inser(int n,String nme,float am) {
	   acc_no=n;
	   acc_name=nme;
	   amount=am;
   }
   
   void deposite(float amt) {
	   amount=amount+amt;
	   System.out.println(amt+" deposited");
   }
   
   void withdraw(float amt) {
	   if(amount<amt) {
		   System.out.println("Insuficient Balance!"); 
	   }
	   else {
		   amount=amount-amt;
		   System.out.println(amt+" withdrawn");
	   }
   }
void checkBalance() {
	System.out.println("Balace "+amount);
}
void display() {
	System.out.println(acc_no+" "+acc_name+" "+amount);
}
}







