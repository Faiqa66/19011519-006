package system.uog.edu;

import java.io.*;
public class reader {
public static void main(String args[]) {
	try {
	Reader r=new FileReader("C:\\Faiqa\\Testout.txt");
	int data=r.read();
	
	while(data!=-1) {
		System.out.print((char)data);
		data=r.read();
	}
	r.close();
	System.out.println("\n"+"Done Successfully!");
	}catch(IOException e) {
		System.out.println(e);
	}
}
}
