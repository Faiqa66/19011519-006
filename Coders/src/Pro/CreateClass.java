package Pro;

import java.io.*;

public class CreateClass {
public static void main(String args[]) {
	
	try {
		FileWriter myObj=new FileWriter("C:\\Faiqa\\filename.txt");
		myObj.write("Let's do a party");
		myObj.append("\nWhat the hell you are doing here!");
		myObj.close();
		System.out.println("Written successfully!");
	}catch(IOException e) {
		System.out.println("An error occured");
		e.printStackTrace();
	}
}
}
