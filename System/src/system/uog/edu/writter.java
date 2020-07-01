package system.uog.edu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class writter {
	public static void main(String args[]) {
		try {
			Writer w=new FileWriter("C:\\Faiqa\\output.txt");
			String content="I Love Pakistan!";
		    w.write(content);
		    w.close();
		    System.out.println("Done");
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
