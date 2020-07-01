package InventoryOfBook;
import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BOOK b=new BOOK("Mooris mano","DLD","yamin",540,200);
	    
		while(true) {
        	 System.out.println("t\tMenu:");
        	 System.out.println("1:\tEnter new Books:");
        	 System.out.println("2:\tSearch for Book:");
        	 System.out.println("3:\tBuy Book:");
        	 System.out.println("4:\tExit");
        	 System.out.println("\n\nEnter your choice:");
        	 int choice=sc.nextInt();
        
        	switch(choice) {
        	case 1:
        		b.feedData();
        		break;
        	case 2:
        		System.out.println("Enter book title:");
        		System.out.println("Enetr author name:");
        		b.search();
        		break;
        	case 3:
        		System.out.println("Enter book title:");
        		System.out.println("Enetr author name:");
        		b.buyBook();
        	    break;
        	case 4:
        	     System.exit(0);
        	     break;
        	 default:
        		 System.out.println("Invalid input!");
        		
        	}
          }
}
}
