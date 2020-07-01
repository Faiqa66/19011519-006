package Pro;

class Book{
	long pages=500;
	
	static class Pages{
		long words=4000;
	}
}

public class Main {

	public static void main(String args[]) {
		Book.Pages pg=new Book.Pages();
       	System.out.println(pg.words);	
		
}
}
