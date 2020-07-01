package JavaConstructor;

public class Static2 {
static int count=0;
int counter=0;
void dispaly() {
	count++;
	System.out.println(count);
}
void dispaly2() {
	counter++;
	System.out.println(counter);
}
public static void main(String...args) {
	Static2 s1=new Static2();
	Static2 s2=new Static2();
	Static2 s3=new Static2();
	
	s1.dispaly();
	s2.dispaly();
	s3.dispaly();
	
	s1.dispaly2();
	s2.dispaly2();
	s3.dispaly2();
}
}
