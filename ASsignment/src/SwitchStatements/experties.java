package SwitchStatements;

public class experties {
	public static void main(String[] args) {
     String expertLevel="Expert";
     int level=0;
		
		switch(expertLevel) {
		case "Beginner":
			level =1;
			break;
		case "Intermediate":
			level=2;
			break;
		case "Expert":
		     level=3;
			break;
		default:
			System.out.println("Invalid input");
		}
		System.out.println("Level="+level);
	}
}
