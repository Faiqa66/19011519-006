package InventoryOfBook;
import java.util.Scanner;
public class BOOK {
	
	Scanner sc=new Scanner(System.in);
	
       String AUTHOR;
       String TITLE;
       String PUBLISHER;
       double PRICE;
       int STOCK;
BOOK(String author,String title,String publisher,double price,int stock){
	this.AUTHOR=author;
	this.TITLE=title;
	this.PUBLISHER=publisher;
	this.PRICE=price;
	this.STOCK=stock;
}
void feedData() {
	System.out.println("Author name:");
	AUTHOR=sc.next();
	System.out.println("Book Title:");
	TITLE=sc.next();
	System.out.println("Publisher Name:");
	PUBLISHER=sc.next();
	System.out.println("Book Price:");
	PRICE=sc.nextDouble();
	System.out.println("Book Stock:");
	STOCK=sc.nextInt();
}
void showData() {
	System.out.println("Author Name:"+AUTHOR);
	System.out.println("BooK Title:"+TITLE);
	System.out.println("Publisher Name:"+PUBLISHER);
	System.out.println("Book Price:"+PRICE);
	System.out.println("Stock of Books:"+STOCK);
}
Boolean search() {
     System.out.println("Enter book title you want to buy!");
     String tbuy=sc.next();
     System.out.println("Enter author name:");
     String abuy=sc.next();
	if((tbuy==TITLE)&&(abuy==AUTHOR))
	return true;
	else
		return false;
		
}
void buyBook() {
	System.out.println("Enter number of books you want to buy:");
	int count=sc.nextInt();
	if(count<=STOCK) {
		STOCK=STOCK-count;
		System.out.println("Books bought successfully!");
		System.out.println("Price of book:"+(PRICE*count));
	}
	else
	{
		System.out.println("Required book is not in stock!");
	}
}

}