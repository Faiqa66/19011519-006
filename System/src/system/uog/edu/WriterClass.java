package system.uog.edu;

import java.io.FileWriter;

public class WriterClass {
public static void main(String args[]) {
	
	try {
		FileWriter f=new FileWriter("C:\\Faiqa\\Zindagi.txt");
	    f.write("How are you lovely girl?");
	    f.close();
	
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
