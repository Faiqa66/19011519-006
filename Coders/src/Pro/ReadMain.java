package Pro;

import java.io.*;

public class ReadMain {
public static void main(String args[]) {
	String name="Hamid";
	int roll_no=1;
	
	try {
	      BufferedWriter bf=new BufferedWriter(new FileWriter("C:\\Faiqa\\StudentFile.txt"));
	      bf.write(String.valueOf(roll_no));
	      bf.write(name);
	      bf.newLine();
	      bf.close();
	      System.out.println("Written Successfully");
	}catch(Exception e) {
		System.out.println(e);
	}
	

}
}