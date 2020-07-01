package Continue;

public class ContinueDoWhile {
	public static void main(String args[]) {
		int i=1;
		do {
			if(i==5) {
				i++;
				break;
			}
		System.out.println("i="+i);
		i++;
		}while(i<=7);
	}
}
